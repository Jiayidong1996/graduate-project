package com.graduate.project.entity;

import java.math.BigDecimal;

public class StoreHouse {
    private Integer materialid;

    private String materialname;

    private BigDecimal materialsurplus;

    public StoreHouse(Integer materialid, String materialname, BigDecimal materialsurplus) {
        this.materialid = materialid;
        this.materialname = materialname;
        this.materialsurplus = materialsurplus;
    }

    public StoreHouse() {
        super();
    }

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public BigDecimal getMaterialsurplus() {
        return materialsurplus;
    }

    public void setMaterialsurplus(BigDecimal materialsurplus) {
        this.materialsurplus = materialsurplus;
    }
}