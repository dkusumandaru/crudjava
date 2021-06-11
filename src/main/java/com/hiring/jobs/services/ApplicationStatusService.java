/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.services;

import com.hiring.jobs.entity.TblApplicationStatus;
import com.hiring.jobs.interfaces.ApplicationStatusInterface;
import com.hiring.jobs.repository.ApplicationStatusRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author D
 */
@Service
public class ApplicationStatusService implements ApplicationStatusInterface {

    @Autowired
    private ApplicationStatusRepository appStatusRepository;
    
    @Override
    public Iterable<TblApplicationStatus> getAll() {
        return appStatusRepository.findAll();
    }

    @Override
    public Optional<TblApplicationStatus> getById(Integer id) {
        return appStatusRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        appStatusRepository.deleteById(id);
    }

    @Override
    public void save(TblApplicationStatus applicationStatus) {
       appStatusRepository.save(applicationStatus);
    }

    @Override
    public Iterable<TblApplicationStatus> getApplicationStatusActive() {
        return appStatusRepository.getApplicationStatusActive();
    }



}
