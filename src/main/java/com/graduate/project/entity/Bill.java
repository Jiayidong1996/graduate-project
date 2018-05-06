package com.graduate.project.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private Integer billid;

    private Date billdate;

    private BigDecimal billmoney;

    private String billremark;

    private String paytype;

    private Integer deskid;

    private String areaid;

    private Integer customerid;

    private Integer vipid;

    public Bill(Integer billid, Date billdate, BigDecimal billmoney, String billremark, String paytype, Integer deskid, String areaid, Integer customerid, Integer vipid) {
        this.billid = billid;
        this.billdate = billdate;
        this.billmoney = billmoney;
        this.billremark = billremark;
        this.paytype = paytype;
        this.deskid = deskid;
        this.areaid = areaid;
        this.customerid = customerid;
        this.vipid = vipid;
    }

    public Bill() {
        super();
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public BigDecimal getBillmoney() {
        return billmoney;
    }

    public void setBillmoney(BigDecimal billmoney) {
        this.billmoney = billmoney;
    }

    public String getBillremark() {
        return billremark;
    }

    public void setBillremark(String billremark) {
        this.billremark = billremark == null ? null : billremark.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Integer getDeskid() {
        return deskid;
    }

    public void setDeskid(Integer deskid) {
        this.deskid = deskid;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }
}