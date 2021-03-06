package com.graduate.project.entity;

import sun.util.calendar.LocalGregorianCalendar;

import java.math.BigDecimal;
import java.sql.Date;

public class VIP {
    private Integer vipid;

    private String vipname;

    private Integer vipphone;

    private BigDecimal vipbalance;

    private BigDecimal vipdiscount;

    /*private String vipbirth;*/
    private Date vipbirth;

    private String vipaddress;

    public VIP(Integer vipid, String vipname, Integer vipphone, BigDecimal vipbalance, BigDecimal vipdiscount, Date vipbirth, String vipaddress) {
        this.vipid = vipid;
        this.vipname = vipname;
        this.vipphone = vipphone;
        this.vipbalance = vipbalance;
        this.vipdiscount = vipdiscount;
        this.vipbirth = vipbirth;
        this.vipaddress = vipaddress;
    }

    public VIP() {
        super();
    }

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    public String getVipname() {
        return vipname;
    }

    public void setVipname(String vipname) {
        this.vipname = vipname == null ? null : vipname.trim();
    }

    public Integer getVipphone() {
        return vipphone;
    }

    public void setVipphone(Integer vipphone) {
        this.vipphone = vipphone;
    }

    public BigDecimal getVipbalance() {
        return vipbalance;
    }

    public void setVipbalance(BigDecimal vipbalance) {
        this.vipbalance = vipbalance;
    }

    public BigDecimal getVipdiscount() {
        return vipdiscount;
    }

    public void setVipdiscount(BigDecimal vipdiscount) {
        this.vipdiscount = vipdiscount;
    }

    public Date getVipbirth() {
        return vipbirth;
    }

    public void setVipbirth(Date vipbirth) {
        this.vipbirth = vipbirth ;
    }

    public String getVipaddress() {
        return vipaddress;
    }

    public void setVipaddress(String vipaddress) {
        this.vipaddress = vipaddress == null ? null : vipaddress.trim();
    }
}