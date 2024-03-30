/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

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

    // Constructor
    public HoKhauModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public HoKhauModel(int ID, String MaHK, String DiaChi, String KhaiSinhChuHo, int TrangThai) {
        this.ID = ID;
        this.MaHK = MaHK;
        this.DiaChi = DiaChi;
        this.KhaiSinhChuHo = KhaiSinhChuHo;
        this.TrangThai = TrangThai;
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
}
