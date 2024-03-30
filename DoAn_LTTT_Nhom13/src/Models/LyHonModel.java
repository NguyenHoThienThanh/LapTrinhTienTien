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
public class LyHonModel {
    private int ID;
    private String MaLh;
    private String MaCnkh;
    private String CCCDNguoiNopDon;
    private String Noidk;
    private Date Ngaydk;
    private String Lydo;
    private int TrangThai;

    // Constructor
    public LyHonModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public LyHonModel(int ID, String MaLh, String MaCnkh, String CCCDNguoiNopDon, String Noidk, Date Ngaydk, String Lydo, int TrangThai) {
        this.ID = ID;
        this.MaLh = MaLh;
        this.MaCnkh = MaCnkh;
        this.CCCDNguoiNopDon = CCCDNguoiNopDon;
        this.Noidk = Noidk;
        this.Ngaydk = Ngaydk;
        this.Lydo = Lydo;
        this.TrangThai = TrangThai;
    }

    
    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaLh() {
        return MaLh;
    }

    public void setMaLh(String maLh) {
        MaLh = maLh;
    }

    public String getMaCnkh() {
        return MaCnkh;
    }

    public void setMaCnkh(String maCnkh) {
        MaCnkh = maCnkh;
    }

    public String getCCCDNguoiNopDon() {
        return CCCDNguoiNopDon;
    }

    public void setCCCDNguoiNopDon(String CCCDNguoiNopDon) {
        this.CCCDNguoiNopDon = CCCDNguoiNopDon;
    }

    public String getNoidk() {
        return Noidk;
    }

    public void setNoidk(String noidk) {
        Noidk = noidk;
    }

    public Date getNgaydk() {
        return Ngaydk;
    }

    public void setNgaydk(Date ngaydk) {
        Ngaydk = ngaydk;
    }

    public String getLydo() {
        return Lydo;
    }

    public void setLydo(String lydo) {
        Lydo = lydo;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
}
