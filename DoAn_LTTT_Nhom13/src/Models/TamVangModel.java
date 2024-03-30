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
public class TamVangModel {
    private int ID;
    private String MaTV;
    private String CCCD;
    private Date Ngaydk;
    private String Ncdi;
    private String Ncden;
    private Date Ngaydi;
    private Date Ngayve;
    private String Lydo;
    private int TrangThai;

    // Constructor
    public TamVangModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public TamVangModel(int ID, String MaTV, String CCCD, Date Ngaydk, String Ncdi, String Ncden, Date Ngaydi, Date Ngayve, String Lydo, int TrangThai) {
        this.ID = ID;
        this.MaTV = MaTV;
        this.CCCD = CCCD;
        this.Ngaydk = Ngaydk;
        this.Ncdi = Ncdi;
        this.Ncden = Ncden;
        this.Ngaydi = Ngaydi;
        this.Ngayve = Ngayve;
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

    public String getMaTV() {
        return MaTV;
    }

    public void setMaTV(String maTV) {
        MaTV = maTV;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgaydk() {
        return Ngaydk;
    }

    public void setNgaydk(Date ngaydk) {
        Ngaydk = ngaydk;
    }

    public String getNcdi() {
        return Ncdi;
    }

    public void setNcdi(String ncdi) {
        Ncdi = ncdi;
    }

    public String getNcden() {
        return Ncden;
    }

    public void setNcden(String ncden) {
        Ncden = ncden;
    }

    public Date getNgaydi() {
        return Ngaydi;
    }

    public void setNgaydi(Date ngaydi) {
        Ngaydi = ngaydi;
    }

    public Date getNgayve() {
        return Ngayve;
    }

    public void setNgayve(Date ngayve) {
        Ngayve = ngayve;
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
