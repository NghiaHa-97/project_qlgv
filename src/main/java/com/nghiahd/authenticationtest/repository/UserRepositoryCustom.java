package com.nghiahd.authenticationtest.repository;

import com.nghiahd.authenticationtest.repository.DTO.AdminAndIdDTO;
import com.nghiahd.authenticationtest.repository.DTO.UserDetailDTO;

public interface UserRepositoryCustom {
    boolean checkUser(String userName,String password);
    AdminAndIdDTO checkAdmin(String userName, String password);
    UserDetailDTO getUserDetailByUserName(String userName);
}
