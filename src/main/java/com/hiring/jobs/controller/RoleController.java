/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.controller;

import com.hiring.jobs.entity.TblRole;
import com.hiring.jobs.services.RoleService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author D
 */
@Controller
@RequestMapping
public class RoleController {
    
    @Autowired
    private RoleService role;
    
    @GetMapping("/auth")
    public String getRole() {

        Iterable<TblRole> roles = role.findAll();       
        System.out.println(roles.toString());

        return "HELLO";
    }
    
    @GetMapping("/test")
    public String getRoleTest() {
        Integer id = 1;
        
        Optional<TblRole> roles = role.getById(id);       
        System.out.println(roles.toString());
        System.out.println(roles.get().getNamaRole());
        System.out.println(roles.get().getRoleId());

        return "index.html";
    }
    
}
