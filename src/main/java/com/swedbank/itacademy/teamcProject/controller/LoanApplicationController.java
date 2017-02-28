package com.swedbank.itacademy.teamcProject.controller;

import com.swedbank.itacademy.teamcProject.bean.entity.Admin;
import com.swedbank.itacademy.teamcProject.bean.entity.Loans;
import com.swedbank.itacademy.teamcProject.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by benas on 17.2.24.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class LoanApplicationController {


    @Autowired
    private LoanService loansService;

    @RequestMapping(value = "/loans", method = RequestMethod.GET)
    public Iterable<Loans> test() {
        return loansService.getLoans();
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public Iterable<Admin> testAdmin() {
        return loansService.getAdmin();
    }

    @RequestMapping(value = "/admin/new", method = RequestMethod.POST)

    public void addAdmin() {
        loansService.addAdmin();
    }

    @RequestMapping(value = "/loans/new", method = RequestMethod.POST)

    public void tes2() {
        loansService.addNewLoan();
    }

    @RequestMapping(value = "/loans/all", method = RequestMethod.POST)

    public void tes3(@Valid @RequestBody Loans loans) {

        loansService.addLoans(loans);
    }







}
