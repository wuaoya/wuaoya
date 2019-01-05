package com.way.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lost", schema = "wuaoya")
public class LostEntity {
    private int lid;
    private String ltitle;
    private String lcontent;
    private String limage;
    private Timestamp ltime;
    private String lltime;
    private String lphone;
    private Integer sid;
    private Integer aid;
    private String lstatus;
    private String laf;

    @Id
    @Column(name = "lid")
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Basic
    @Column(name = "ltitle")
    public String getLtitle() {
        return ltitle;
    }

    public void setLtitle(String ltitle) {
        this.ltitle = ltitle;
    }

    @Basic
    @Column(name = "lcontent")
    public String getLcontent() {
        return lcontent;
    }

    public void setLcontent(String lcontent) {
        this.lcontent = lcontent;
    }

    @Basic
    @Column(name = "limage")
    public String getLimage() {
        return limage;
    }

    public void setLimage(String limage) {
        this.limage = limage;
    }

    @Basic
    @Column(name = "ltime")
    public Timestamp getLtime() {
        return ltime;
    }

    public void setLtime(Timestamp ltime) {
        this.ltime = ltime;
    }

    @Basic
    @Column(name = "lltime")
    public String getLltime() {
        return lltime;
    }

    public void setLltime(String lltime) {
        this.lltime = lltime;
    }

    @Basic
    @Column(name = "lphone")
    public String getLphone() {
        return lphone;
    }

    public void setLphone(String lphone) {
        this.lphone = lphone;
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
    @Column(name = "aid")
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "lstatus")
    public String getLstatus() {
        return lstatus;
    }

    public void setLstatus(String lstatus) {
        this.lstatus = lstatus;
    }

    @Basic
    @Column(name = "laf")
    public String getLaf() {
        return laf;
    }

    public void setLaf(String laf) {
        this.laf = laf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LostEntity that = (LostEntity) o;

        if (lid != that.lid) return false;
        if (ltitle != null ? !ltitle.equals(that.ltitle) : that.ltitle != null) return false;
        if (lcontent != null ? !lcontent.equals(that.lcontent) : that.lcontent != null) return false;
        if (limage != null ? !limage.equals(that.limage) : that.limage != null) return false;
        if (ltime != null ? !ltime.equals(that.ltime) : that.ltime != null) return false;
        if (lltime != null ? !lltime.equals(that.lltime) : that.lltime != null) return false;
        if (lphone != null ? !lphone.equals(that.lphone) : that.lphone != null) return false;
        if (sid != null ? !sid.equals(that.sid) : that.sid != null) return false;
        if (aid != null ? !aid.equals(that.aid) : that.aid != null) return false;
        if (lstatus != null ? !lstatus.equals(that.lstatus) : that.lstatus != null) return false;
        if (laf != null ? !laf.equals(that.laf) : that.laf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + (ltitle != null ? ltitle.hashCode() : 0);
        result = 31 * result + (lcontent != null ? lcontent.hashCode() : 0);
        result = 31 * result + (limage != null ? limage.hashCode() : 0);
        result = 31 * result + (ltime != null ? ltime.hashCode() : 0);
        result = 31 * result + (lltime != null ? lltime.hashCode() : 0);
        result = 31 * result + (lphone != null ? lphone.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        result = 31 * result + (lstatus != null ? lstatus.hashCode() : 0);
        result = 31 * result + (laf != null ? laf.hashCode() : 0);
        return result;
    }
}
