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
public class HoKhauModel {
    private int ID;
    private String MaHK;
    private String DiaChi;
    private String KhaiSinhChuHo;
    private int TrangThai;
    private String HoTen;
    private String SoCCCD;
    private String GioiTinh;
    private Date NgaySinh;
    private String SDT;
    private String Email;
    private String MaKS;

    // Constructor
    public HoKhauModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public HoKhauModel(int ID, String MaHK, String DiaChi, String KhaiSinhChuHo, int TrangThai, String HoTen, String SoCCCD, String GioiTinh, Date NgaySinh, String SDT, String Email, String MaKS) {
        this.ID = ID;
        this.MaHK = MaHK;
        this.DiaChi = DiaChi;
        this.KhaiSinhChuHo = KhaiSinhChuHo;
        this.TrangThai = TrangThai;
        this.HoTen = HoTen;
        this.SoCCCD = SoCCCD;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.MaKS = MaKS;
    }

    

    
    
    
    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaHK() {
        return MaHK;
    }

    public void setMaHK(String maHK) {
        MaHK = maHK;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getKhaiSinhChuHo() {
        return KhaiSinhChuHo;
    }

    public void setKhaiSinhChuHo(String khaiSinhChuHo) {
        KhaiSinhChuHo = khaiSinhChuHo;
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

    public String getSoCCCD() {
        return SoCCCD;
    }

    public void setSoCCCD(String SoCCCD) {
        this.SoCCCD = SoCCCD;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
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

    public String getMaKS() {
        return MaKS;
    }

    public void setMaKS(String MaKS) {
        this.MaKS = MaKS;
    }
    
    
    
}
