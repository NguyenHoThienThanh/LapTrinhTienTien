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
public class ChungNhanKetHonModel {
    private int ID;
    private String MaCnkh;
    private String CCCDVo;
    private String CCCDChong;
    private String Noidk;
    private Date Ngaydk;
    private int TrangThai;

    // Constructor
    public ChungNhanKetHonModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public ChungNhanKetHonModel(int ID, String MaCnkh, String CCCDVo, String CCCDChong, String Noidk, Date Ngaydk, int TrangThai) {
        this.ID = ID;
        this.MaCnkh = MaCnkh;
        this.CCCDVo = CCCDVo;
        this.CCCDChong = CCCDChong;
        this.Noidk = Noidk;
        this.Ngaydk = Ngaydk;
        this.TrangThai = TrangThai;
    }

    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaCnkh() {
        return MaCnkh;
    }

    public void setMaCnkh(String maCnkh) {
        MaCnkh = maCnkh;
    }

    public String getCCCDVo() {
        return CCCDVo;
    }

    public void setCCCDVo(String CCCDVo) {
        this.CCCDVo = CCCDVo;
    }

    public String getCCCDChong() {
        return CCCDChong;
    }

    public void setCCCDChong(String CCCDChong) {
        this.CCCDChong = CCCDChong;
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

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
}
