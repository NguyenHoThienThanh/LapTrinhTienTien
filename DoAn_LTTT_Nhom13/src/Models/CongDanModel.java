package Models;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class CongDanModel {

    private String CCCD;
    private String HoTen;
    private String NcCccd;
    private Date NgcCccd;
    private String MaKS;
    private String SDT;
    private String Email;
    private int TrangThai;
    private Date NgaySinh;
    private String GioiTinh;
    private String NoiSinh;

    //Them
    private String QuocTich;
    private String DanToc;
    private String QueQuan;
    private String DiaChi;
    private byte[] HinhAnh;
    private int ID;

    // Constructor
    public CongDanModel() {
    }

    public CongDanModel(ResultSet resultSet) throws SQLException {
        this.CCCD = resultSet.getString("CCCD");
        this.HoTen = resultSet.getString("HoTen");
        this.NcCccd = resultSet.getString("NcCccd");
        this.NgcCccd = resultSet.getDate("NgcCccd");
        this.MaKS = resultSet.getString("MaKS");
        this.SDT = resultSet.getString("SDT");
        this.Email = resultSet.getString("Email");
        this.TrangThai = resultSet.getInt("TrangThai");
        this.NgaySinh = resultSet.getDate("NgaySinh");
        this.GioiTinh = resultSet.getString("GioiTinh");
        this.NoiSinh = resultSet.getString("NoiSinh");
        this.QuocTich = resultSet.getString("QuocTich");
        this.DanToc = resultSet.getString("DanToc");
        this.QueQuan = resultSet.getString("QueQuan");
        this.DiaChi = resultSet.getString("DiaChi");

        InputStream inputStream = resultSet.getBinaryStream("HinhAnh");
        if (inputStream == null) {
            this.HinhAnh = null;
        } else {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;
            try {
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                byte[] data = outputStream.toByteArray();
                this.HinhAnh = data;
            } catch (IOException e) {
                this.HinhAnh = null;
            }
        }
    }

    public CongDanModel(String CCCD, String HoTen, String NcCccd, Date NgcCccd, String MaKS, String SDT, String Email, int TrangThai, Date NgaySinh, String GioiTinh, String NoiSinh, String QuocTich, String DanToc, String QueQuan, String DiaChi, byte[] HinhAnh, int ID) {
        this.CCCD = CCCD;
        this.HoTen = HoTen;
        this.NcCccd = NcCccd;
        this.NgcCccd = NgcCccd;
        this.MaKS = MaKS;
        this.SDT = SDT;
        this.Email = Email;
        this.TrangThai = TrangThai;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.NoiSinh = NoiSinh;
        this.QuocTich = QuocTich;
        this.DanToc = DanToc;
        this.QueQuan = QueQuan;
        this.DiaChi = DiaChi;
        this.HinhAnh = HinhAnh;
        this.ID = ID;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
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

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
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

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }    
}
