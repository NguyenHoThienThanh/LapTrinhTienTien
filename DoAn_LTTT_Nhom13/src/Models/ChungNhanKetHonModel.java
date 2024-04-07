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
public class ChungNhanKetHonModel {
    private int ID;
    private String MaCnkh;
    private String CCCDVo;
    private String CCCDChong;
    private String Noidk;
    private Date Ngaydk;
    private int TrangThai;
    private String HoTenVo;
    private String HoTenChong;
    private Date NgaySinhVo;
    private Date NgaySinhChong;
    private String QuocTichVo;
    private String QuocTichChong;
    private String DanTocVo;
    private String DanTocChong;
    private String NoiCuTruVo;
    private String NoiCuTruChong;

    public ChungNhanKetHonModel(String MaCnkh, String CCCDVo, String CCCDChong, String Noidk, Date Ngaydk, int TrangThai, String HoTenVo, String HoTenChong, Date NgaySinhVo, Date NgaySinhChong, String QuocTichVo, String QuocTichChong, String DanTocVo, String NoiCuTruVo, String NoiCuTruChong) {
        this.MaCnkh = MaCnkh;
        this.CCCDVo = CCCDVo;
        this.CCCDChong = CCCDChong;
        this.Noidk = Noidk;
        this.Ngaydk = Ngaydk;
        this.TrangThai = TrangThai;
        this.HoTenVo = HoTenVo;
        this.HoTenChong = HoTenChong;
        this.NgaySinhVo = NgaySinhVo;
        this.NgaySinhChong = NgaySinhChong;
        this.QuocTichVo = QuocTichVo;
        this.QuocTichChong = QuocTichChong;
        this.DanTocVo = DanTocVo;
        this.NoiCuTruVo = NoiCuTruVo;
        this.NoiCuTruChong = NoiCuTruChong;
    }

    public String getHoTenVo() {
        return HoTenVo;
    }

    public void setHoTenVo(String HoTenVo) {
        this.HoTenVo = HoTenVo;
    }

    public String getHoTenChong() {
        return HoTenChong;
    }

    public void setHoTenChong(String HoTenChong) {
        this.HoTenChong = HoTenChong;
    }

    public Date getNgaySinhVo() {
        return NgaySinhVo;
    }

    public void setNgaySinhVo(Date NgaySinhVo) {
        this.NgaySinhVo = NgaySinhVo;
    }

    public Date getNgaySinhChong() {
        return NgaySinhChong;
    }

    public void setNgaySinhChong(Date NgaySinhChong) {
        this.NgaySinhChong = NgaySinhChong;
    }

    public String getQuocTichVo() {
        return QuocTichVo;
    }

    public void setQuocTichVo(String QuocTichVo) {
        this.QuocTichVo = QuocTichVo;
    }

    public String getQuocTichChong() {
        return QuocTichChong;
    }

    public void setQuocTichChong(String QuocTichChong) {
        this.QuocTichChong = QuocTichChong;
    }

    public String getDanTocVo() {
        return DanTocVo;
    }

    public void setDanTocVo(String DanTocVo) {
        this.DanTocVo = DanTocVo;
    }

    public String getDanTocChong() {
        return DanTocChong;
    }

    public void setDanTocChong(String DanTocChong) {
        this.DanTocChong = DanTocChong;
    }

    public String getNoiCuTruVo() {
        return NoiCuTruVo;
    }

    public void setNoiCuTruVo(String NoiCuTruVo) {
        this.NoiCuTruVo = NoiCuTruVo;
    }

    public String getNoiCuTruChong() {
        return NoiCuTruChong;
    }

    public void setNoiCuTruChong(String NoiCuTruChong) {
        this.NoiCuTruChong = NoiCuTruChong;
    }

    // Constructor
    public ChungNhanKetHonModel() {
        // Không có gì cần khởi tạo trong constructor này
    }

    public ChungNhanKetHonModel(int ID, String MaCnkh, String CCCDVo, String CCCDChong, String Noidk, Date Ngaydk, int TrangThai) {
        this.ID = ID;
        this.MaCnkh = MaCnkh;
        this.CCCDVo = CCCDVo;
        this.CCCDChong = CCCDChong;
        this.Noidk = Noidk;
        this.Ngaydk = Ngaydk;
        this.TrangThai = TrangThai;
    }

    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaCnkh() {
        return MaCnkh;
    }

    public void setMaCnkh(String maCnkh) {
        MaCnkh = maCnkh;
    }

    public String getCCCDVo() {
        return CCCDVo;
    }

    public void setCCCDVo(String CCCDVo) {
        this.CCCDVo = CCCDVo;
    }

    public String getCCCDChong() {
        return CCCDChong;
    }

    public void setCCCDChong(String CCCDChong) {
        this.CCCDChong = CCCDChong;
    }

    public String getNoidk() {
        return Noidk;
    }

    public void setNoidk(String noidk) {
        Noidk = noidk;
    }

    public Date getNgaydk() {
        return Ngaydk;
    }

    public void setNgaydk(Date ngaydk) {
        Ngaydk = ngaydk;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
}
