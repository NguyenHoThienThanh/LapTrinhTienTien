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
    private String HoTenNguoiNopDon;
    private String CCCDVO;
    private String CCCDChong;
    private String HoTenVo;
    private String HoTenChong;

    public LyHonModel(String MaLh, String MaCnkh, String CCCDNguoiNopDon, String HoTenNguoiNopDon, String CCCDVO, String HoTenVo, String CCCDChong, String HoTenChong, Date Ngaydk, String Noidk, String Lydo, int TrangThai) {
        this.MaLh = MaLh;
        this.MaCnkh = MaCnkh;
        this.CCCDNguoiNopDon = CCCDNguoiNopDon;
        this.HoTenNguoiNopDon = HoTenNguoiNopDon;
        this.CCCDVO = CCCDVO;
        this.HoTenVo = HoTenVo;
        this.CCCDChong = CCCDChong;
        this.HoTenChong = HoTenChong;
        this.Ngaydk = Ngaydk;
        this.Noidk = Noidk;
        this.Lydo = Lydo;
        this.TrangThai = TrangThai;
    }

    // Constructor
    public LyHonModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaLh() {
        return MaLh;
    }

    public void setMaLh(String MaLh) {
        this.MaLh = MaLh;
    }

    public String getMaCnkh() {
        return MaCnkh;
    }

    public void setMaCnkh(String MaCnkh) {
        this.MaCnkh = MaCnkh;
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

    public void setNoidk(String Noidk) {
        this.Noidk = Noidk;
    }

    public Date getNgaydk() {
        return Ngaydk;
    }

    public void setNgaydk(Date Ngaydk) {
        this.Ngaydk = Ngaydk;
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

    public String getHoTenNguoiNopDon() {
        return HoTenNguoiNopDon;
    }

    public void setHoTenNguoiNopDon(String HoTenNguoiNopDon) {
        this.HoTenNguoiNopDon = HoTenNguoiNopDon;
    }

    public String getCCCDVO() {
        return CCCDVO;
    }

    public void setCCCDVO(String CCCDVO) {
        this.CCCDVO = CCCDVO;
    }

    public String getCCCDChong() {
        return CCCDChong;
    }

    public void setCCCDChong(String CCCDChong) {
        this.CCCDChong = CCCDChong;
    }

    public String getHoTenVo() {
        return HoTenVo;
    }

    public void setHoTenVo(String HoTenVo) {
        this.HoTenVo = HoTenVo;
    }

    public String getHoTenChong() {
        return HoTenChong;
    }

    public void setHoTenChong(String HoTenChong) {
        this.HoTenChong = HoTenChong;
    }

}
