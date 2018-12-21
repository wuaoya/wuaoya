package com.way.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lost", schema = "wuaoya", catalog = "")
public class LostEntity {
    private int lid;
    private String ltitle;
    private Integer uid;
    private Timestamp ltime;
    private String lltime;
    private String lphone;

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
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LostEntity that = (LostEntity) o;

        if (lid != that.lid) return false;
        if (ltitle != null ? !ltitle.equals(that.ltitle) : that.ltitle != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (ltime != null ? !ltime.equals(that.ltime) : that.ltime != null) return false;
        if (lltime != null ? !lltime.equals(that.lltime) : that.lltime != null) return false;
        if (lphone != null ? !lphone.equals(that.lphone) : that.lphone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + (ltitle != null ? ltitle.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (ltime != null ? ltime.hashCode() : 0);
        result = 31 * result + (lltime != null ? lltime.hashCode() : 0);
        result = 31 * result + (lphone != null ? lphone.hashCode() : 0);
        return result;
    }
}
