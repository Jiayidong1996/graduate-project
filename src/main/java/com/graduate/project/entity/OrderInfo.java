package com.graduate.project.entity;

import java.math.BigDecimal;

public class OrderInfo extends OrderInfoKey {
    private String materianame;

    private BigDecimal materiaprice;

    private BigDecimal materianum;

    public OrderInfo(Integer orderid, Integer materiaid, String materianame, BigDecimal materiaprice, BigDecimal materianum) {
        super(orderid, materiaid);
        this.materianame = materianame;
        this.materiaprice = materiaprice;
        this.materianum = materianum;
    }

    public OrderInfo() {
        super();
    }

    public String getMaterianame() {
        return materianame;
    }

    public void setMaterianame(String materianame) {
        this.materianame = materianame == null ? null : materianame.trim();
    }

    public BigDecimal getMateriaprice() {
        return materiaprice;
    }

    public void setMateriaprice(BigDecimal materiaprice) {
        this.materiaprice = materiaprice;
    }

    public BigDecimal getMaterianum() {
        return materianum;
    }

    public void setMaterianum(BigDecimal materianum) {
        this.materianum = materianum;
    }
}