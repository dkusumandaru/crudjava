/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.services;

import com.hiring.jobs.entity.TblRole;
import com.hiring.jobs.interfaces.RoleInterface;
import com.hiring.jobs.repository.RoleRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author D
 */
@Service
public class RoleService implements RoleInterface{
    
    @Autowired
    private RoleRepository role;
    
    
    @Override
    public Iterable<TblRole> findAll() {
        return role.findAll();
    }

    @Override
    public Optional<TblRole> getById(Integer id) {
        return role.findById(id);
    }

    @Override
    public void deleleteById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(TblRole role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
