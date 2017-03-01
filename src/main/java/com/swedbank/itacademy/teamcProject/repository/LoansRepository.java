package com.swedbank.itacademy.teamcProject.repository;

import com.swedbank.itacademy.teamcProject.bean.entity.Loans;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by benas on 17.2.24.
 */
public interface LoansRepository extends CrudRepository<Loans, Integer> {
    public Loans findOne(String hash);
}
