package com.graduate.project.entity;

public class BillInfoKey {
    private Integer billid;

    private Integer dishid;

    public BillInfoKey(Integer billid, Integer dishid) {
        this.billid = billid;
        this.dishid = dishid;
    }

    public BillInfoKey() {
        super();
    }

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
}