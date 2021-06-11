/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.interfaces;

import com.hiring.jobs.entity.TblApplicationStatus;
import java.util.Optional;

/**
 *
 * @author D
 */
public interface ApplicationStatusInterface  {
    Iterable<TblApplicationStatus> getAll(); 
    Optional<TblApplicationStatus> getById(Integer id);
    void deleteById(Integer id);
    void save(TblApplicationStatus applicationStatus);
    Iterable<TblApplicationStatus> getApplicationStatusActive(); 
}
