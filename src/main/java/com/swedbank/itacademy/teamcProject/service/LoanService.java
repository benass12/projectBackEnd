package com.swedbank.itacademy.teamcProject.service;

import com.swedbank.itacademy.teamcProject.bean.entity.Admin;
import com.swedbank.itacademy.teamcProject.bean.entity.Loans;
import com.swedbank.itacademy.teamcProject.repository.AdminRepository;
import com.swedbank.itacademy.teamcProject.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;


/**
 * Created by benas on 17.2.24.
 */

@Service
public class LoanService {

    @Autowired
    private LoansRepository loansRepository;
    @Autowired
    private AdminRepository adminRepository;


    public Iterable<Loans> getLoans() {

        return loansRepository.findAll();
    }

    public Iterable<Admin> getAdmin() {

        return adminRepository.findAll();
    }

    public void addNewLoan() {

        Loans newLoan = new Loans();
        BigDecimal value = new BigDecimal("1115.37");
        newLoan.setName("Andrius");
        newLoan.setSurname("Antanavicius");
        newLoan.setAddress("Kentukio 30");
        newLoan.setCountry("Lietuva");
        newLoan.setValue(value);
//            newLoan.setDate(new Date(2016,12,25));
        newLoan.setEmail("Antanavicius@gmail.com");
        newLoan.setDoctype("pasas");
        newLoan.setDocnumber(2);
        newLoan.setPhone1("63587852");
        loansRepository.save(newLoan);
    }

    public boolean checkAdmin(Admin admin)
    {
        if(adminRepository.findOne(0).getUsername() == admin.getUsername())
        {
            if(adminRepository.findOne(0).getPassword() == admin.getPassword()) {
                return true;
            }
        }
        return false;
    }


    public void addLoans(Loans loans) {
        loansRepository.save(loans);
        loans.setHash();
        loansRepository.save(loans);
    }

    public void addAdmin() {
        Admin newAdmin = new Admin();
        newAdmin.setId(1);
        newAdmin.setUsername("root");
        newAdmin.setPassword("root");
        newAdmin.setToken("labas");
        adminRepository.save(newAdmin);
    }


    public Loans updateStatus(Loans loans) {
        Loans temp = loansRepository.findOne(loans.getId());
        temp.setStatus(loans.getStatus());
        return temp;
    }

    public Loans getLoanByHash(String hash) {
        long count = 150;

        Loans temp;
        for (int i = 0; i < count; i++) {
            if (loansRepository.exists(i))
            {
                temp = loansRepository.findOne(i);
                if(temp.getLoancode().toLowerCase().equals(hash.toLowerCase())) {
                    return temp;
                }
            }
            }
            return null;
        }
    }