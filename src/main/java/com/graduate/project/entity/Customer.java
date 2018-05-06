package com.graduate.project.entity;

import java.util.Date;

public class Customer {
    private Integer customerid;

    private Date date;

    private Integer billid;

    public Customer(Integer customerid, Date date, Integer billid) {
        this.customerid = customerid;
        this.date = date;
        this.billid = billid;
    }

    public Customer() {
        super();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }
}