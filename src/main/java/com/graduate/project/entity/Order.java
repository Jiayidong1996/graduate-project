package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderid;

    private Date orderdate;

    private BigDecimal ordertotalprice;

    private Integer ordercompanyid;

    private String ordercompanyname;

    private String orderperson;

    public Order(Integer orderid, Date orderdate, BigDecimal ordertotalprice, Integer ordercompanyid, String ordercompanyname, String orderperson) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.ordertotalprice = ordertotalprice;
        this.ordercompanyid = ordercompanyid;
        this.ordercompanyname = ordercompanyname;
        this.orderperson = orderperson;
    }

    public Order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public BigDecimal getOrdertotalprice() {
        return ordertotalprice;
    }

    public void setOrdertotalprice(BigDecimal ordertotalprice) {
        this.ordertotalprice = ordertotalprice;
    }

    public Integer getOrdercompanyid() {
        return ordercompanyid;
    }

    public void setOrdercompanyid(Integer ordercompanyid) {
        this.ordercompanyid = ordercompanyid;
    }

    public String getOrdercompanyname() {
        return ordercompanyname;
    }

    public void setOrdercompanyname(String ordercompanyname) {
        this.ordercompanyname = ordercompanyname == null ? null : ordercompanyname.trim();
    }

    public String getOrderperson() {
        return orderperson;
    }

    public void setOrderperson(String orderperson) {
        this.orderperson = orderperson == null ? null : orderperson.trim();
    }
}