package com.way.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "fix", schema = "wuaoya", catalog = "")
public class FixEntity {
    private int fid;
    private String fclass;
    private String fcontent;
    private Timestamp ftime;
    private Integer sid;
    private Integer uid;
    private String fstatus;
    private String farea;

    @Id
    @Column(name = "fid")
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "fclass")
    public String getFclass() {
        return fclass;
    }

    public void setFclass(String fclass) {
        this.fclass = fclass;
    }

    @Basic
    @Column(name = "fcontent")
    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent;
    }

    @Basic
    @Column(name = "ftime")
    public Timestamp getFtime() {
        return ftime;
    }

    public void setFtime(Timestamp ftime) {
        this.ftime = ftime;
    }

    @Basic
    @Column(name = "sid")
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "fstatus")
    public String getFstatus() {
        return fstatus;
    }

    public void setFstatus(String fstatus) {
        this.fstatus = fstatus;
    }

    @Basic
    @Column(name = "farea")
    public String getFarea() {
        return farea;
    }

    public void setFarea(String farea) {
        this.farea = farea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FixEntity fixEntity = (FixEntity) o;

        if (fid != fixEntity.fid) return false;
        if (fclass != null ? !fclass.equals(fixEntity.fclass) : fixEntity.fclass != null) return false;
        if (fcontent != null ? !fcontent.equals(fixEntity.fcontent) : fixEntity.fcontent != null) return false;
        if (ftime != null ? !ftime.equals(fixEntity.ftime) : fixEntity.ftime != null) return false;
        if (sid != null ? !sid.equals(fixEntity.sid) : fixEntity.sid != null) return false;
        if (uid != null ? !uid.equals(fixEntity.uid) : fixEntity.uid != null) return false;
        if (fstatus != null ? !fstatus.equals(fixEntity.fstatus) : fixEntity.fstatus != null) return false;
        if (farea != null ? !farea.equals(fixEntity.farea) : fixEntity.farea != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid;
        result = 31 * result + (fclass != null ? fclass.hashCode() : 0);
        result = 31 * result + (fcontent != null ? fcontent.hashCode() : 0);
        result = 31 * result + (ftime != null ? ftime.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (fstatus != null ? fstatus.hashCode() : 0);
        result = 31 * result + (farea != null ? farea.hashCode() : 0);
        return result;
    }
}
