/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DonTamTru {
    private String MaTT;
    private String HoTen;
    private Date NgaySinh;
    private String CCCD; 
    private String NoiCap;
    private Date NgayCap;
    private Date NgayDen;
    private Date NgayDi;
    private Date NgayDk;
    private String LiDo;
    private String NoiDangKy;

    public DonTamTru() {
    }

    public DonTamTru(String MaTT, String HoTen, Date NgaySinh, String CCCD, String NoiCap, Date NgayCap, Date NgayDen, Date NgayDi, Date NgayDk, String LiDo, String NoiDangKy) {
        this.MaTT = MaTT;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.CCCD = CCCD;
        this.NoiCap = NoiCap;
        this.NgayCap = NgayCap;
        this.NgayDen = NgayDen;
        this.NgayDi = NgayDi;
        this.NgayDk = NgayDk;
        this.LiDo = LiDo;
        this.NoiDangKy = NoiDangKy;
    }

    public String getMaTT() {
        return MaTT;
    }

    public void setMaTT(String MaTT) {
        this.MaTT = MaTT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getNoiCap() {
        return NoiCap;
    }

    public void setNoiCap(String NoiCap) {
        this.NoiCap = NoiCap;
    }

    public Date getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(Date NgayCap) {
        this.NgayCap = NgayCap;
    }

    public Date getNgayDen() {
        return NgayDen;
    }

    public void setNgayDen(Date NgayDen) {
        this.NgayDen = NgayDen;
    }

    public Date getNgayDi() {
        return NgayDi;
    }

    public void setNgayDi(Date NgayDi) {
        this.NgayDi = NgayDi;
    }

    public Date getNgayDk() {
        return NgayDk;
    }

    public void setNgayDk(Date NgayDk) {
        this.NgayDk = NgayDk;
    }

    public String getLiDo() {
        return LiDo;
    }

    public void setLiDo(String LiDo) {
        this.LiDo = LiDo;
    }

    public String getNoiDangKy() {
        return NoiDangKy;
    }

    public void setNoiDangKy(String NoiDangKy) {
        this.NoiDangKy = NoiDangKy;
    }
    
    
    
}
