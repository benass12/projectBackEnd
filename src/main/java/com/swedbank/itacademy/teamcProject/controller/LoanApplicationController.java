package com.swedbank.itacademy.teamcProject.controller;

import com.swedbank.itacademy.teamcProject.bean.entity.Loans;
import com.swedbank.itacademy.teamcProject.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by benas on 17.2.24.
 */

@RestController
public class LoanApplicationController {


    @Autowired
    private LoanService loansService;


    @RequestMapping(value = "/loans", method = RequestMethod.GET)
    public Iterable<Loans> test() {
        return loansService.getLoans();
    }




}


