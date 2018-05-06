package com.graduate.project.entity;

import java.math.BigDecimal;

public class Dish {
    private Integer dishid;

    private String dishname;

    private BigDecimal dishprice;

    private String dishstyle;

    private String dishpictureroute;

    public Dish(Integer dishid, String dishname, BigDecimal dishprice, String dishstyle, String dishpictureroute) {
        this.dishid = dishid;
        this.dishname = dishname;
        this.dishprice = dishprice;
        this.dishstyle = dishstyle;
        this.dishpictureroute = dishpictureroute;
    }

    public Dish() {
        super();
    }

    public Integer getDishid() {
        return dishid;
    }

    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public BigDecimal getDishprice() {
        return dishprice;
    }

    public void setDishprice(BigDecimal dishprice) {
        this.dishprice = dishprice;
    }

    public String getDishstyle() {
        return dishstyle;
    }

    public void setDishstyle(String dishstyle) {
        this.dishstyle = dishstyle == null ? null : dishstyle.trim();
    }

    public String getDishpictureroute() {
        return dishpictureroute;
    }

    public void setDishpictureroute(String dishpictureroute) {
        this.dishpictureroute = dishpictureroute == null ? null : dishpictureroute.trim();
    }
}