package com.graduate.project.entity;

public class Desk {
    private Integer deskId;

    private String areaId;

    private String deskname;

    private String deskstate;

    private String deskremark;

    public Desk( String deskname, String deskstate, String deskremark) {
        //super(deskid, areaid);
        this.deskname = deskname;
        this.deskstate = deskstate;
        this.deskremark = deskremark;
    }

    //test!!!
    public Desk( Integer deskId,String areaId,String deskname, String deskstate, String deskremark) {
       // super(deskId, areaId);
        this.deskId=deskId;
        this.areaId=areaId;
        this.deskname = deskname;
        this.deskstate=deskstate;
        this.deskremark = deskremark;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getDeskId() {
        return deskId;
    }

    public void setDeskId(Integer deskId) {
        this.deskId = deskId;
    }

    public Desk() {
        super();
    }

    public String getDeskname() {
        return deskname;
    }

    public void setDeskname(String deskname) {
        this.deskname = deskname == null ? null : deskname.trim();
    }

    public String getDeskstate() {
        return deskstate;
    }

    public void setDeskstate(String deskstate) {
        this.deskstate = deskstate == null ? null : deskstate.trim();
    }

    public String getDeskremark() {
        return deskremark;
    }

    public void setDeskremark(String deskremark) {
        this.deskremark = deskremark == null ? null : deskremark.trim();
    }
}