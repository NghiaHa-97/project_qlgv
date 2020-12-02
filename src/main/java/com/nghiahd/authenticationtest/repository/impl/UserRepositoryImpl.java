package com.nghiahd.authenticationtest.repository.impl;

import com.nghiahd.authenticationtest.repository.DTO.AdminAndIdDTO;
import com.nghiahd.authenticationtest.repository.DTO.UserDetailDTO;
import com.nghiahd.authenticationtest.repository.DTO.UserPermissionDTO;
import com.nghiahd.authenticationtest.repository.UserRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    public boolean checkUser(String userName, String password) {
        StringBuilder sql= new StringBuilder();
        int x=0;
        sql.append(" SELECT COUNT(1) " +
                " FROM dbo.[User] " +
                " WHERE UserName = :userName AND Password = :password ");
        Query query=entityManager.createNativeQuery(sql.toString());
        query.setParameter("userName",userName);
        query.setParameter("password",password);

        x= (int) query.getSingleResult();

        return x==1;
    }


    @Override
    public AdminAndIdDTO checkAdmin(String userName, String password) {
        StringBuilder sql= new StringBuilder();
        int x=0;
        sql.append(" SELECT isAdmin as admin , id " +
                " FROM dbo.[User] " +
                " WHERE UserName = :userName AND Password = :password ");
        Query query=entityManager.createNativeQuery(sql.toString(),"AdminAndIdDTO");
        query.setParameter("userName",userName);
        query.setParameter("password",password);

        AdminAndIdDTO result= (AdminAndIdDTO) query.getSingleResult();

        return result;
    }

    @Override
    public UserDetailDTO getUserDetailByUserName(String userName) {
        StringBuilder sql= new StringBuilder();

        sql.append(" SELECT u.id , u.UserName , u.Password " +
                " FROM dbo.[User] as u " +
                " WHERE u.UserName = :userName ");

        Query query=entityManager.createNativeQuery(sql.toString(),"UserDetailDTO");
        query.setParameter("userName",userName);

        UserDetailDTO result= (UserDetailDTO) query.getSingleResult();

        return result;
    }
}
