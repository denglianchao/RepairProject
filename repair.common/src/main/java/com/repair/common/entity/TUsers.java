package com.repair.common.entity;

public class TUsers {
    private Integer uid;

    private String username;

    private String password;

    private String email;

    private String homeUrl;

    private String screenName;

    private Integer created;

    private Integer activated;

    private Integer logged;

    private String groupName;

    public TUsers(Integer uid, String username, String password, String email, String homeUrl, String screenName, Integer created, Integer activated, Integer logged, String groupName) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.homeUrl = homeUrl;
        this.screenName = screenName;
        this.created = created;
        this.activated = activated;
        this.logged = logged;
        this.groupName = groupName;
    }

    public TUsers() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    public Integer getLogged() {
        return logged;
    }

    public void setLogged(Integer logged) {
        this.logged = logged;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}