package com.nghiahd.authenticationtest.rest;

import com.nghiahd.authenticationtest.config.jwt.JwtTokenUtil;
import com.nghiahd.authenticationtest.config.jwt.JwtUserDetailService;
import com.nghiahd.authenticationtest.domain.GiangVien;
import com.nghiahd.authenticationtest.domain.Permission;
import com.nghiahd.authenticationtest.domain.UserAccount;
import com.nghiahd.authenticationtest.repository.DTO.AdminAndIdDTO;
import com.nghiahd.authenticationtest.repository.DTO.AuthenticationRequest;
import com.nghiahd.authenticationtest.repository.DTO.AuthenticationResponse;
import com.nghiahd.authenticationtest.repository.DTO.UserDTO;
import com.nghiahd.authenticationtest.service.GiangVienService;
import com.nghiahd.authenticationtest.service.PermissionService;
import com.nghiahd.authenticationtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserRest {

    @Autowired
    UserService userService;

    @Autowired
    JwtUserDetailService jwtUserDetailService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping(value = "/user/login")
    public boolean checkUser(@RequestBody UserDTO userDTO){

        return userService.checkUser(userDTO);
    }

    @PostMapping(value = "/user/get-isadmin")
    public AdminAndIdDTO checkAdmin(@RequestBody UserDTO userDTO){

        return userService.checkAdmin(userDTO);
    }

    @GetMapping(value = "/user/get-all-user")
    public List<UserAccount> getAllUser(){

        return userService.getAllUser();
    }
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        }
        catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }


        final UserDetails userDetails = jwtUserDetailService
                .loadUserByUsername(authenticationRequest.getUsername());

        final  String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt, authenticationRequest.getUsername()));
    }

}
