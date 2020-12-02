package com.nghiahd.authenticationtest.service;

import com.nghiahd.authenticationtest.domain.UserAccount;
import com.nghiahd.authenticationtest.repository.DTO.AdminAndIdDTO;
import com.nghiahd.authenticationtest.repository.DTO.UserDTO;

import java.util.List;

public interface UserService {
    boolean checkUser(UserDTO userDTO);
    AdminAndIdDTO checkAdmin(UserDTO userDTO);
    List<UserAccount> getAllUser();
}
