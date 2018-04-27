package com.xjblx.po;

public class User {
    private String username;

    private String usershowname;

    private String password;

    private String ismanager;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsershowname() {
        return usershowname;
    }

    public void setUsershowname(String usershowname) {
        this.usershowname = usershowname == null ? null : usershowname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIsmanager() {
        return ismanager;
    }

    public void setIsmanager(String ismanager) {
        this.ismanager = ismanager == null ? null : ismanager.trim();
    }
}