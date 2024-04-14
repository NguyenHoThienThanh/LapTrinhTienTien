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
public class DonTamVangUser {
    private String MaTV;
    private String HoTen;
    private String GioiTinh;
    private Date NgaySinh;
    private Date NgayDk;
    private String CCCD; 
    private String NoiCap;
    private Date NgayCap;
    private String Sdt; 
    private String Email;   
    private String NoiChuyenDi;
    private String NoiChuyenDen;
    private Date NgayDi;
    private Date NgayVe;
    private String Lydo;
    private int TrangThai;

    @Override
    public String toString() {
        return "DonTamVangUser{" + "MaTV=" + MaTV + ", HoTen=" + HoTen + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", NgayDk=" + NgayDk + ", CCCD=" + CCCD + ", NoiCap=" + NoiCap + ", NgayCap=" + NgayCap + ", Sdt=" + Sdt + ", Email=" + Email + ", NoiChuyenDi=" + NoiChuyenDi + ", NoiChuyenDen=" + NoiChuyenDen + ", NgayDi=" + NgayDi + ", NgayVe=" + NgayVe + ", Lydo=" + Lydo + ", TrangThai=" + TrangThai + '}';
    }

    public String getMaTV() {
        return MaTV;
    }

    public void setMaTV(String MaTV) {
        this.MaTV = MaTV;
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

    public String getNoiChuyenDi() {
        return NoiChuyenDi;
    }

    public void setNoiChuyenDi(String NoiChuyenDi) {
        this.NoiChuyenDi = NoiChuyenDi;
    }

    public String getNoiChuyenDen() {
        return NoiChuyenDen;
    }

    public void setNoiChuyenDen(String NoiChuyenDen) {
        this.NoiChuyenDen = NoiChuyenDen;
    }

    public Date getNgayDi() {
        return NgayDi;
    }

    public void setNgayDi(Date NgayDi) {
        this.NgayDi = NgayDi;
    }

    public Date getNgayVe() {
        return NgayVe;
    }

    public void setNgayVe(Date NgayVe) {
        this.NgayVe = NgayVe;
    }

    public String getLydo() {
        return Lydo;
    }

    public void setLydo(String Lydo) {
        this.Lydo = Lydo;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public DonTamVangUser() {
    }

    public DonTamVangUser(String MaTV, String HoTen, String GioiTinh, Date NgaySinh, Date NgayDk, String CCCD, String NoiCap, Date NgayCap, String Sdt, String Email, String NoiChuyenDi, String NoiChuyenDen, Date NgayDi, Date NgayVe, String Lydo, int TrangThai) {
        this.MaTV = MaTV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NgayDk = NgayDk;
        this.CCCD = CCCD;
        this.NoiCap = NoiCap;
        this.NgayCap = NgayCap;
        this.Sdt = Sdt;
        this.Email = Email;
        this.NoiChuyenDi = NoiChuyenDi;
        this.NoiChuyenDen = NoiChuyenDen;
        this.NgayDi = NgayDi;
        this.NgayVe = NgayVe;
        this.Lydo = Lydo;
        this.TrangThai = TrangThai;
    }

}
