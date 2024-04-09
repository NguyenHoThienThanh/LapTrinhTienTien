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
public class CongDanModel {
    private String CCCD;
    private String HoTen;
    private String NcCccd;
    private Date NgcCccd;
    private String MaKS;
    private String SDT;
    private String Email;
    private int TrangThai;
    private Date NgaySinh;
    private String GioiTinh;
    private String NoiSinh;

    // Constructor
    public CongDanModel() {
    }

    public CongDanModel(String CCCD, String HoTen, String NcCccd, Date NgcCccd, String MaKS, String SDT, String Email, int TrangThai, Date NgaySinh, String GioiTinh, String NoiSinh) {
        this.CCCD = CCCD;
        this.HoTen = HoTen;
        this.NcCccd = NcCccd;
        this.NgcCccd = NgcCccd;
        this.MaKS = MaKS;
        this.SDT = SDT;
        this.Email = Email;
        this.TrangThai = TrangThai;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.NoiSinh = NoiSinh;
    }
    
    // Getters and setters
    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNcCccd() {
        return NcCccd;
    }

    public void setNcCccd(String ncCccd) {
        NcCccd = ncCccd;
    }

    public Date getNgcCccd() {
        return NgcCccd;
    }

    public void setNgcCccd(Date ngcCccd) {
        NgcCccd = ngcCccd;
    }

    public String getMaKS() {
        return MaKS;
    }

    public void setMaKS(String maKS) {
        MaKS = maKS;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    
    
    
}
 

