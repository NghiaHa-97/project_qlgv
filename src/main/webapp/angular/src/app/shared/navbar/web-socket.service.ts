import {Injectable} from "@angular/core";
import {Message} from "../../model/Message";

@Injectable({
    providedIn:"root"
})
export class WebSocketService{
    webSocket: WebSocket;
    chatMessages: Message[] = [];

    constructor() { }

    public openWebSocket(){
        this.webSocket = new WebSocket('ws://localhost:8080/message/'+JSON.parse(localStorage.getItem("auth")).username);

        this.webSocket.onopen = (event) => {
            console.log('Open: ', event);
        };

        this.webSocket.onmessage = (event) => {
            const chatMessageDto = JSON.parse(event.data);
            console.log("push data")
            this.chatMessages.push(chatMessageDto);
        };

        this.webSocket.onclose = (event) => {
            console.log('Close: ', event);
        };
    }

    public sendMessage(chatMessageDto: Message){
        this.webSocket.send(JSON.stringify(chatMessageDto));
    }

    public closeWebSocket() {
        this.webSocket.close();
    }
}
