package com.repair.common.entity;

public class TRole {
    private String roleid;

    private String rolename;

    private String roledesc;

    private String addtime;

    private String updatetime;

    private String operator;

    private String operatprid;

    public TRole(String roleid, String rolename, String roledesc, String addtime, String updatetime, String operator, String operatprid) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.roledesc = roledesc;
        this.addtime = addtime;
        this.updatetime = updatetime;
        this.operator = operator;
        this.operatprid = operatprid;
    }

    public TRole() {
        super();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatprid() {
        return operatprid;
    }

    public void setOperatprid(String operatprid) {
        this.operatprid = operatprid;
    }
}