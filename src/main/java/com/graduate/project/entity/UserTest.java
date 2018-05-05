package com.graduate.project.entity;

public class UserTest {
    private int adminId;
    private String adminPass;
    private String limits;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "adminId=" + adminId +
                ", adminPass='" + adminPass + '\'' +
                ", limits='" + limits + '\'' +
                '}';
    }

    public UserTest(){ super(); }

    public UserTest(int adminId, String adminPass, String limits){
        super();
        this.adminId=adminId;
        this.adminPass=adminPass;
        this.limits=limits;
    }



}
