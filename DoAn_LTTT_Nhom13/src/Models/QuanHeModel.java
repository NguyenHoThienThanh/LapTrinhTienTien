/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class QuanHeModel {
    private String MaHK;
    private String KhaiSinhNguoiThamGia;
    private String QuanHeVoiChuHo;
    private int TrangThai;

    // Constructor
    public QuanHeModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public QuanHeModel(String MaHK, String KhaiSinhNguoiThamGia, String QuanHeVoiChuHo, int TrangThai) {
        this.MaHK = MaHK;
        this.KhaiSinhNguoiThamGia = KhaiSinhNguoiThamGia;
        this.QuanHeVoiChuHo = QuanHeVoiChuHo;
        this.TrangThai = TrangThai;
    }

    
    // Getters and setters
    public String getMaHK() {
        return MaHK;
    }

    public void setMaHK(String maHK) {
        MaHK = maHK;
    }

    public String getKhaiSinhNguoiThamGia() {
        return KhaiSinhNguoiThamGia;
    }

    public void setKhaiSinhNguoiThamGia(String khaiSinhNguoiThamGia) {
        KhaiSinhNguoiThamGia = khaiSinhNguoiThamGia;
    }

    public String getQuanHeVoiChuHo() {
        return QuanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        QuanHeVoiChuHo = quanHeVoiChuHo;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
}
