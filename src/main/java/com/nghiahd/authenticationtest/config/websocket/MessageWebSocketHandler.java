package com.nghiahd.authenticationtest.config.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.adapter.NativeWebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.websocket.server.PathParam;
import java.util.*;

@Component
public class MessageWebSocketHandler extends TextWebSocketHandler {
    private final  Logger logger=LoggerFactory.getLogger(MessageWebSocketHandler.class);
    private final Map<String,WebSocketSession> webSocketSessions = new HashMap<>();
    private String userName;

    public MessageWebSocketHandler() {
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session ) throws Exception {
        userName=session.getUri().getPath().split("/message/")[1].trim();
        if(!webSocketSessions.containsKey(userName)){
            webSocketSessions.put(userName,session);
        }

    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        userName=session.getUri().getPath().split("/message/")[1].trim();
        Set<String> keys=webSocketSessions.keySet();
        for(String key : keys){
            logger.info("Web socket id session: " + key);
            if(!key.equalsIgnoreCase(userName)){
                webSocketSessions.get(key).sendMessage(message);
            }
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        userName=session.getUri().getPath().split("/message/")[1].trim();
        webSocketSessions.remove(userName);
        userName="";
    }
}
