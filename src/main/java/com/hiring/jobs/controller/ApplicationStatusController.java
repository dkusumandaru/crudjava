/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.controller;

import com.hiring.jobs.entity.TblApplicationStatus;
import com.hiring.jobs.entity.TblApplicationStatus;
import com.hiring.jobs.services.ApplicationStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author D
 */
@Controller
@RequestMapping
public class ApplicationStatusController {
    
    @Autowired
    private ApplicationStatusService appStatusService;
    
    @GetMapping("/status")
    public String getConsultattionStatus(Model model) {
        Iterable<TblApplicationStatus> applicationStatus = appStatusService.getApplicationStatusActive();
        model.addAttribute("status", applicationStatus);

        TblApplicationStatus applicationStatusCrud = new TblApplicationStatus();

        model.addAttribute("addStatus", applicationStatusCrud);        
        model.addAttribute("editStatus", applicationStatusCrud);
        model.addAttribute("removeStatus", applicationStatusCrud);
        
//        return "index.html";
        return "application_status/v_page_consultationstatus.html";
    }

    @PostMapping("/status/add")
    public String addTblApplicationStatus(
            @ModelAttribute("addTblApplicationStatus")
            TblApplicationStatus consultationStatus
    ) 
    {
        this.appStatusService.save(consultationStatus);

        return "redirect:/status";
    }
    
    @PostMapping(value = "/status/edit")
    public String editCosultationStatus(
            @RequestParam(value = "statusId", required = false) Integer id,
            @RequestParam(value = "namaStatus", required = false) String name,
            @RequestParam(value = "status", required = false) Boolean status
    ) {
        TblApplicationStatus consultationStatus = new TblApplicationStatus(id, name, status);
        consultationStatus.setStatusId(id);
        consultationStatus.setNamaStatus(name);
        consultationStatus.setStatus(status);

        this.appStatusService.save(consultationStatus);
        return "redirect:/status";
        
    }
    
}
