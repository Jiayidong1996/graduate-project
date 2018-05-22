package com.graduate.project.entity;

import java.math.BigDecimal;

public class BillInfoVO{
    private Integer billid;

    private Integer dishid;

    private Integer dishnum;

    private String dishname;

    private BigDecimal dishprice;

    private String dishpictureroute;

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public Integer getDishid() {
        return dishid;
    }

    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    public Integer getDishnum() {
        return dishnum;
    }

    public void setDishnum(Integer dishnum) {
        this.dishnum = dishnum;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public BigDecimal getDishprice() {
        return dishprice;
    }

    public void setDishprice(BigDecimal dishprice) {
        this.dishprice = dishprice;
    }

    public String getDishpictureroute() {
        return dishpictureroute;
    }

    public void setDishpictureroute(String dishpictureroute) {
        this.dishpictureroute = dishpictureroute;
    }

    @Override
    public String toString() {
        return "BillInfoVO{" +
                "billid=" + billid +
                ", dishid=" + dishid +
                ", dishnum=" + dishnum +
                ", dishname='" + dishname + '\'' +
                ", dishprice=" + dishprice +
                ", dishpictureroute='" + dishpictureroute + '\'' +
                '}';
    }
}
