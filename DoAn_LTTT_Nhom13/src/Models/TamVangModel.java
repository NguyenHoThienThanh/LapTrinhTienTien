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
    private String HoTen;
    private Date NgaySinh;
    private String NoiCapCCCD;
    private Date NgayCapCCCD;

    // Constructor
    public TamVangModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public TamVangModel(int ID, String MaTV, String CCCD, Date Ngaydk, String Ncdi, String Ncden, Date Ngaydi, Date Ngayve, String Lydo, int TrangThai, String HoTen, Date NgaySinh, String NoiCapCCCD, Date NgayCapCCCD) {
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
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.NoiCapCCCD = NoiCapCCCD;
        this.NgayCapCCCD = NgayCapCCCD;
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

    public String getNoiCapCCCD() {
        return NoiCapCCCD;
    }

    public void setNoiCapCCCD(String NoiCapCCCD) {
        this.NoiCapCCCD = NoiCapCCCD;
    }

    public Date getNgayCapCCCD() {
        return NgayCapCCCD;
    }

    public void setNgayCapCCCD(Date NgayCapCCCD) {
        this.NgayCapCCCD = NgayCapCCCD;
    }
    
    
}
