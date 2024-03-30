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
public class ThueModel {
    private int ID;
    private String Masothue;
    private String Coquanthue;
    private String SoCMT_CCCD;
    private Date Ngaythaydoithongtingannhat;
    private int TrangThai;

    // Constructor
    public ThueModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public ThueModel(int ID, String Masothue, String Coquanthue, String SoCMT_CCCD, Date Ngaythaydoithongtingannhat, int TrangThai) {
        this.ID = ID;
        this.Masothue = Masothue;
        this.Coquanthue = Coquanthue;
        this.SoCMT_CCCD = SoCMT_CCCD;
        this.Ngaythaydoithongtingannhat = Ngaythaydoithongtingannhat;
        this.TrangThai = TrangThai;
    }  
    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMasothue() {
        return Masothue;
    }

    public void setMasothue(String masothue) {
        Masothue = masothue;
    }

    public String getCoquanthue() {
        return Coquanthue;
    }

    public void setCoquanthue(String coquanthue) {
        Coquanthue = coquanthue;
    }

    public String getSoCMT_CCCD() {
        return SoCMT_CCCD;
    }

    public void setSoCMT_CCCD(String soCMT_CCCD) {
        SoCMT_CCCD = soCMT_CCCD;
    }

    public Date getNgaythaydoithongtingannhat() {
        return Ngaythaydoithongtingannhat;
    }

    public void setNgaythaydoithongtingannhat(Date ngaythaydoithongtingannhat) {
        Ngaythaydoithongtingannhat = ngaythaydoithongtingannhat;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
}
