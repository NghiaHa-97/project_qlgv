package com.nghiahd.authenticationtest.rest;

import com.nghiahd.authenticationtest.domain.Role;
import com.nghiahd.authenticationtest.domain.UserRole;
import com.nghiahd.authenticationtest.repository.DTO.RequestPermissionRole;
import com.nghiahd.authenticationtest.repository.DTO.RequestUserRole;
import com.nghiahd.authenticationtest.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api")
public class RoleRest {

    private RoleService roleService;

    @Autowired
    public RoleRest(RoleService roleService){
        this.roleService=roleService;
    }

    @GetMapping(value = "/get-all-role-by-iduser")
    public List<Role> getAllRoleById(@RequestParam String id){
        int id1= Integer.parseInt(id);
        return roleService.findAllRoleById(id1);
    }

    @GetMapping(value = "/get-all-role")
    public List<Role> getAllRole(){

        return roleService.getAllRole();
    }
    @PostMapping(value = "/save-user-role")
    public boolean saveUserRole(@RequestBody List<RequestUserRole> requests){
        return roleService.saveDeleteUserRole(requests);
    }

    @GetMapping(value = "/save-role")
    public boolean saveRole(@RequestParam String roleName){

        return roleService.saveRole(roleName);
    }
}
