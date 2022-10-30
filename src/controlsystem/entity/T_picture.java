package controlsystem.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class T_picture {
    private Integer pid;
    private String pcode;
    private String pname;
    private String psize;
    private String ptype;
    private Short pstatus;
    private Date ptime;
    private String pauthor;
    private String pPhone;
    private String pfax;
    private String pdesc;
    private String paddress;
    private List<T_picture> picList ;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPsize() {
        return psize;
    }

    public void setPsize(String psize) {
        this.psize = psize;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public Short getPstatus() {
        return pstatus;
    }

    public void setPstatus(Short pstatus) {
        this.pstatus = pstatus;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getPauthor() {
        return pauthor;
    }

    public void setPauthor(String pauthor) {
        this.pauthor = pauthor;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    public String getPfax() {
        return pfax;
    }

    public void setPfax(String pfax) {
        this.pfax = pfax;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public List<T_picture> getPicList() {
        return picList;
    }

    public void setPicList(List<T_picture> picList) {
        this.picList = picList;
    }

    @Override
    public String toString() {
        return "T_picture{" +
                "pid=" + pid +
                ", pcode='" + pcode + '\'' +
                ", pname='" + pname + '\'' +
                ", psize='" + psize + '\'' +
                ", ptype='" + ptype + '\'' +
                ", pstatus=" + pstatus +
                ", ptime=" + ptime +
                ", pauthor='" + pauthor + '\'' +
                ", pPhone='" + pPhone + '\'' +
                ", pfax='" + pfax + '\'' +
                ", pdesc='" + pdesc + '\'' +
                ", paddress='" + paddress + '\'' +
                ", picList=" + picList +
                '}';
    }
}
