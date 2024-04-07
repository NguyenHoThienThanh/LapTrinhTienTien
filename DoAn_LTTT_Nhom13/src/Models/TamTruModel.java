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
public class TamTruModel {
     private int ID;
    private String MaTT;
    private String CCCD;
    private Date Ngaydk;
    private String Noidk;
    private Date Ngayden;
    private Date Ngaydi;
    private String Lydo;
    private int TrangThai;
    private String HoTen;
    private String NcCccd;
    private Date NgcCccd;
    private String MaKS;
    private String SDT;
    private String Email;
    private Date NgaySinh;
    private String GioiTinh;

    // Constructor
    public TamTruModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public TamTruModel(int ID, String MaTT, String CCCD, Date Ngaydk, String Noidk, Date Ngayden, Date Ngaydi, String Lydo, int TrangThai, String HoTen, String NcCccd, Date NgcCccd, String MaKS, String SDT, String Email, Date NgaySinh, String GioiTinh) {
        this.ID = ID;
        this.MaTT = MaTT;
        this.CCCD = CCCD;
        this.Ngaydk = Ngaydk;
        this.Noidk = Noidk;
        this.Ngayden = Ngayden;
        this.Ngaydi = Ngaydi;
        this.Lydo = Lydo;
        this.TrangThai = TrangThai;
        this.HoTen = HoTen;
        this.NcCccd = NcCccd;
        this.NgcCccd = NgcCccd;
        this.MaKS = MaKS;
        this.SDT = SDT;
        this.Email = Email;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
    }

    

    

    
    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaTT() {
        return MaTT;
    }

    public void setMaTT(String maTT) {
        MaTT = maTT;
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

    public String getNoidk() {
        return Noidk;
    }

    public void setNoidk(String noidk) {
        Noidk = noidk;
    }

    public Date getNgayden() {
        return Ngayden;
    }

    public void setNgayden(Date ngayden) {
        Ngayden = ngayden;
    }

    public Date getNgaydi() {
        return Ngaydi;
    }

    public void setNgaydi(Date ngaydi) {
        Ngaydi = ngaydi;
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

    public String getNcCccd() {
        return NcCccd;
    }

    public void setNcCccd(String NcCccd) {
        this.NcCccd = NcCccd;
    }

    public Date getNgcCccd() {
        return NgcCccd;
    }

    public void setNgcCccd(Date NgcCccd) {
        this.NgcCccd = NgcCccd;
    }

    public String getMaKS() {
        return MaKS;
    }

    public void setMaKS(String MaKS) {
        this.MaKS = MaKS;
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

    public void setEmail(String Email) {
        this.Email = Email;
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
    
    
}
