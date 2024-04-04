/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author TUAN
 */
public class ThongKeModel {
    private String thang;
    private double soLuongKhaiSinh;
    private double soLuongChungTu;
    private double soLuongKetHon;
    private double soLuongLyHon;

    public ThongKeModel(String thang, double soLuongKhaiSinh, double soLuongChungTu, double soLuongKetHon, double soLuongLyHon) {
        this.thang = thang;
        this.soLuongKhaiSinh = soLuongKhaiSinh;
        this.soLuongChungTu = soLuongChungTu;
        this.soLuongKetHon = soLuongKetHon;
        this.soLuongLyHon = soLuongLyHon;
    }

    

    public ThongKeModel() {
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public double getSoLuongKhaiSinh() {
        return soLuongKhaiSinh;
    }

    public void setSoLuongKhaiSinh(double soLuongKhaiSinh) {
        this.soLuongKhaiSinh = soLuongKhaiSinh;
    }

    public double getSoLuongChungTu() {
        return soLuongChungTu;
    }

    public void setSoLuongChungTu(double soLuongChungTu) {
        this.soLuongChungTu = soLuongChungTu;
    }

    public double getSoLuongKetHon() {
        return soLuongKetHon;
    }

    public void setSoLuongKetHon(double soLuongKetHon) {
        this.soLuongKetHon = soLuongKetHon;
    }

    public double getSoLuongLyHon() {
        return soLuongLyHon;
    }

    public void setSoLuongLyHon(double soLuongLyHon) {
        this.soLuongLyHon = soLuongLyHon;
    }
    
    

    
    
    
}
