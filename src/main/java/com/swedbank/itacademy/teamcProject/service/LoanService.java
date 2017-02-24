package com.swedbank.itacademy.teamcProject.service;

import com.swedbank.itacademy.teamcProject.bean.entity.Loans;
import com.swedbank.itacademy.teamcProject.bean.entity.LoansResponse;
import com.swedbank.itacademy.teamcProject.repository.LoansRepository;
import com.swedbank.itacademy.teamcProject.repository.LoansResponseRepository;
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

    @Autowired
    private LoansResponseRepository loansResponseRepository;


    public Iterable<LoansResponse> getResponseLoans() {

        return loansResponseRepository.findAll();
    }

}
