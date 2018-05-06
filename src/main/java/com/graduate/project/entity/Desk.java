package com.graduate.project.entity;

public class Desk extends DeskKey {
    private String deskname;

    private String deskstate;

    private String deskremark;

    public Desk(Integer deskid, String areaid, String deskname, String deskstate, String deskremark) {
        super(deskid, areaid);
        this.deskname = deskname;
        this.deskstate = deskstate;
        this.deskremark = deskremark;
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