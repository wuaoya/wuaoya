package com.way.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "news", schema = "wuaoya", catalog = "")
public class NewsEntity {
    private int nid;
    private String nclass;
    private String ncontent;
    private Timestamp ndate;
    private Integer uid;
    private String ntitle;

    @Id
    @Column(name = "nid")
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Basic
    @Column(name = "nclass")
    public String getNclass() {
        return nclass;
    }

    public void setNclass(String nclass) {
        this.nclass = nclass;
    }

    @Basic
    @Column(name = "ncontent")
    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    @Basic
    @Column(name = "ndate")
    public Timestamp getNdate() {
        return ndate;
    }

    public void setNdate(Timestamp ndate) {
        this.ndate = ndate;
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
    @Column(name = "ntitle")
    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsEntity that = (NewsEntity) o;

        if (nid != that.nid) return false;
        if (nclass != null ? !nclass.equals(that.nclass) : that.nclass != null) return false;
        if (ncontent != null ? !ncontent.equals(that.ncontent) : that.ncontent != null) return false;
        if (ndate != null ? !ndate.equals(that.ndate) : that.ndate != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (ntitle != null ? !ntitle.equals(that.ntitle) : that.ntitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + (nclass != null ? nclass.hashCode() : 0);
        result = 31 * result + (ncontent != null ? ncontent.hashCode() : 0);
        result = 31 * result + (ndate != null ? ndate.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (ntitle != null ? ntitle.hashCode() : 0);
        return result;
    }
}
