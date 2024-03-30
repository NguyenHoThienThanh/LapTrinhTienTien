/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class DangNhapModel {
    private String Quyen;
    private String TenDangNhap;
    private String MatKhau;
    private int TrangThai;

    // Constructor
    public DangNhapModel() {
        // Không có gì cần khởi tạo trong constructor này
    }
    
    // Getters and setters
    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String quyen) {
        Quyen = quyen;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        TenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
}
