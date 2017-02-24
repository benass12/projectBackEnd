package com.swedbank.itacademy.teamcProject.bean.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by benas on 17.2.24.
 */
@Entity(name = "loan_apllications")
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private BigDecimal value;
    private Integer paymentday;
    private Date termdate;
    private String email;
    private Integer personalid;
    private String country;
    private String city;
    private String phone1;
    private String phone2;
    private Integer status;
    private Date date;
    private String salarywithtaxes;
    private String loancode;
    private Integer docnumber;
    private String address;
    private Integer doctype;

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

    public Date getTermdate() {
        return termdate;
    }

    public void setTermdate(Date termDate) {
        this.termdate = termDate;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSalarywithtaxes() {
        return salarywithtaxes;
    }

    public void setSalarywithtaxes(String salarywithtaxes) {
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

    public Integer getDoctype() {
        return doctype;
    }

    public void setDoctype(Integer doctype) {
        this.doctype = doctype;
    }
}
