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
public class GiayChungTuModel {
     private int ID;
    private String MaCT;
    private String CCCD;
    private Date NgayMat;
    private String NoiMat;
    private String NguyenNhan;
    private int TrangThai;
    private String HoTen;
    private Date NgaySinh;
    private String MaKS;

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

   

    // Constructor
    public GiayChungTuModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public GiayChungTuModel(int ID, String MaCT, String CCCD, Date NgayMat, String NoiMat, String NguyenNhan, int TrangThai, String HoTen, Date NgaySinh, String MaKS) {
        this.ID = ID;
        this.MaCT = MaCT;
        this.CCCD = CCCD;
        this.NgayMat = NgayMat;
        this.NoiMat = NoiMat;
        this.NguyenNhan = NguyenNhan;
        this.TrangThai = TrangThai;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.MaKS = MaKS;
    }

    

    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaCT() {
        return MaCT;
    }

    public void setMaCT(String maCT) {
        MaCT = maCT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgayMat() {
        return NgayMat;
    }

    public void setNgayMat(Date ngayMat) {
        NgayMat = ngayMat;
    }

    public String getNoiMat() {
        return NoiMat;
    }

    public void setNoiMat(String noiMat) {
        NoiMat = noiMat;
    }

    public String getNguyenNhan() {
        return NguyenNhan;
    }

    public void setNguyenNhan(String nguyenNhan) {
        NguyenNhan = nguyenNhan;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }

    public String getMaKS() {
        return MaKS;
    }

    public void setMaKS(String MaKS) {
        this.MaKS = MaKS;
    }
    
    
}

