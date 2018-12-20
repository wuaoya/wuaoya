package com.way.domain;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "wuaoya")
@DynamicInsert(value = true)
public class AdminEntity {
    private int aid;
    private String aname;
    private String aphone;
    private String adepart;
    private String apwd;

    @Id
    @Column(name = "aid")
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "aname")
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Basic
    @Column(name = "aphone")
    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone;
    }

    @Basic
    @Column(name = "adepart")
    public String getAdepart() {
        return adepart;
    }

    public void setAdepart(String adepart) {
        this.adepart = adepart;
    }

    @Basic
    @Column(name = "apwd")
    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (aid != that.aid) return false;
        if (aname != null ? !aname.equals(that.aname) : that.aname != null) return false;
        if (aphone != null ? !aphone.equals(that.aphone) : that.aphone != null) return false;
        if (adepart != null ? !adepart.equals(that.adepart) : that.adepart != null) return false;
        if (apwd != null ? !apwd.equals(that.apwd) : that.apwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid;
        result = 31 * result + (aname != null ? aname.hashCode() : 0);
        result = 31 * result + (aphone != null ? aphone.hashCode() : 0);
        result = 31 * result + (adepart != null ? adepart.hashCode() : 0);
        result = 31 * result + (apwd != null ? apwd.hashCode() : 0);
        return result;
    }
}
