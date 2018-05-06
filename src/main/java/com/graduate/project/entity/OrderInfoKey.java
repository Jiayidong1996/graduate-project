package com.graduate.project.entity;

public class OrderInfoKey {
    private Integer orderid;

    private Integer materiaid;

    public OrderInfoKey(Integer orderid, Integer materiaid) {
        this.orderid = orderid;
        this.materiaid = materiaid;
    }

    public OrderInfoKey() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getMateriaid() {
        return materiaid;
    }

    public void setMateriaid(Integer materiaid) {
        this.materiaid = materiaid;
    }
}