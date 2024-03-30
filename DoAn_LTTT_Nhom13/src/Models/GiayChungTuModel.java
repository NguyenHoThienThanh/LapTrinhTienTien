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

    // Constructor
    public GiayChungTuModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public GiayChungTuModel(int ID, String MaCT, String CCCD, Date NgayMat, String NoiMat, String NguyenNhan, int TrangThai) {
        this.ID = ID;
        this.MaCT = MaCT;
        this.CCCD = CCCD;
        this.NgayMat = NgayMat;
        this.NoiMat = NoiMat;
        this.NguyenNhan = NguyenNhan;
        this.TrangThai = TrangThai;
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
}

