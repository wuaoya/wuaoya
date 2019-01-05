package com.way.domain;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "monitor", schema = "wuaoya", catalog = "")
@DynamicInsert(value = true)
public class MonitorEntity {
    private int mid;
    private String mclass;
    private String mtitle;
    private Integer sid;
    private Timestamp mdate;
    private Integer muid;
    private String matatus;
    private String mcontent;

    @Id
    @Column(name = "mid")
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "mclass")
    public String getMclass() {
        return mclass;
    }

    public void setMclass(String mclass) {
        this.mclass = mclass;
    }

    @Basic
    @Column(name = "mtitle")
    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
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
    @Column(name = "mdate")
    public Timestamp getMdate() {
        return mdate;
    }

    public void setMdate(Timestamp mdate) {
        this.mdate = mdate;
    }

    @Basic
    @Column(name = "muid")
    public Integer getMuid() {
        return muid;
    }

    public void setMuid(Integer muid) {
        this.muid = muid;
    }

    @Basic
    @Column(name = "matatus")
    public String getMatatus() {
        return matatus;
    }

    public void setMatatus(String matatus) {
        this.matatus = matatus;
    }

    @Basic
    @Column(name = "mcontent")
    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonitorEntity that = (MonitorEntity) o;

        if (mid != that.mid) return false;
        if (mclass != null ? !mclass.equals(that.mclass) : that.mclass != null) return false;
        if (mtitle != null ? !mtitle.equals(that.mtitle) : that.mtitle != null) return false;
        if (sid != null ? !sid.equals(that.sid) : that.sid != null) return false;
        if (mdate != null ? !mdate.equals(that.mdate) : that.mdate != null) return false;
        if (muid != null ? !muid.equals(that.muid) : that.muid != null) return false;
        if (matatus != null ? !matatus.equals(that.matatus) : that.matatus != null) return false;
        if (mcontent != null ? !mcontent.equals(that.mcontent) : that.mcontent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (mclass != null ? mclass.hashCode() : 0);
        result = 31 * result + (mtitle != null ? mtitle.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (mdate != null ? mdate.hashCode() : 0);
        result = 31 * result + (muid != null ? muid.hashCode() : 0);
        result = 31 * result + (matatus != null ? matatus.hashCode() : 0);
        result = 31 * result + (mcontent != null ? mcontent.hashCode() : 0);
        return result;
    }
}
