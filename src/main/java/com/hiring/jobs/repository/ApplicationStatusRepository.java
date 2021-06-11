/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.repository;

import com.hiring.jobs.entity.TblApplicationStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author D
 */
@Repository
public interface ApplicationStatusRepository extends CrudRepository<TblApplicationStatus, Integer> {
  @Query(value = "SELECT * FROM tbl_application_status WHERE tbl_application_status.status = 1", nativeQuery = true)
  Iterable <TblApplicationStatus> getApplicationStatusActive();
}
