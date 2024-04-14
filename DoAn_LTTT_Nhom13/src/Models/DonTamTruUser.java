/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class DonTamTruUser {
    private String MaTT;
    private String HoTen;
    private String GioiTinh;
    private Date NgaySinh;
    private Date NgayDk;
    private String CCCD; 
    private String NoiCap;
    private Date NgayCap;
    private String Sdt; 
    private String Email;   
    private String LiDo;    
    private Date NgayDen;
    private Date NgayDi;
    private String NoiDangKy;
    private int TrangThai;

    public DonTamTruUser(String MaTT, String HoTen, String GioiTinh, Date NgaySinh, Date NgayDk, String CCCD, String NoiCap, Date NgayCap, String Sdt, String Email, String LiDo, Date NgayDen, Date NgayDi, String NoiDangKy, int TrangThai) {
        this.MaTT = MaTT;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NgayDk = NgayDk;
        this.CCCD = CCCD;
        this.NoiCap = NoiCap;
        this.NgayCap = NgayCap;
        this.Sdt = Sdt;
        this.Email = Email;
        this.LiDo = LiDo;
        this.NgayDen = NgayDen;
        this.NgayDi = NgayDi;
        this.NoiDangKy = NoiDangKy;
        this.TrangThai = TrangThai;
    }

    public DonTamTruUser() {
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

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public Date getNgayDk() {
        return NgayDk;
    }

    public void setNgayDk(Date NgayDk) {
        this.NgayDk = NgayDk;
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

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLiDo() {
        return LiDo;
    }

    public void setLiDo(String LiDo) {
        this.LiDo = LiDo;
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

    public String getNoiDangKy() {
        return NoiDangKy;
    }

    public void setNoiDangKy(String NoiDangKy) {
        this.NoiDangKy = NoiDangKy;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
