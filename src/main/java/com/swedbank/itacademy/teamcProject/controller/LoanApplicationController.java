package com.swedbank.itacademy.teamcProject.controller;

import com.swedbank.itacademy.teamcProject.bean.entity.Loans;
import com.swedbank.itacademy.teamcProject.repository.LoansRepository;
import com.swedbank.itacademy.teamcProject.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by benas on 17.2.24.
 */
@CrossOrigin(value = "https://localhost:17469")
@RestController
public class LoanApplicationController {


    @Autowired
    private LoanService loansService;



    @RequestMapping(value = "/loans", method = RequestMethod.GET)
    public Iterable<Loans> test() {
        return loansService.getLoans();
    }



    @RequestMapping(value = "/loans/new", method = RequestMethod.POST)

    public void tes2() {
        loansService.addNewLoan();
    }

//    @RequestMapping(value = "/loans/new", method = RequestMethod.POST)
//
//    public void tes2() {
//        loansService.addNewLoan();
//    }


}