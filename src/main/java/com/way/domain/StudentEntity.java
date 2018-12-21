package com.way.domain;

import javax.persistence.*;

@Entity
@Table(name = "student", schema = "wuaoya", catalog = "")
public class StudentEntity {
    private int sid;
    private String sname;
    private String sphone;
    private String spwd;
    private String sstatus;

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "sphone")
    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    @Basic
    @Column(name = " spwd")
    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    @Basic
    @Column(name = "sstatus")
    public String getSstatus() {
        return sstatus;
    }

    public void setSstatus(String sstatus) {
        this.sstatus = sstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (sid != that.sid) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sphone != null ? !sphone.equals(that.sphone) : that.sphone != null) return false;
        if (spwd != null ? !spwd.equals(that.spwd) : that.spwd != null) return false;
        if (sstatus != null ? !sstatus.equals(that.sstatus) : that.sstatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sphone != null ? sphone.hashCode() : 0);
        result = 31 * result + (spwd != null ? spwd.hashCode() : 0);
        result = 31 * result + (sstatus != null ? sstatus.hashCode() : 0);
        return result;
    }
}
