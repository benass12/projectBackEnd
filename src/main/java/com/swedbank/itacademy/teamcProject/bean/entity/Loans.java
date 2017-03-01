package com.swedbank.itacademy.teamcProject.bean.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;

/**
 * Created by benas on 17.2.24.
 */
@Entity(name = "loan_apllications")
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "First name is required")
    private String name;
    @NotEmpty(message = "Last name is required")
    private String surname;
    private BigDecimal value;
    private Integer paymentday;
    private String termdate;
    private String email;
    private Integer personalid;
    private String country;
    private String city;
    private String phone1;
    private String phone2;
    private String status;
    private String date;
    private Integer salarywithtaxes;
    private String loancode;
    private Integer docnumber;
    private String address;
    private String doctype;


    public Loans(String name, String surname, BigDecimal value, Integer paymentday, String termdate, String email, Integer personalid, String country, String city, String phone1, String phone2, String status, String date, Integer salarywithtaxes, String loancode, Integer docnumber, String address, String doctype) {
        this.name = name;
        this.surname = surname;
        this.value = value;
        this.paymentday = paymentday;
        this.termdate = termdate;
        this.email = email;
        this.personalid = personalid;
        this.country = country;
        this.city = city;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.status = status;
        this.date = date;
        this.salarywithtaxes = salarywithtaxes;
        this.loancode = loancode;
        this.docnumber = docnumber;
        this.address = address;
        this.doctype = doctype;

    }



    public void setHash()
    {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            this.setLoancode("fail");
            return;
        }
        md5.update(StandardCharsets.UTF_8.encode(String.valueOf(this.getId())));
        this.setLoancode(String.format("%032x", new BigInteger(1, md5.digest())));
    }


    public Loans() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Integer getPaymentday() {
        return paymentday;
    }

    public void setPaymentday(Integer paymentday) {
        this.paymentday = paymentday;
    }

    public String getTermdate() {
        return termdate;
    }

    public void setTermdate(String termdate) {
        this.termdate = termdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPersonalid() {
        return personalid;
    }

    public void setPersonalid(Integer personalid) {
        this.personalid = personalid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSalarywithtaxes() {
        return salarywithtaxes;
    }

    public void setSalarywithtaxes(Integer salarywithtaxes) {
        this.salarywithtaxes = salarywithtaxes;
    }

    public String getLoancode() {
        return loancode;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode;
    }

    public Integer getDocnumber() {
        return docnumber;
    }

    public void setDocnumber(Integer docnumber) {
        this.docnumber = docnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }
}