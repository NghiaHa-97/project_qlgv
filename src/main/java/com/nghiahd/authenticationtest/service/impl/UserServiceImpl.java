package com.nghiahd.authenticationtest.service.impl;

import com.nghiahd.authenticationtest.domain.UserAccount;
import com.nghiahd.authenticationtest.repository.DTO.AdminAndIdDTO;
import com.nghiahd.authenticationtest.repository.DTO.UserDTO;
import com.nghiahd.authenticationtest.repository.UserRepository;
import com.nghiahd.authenticationtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean checkUser(UserDTO userDTO) {
        return userRepository.checkUser(userDTO.getUserName(),userDTO.getPassword());
    }

    @Override
    public AdminAndIdDTO checkAdmin(UserDTO userDTO) {
        return userRepository.checkAdmin(userDTO.getUserName(),userDTO.getPassword());

    }

    @Override
    public List<UserAccount> getAllUser() {
        return userRepository.findAll();
    }
}
