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
@CrossOrigin(value = "*", maxAge = 3600)

@RestController
public class LoanApplicationController {


    @Autowired
    private LoanService loansService;

    @RequestMapping(value = "/loans", method = RequestMethod.GET)
    public Iterable<Loans> test() {

        return loansService.getLoans();
    }

    @RequestMapping(value = "/admin/get", method = RequestMethod.GET)
    public Iterable<Admin> testAdmin() {
        return loansService.getAdmin();
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public Admin testAdmin1(Admin admin) {
        admin.setToken("labas");
        return admin;
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
    @ResponseBody
    public void tes3(@Valid @RequestBody Loans loans) {

        loans.setStatus("Unverified");
        loansService.addLoans(loans);
    }

    @RequestMapping(value = "loan/edit", method = RequestMethod.POST)

    public Loans editLoan(@Valid @RequestBody Loans loans) {

        String str1 = "Approved";
        String str2 = "Disapproved";
        String str3 = "Unverified";


        if (loans.getStatus().equals(str1))  {
            loans.setStatus(str1);
        } else if (loans.getStatus().equals(str2)) {
            loans.setStatus(str2);

        } else if (loans.getStatus().equals(str3)) {
            loans.setStatus(str3);
        }
        return loansService.updateStatus(loans);
    }

    @RequestMapping(value = "/admin/{hash}", method = RequestMethod.GET)
         public @ResponseBody Loans getLoanByHash(@PathVariable String hash) {
            return loansService.getLoanByHash("74234e98afe7498fb5daf1f36ac2d78acc339464f950703b8c019892f982b90b");
        }

    }



