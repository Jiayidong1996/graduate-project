package com.graduate.project.entity;

public class DeskKey {
    private Integer deskid;

    private String areaid;

    public DeskKey(Integer deskid, String areaid) {
        this.deskid = deskid;
        this.areaid = areaid;
    }

    public DeskKey() {
        super();
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
}