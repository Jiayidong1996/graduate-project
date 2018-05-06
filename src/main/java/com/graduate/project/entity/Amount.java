package com.graduate.project.entity;

import java.util.Date;

public class Amount {
    private Integer amountid;

    private String amountarea;

    private String amounttype;

    private Date amountdate;

    private String amountremark;

    public Amount(Integer amountid, String amountarea, String amounttype, Date amountdate, String amountremark) {
        this.amountid = amountid;
        this.amountarea = amountarea;
        this.amounttype = amounttype;
        this.amountdate = amountdate;
        this.amountremark = amountremark;
    }

    public Amount() {
        super();
    }

    public Integer getAmountid() {
        return amountid;
    }

    public void setAmountid(Integer amountid) {
        this.amountid = amountid;
    }

    public String getAmountarea() {
        return amountarea;
    }

    public void setAmountarea(String amountarea) {
        this.amountarea = amountarea == null ? null : amountarea.trim();
    }

    public String getAmounttype() {
        return amounttype;
    }

    public void setAmounttype(String amounttype) {
        this.amounttype = amounttype == null ? null : amounttype.trim();
    }

    public Date getAmountdate() {
        return amountdate;
    }

    public void setAmountdate(Date amountdate) {
        this.amountdate = amountdate;
    }

    public String getAmountremark() {
        return amountremark;
    }

    public void setAmountremark(String amountremark) {
        this.amountremark = amountremark == null ? null : amountremark.trim();
    }
}