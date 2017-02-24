package com.swedbank.itacademy.teamcProject.service;

import com.swedbank.itacademy.teamcProject.bean.entity.Loans;
import com.swedbank.itacademy.teamcProject.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by benas on 17.2.24.
 */

@Service
public class LoanService {

    @Autowired
    private LoansRepository loansRepository;


    public Iterable<Loans> getLoans() {

        return loansRepository.findAll();
    }



}
