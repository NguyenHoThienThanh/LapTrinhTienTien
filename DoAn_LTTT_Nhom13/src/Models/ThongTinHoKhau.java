
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
public class ThongTinHoKhau {
    private String MaHoKhau;
    private String CCCDNguoiThan;
    private String CCCDChuHo;
    private String CCCDNguoiDangNhap;
    private String QuanHeVoiChuHo;
    private String DiaChi;
    private String HoTenChuHo;
    private String HoTenNguoiThan;
    private String HoTenNguoiDangNhap;
    private Date NgaySinh;
    private String KhaiSinhChuHo, KhaiSinhNguoiThamGia;

    public ThongTinHoKhau(String MaHoKhau, String CCCDNguoiThan, String CCCDChuHo, String CCCDNguoiDangNhap, String QuanHeVoiChuHo, String DiaChi, String HoTenChuHo, String HoTenNguoiThan, String HoTenNguoiDangNhap, Date NgaySinh, String KhaiSinhChuHo, String KhaiSinhNguoiThamGia) {
        this.MaHoKhau = MaHoKhau;
        this.CCCDNguoiThan = CCCDNguoiThan;
        this.CCCDChuHo = CCCDChuHo;
        this.CCCDNguoiDangNhap = CCCDNguoiDangNhap;
        this.QuanHeVoiChuHo = QuanHeVoiChuHo;
        this.DiaChi = DiaChi;
        this.HoTenChuHo = HoTenChuHo;
        this.HoTenNguoiThan = HoTenNguoiThan;
        this.HoTenNguoiDangNhap = HoTenNguoiDangNhap;
        this.NgaySinh = NgaySinh;
        this.KhaiSinhChuHo = KhaiSinhChuHo;
        this.KhaiSinhNguoiThamGia = KhaiSinhNguoiThamGia;
    }

    public ThongTinHoKhau() {
    }

    public String getMaHoKhau() {
        return MaHoKhau;
    }

    public void setMaHoKhau(String MaHoKhau) {
        this.MaHoKhau = MaHoKhau;
    }

    public String getCCCDNguoiThan() {
        return CCCDNguoiThan;
    }

    public void setCCCDNguoiThan(String CCCDNguoiThan) {
        this.CCCDNguoiThan = CCCDNguoiThan;
    }

    public String getCCCDChuHo() {
        return CCCDChuHo;
    }

    public void setCCCDChuHo(String CCCDChuHo) {
        this.CCCDChuHo = CCCDChuHo;
    }

    public String getCCCDNguoiDangNhap() {
        return CCCDNguoiDangNhap;
    }

    public void setCCCDNguoiDangNhap(String CCCDNguoiDangNhap) {
        this.CCCDNguoiDangNhap = CCCDNguoiDangNhap;
    }

    public String getQuanHeVoiChuHo() {
        return QuanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String QuanHeVoiChuHo) {
        this.QuanHeVoiChuHo = QuanHeVoiChuHo;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getHoTenChuHo() {
        return HoTenChuHo;
    }

    public void setHoTenChuHo(String HoTenChuHo) {
        this.HoTenChuHo = HoTenChuHo;
    }

    public String getHoTenNguoiThan() {
        return HoTenNguoiThan;
    }

    public void setHoTenNguoiThan(String HoTenNguoiThan) {
        this.HoTenNguoiThan = HoTenNguoiThan;
    }

    public String getHoTenNguoiDangNhap() {
        return HoTenNguoiDangNhap;
    }

    public void setHoTenNguoiDangNhap(String HoTenNguoiDangNhap) {
        this.HoTenNguoiDangNhap = HoTenNguoiDangNhap;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getKhaiSinhChuHo() {
        return KhaiSinhChuHo;
    }

    public void setKhaiSinhChuHo(String KhaiSinhChuHo) {
        this.KhaiSinhChuHo = KhaiSinhChuHo;
    }

    public String getKhaiSinhNguoiThamGia() {
        return KhaiSinhNguoiThamGia;
    }

    public void setKhaiSinhNguoiThamGia(String KhaiSinhNguoiThamGia) {
        this.KhaiSinhNguoiThamGia = KhaiSinhNguoiThamGia;
    }

  
}
