package com.hiring.jobs.interfaces;


import com.hiring.jobs.entity.TblRole;
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D
 */
public interface RoleInterface {
    Iterable<TblRole> findAll(); 
    Optional<TblRole> getById(Integer id);
    void deleleteById(String id);
    void save(TblRole role); 
}
