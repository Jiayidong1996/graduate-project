package com.graduate.project.entity;

public class BillInfo extends BillInfoKey {
    private Integer dishnum;

    public BillInfo(Integer billid, Integer dishid, Integer dishnum) {
        super(billid, dishid);
        this.dishnum = dishnum;
    }

    public BillInfo() {
        super();
    }

    public Integer getDishnum() {
        return dishnum;
    }

    public void setDishnum(Integer dishnum) {
        this.dishnum = dishnum;
    }
}