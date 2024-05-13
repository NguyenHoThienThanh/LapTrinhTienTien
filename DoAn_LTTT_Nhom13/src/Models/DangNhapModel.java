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
    private int ID;
    private String Quyen;
    private String TenDangNhap;
    private String MatKhau;
    private String Email;
    private String VerifyCode;
    private int TrangThai;

    // Constructor
    public DangNhapModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public DangNhapModel(int ID, String Quyen, String TenDangNhap, String MatKhau, int TrangThai) {
        this.ID = ID;
        this.Quyen = Quyen;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
    }

    public String getEmail() {
        return Email;   
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getVerifyCode() {
        return VerifyCode;
    }

    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

 
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;

    }

}
