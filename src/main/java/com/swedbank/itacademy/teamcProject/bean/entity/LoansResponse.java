package com.swedbank.itacademy.teamcProject.bean.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by benas on 17.2.24.
 */
@Entity(name = "loans_apllications")
public class LoansResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
