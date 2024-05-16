/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.IChungNhanKetHonService;
import InterfaceService.ICongDanService;
import InterfaceService.IGiayChungTuService;
import InterfaceService.IHoKhauService;
import InterfaceService.IKhaiSinhService;
import InterfaceService.ILyHonService;
import InterfaceService.ITamTruService;
import InterfaceService.ITamVangService;
import InterfaceService.IThueService;
import Models.DonChungNhanKetHon;
import Models.DonTamTru;
import Models.DonTamVang;
import Models.GiayChungTuModel;
import Models.KhaiSinhModel;
import Models.LyHonModel;
import Models.ThongTinCaNhan;
import Models.ThongTinHoKhau;
import Models.ThueModel;
import ServiceImplement.ChungNhanKetHonServiceImpl;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.GiayChungTuServiceImpl;
import ServiceImplement.HoKhauServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import ServiceImplement.LyHonServiceImpl;
import ServiceImplement.TamTruServiceImpl;
import ServiceImplement.TamVangServiceImpl;
import ServiceImplement.ThueServiceImpl;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TraCuuDonController extends javax.swing.JPanel {

    ICongDanService congDanService = new CongDanServiceImpl();
    ThongTinCaNhan thongTinCaNhan = new ThongTinCaNhan();

    List<DonChungNhanKetHon> listDonChungNhanKetHon;
    IChungNhanKetHonService chungNhanKetHonService = new ChungNhanKetHonServiceImpl();

    IKhaiSinhService khaiSinhService = new KhaiSinhServiceImpl();
    KhaiSinhModel khaiSinhModel = new KhaiSinhModel();

    List<DonTamTru> listDonTamTru;
    ITamTruService tamTruService = new TamTruServiceImpl();

    List<DonTamVang> listDonTamVang;
    ITamVangService tamVangService = new TamVangServiceImpl();

    List<LyHonModel> listLyHon;
    ILyHonService lyHonService = new LyHonServiceImpl();

    IGiayChungTuService chungTuService = new GiayChungTuServiceImpl();
    GiayChungTuModel giayChungTuModel;

    IThueService thueService = new ThueServiceImpl();
    ThueModel thue;

    List<ThongTinHoKhau> listHoKhau;
    IHoKhauService hoKhauService = new HoKhauServiceImpl();
    ThongTinHoKhau tthk;

    private String search = "";
    private DefaultTableModel model;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public TraCuuDonController() {
        initComponents();
        tabbedPaneCustom1.setEnabledAt(1, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDon = new javax.swing.JPanel();
        tf_timkiem = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        tabbedPaneCustom1 = new Swing.TabbedPaneCustom();
        panelXemDon = new javax.swing.JPanel();
        btn_donkhaisinh = new button.MyButton();
        btn_dontamtru = new button.MyButton();
        btn_dontamvang = new button.MyButton();
        btn_thongtincongdan = new button.MyButton();
        btn_donlyhon = new button.MyButton();
        btn_giaychungtu = new button.MyButton();
        btn_donkethon = new button.MyButton();
        panelHoKhau = new javax.swing.JPanel();
        tf_mahokhau = new Swing.TextField();
        tf_cccdchuho = new Swing.TextField();
        tf_hotenchuho = new Swing.TextField();
        tf_cccdthanhvien = new Swing.TextField();
        tf_hotenthanhvien = new Swing.TextField();
        tf_quanhevoichuho = new Swing.TextField();
        tf_diachihk = new Swing.TextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_hokhau = new Swing.TableDark();
        jLabel7 = new javax.swing.JLabel();
        btn_timkiem = new button.MyButton();
        panelGCNKH = new javax.swing.JPanel();
        tf_ngaysinhchong = new Swing.TextField();
        tf_ngaydangky = new Swing.TextField();
        tf_quoctichchong = new Swing.TextField();
        tf_noidangky = new Swing.TextField();
        tf_ngaysinhvo = new Swing.TextField();
        tf_quoctichvo = new Swing.TextField();
        tf_dantocchong = new Swing.TextField();
        jLabel2 = new javax.swing.JLabel();
        tf_giaytotuythanchong = new Swing.TextField();
        tf_dantocvo = new Swing.TextField();
        tf_giaytotuythanvo = new Swing.TextField();
        tf_noicutrucuachong = new Swing.TextField();
        tf_hotenchong = new Swing.TextField();
        tf_noicutrucuavo = new Swing.TextField();
        tf_hotenvo = new Swing.TextField();
        tf_macnkh = new Swing.TextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_cnkh = new Swing.TableDark();
        btn_backFromCNKHToDon = new button.MyButton();
        jLabel9 = new javax.swing.JLabel();
        panelTT = new javax.swing.JPanel();
        tf_matamtru = new Swing.TextField();
        tf_hoten = new Swing.TextField();
        tf_ngaysinh = new Swing.TextField();
        tf_cccd = new Swing.TextField();
        tf_noicap = new Swing.TextField();
        tf_ngaycap = new Swing.TextField();
        tf_ngayden = new Swing.TextField();
        tf_ngaydi = new Swing.TextField();
        tf_ngaydangkyTT = new Swing.TextField();
        tf_lydo = new Swing.TextField();
        tf_noidangkyTT = new Swing.TextField();
        jLabel3 = new javax.swing.JLabel();
        btn_backFromTTToDon = new button.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tamtru = new Swing.TableDark();
        jLabel10 = new javax.swing.JLabel();
        panelGCT = new javax.swing.JPanel();
        tf_machungtu = new Swing.TextField();
        tf_cccdgct = new Swing.TextField();
        tf_hotengct = new Swing.TextField();
        tf_ngaysinhgct = new Swing.TextField();
        tf_ngaymat = new Swing.TextField();
        tf_noimat = new Swing.TextField();
        tf_lydogct = new Swing.TextField();
        btn_backFromGCTToDon = new button.MyButton();
        jLabel6 = new javax.swing.JLabel();
        panelKS = new javax.swing.JPanel();
        tf_maks = new Swing.TextField();
        tf_noisinh = new Swing.TextField();
        tf_ngaysinhks = new Swing.TextField();
        tf_gioitinh = new Swing.TextField();
        tf_quequan = new Swing.TextField();
        tf_dantoc = new Swing.TextField();
        tf_quoctich = new Swing.TextField();
        tf_cccdcha = new Swing.TextField();
        tf_cccdme = new Swing.TextField();
        tf_ngaydangkyks = new Swing.TextField();
        tf_cccdnguoikhaisinh = new Swing.TextField();
        tf_quanhe = new Swing.TextField();
        tf_noidangkyks = new Swing.TextField();
        brn_backFromKSToDon = new button.MyButton();
        tf_hotenks = new Swing.TextField();
        jLabel11 = new javax.swing.JLabel();
        panelTV = new javax.swing.JPanel();
        btn_backFromTVToDon = new button.MyButton();
        tf_hotentv = new Swing.TextField();
        tf_matamvang = new Swing.TextField();
        tf_noichuyendi = new Swing.TextField();
        tf_noichuyenden = new Swing.TextField();
        tf_ngaysinhtv = new Swing.TextField();
        tf_noicaptv = new Swing.TextField();
        tf_cccdtv = new Swing.TextField();
        tf_ngaydangkytv = new Swing.TextField();
        tf_ngayditv = new Swing.TextField();
        tf_ngayve = new Swing.TextField();
        jLabel4 = new javax.swing.JLabel();
        tf_lydotv = new Swing.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tamvang = new Swing.TableDark();
        jLabel12 = new javax.swing.JLabel();
        panelTTCD = new javax.swing.JPanel();
        tf_hotencd = new Swing.TextField();
        tf_gioitinhcd = new Swing.TextField();
        tf_cccdcd = new Swing.TextField();
        tf_ngaysinhcd = new Swing.TextField();
        tf_noisinhcd = new Swing.TextField();
        tf_quoctichcd = new Swing.TextField();
        tf_dantoccd = new Swing.TextField();
        tf_quequancd = new Swing.TextField();
        tf_diachi = new Swing.TextField();
        tf_sodienthoai = new Swing.TextField();
        tf_email = new Swing.TextField();
        btn_backFromTTCDToDon = new button.MyButton();
        jLabel13 = new javax.swing.JLabel();
        pic_imgavatar = new Swing.PictureBox();
        panelLH = new javax.swing.JPanel();
        tf_malyhon = new Swing.TextField();
        tf_macnkhlh = new Swing.TextField();
        tf_hotennguoinopdon = new Swing.TextField();
        tf_cccdnguoinopdon = new Swing.TextField();
        tf_hotenvolh = new Swing.TextField();
        tf_hotenchonglh = new Swing.TextField();
        tf_cccdvo = new Swing.TextField();
        tf_cccdchong = new Swing.TextField();
        tf_noidangkylh = new Swing.TextField();
        tf_ngaydangkylh = new Swing.TextField();
        tf_lydolh = new Swing.TextField();
        jLabel5 = new javax.swing.JLabel();
        btn_backFromLHToDon = new button.MyButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_lyhon = new Swing.TableDark();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(918, 539));
        setLayout(new java.awt.CardLayout());

        panelDon.setBackground(new java.awt.Color(255, 255, 255));
        panelDon.setPreferredSize(new java.awt.Dimension(918, 539));

        tf_timkiem.setLabelText("Nhập CCCD");
        tf_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_timkiemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 110, 71));
        jLabel1.setText("Quản lý đơn");

        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(21, 110, 71));

        panelXemDon.setBackground(new java.awt.Color(255, 255, 255));
        panelXemDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 110, 71), 2));
        panelXemDon.setPreferredSize(new java.awt.Dimension(877, 400));

        btn_donkhaisinh.setForeground(new java.awt.Color(176, 176, 176));
        btn_donkhaisinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/baby-face-outline-custom.png"))); // NOI18N
        btn_donkhaisinh.setText("Đơn khai sinh");
        btn_donkhaisinh.setBorderColor(new java.awt.Color(176, 176, 176));
        btn_donkhaisinh.setColorClick(new java.awt.Color(255, 255, 255));
        btn_donkhaisinh.setColorOver(new java.awt.Color(255, 255, 255));
        btn_donkhaisinh.setEnabled(false);
        btn_donkhaisinh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_donkhaisinh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_donkhaisinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donkhaisinhActionPerformed(evt);
            }
        });

        btn_dontamtru.setForeground(new java.awt.Color(176, 176, 176));
        btn_dontamtru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-plus-custom.png"))); // NOI18N
        btn_dontamtru.setText("Đơn tạm trú");
        btn_dontamtru.setBorderColor(new java.awt.Color(176, 176, 176));
        btn_dontamtru.setColorClick(new java.awt.Color(255, 255, 255));
        btn_dontamtru.setColorOver(new java.awt.Color(255, 255, 255));
        btn_dontamtru.setEnabled(false);
        btn_dontamtru.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dontamtru.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_dontamtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dontamtruActionPerformed(evt);
            }
        });

        btn_dontamvang.setForeground(new java.awt.Color(176, 176, 176));
        btn_dontamvang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-minus-custom.png"))); // NOI18N
        btn_dontamvang.setText("Đơn tạm vắng");
        btn_dontamvang.setBorderColor(new java.awt.Color(176, 176, 176));
        btn_dontamvang.setColorClick(new java.awt.Color(255, 255, 255));
        btn_dontamvang.setColorOver(new java.awt.Color(255, 255, 255));
        btn_dontamvang.setEnabled(false);
        btn_dontamvang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dontamvang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_dontamvang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dontamvangActionPerformed(evt);
            }
        });

        btn_thongtincongdan.setForeground(new java.awt.Color(176, 176, 176));
        btn_thongtincongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/account-circle-custom.png"))); // NOI18N
        btn_thongtincongdan.setText("Thông tin công dân");
        btn_thongtincongdan.setBorderColor(new java.awt.Color(176, 176, 176));
        btn_thongtincongdan.setColorClick(new java.awt.Color(255, 255, 255));
        btn_thongtincongdan.setColorOver(new java.awt.Color(255, 255, 255));
        btn_thongtincongdan.setEnabled(false);
        btn_thongtincongdan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_thongtincongdan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_thongtincongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thongtincongdanActionPerformed(evt);
            }
        });

        btn_donlyhon.setForeground(new java.awt.Color(176, 176, 176));
        btn_donlyhon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/heart-broken-custom.png"))); // NOI18N
        btn_donlyhon.setText("Đơn ly hôn");
        btn_donlyhon.setBorderColor(new java.awt.Color(176, 176, 176));
        btn_donlyhon.setColorClick(new java.awt.Color(255, 255, 255));
        btn_donlyhon.setColorOver(new java.awt.Color(255, 255, 255));
        btn_donlyhon.setEnabled(false);
        btn_donlyhon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_donlyhon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_donlyhon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donlyhonActionPerformed(evt);
            }
        });

        btn_giaychungtu.setForeground(new java.awt.Color(176, 176, 176));
        btn_giaychungtu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/emoticon-dead-custom.png"))); // NOI18N
        btn_giaychungtu.setText("Giấy chứng tử");
        btn_giaychungtu.setBorderColor(new java.awt.Color(176, 176, 176));
        btn_giaychungtu.setColorClick(new java.awt.Color(255, 255, 255));
        btn_giaychungtu.setColorOver(new java.awt.Color(255, 255, 255));
        btn_giaychungtu.setEnabled(false);
        btn_giaychungtu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_giaychungtu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_giaychungtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giaychungtuActionPerformed(evt);
            }
        });

        btn_donkethon.setBorder(null);
        btn_donkethon.setForeground(new java.awt.Color(176, 176, 176));
        btn_donkethon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email-heart-outline-custom.png"))); // NOI18N
        btn_donkethon.setText("Đơn kết hôn");
        btn_donkethon.setToolTipText("");
        btn_donkethon.setBorderColor(new java.awt.Color(176, 176, 176));
        btn_donkethon.setColorClick(new java.awt.Color(255, 255, 255));
        btn_donkethon.setColorOver(new java.awt.Color(255, 255, 255));
        btn_donkethon.setEnabled(false);
        btn_donkethon.setHideActionText(true);
        btn_donkethon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_donkethon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_donkethon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donkethonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelXemDonLayout = new javax.swing.GroupLayout(panelXemDon);
        panelXemDon.setLayout(panelXemDonLayout);
        panelXemDonLayout.setHorizontalGroup(
            panelXemDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXemDonLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_donkethon, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_donkhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dontamtru, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_dontamvang, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelXemDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_thongtincongdan, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_donlyhon, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_giaychungtu, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        panelXemDonLayout.setVerticalGroup(
            panelXemDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXemDonLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelXemDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelXemDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelXemDonLayout.createSequentialGroup()
                            .addComponent(btn_donkhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))
                        .addComponent(btn_donkethon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_dontamtru, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dontamvang, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelXemDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_thongtincongdan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_donlyhon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_giaychungtu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        tabbedPaneCustom1.addTab("Xem đơn từ", panelXemDon);

        panelHoKhau.setBackground(new java.awt.Color(255, 255, 255));
        panelHoKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 110, 71), 2));

        tf_mahokhau.setLabelText("Mã hộ khẩu");

        tf_cccdchuho.setLabelText("CCCD Chủ hộ");

        tf_hotenchuho.setLabelText("Họ tên chủ hộ");

        tf_cccdthanhvien.setLabelText("CCCD thành viên");

        tf_hotenthanhvien.setLabelText("Họ tên thành viên");

        tf_quanhevoichuho.setLabelText("Quan hệ với chủ hộ");

        tf_diachihk.setLabelText("Địa chỉ");

        tbl_hokhau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CCCD Người thân", "Họ tên người thân", "Ngày sinh", "Quan hệ với chủ hộ"
            }
        ));
        jScrollPane5.setViewportView(tbl_hokhau);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 110, 71));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("THÔNG TIN HỘ KHẨU");

        javax.swing.GroupLayout panelHoKhauLayout = new javax.swing.GroupLayout(panelHoKhau);
        panelHoKhau.setLayout(panelHoKhauLayout);
        panelHoKhauLayout.setHorizontalGroup(
            panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoKhauLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_diachihk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelHoKhauLayout.createSequentialGroup()
                        .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_mahokhau, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cccdthanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHoKhauLayout.createSequentialGroup()
                                .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_cccdchuho, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_hotenthanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_hotenchuho, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_quanhevoichuho, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
            .addGroup(panelHoKhauLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHoKhauLayout.setVerticalGroup(
            panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoKhauLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_mahokhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdchuho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenchuho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdthanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenthanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quanhevoichuho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tf_diachihk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Hộ khẩu", panelHoKhau);

        btn_timkiem.setBackground(new java.awt.Color(21, 110, 71));
        btn_timkiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/magnify-custom.png"))); // NOI18N
        btn_timkiem.setText("SEARCH");
        btn_timkiem.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_timkiem.setBorderPainted(false);
        btn_timkiem.setColor(new java.awt.Color(21, 110, 71));
        btn_timkiem.setColorClick(new java.awt.Color(141, 240, 197));
        btn_timkiem.setColorOver(new java.awt.Color(61, 212, 146));
        btn_timkiem.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_timkiem.setIconTextGap(6);
        btn_timkiem.setRadius(15);
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDonLayout = new javax.swing.GroupLayout(panelDon);
        panelDon.setLayout(panelDonLayout);
        panelDonLayout.setHorizontalGroup(
            panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDonLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(282, 282, 282)
                        .addComponent(tf_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDonLayout.setVerticalGroup(
            panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelDon, "card2");

        panelGCNKH.setBackground(new java.awt.Color(255, 255, 255));
        panelGCNKH.setPreferredSize(new java.awt.Dimension(918, 539));

        tf_ngaysinhchong.setLabelText("Ngày sinh chồng");

        tf_ngaydangky.setLabelText("Ngày đăng kí kết hôn");

        tf_quoctichchong.setLabelText("Quốc tịch chồng");

        tf_noidangky.setLabelText("Nơi đăng ký kết hôn");

        tf_ngaysinhvo.setLabelText("Ngày sinh vợ");

        tf_quoctichvo.setLabelText("Quốc tịch vợ");

        tf_dantocchong.setLabelText("Dân tộc chồng");
        tf_dantocchong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dantocchongActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("Lịch sử đơn");

        tf_giaytotuythanchong.setLabelText("Giấy tờ tùy thân của chồng");
        tf_giaytotuythanchong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_giaytotuythanchongActionPerformed(evt);
            }
        });

        tf_dantocvo.setLabelText("Dân tộc vợ");

        tf_giaytotuythanvo.setLabelText("Giấy tờ tùy thân của vợ");

        tf_noicutrucuachong.setLabelText("Nơi cư trú của chồng");

        tf_hotenchong.setLabelText("Họ tên chồng");

        tf_noicutrucuavo.setLabelText("Nơi cư trú của vợ");

        tf_hotenvo.setLabelText("Họ tên vợ");

        tf_macnkh.setLabelText("Mã CNKH");

        tbl_cnkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CNKH", "Giấy tờ tùy thân vợ", "Họ tên vợ", "Ngày sinh vợ", "Dân tộc vợ", "Quốc tịch vợ", "Nơi cư trú vợ", "Giấy tờ tùy thân chồng", "Họ tên chồng", "Ngày sinh chồng", "Dân tộc chồng", "Quốc tịch chồng", "Nơi cư trú chồng", "Ngày đăng ký kết hôn", "Nơi đăng ký kết hôn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cnkh.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_cnkh.setPreferredScrollableViewportSize(new java.awt.Dimension(450, 100));
        tbl_cnkh.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbl_cnkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cnkhMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_cnkh);

        btn_backFromCNKHToDon.setBackground(new java.awt.Color(21, 110, 71));
        btn_backFromCNKHToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromCNKHToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-left-custom.png"))); // NOI18N
        btn_backFromCNKHToDon.setText("Back");
        btn_backFromCNKHToDon.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_backFromCNKHToDon.setColor(new java.awt.Color(21, 110, 71));
        btn_backFromCNKHToDon.setColorClick(new java.awt.Color(141, 240, 197));
        btn_backFromCNKHToDon.setColorOver(new java.awt.Color(61, 212, 146));
        btn_backFromCNKHToDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_backFromCNKHToDon.setIconTextGap(6);
        btn_backFromCNKHToDon.setMargin(new java.awt.Insets(2, 8, 3, 14));
        btn_backFromCNKHToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromCNKHToDonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(21, 110, 71));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("THÔNG TIN KẾT HÔN CỦA CÔNG DÂN");

        javax.swing.GroupLayout panelGCNKHLayout = new javax.swing.GroupLayout(panelGCNKH);
        panelGCNKH.setLayout(panelGCNKHLayout);
        panelGCNKHLayout.setHorizontalGroup(
            panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCNKHLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGCNKHLayout.createSequentialGroup()
                        .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGCNKHLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_noicutrucuachong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_hotenvo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_hotenchong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelGCNKHLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btn_backFromCNKHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGCNKHLayout.createSequentialGroup()
                                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_noicutrucuavo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_giaytotuythanchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_giaytotuythanvo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_ngaysinhchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_ngaysinhvo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_quoctichchong, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_quoctichvo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_dantocchong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_dantocvo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelGCNKHLayout.setVerticalGroup(
            panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGCNKHLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(btn_backFromCNKHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hotenchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinhchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctichchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_giaytotuythanchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantocchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_giaytotuythanvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinhvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctichvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantocvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noicutrucuachong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noicutrucuavo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        add(panelGCNKH, "card3");

        panelTT.setBackground(new java.awt.Color(255, 255, 255));
        panelTT.setPreferredSize(new java.awt.Dimension(919, 539));

        tf_matamtru.setLabelText("Mã tạm trú");

        tf_hoten.setLabelText("Họ tên ");

        tf_ngaysinh.setLabelText("Ngày sinh");

        tf_cccd.setLabelText("CCCD");

        tf_noicap.setLabelText("Nơi cấp CCCD");

        tf_ngaycap.setLabelText("Ngày cấp");

        tf_ngayden.setLabelText("Ngày đến");

        tf_ngaydi.setLabelText("Ngày đi");

        tf_ngaydangkyTT.setLabelText("Ngày đăng ký");

        tf_lydo.setLabelText("Lý do");

        tf_noidangkyTT.setLabelText("Nơi đăng ký");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 110, 71));
        jLabel3.setText("Lịch sử đơn");

        btn_backFromTTToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromTTToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-left-custom.png"))); // NOI18N
        btn_backFromTTToDon.setText("Back");
        btn_backFromTTToDon.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_backFromTTToDon.setColor(new java.awt.Color(21, 110, 71));
        btn_backFromTTToDon.setColorClick(new java.awt.Color(141, 240, 197));
        btn_backFromTTToDon.setColorOver(new java.awt.Color(61, 212, 146));
        btn_backFromTTToDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_backFromTTToDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_backFromTTToDon.setIconTextGap(6);
        btn_backFromTTToDon.setMargin(new java.awt.Insets(2, 8, 3, 14));
        btn_backFromTTToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromTTToDonActionPerformed(evt);
            }
        });

        tbl_tamtru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tạm Trú", "Ngày đăng ký", "Nơi đăng ký", "Họ tên", "Ngày sinh", "CCCD", "Nơi cấp CCCD", "Ngày cấp CCCD", "Ngày đến", "Ngày đi", "Lý do"
            }
        ));
        tbl_tamtru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tamtruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tamtru);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 110, 71));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("THÔNG TIN TẠM TRÚ CỦA CÔNG DÂN");

        javax.swing.GroupLayout panelTTLayout = new javax.swing.GroupLayout(panelTT);
        panelTT.setLayout(panelTTLayout);
        panelTTLayout.setHorizontalGroup(
            panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTTLayout.createSequentialGroup()
                        .addComponent(tf_ngaydangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_noidangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_lydo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTTLayout.createSequentialGroup()
                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTTLayout.createSequentialGroup()
                                .addComponent(tf_matamtru, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTTLayout.createSequentialGroup()
                                .addComponent(tf_noicap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ngaycap, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ngaydi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_cccd, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(tf_ngayden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelTTLayout.createSequentialGroup()
                        .addComponent(btn_backFromTTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
            .addGroup(panelTTLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTTLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTTLayout.createSequentialGroup()
                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelTTLayout.setVerticalGroup(
            panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(btn_backFromTTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_matamtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noicap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaycap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaydangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        add(panelTT, "card4");

        panelGCT.setBackground(new java.awt.Color(255, 255, 255));

        tf_machungtu.setLabelText("Mã chứng tử");

        tf_cccdgct.setLabelText("CCCD");

        tf_hotengct.setLabelText("Họ và tên");

        tf_ngaysinhgct.setLabelText("Ngày sinh");

        tf_ngaymat.setLabelText("Ngày mất");

        tf_noimat.setLabelText("Nơi mất");

        tf_lydogct.setLabelText("Lý do");

        btn_backFromGCTToDon.setBackground(new java.awt.Color(21, 110, 71));
        btn_backFromGCTToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromGCTToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-left-custom.png"))); // NOI18N
        btn_backFromGCTToDon.setText("Back");
        btn_backFromGCTToDon.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_backFromGCTToDon.setColor(new java.awt.Color(21, 110, 71));
        btn_backFromGCTToDon.setColorClick(new java.awt.Color(141, 240, 197));
        btn_backFromGCTToDon.setColorOver(new java.awt.Color(61, 212, 146));
        btn_backFromGCTToDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_backFromGCTToDon.setIconTextGap(6);
        btn_backFromGCTToDon.setMargin(new java.awt.Insets(2, 8, 3, 14));
        btn_backFromGCTToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromGCTToDonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 110, 71));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THÔNG TIN CHỨNG TỬ");

        javax.swing.GroupLayout panelGCTLayout = new javax.swing.GroupLayout(panelGCT);
        panelGCT.setLayout(panelGCTLayout);
        panelGCTLayout.setHorizontalGroup(
            panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCTLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGCTLayout.createSequentialGroup()
                        .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_ngaysinhgct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelGCTLayout.createSequentialGroup()
                                .addComponent(tf_machungtu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(tf_cccdgct, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                            .addComponent(tf_noimat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_lydogct, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(tf_ngaymat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_hotengct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))
                    .addGroup(panelGCTLayout.createSequentialGroup()
                        .addComponent(btn_backFromGCTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGCTLayout.setVerticalGroup(
            panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCTLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btn_backFromGCTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_machungtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdgct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotengct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaysinhgct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaymat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noimat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lydogct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(panelGCT, "card5");

        panelKS.setBackground(new java.awt.Color(255, 255, 255));

        tf_maks.setLabelText("Mã khai sinh");
        tf_maks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_maksActionPerformed(evt);
            }
        });

        tf_noisinh.setLabelText("Nơi sinh");

        tf_ngaysinhks.setLabelText("Ngày sinh");

        tf_gioitinh.setLabelText("Giới tính");

        tf_quequan.setLabelText("Quê quán");

        tf_dantoc.setLabelText("Dân tộc");

        tf_quoctich.setLabelText("Quốc tịch");
        tf_quoctich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quoctichActionPerformed(evt);
            }
        });

        tf_cccdcha.setLabelText("CCCD Cha");

        tf_cccdme.setLabelText("CCCD Me");

        tf_ngaydangkyks.setLabelText("Ngày đăng ký");

        tf_cccdnguoikhaisinh.setLabelText("CCCD người khai sinh");

        tf_quanhe.setLabelText("Quan hệ");

        tf_noidangkyks.setLabelText("Nơi đăng ký");

        brn_backFromKSToDon.setBackground(new java.awt.Color(21, 110, 71));
        brn_backFromKSToDon.setForeground(new java.awt.Color(255, 255, 255));
        brn_backFromKSToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-left-custom.png"))); // NOI18N
        brn_backFromKSToDon.setText("Back");
        brn_backFromKSToDon.setBorderColor(new java.awt.Color(255, 255, 255));
        brn_backFromKSToDon.setColor(new java.awt.Color(21, 110, 71));
        brn_backFromKSToDon.setColorClick(new java.awt.Color(141, 240, 197));
        brn_backFromKSToDon.setColorOver(new java.awt.Color(61, 212, 146));
        brn_backFromKSToDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        brn_backFromKSToDon.setIconTextGap(6);
        brn_backFromKSToDon.setMargin(new java.awt.Insets(2, 8, 3, 14));
        brn_backFromKSToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brn_backFromKSToDonActionPerformed(evt);
            }
        });

        tf_hotenks.setLabelText("Họ tên");
        tf_hotenks.setOpaque(true);
        tf_hotenks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hotenksActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(21, 110, 71));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("THÔNG TIN KHAI SINH CỦA CÔNG DÂN");

        javax.swing.GroupLayout panelKSLayout = new javax.swing.GroupLayout(panelKS);
        panelKS.setLayout(panelKSLayout);
        panelKSLayout.setHorizontalGroup(
            panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKSLayout.createSequentialGroup()
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKSLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(brn_backFromKSToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelKSLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelKSLayout.createSequentialGroup()
                                .addComponent(tf_cccdme, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_cccdcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelKSLayout.createSequentialGroup()
                                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_maks, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cccdnguoikhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelKSLayout.createSequentialGroup()
                                        .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelKSLayout.createSequentialGroup()
                                                .addComponent(tf_quanhe, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(tf_ngaydangkyks, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelKSLayout.createSequentialGroup()
                                                .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(11, 11, 11)
                                        .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_quoctich, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_noidangkyks, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelKSLayout.createSequentialGroup()
                                        .addComponent(tf_hotenks, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_ngaysinhks, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelKSLayout.setVerticalGroup(
            panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKSLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brn_backFromKSToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(54, 54, 54)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_maks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinhks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_quoctich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdnguoikhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quanhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangkyks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangkyks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        add(panelKS, "card6");

        panelTV.setBackground(new java.awt.Color(255, 255, 255));

        btn_backFromTVToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromTVToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-left-custom.png"))); // NOI18N
        btn_backFromTVToDon.setText("Back");
        btn_backFromTVToDon.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_backFromTVToDon.setColor(new java.awt.Color(21, 110, 71));
        btn_backFromTVToDon.setColorClick(new java.awt.Color(141, 240, 197));
        btn_backFromTVToDon.setColorOver(new java.awt.Color(61, 212, 146));
        btn_backFromTVToDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_backFromTVToDon.setIconTextGap(6);
        btn_backFromTVToDon.setMargin(new java.awt.Insets(2, 8, 3, 14));
        btn_backFromTVToDon.setRadius(15);
        btn_backFromTVToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromTVToDonActionPerformed(evt);
            }
        });

        tf_hotentv.setLabelText("Họ tên");

        tf_matamvang.setLabelText("Mã tạm vắng");

        tf_noichuyendi.setLabelText("Nơi chuyển đi");

        tf_noichuyenden.setLabelText("Nơi chuyển đến");

        tf_ngaysinhtv.setLabelText("Ngày sinh");

        tf_noicaptv.setLabelText("Nơi cấp");

        tf_cccdtv.setLabelText("CCCD");

        tf_ngaydangkytv.setLabelText("Ngày đăng ký");

        tf_ngayditv.setLabelText("Ngày đi");

        tf_ngayve.setLabelText("Ngày về");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 110, 71));
        jLabel4.setText("Lịch sử đơn");

        tf_lydotv.setLabelText("Lý do");

        tbl_tamvang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tạm vắng", "Ngày đăng ký", "Nơi chuyển đi", "Nơi chuyển đến", "Họ tên", "Ngày sinh", "CCCD", "Nơi cấp CCCD", "Ngày đi", "Ngày về", "Lí do"
            }
        ));
        tbl_tamvang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tamvangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_tamvang);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(21, 110, 71));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("THÔNG TIN TẠM VẮNG CỦA CÔNG DÂN");

        javax.swing.GroupLayout panelTVLayout = new javax.swing.GroupLayout(panelTV);
        panelTV.setLayout(panelTVLayout);
        panelTVLayout.setHorizontalGroup(
            panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTVLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTVLayout.createSequentialGroup()
                        .addComponent(btn_backFromTVToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(panelTVLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTVLayout.createSequentialGroup()
                        .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelTVLayout.createSequentialGroup()
                                .addComponent(tf_noichuyendi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_noichuyenden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelTVLayout.createSequentialGroup()
                                .addComponent(tf_noicaptv, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ngayditv, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(tf_lydotv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTVLayout.createSequentialGroup()
                        .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTVLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tf_ngayve, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTVLayout.createSequentialGroup()
                                .addComponent(tf_matamvang, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_hotentv, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ngaysinhtv, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTVLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_ngaydangkytv, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTVLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(tf_cccdtv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(70, 70, 70))
        );
        panelTVLayout.setVerticalGroup(
            panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTVLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backFromTVToDon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_matamvang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotentv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinhtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noicaptv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayditv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangkytv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noichuyendi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noichuyenden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lydotv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 116, Short.MAX_VALUE))
        );

        add(panelTV, "card7");

        panelTTCD.setBackground(new java.awt.Color(255, 255, 255));
        panelTTCD.setPreferredSize(new java.awt.Dimension(883, 832));

        tf_hotencd.setLabelText("Họ và tên");

        tf_gioitinhcd.setLabelText("Giới tính");

        tf_cccdcd.setLabelText("CCCD");

        tf_ngaysinhcd.setLabelText("Ngày sinh");

        tf_noisinhcd.setLabelText("Nơi sinh");

        tf_quoctichcd.setLabelText("Quốc tịch");

        tf_dantoccd.setLabelText("Dân tộc");

        tf_quequancd.setLabelText("Quê quán");

        tf_diachi.setLabelText("Địa chỉ");

        tf_sodienthoai.setLabelText("Số điện thoại");

        tf_email.setLabelText("Email");

        btn_backFromTTCDToDon.setBackground(new java.awt.Color(21, 110, 71));
        btn_backFromTTCDToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromTTCDToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-left-custom.png"))); // NOI18N
        btn_backFromTTCDToDon.setText("Back");
        btn_backFromTTCDToDon.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_backFromTTCDToDon.setColor(new java.awt.Color(21, 110, 71));
        btn_backFromTTCDToDon.setColorClick(new java.awt.Color(141, 240, 197));
        btn_backFromTTCDToDon.setColorOver(new java.awt.Color(61, 212, 146));
        btn_backFromTTCDToDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_backFromTTCDToDon.setIconTextGap(6);
        btn_backFromTTCDToDon.setMargin(new java.awt.Insets(2, 8, 3, 14));
        btn_backFromTTCDToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromTTCDToDonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(21, 110, 71));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("THÔNG TIN CÁ NHÂN CỦA CÔNG DÂN");

        javax.swing.GroupLayout panelTTCDLayout = new javax.swing.GroupLayout(panelTTCD);
        panelTTCD.setLayout(panelTTCDLayout);
        panelTTCDLayout.setHorizontalGroup(
            panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTCDLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTTCDLayout.createSequentialGroup()
                        .addComponent(tf_quequancd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(tf_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTTCDLayout.createSequentialGroup()
                        .addComponent(tf_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTTCDLayout.createSequentialGroup()
                        .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_ngaysinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelTTCDLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pic_imgavatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTTCDLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(tf_noisinhcd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addComponent(tf_quoctichcd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTTCDLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_hotencd, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(tf_gioitinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_cccdcd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_dantoccd, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                    .addGroup(panelTTCDLayout.createSequentialGroup()
                        .addComponent(btn_backFromTTCDToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addGap(105, 105, 105))
        );
        panelTTCDLayout.setVerticalGroup(
            panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTCDLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backFromTTCDToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTTCDLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_hotencd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_gioitinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cccdcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTTCDLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(pic_imgavatar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaysinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noisinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctichcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantoccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_quequancd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        add(panelTTCD, "card8");

        panelLH.setBackground(new java.awt.Color(255, 255, 255));

        tf_malyhon.setLabelText("Mã ly hôn");

        tf_macnkhlh.setLabelText("Mã CNKH");
        tf_macnkhlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_macnkhlhActionPerformed(evt);
            }
        });

        tf_hotennguoinopdon.setLabelText("Họ tên người nộp đơn");

        tf_cccdnguoinopdon.setLabelText("CCCD người nộp đơn");

        tf_hotenvolh.setLabelText("Họ tên vợ");

        tf_hotenchonglh.setLabelText("Họ tên chồng");

        tf_cccdvo.setLabelText("CCCD vợ");

        tf_cccdchong.setLabelText("CCCD chồng");

        tf_noidangkylh.setLabelText("Nơi đăng ký");

        tf_ngaydangkylh.setLabelText("Ngày đăng ký");

        tf_lydolh.setLabelText("Lý do");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 110, 71));
        jLabel5.setText("Lịch sử đơn");

        btn_backFromLHToDon.setBackground(new java.awt.Color(21, 110, 71));
        btn_backFromLHToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromLHToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-left-custom.png"))); // NOI18N
        btn_backFromLHToDon.setText("Back");
        btn_backFromLHToDon.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_backFromLHToDon.setColor(new java.awt.Color(21, 110, 71));
        btn_backFromLHToDon.setColorClick(new java.awt.Color(141, 240, 197));
        btn_backFromLHToDon.setColorOver(new java.awt.Color(61, 212, 146));
        btn_backFromLHToDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_backFromLHToDon.setIconTextGap(6);
        btn_backFromLHToDon.setMargin(new java.awt.Insets(2, 8, 3, 14));
        btn_backFromLHToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromLHToDonActionPerformed(evt);
            }
        });

        tbl_lyhon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ly hôn", "Mã CNKH", "Họ tên người nộp đơn", "CCCD người nộp đơn", "Họ tên vợ", "CCCD vợ", "Họ tên chồng", "CCCD chồng", "Nơi đăng ký", "Ngày đăng ký", "Lý do"
            }
        ));
        tbl_lyhon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_lyhonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_lyhon);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(21, 110, 71));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("THÔNG TIN LY HÔN CỦA CÔNG DÂN");

        javax.swing.GroupLayout panelLHLayout = new javax.swing.GroupLayout(panelLH);
        panelLH.setLayout(panelLHLayout);
        panelLHLayout.setHorizontalGroup(
            panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLHLayout.createSequentialGroup()
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLHLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLHLayout.createSequentialGroup()
                                .addComponent(tf_noidangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ngaydangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_lydolh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLHLayout.createSequentialGroup()
                                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hotenvolh, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_malyhon, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_macnkhlh, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(tf_cccdvo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hotennguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_hotenchonglh, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_cccdnguoinopdon, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(tf_cccdchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelLHLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_backFromLHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(741, 741, 741)))
                .addGap(55, 55, 55))
            .addGroup(panelLHLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLHLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelLHLayout.setVerticalGroup(
            panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLHLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backFromLHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_malyhon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_macnkhlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotennguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdnguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hotenchonglh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenvolh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noidangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lydolh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        add(panelLH, "card9");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
        if (tf_timkiem.getText().length() != 12) {
            setEnabledButton();
            JOptionPane.showMessageDialog(null, "Vui lòng nhập CCCD có đủ 12 kí tự");
            return;
        }
        if (congDanService.checkCCCDExist(tf_timkiem.getText().trim()) == false) {
            setEnabledButton();
            JOptionPane.showMessageDialog(null, "Không thể tìm thấy CCCD trên!! Vui lòng nhập lại");
            return;
        }
        setSearch(tf_timkiem.getText());
        getSearch();

        setEnabledButton();


    }//GEN-LAST:event_btn_timkiemActionPerformed


    private void loadHoKhau(String search) {
        search = tf_timkiem.getText().trim();
        tthk = hoKhauService.findOneByCCCD(search);

        tf_mahokhau.setText(tthk.getMaHoKhau());
        tf_cccdchuho.setText(tthk.getCCCDChuHo());
        tf_hotenchuho.setText(tthk.getHoTenChuHo());
        tf_cccdthanhvien.setText(tthk.getCCCDNguoiDangNhap());
        tf_hotenthanhvien.setText(tthk.getHoTenNguoiDangNhap());
        tf_quanhevoichuho.setText(tthk.getQuanHeVoiChuHo());
        tf_diachihk.setText(tthk.getDiaChi());

        tf_mahokhau.setEditable(false);
        tf_cccdchuho.setEditable(false);
        tf_hotenchuho.setEditable(false);
        tf_cccdthanhvien.setEditable(false);
        tf_hotenthanhvien.setEditable(false);
        tf_quanhevoichuho.setEditable(false);
        tf_diachihk.setEditable(false);

    }

    private void loadListHoKhau(String search) {
        search = tf_timkiem.getText().trim();
        listHoKhau = hoKhauService.findAllHoKhau(search);

        tbl_hokhau.fixTable(jScrollPane5);
        model = (DefaultTableModel) tbl_hokhau.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (ThongTinHoKhau tthk : listHoKhau) {
            model.addRow(new Object[]{tthk.getCCCDNguoiThan() == null ? "Chưa có CCCD" : tthk.getCCCDNguoiThan(), tthk.getHoTenNguoiThan(), tthk.getNgaySinh(), tthk.getQuanHeVoiChuHo()});
        }
    }
    private void tf_giaytotuythanchongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_giaytotuythanchongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_giaytotuythanchongActionPerformed

    private void tf_dantocchongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dantocchongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dantocchongActionPerformed

    private void btn_backFromTTToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backFromTTToDonActionPerformed
        // TODO add your handling code here:
        panelTT.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_btn_backFromTTToDonActionPerformed

    private void brn_backFromKSToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brn_backFromKSToDonActionPerformed
        // TODO add your handling code here:
        panelKS.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_brn_backFromKSToDonActionPerformed

    private void btn_backFromTVToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backFromTVToDonActionPerformed
        // TODO add your handling code here:
        panelTV.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_btn_backFromTVToDonActionPerformed

    private void btn_backFromTTCDToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backFromTTCDToDonActionPerformed
        // TODO add your handling code here:
        panelTTCD.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_btn_backFromTTCDToDonActionPerformed

    private void btn_backFromLHToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backFromLHToDonActionPerformed
        // TODO add your handling code here:
        panelLH.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_btn_backFromLHToDonActionPerformed

    private void btn_backFromGCTToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backFromGCTToDonActionPerformed
        // TODO add your handling code here:
        panelGCT.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_btn_backFromGCTToDonActionPerformed

    private void tf_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_timkiemActionPerformed

    private void tbl_cnkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cnkhMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbl_cnkh.getModel();
        tf_macnkh.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 0).toString());
        tf_giaytotuythanvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 1).toString());
        tf_hotenvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 2).toString());
        tf_ngaysinhvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 3).toString());
        tf_dantocvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 4).toString());
        tf_quoctichvo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 5).toString());
        tf_noicutrucuavo.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 6).toString());
        tf_giaytotuythanchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 7).toString());
        tf_hotenchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 8).toString());
        tf_ngaysinhchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 9).toString());
        tf_dantocchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 10).toString());
        tf_quoctichchong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 11).toString());
        tf_noicutrucuachong.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 12).toString());
        tf_ngaydangky.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 13).toString());
        tf_noidangky.setText(model.getValueAt(tbl_cnkh.getSelectedRow(), 14).toString());
    }//GEN-LAST:event_tbl_cnkhMouseClicked

    private void btn_backFromCNKHToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backFromCNKHToDonActionPerformed
        // TODO add your handling code here:
        panelGCNKH.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_btn_backFromCNKHToDonActionPerformed

    private void tbl_tamtruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tamtruMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbl_tamtru.getModel();
        tf_matamtru.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 0).toString());
        tf_ngaydangkyTT.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 1).toString());
        tf_noidangkyTT.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 2).toString());
        tf_hoten.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 3).toString());
        tf_ngaysinh.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 4).toString());
        tf_cccd.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 5).toString());
        tf_noicap.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 6).toString());
        tf_ngaycap.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 7).toString());
        tf_ngayden.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 8).toString());
        tf_ngaydi.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 9).toString());
        tf_lydo.setText(model.getValueAt(tbl_tamtru.getSelectedRow(), 10).toString());
    }//GEN-LAST:event_tbl_tamtruMouseClicked

    private void tbl_tamvangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tamvangMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbl_tamvang.getModel();
        tf_matamvang.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 0).toString());
        tf_ngaydangkytv.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 1).toString());
        tf_noichuyendi.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 2).toString());
        tf_noichuyenden.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 3).toString());
        tf_hotentv.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 4).toString());
        tf_ngaysinhtv.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 5).toString());
        tf_cccdtv.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 6).toString());
        tf_noicaptv.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 7).toString());
        tf_ngayditv.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 8).toString());
        tf_ngayve.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 9).toString());
        tf_lydotv.setText(model.getValueAt(tbl_tamvang.getSelectedRow(), 10).toString());
    }//GEN-LAST:event_tbl_tamvangMouseClicked

    private void tf_maksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_maksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_maksActionPerformed

    private void tbl_lyhonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_lyhonMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tbl_lyhon.getModel();
        tf_malyhon.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 0).toString());
        tf_macnkhlh.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 1).toString());
        tf_hotennguoinopdon.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 2).toString());
        tf_cccdnguoinopdon.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 3).toString());
        tf_hotenvolh.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 4).toString());
        tf_cccdvo.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 5).toString());
        tf_hotenchonglh.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 6).toString());
        tf_cccdchong.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 7).toString());
        tf_noidangkylh.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 8).toString());
        tf_ngaydangkylh.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 9).toString());
        tf_lydolh.setText(model.getValueAt(tbl_lyhon.getSelectedRow(), 10).toString());
    }//GEN-LAST:event_tbl_lyhonMouseClicked

    private void tf_quoctichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quoctichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quoctichActionPerformed

    private void btn_donkethonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donkethonActionPerformed
        // TODO add your handling code here:
        panelDon.setVisible(false);
        panelGCNKH.setVisible(true);

        listDonChungNhanKetHon = chungNhanKetHonService.findAllCNKH(tf_timkiem.getText().trim(), tf_timkiem.getText().trim());
        model = (DefaultTableModel) tbl_cnkh.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (DonChungNhanKetHon dcnkh : listDonChungNhanKetHon) {
            model.addRow(new Object[]{dcnkh.getMaCnkh(), dcnkh.getCCCDVo(), dcnkh.getHoTenVo(), dcnkh.getNgaySinhVo(), dcnkh.getDanTocVo(), dcnkh.getQuocTichVo(), dcnkh.getNoiCuTruVo(),
                dcnkh.getCCCDChong(), dcnkh.getHoTenChong(), dcnkh.getNgaySinhChong(), dcnkh.getDanTocChong(), dcnkh.getQuocTichChong(), dcnkh.getNoiCuTruChong(), dcnkh.getNgaydk(), dcnkh.getNoidk()});
        }

        tf_macnkh.setEditable(false);
        tf_giaytotuythanvo.setEditable(false);
        tf_hotenvo.setEditable(false);
        tf_ngaysinhvo.setEditable(false);
        tf_quoctichvo.setEditable(false);
        tf_dantocvo.setEditable(false);
        tf_noicutrucuavo.setEditable(false);
        tf_giaytotuythanchong.setEditable(false);
        tf_hotenchong.setEditable(false);
        tf_ngaysinhchong.setEditable(false);
        tf_dantocchong.setEditable(false);
        tf_quoctichchong.setEditable(false);
        tf_noicutrucuachong.setEditable(false);
        tf_ngaydangky.setEditable(false);
        tf_noidangky.setEditable(false);
    }//GEN-LAST:event_btn_donkethonActionPerformed

    private void btn_giaychungtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giaychungtuActionPerformed
        // TODO add your handling code here:
        panelDon.setVisible(false);
        panelGCT.setVisible(true);

        giayChungTuModel = chungTuService.findAllGCT(tf_timkiem.getText().trim());

        tf_machungtu.setText(giayChungTuModel.getMaCT());
        tf_cccdgct.setText(giayChungTuModel.getCCCD());
        tf_hotengct.setText(giayChungTuModel.getHoTen());
        tf_ngaysinhgct.setText(String.valueOf(giayChungTuModel.getNgaySinh()));
        tf_ngaymat.setText(String.valueOf(giayChungTuModel.getNgayMat()));
        tf_noimat.setText(giayChungTuModel.getNoiMat());
        tf_lydogct.setText(giayChungTuModel.getNguyenNhan());

        tf_machungtu.setEditable(false);
        tf_cccdgct.setEditable(false);
        tf_hotengct.setEditable(false);
        tf_ngaysinhgct.setEditable(false);
        tf_ngaymat.setEditable(false);
        tf_noimat.setEditable(false);
        tf_lydogct.setEditable(false);
    }//GEN-LAST:event_btn_giaychungtuActionPerformed

    private void btn_donlyhonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donlyhonActionPerformed
        // TODO add your handling code here:
        panelDon.setVisible(false);
        panelLH.setVisible(true);

        listLyHon = lyHonService.findAllLH(tf_timkiem.getText().trim(), tf_timkiem.getText().trim());
        model = (DefaultTableModel) tbl_lyhon.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (LyHonModel lh : listLyHon) {
            model.addRow(new Object[]{lh.getMaLh(), lh.getMaCnkh(), lh.getHoTenNguoiNopDon(), lh.getCCCDNguoiNopDon(), lh.getHoTenVo(), lh.getCCCDVO(),
                lh.getHoTenChong(), lh.getCCCDChong(), lh.getNoidk(), lh.getNgaydk(), lh.getLydo()});
        }

        tf_malyhon.setEditable(false);
        tf_macnkhlh.setEditable(false);
        tf_hotennguoinopdon.setEditable(false);
        tf_cccdnguoinopdon.setEditable(false);
        tf_hotenvolh.setEditable(false);
        tf_cccdvo.setEditable(false);
        tf_hotenchonglh.setEditable(false);
        tf_cccdchong.setEditable(false);
        tf_noidangkylh.setEditable(false);
        tf_ngaydangkylh.setEditable(false);
        tf_lydolh.setEditable(false);
    }//GEN-LAST:event_btn_donlyhonActionPerformed

    private void btn_thongtincongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thongtincongdanActionPerformed
        // TODO add your handling code here:
        panelDon.setVisible(false);
        panelTTCD.setVisible(true);

        thongTinCaNhan = congDanService.findTTCN(tf_timkiem.getText().trim());

        tf_hotencd.setText(thongTinCaNhan.getHoTen());
        tf_gioitinhcd.setText(thongTinCaNhan.getGioiTinh());
        tf_cccdcd.setText(thongTinCaNhan.getCCCD());
        tf_ngaysinhcd.setText(String.valueOf(thongTinCaNhan.getNgaySinh()));
        tf_noisinhcd.setText(thongTinCaNhan.getNoiSinh());
        tf_quoctichcd.setText(thongTinCaNhan.getQuocTich());
        tf_dantoccd.setText(thongTinCaNhan.getDanToc());
        tf_quequancd.setText(thongTinCaNhan.getQueQuan());
        tf_diachi.setText(thongTinCaNhan.getDiaChi());
        tf_sodienthoai.setText(thongTinCaNhan.getSdt());
        tf_email.setText(thongTinCaNhan.getEmail());
        
        byte[] imageData = thongTinCaNhan.getHinhAnh();
        Image image = null;
        try {
            image = ImageIO.read(new ByteArrayInputStream(imageData));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (image != null) {
        ImageIcon icon = new ImageIcon(image);
            pic_imgavatar.setImage(icon);
            pic_imgavatar.repaint(); // Cập nhật lại JLabel để hiển thị hình ảnh mới
        } else {
            // Đặt hình ảnh mặc định hoặc thông báo lỗi nếu hình ảnh không thể đọc được
            pic_imgavatar.setImage(new ImageIcon(getClass().getResource("/Views/OtherForm/Image/error.png")));
        }
        
        tf_hotencd.setEditable(false);
        tf_gioitinhcd.setEditable(false);
        tf_cccdcd.setEditable(false);
        tf_ngaysinhcd.setEditable(false);
        tf_noisinhcd.setEditable(false);
        tf_quoctichcd.setEditable(false);
        tf_dantoccd.setEditable(false);
        tf_quequancd.setEditable(false);
        tf_diachi.setEditable(false);
        tf_sodienthoai.setEditable(false);
        tf_email.setEditable(false);
    }//GEN-LAST:event_btn_thongtincongdanActionPerformed

    private void btn_dontamvangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dontamvangActionPerformed
        // TODO add your handling code here:
        panelDon.setVisible(false);
        panelTV.setVisible(true);

        listDonTamVang = tamVangService.findAllTV(tf_timkiem.getText().trim());
        model = (DefaultTableModel) tbl_tamvang.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (DonTamVang dtv : listDonTamVang) {
            model.addRow(new Object[]{dtv.getMaTV(), dtv.getNgayDangKy(), dtv.getNoiChuyenDi(), dtv.getNoiChuyenDen(), dtv.getHoTen(), dtv.getNgaySinh(),
                dtv.getCCCD(), dtv.getNoiCapCCCD(), dtv.getNgayDi(), dtv.getNgayVe(), dtv.getLyDo()});
        }

        tf_matamvang.setEditable(false);
        tf_ngaydangkytv.setEditable(false);
        tf_noichuyendi.setEditable(false);
        tf_noichuyenden.setEditable(false);
        tf_hotentv.setEditable(false);
        tf_ngaysinhtv.setEditable(false);
        tf_cccdtv.setEditable(false);
        tf_noicaptv.setEditable(false);
        tf_ngayve.setEditable(false);
        tf_ngayditv.setEditable(false);
        tf_lydotv.setEditable(false);
    }//GEN-LAST:event_btn_dontamvangActionPerformed

    private void btn_dontamtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dontamtruActionPerformed
        // TODO add your handling code here:
        panelDon.setVisible(false);
        panelTT.setVisible(true);

        DefaultTableModel model;

        listDonTamTru = tamTruService.findAllTT(tf_timkiem.getText().trim());
        model = (DefaultTableModel) tbl_tamtru.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (DonTamTru dtt : listDonTamTru) {
            model.addRow(new Object[]{dtt.getMaTT(), dtt.getNgayDk(), dtt.getNoiDangKy(), dtt.getHoTen(), dtt.getNgaySinh(), dtt.getCCCD(),
                dtt.getNoiCap(), dtt.getNgayCap(), dtt.getNgayDen(), dtt.getNgayDi(), dtt.getLiDo()});
        }

        tf_matamtru.setEditable(false);
        tf_ngaydangkyTT.setEditable(false);
        tf_noidangkyTT.setEditable(false);
        tf_ngaysinh.setEditable(false);
        tf_hoten.setEditable(false);
        tf_cccd.setEditable(false);
        tf_noicap.setEditable(false);
        tf_ngaycap.setEditable(false);
        tf_ngayden.setEditable(false);
        tf_ngaydi.setEditable(false);
        tf_lydo.setEditable(false);
    }//GEN-LAST:event_btn_dontamtruActionPerformed

    private void btn_donkhaisinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donkhaisinhActionPerformed
        // TODO add your handling code here:
        panelDon.setVisible(false);
        panelKS.setVisible(true);

        khaiSinhModel = khaiSinhService.findByCCCD(tf_timkiem.getText().trim());

        tf_hotenks.setText(khaiSinhModel.getHoTenKS());
        tf_maks.setText(khaiSinhModel.getMaKS());
        tf_gioitinh.setText(khaiSinhModel.getGioiTinh());
        tf_ngaysinhks.setText(String.valueOf(khaiSinhModel.getNgaySinh()));
        tf_noisinh.setText(khaiSinhModel.getNoiSinh());
        tf_quoctich.setText(khaiSinhModel.getQuocTich());
        tf_dantoc.setText(khaiSinhModel.getDanToc());
        tf_quequan.setText(khaiSinhModel.getQueQuan());
        tf_cccdcha.setText(khaiSinhModel.getCha());
        tf_cccdme.setText(khaiSinhModel.getMe());
        tf_ngaydangkyks.setText(String.valueOf(khaiSinhModel.getNgayDk()));
        tf_cccdnguoikhaisinh.setText(khaiSinhModel.getNguoiKhaiSinh());
        tf_quanhe.setText(khaiSinhModel.getQuanHe());
        tf_noidangkyks.setText(khaiSinhModel.getNoiDk());

        tf_hotenks.setEditable(false);
        tf_maks.setEditable(false);
        tf_gioitinh.setEditable(false);
        tf_ngaysinhks.setEditable(false);
        tf_noisinh.setEditable(false);
        tf_quoctich.setEditable(false);
        tf_dantoc.setEditable(false);
        tf_quequan.setEditable(false);
        tf_cccdcha.setEditable(false);
        tf_cccdme.setEditable(false);
        tf_ngaydangkyks.setEditable(false);
        tf_cccdnguoikhaisinh.setEditable(false);
        tf_quanhe.setEditable(false);
        tf_noidangkyks.setEditable(false);
    }//GEN-LAST:event_btn_donkhaisinhActionPerformed

    private void tf_hotenksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hotenksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hotenksActionPerformed

    private void tf_macnkhlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_macnkhlhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_macnkhlhActionPerformed

    private void setEnabledButton() {
        tabbedPaneCustom1.setEnabledAt(1, false);

        thongTinCaNhan = congDanService.findTTCN(tf_timkiem.getText().trim());
        if (thongTinCaNhan.getCCCD() == null) {
            btn_thongtincongdan.setEnabled(false);
            btn_thongtincongdan.setForeground(new Color(176, 176, 176));
            btn_thongtincongdan.setBackground(new Color(255,255,255));
            btn_thongtincongdan.setColor(new Color(255,255,255));
            btn_thongtincongdan.setBorderColor(new Color(176, 176, 176));
            btn_thongtincongdan.setColorClick(new Color(255,255,255));
            btn_thongtincongdan.setColorOver(new Color(255,255,255));
        }
        else if(thongTinCaNhan.getCCCD() != null){
            btn_thongtincongdan.setEnabled(true);
            btn_thongtincongdan.setColor(new Color(255,255,255));
            btn_thongtincongdan.setForeground(new Color(21,110,71));
            btn_thongtincongdan.setBackground(new Color(255,255,255));
            btn_thongtincongdan.setBorderColor(new Color(21,110,71));
            btn_thongtincongdan.setColorClick(new Color(156, 247, 218));
            btn_thongtincongdan.setColorOver(new Color(188, 247, 228));
        }
        
        listDonChungNhanKetHon = chungNhanKetHonService.findAllCNKH(tf_timkiem.getText().trim(), tf_timkiem.getText().trim());
        if (listDonChungNhanKetHon.isEmpty()) {
            btn_donkethon.setEnabled(false);
            btn_donkethon.setForeground(new Color(176, 176, 176));
            btn_donkethon.setBackground(new Color(255,255,255));
            btn_donkethon.setColor(new Color(255,255,255));
            btn_donkethon.setBorderColor(new Color(176, 176, 176));
            btn_donkethon.setColorClick(new Color(255,255,255));
            btn_donkethon.setColorOver(new Color(255,255,255));
        }else if(!listDonChungNhanKetHon.isEmpty()){
            btn_donkethon.setEnabled(true);
            btn_donkethon.setColor(new Color(255,255,255));
            btn_donkethon.setForeground(new Color(21,110,71));
            btn_donkethon.setBackground(new Color(255,255,255));
            btn_donkethon.setBorderColor(new Color(21,110,71));
            btn_donkethon.setColorClick(new Color(156, 247, 218));
            btn_donkethon.setColorOver(new Color(188, 247, 228));
        }
        
        khaiSinhModel = khaiSinhService.findByCCCD(tf_timkiem.getText().trim());
        if (khaiSinhModel.getMaKS() == null) {
            btn_donkhaisinh.setEnabled(false);
            btn_donkhaisinh.setForeground(new Color(176, 176, 176));
            btn_donkhaisinh.setBackground(new Color(255,255,255));
            btn_donkhaisinh.setColor(new Color(255,255,255));
            btn_donkhaisinh.setBorderColor(new Color(176, 176, 176));
            btn_donkhaisinh.setColorClick(new Color(255,255,255));
            btn_donkhaisinh.setColorOver(new Color(255,255,255));
        }
        else if(khaiSinhModel.getMaKS() != null){
            btn_donkhaisinh.setEnabled(true);
            btn_donkhaisinh.setColor(new Color(255,255,255));
            btn_donkhaisinh.setForeground(new Color(21,110,71));
            btn_donkhaisinh.setBackground(new Color(255,255,255));
            btn_donkhaisinh.setBorderColor(new Color(21,110,71));
            btn_donkhaisinh.setColorClick(new Color(156, 247, 218));
            btn_donkhaisinh.setColorOver(new Color(188, 247, 228));
        }
        listDonTamTru = tamTruService.findAllTT(tf_timkiem.getText().trim());
        if (listDonTamTru.isEmpty()) {
            btn_dontamtru.setEnabled(false);
            btn_dontamtru.setForeground(new Color(176, 176, 176));
            btn_dontamtru.setBackground(new Color(255,255,255));
            btn_dontamtru.setColor(new Color(255,255,255));
            btn_dontamtru.setBorderColor(new Color(176, 176, 176));
            btn_dontamtru.setColorClick(new Color(255,255,255));
            btn_dontamtru.setColorOver(new Color(255,255,255));
        }
        else if(!listDonTamTru.isEmpty()){
            btn_dontamtru.setEnabled(true);
            btn_dontamtru.setColor(new Color(255,255,255));
            btn_dontamtru.setForeground(new Color(21,110,71));
            btn_dontamtru.setBackground(new Color(255,255,255));
            btn_dontamtru.setBorderColor(new Color(21,110,71));
            btn_dontamtru.setColorClick(new Color(156, 247, 218));
            btn_dontamtru.setColorOver(new Color(188, 247, 228));
        }
        listDonTamVang = tamVangService.findAllTV(tf_timkiem.getText().trim());
        if (listDonTamVang.isEmpty()) {
            btn_dontamvang.setEnabled(false);
            btn_dontamvang.setForeground(new Color(176, 176, 176));
            btn_dontamvang.setBackground(new Color(255,255,255));
            btn_dontamvang.setColor(new Color(255,255,255));
            btn_dontamvang.setBorderColor(new Color(176, 176, 176));
            btn_dontamvang.setColorClick(new Color(255,255,255));
            btn_dontamvang.setColorOver(new Color(255,255,255));
        }
        else if(!listDonTamVang.isEmpty()){
            btn_dontamvang.setEnabled(true);
            btn_dontamvang.setColor(new Color(255,255,255));
            btn_dontamvang.setForeground(new Color(21,110,71));
            btn_dontamvang.setBackground(new Color(255,255,255));
            btn_dontamvang.setBorderColor(new Color(21,110,71));
            btn_dontamvang.setColorClick(new Color(156, 247, 218));
            btn_dontamvang.setColorOver(new Color(188, 247, 228));
        }
        listLyHon = lyHonService.findAllLH(tf_timkiem.getText().trim(), tf_timkiem.getText().trim());
        if (listLyHon.isEmpty()) {
            btn_donlyhon.setEnabled(false);
            btn_donlyhon.setForeground(new Color(176, 176, 176));
            btn_donlyhon.setBackground(new Color(255,255,255));
            btn_donlyhon.setColor(new Color(255,255,255));
            btn_donlyhon.setBorderColor(new Color(176, 176, 176));
            btn_donlyhon.setColorClick(new Color(255,255,255));
            btn_donlyhon.setColorOver(new Color(255,255,255));
        }
        else if(!listLyHon.isEmpty()){
            btn_donlyhon.setEnabled(true);
            btn_donlyhon.setColor(new Color(255,255,255));
            btn_donlyhon.setForeground(new Color(21,110,71));
            btn_donlyhon.setBackground(new Color(255,255,255));
            btn_donlyhon.setBorderColor(new Color(21,110,71));
            btn_donlyhon.setColorClick(new Color(156, 247, 218));
            btn_donlyhon.setColorOver(new Color(188, 247, 228));
        }
        giayChungTuModel = chungTuService.findAllGCT(tf_timkiem.getText().trim());
        if (giayChungTuModel.getCCCD() == null) {
            btn_giaychungtu.setEnabled(false);
            btn_giaychungtu.setForeground(new Color(176, 176, 176));
            btn_giaychungtu.setBackground(new Color(255,255,255));
            btn_giaychungtu.setColor(new Color(255,255,255));
            btn_giaychungtu.setBorderColor(new Color(176, 176, 176));
            btn_giaychungtu.setColorClick(new Color(255,255,255));
            btn_giaychungtu.setColorOver(new Color(255,255,255));
        }
        else if(giayChungTuModel.getCCCD() != null){
            btn_giaychungtu.setEnabled(true);
            btn_giaychungtu.setColor(new Color(255,255,255));
            btn_giaychungtu.setForeground(new Color(21,110,71));
            btn_giaychungtu.setBackground(new Color(255,255,255));
            btn_giaychungtu.setBorderColor(new Color(21,110,71));
            btn_giaychungtu.setColorClick(new Color(156, 247, 218));
            btn_giaychungtu.setColorOver(new Color(188, 247, 228));
        }
       
        tthk = hoKhauService.findOneByCCCD(tf_timkiem.getText().trim());
        listHoKhau = hoKhauService.findAllHoKhau(tf_timkiem.getText().trim());
        if (tthk.getCCCDNguoiDangNhap() == null) {
            tabbedPaneCustom1.setEnabledAt(1, false);
        } else if (tthk.getCCCDNguoiDangNhap() != null) {
            tabbedPaneCustom1.setEnabledAt(1, true);
            loadHoKhau(tf_timkiem.getText().trim());
            loadListHoKhau(tf_timkiem.getText().trim());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton brn_backFromKSToDon;
    private button.MyButton btn_backFromCNKHToDon;
    private button.MyButton btn_backFromGCTToDon;
    private button.MyButton btn_backFromLHToDon;
    private button.MyButton btn_backFromTTCDToDon;
    private button.MyButton btn_backFromTTToDon;
    private button.MyButton btn_backFromTVToDon;
    private button.MyButton btn_donkethon;
    private button.MyButton btn_donkhaisinh;
    private button.MyButton btn_donlyhon;
    private button.MyButton btn_dontamtru;
    private button.MyButton btn_dontamvang;
    private button.MyButton btn_giaychungtu;
    private button.MyButton btn_thongtincongdan;
    private button.MyButton btn_timkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panelDon;
    private javax.swing.JPanel panelGCNKH;
    private javax.swing.JPanel panelGCT;
    private javax.swing.JPanel panelHoKhau;
    private javax.swing.JPanel panelKS;
    private javax.swing.JPanel panelLH;
    private javax.swing.JPanel panelTT;
    private javax.swing.JPanel panelTTCD;
    private javax.swing.JPanel panelTV;
    private javax.swing.JPanel panelXemDon;
    private Swing.PictureBox pic_imgavatar;
    private Swing.TabbedPaneCustom tabbedPaneCustom1;
    private Swing.TableDark tbl_cnkh;
    private Swing.TableDark tbl_hokhau;
    private Swing.TableDark tbl_lyhon;
    private Swing.TableDark tbl_tamtru;
    private Swing.TableDark tbl_tamvang;
    private Swing.TextField tf_cccd;
    private Swing.TextField tf_cccdcd;
    private Swing.TextField tf_cccdcha;
    private Swing.TextField tf_cccdchong;
    private Swing.TextField tf_cccdchuho;
    private Swing.TextField tf_cccdgct;
    private Swing.TextField tf_cccdme;
    private Swing.TextField tf_cccdnguoikhaisinh;
    private Swing.TextField tf_cccdnguoinopdon;
    private Swing.TextField tf_cccdthanhvien;
    private Swing.TextField tf_cccdtv;
    private Swing.TextField tf_cccdvo;
    private Swing.TextField tf_dantoc;
    private Swing.TextField tf_dantoccd;
    private Swing.TextField tf_dantocchong;
    private Swing.TextField tf_dantocvo;
    private Swing.TextField tf_diachi;
    private Swing.TextField tf_diachihk;
    private Swing.TextField tf_email;
    private Swing.TextField tf_giaytotuythanchong;
    private Swing.TextField tf_giaytotuythanvo;
    private Swing.TextField tf_gioitinh;
    private Swing.TextField tf_gioitinhcd;
    private Swing.TextField tf_hoten;
    private Swing.TextField tf_hotencd;
    private Swing.TextField tf_hotenchong;
    private Swing.TextField tf_hotenchonglh;
    private Swing.TextField tf_hotenchuho;
    private Swing.TextField tf_hotengct;
    private Swing.TextField tf_hotenks;
    private Swing.TextField tf_hotennguoinopdon;
    private Swing.TextField tf_hotenthanhvien;
    private Swing.TextField tf_hotentv;
    private Swing.TextField tf_hotenvo;
    private Swing.TextField tf_hotenvolh;
    private Swing.TextField tf_lydo;
    private Swing.TextField tf_lydogct;
    private Swing.TextField tf_lydolh;
    private Swing.TextField tf_lydotv;
    private Swing.TextField tf_machungtu;
    private Swing.TextField tf_macnkh;
    private Swing.TextField tf_macnkhlh;
    private Swing.TextField tf_mahokhau;
    private Swing.TextField tf_maks;
    private Swing.TextField tf_malyhon;
    private Swing.TextField tf_matamtru;
    private Swing.TextField tf_matamvang;
    private Swing.TextField tf_ngaycap;
    private Swing.TextField tf_ngaydangky;
    private Swing.TextField tf_ngaydangkyTT;
    private Swing.TextField tf_ngaydangkyks;
    private Swing.TextField tf_ngaydangkylh;
    private Swing.TextField tf_ngaydangkytv;
    private Swing.TextField tf_ngayden;
    private Swing.TextField tf_ngaydi;
    private Swing.TextField tf_ngayditv;
    private Swing.TextField tf_ngaymat;
    private Swing.TextField tf_ngaysinh;
    private Swing.TextField tf_ngaysinhcd;
    private Swing.TextField tf_ngaysinhchong;
    private Swing.TextField tf_ngaysinhgct;
    private Swing.TextField tf_ngaysinhks;
    private Swing.TextField tf_ngaysinhtv;
    private Swing.TextField tf_ngaysinhvo;
    private Swing.TextField tf_ngayve;
    private Swing.TextField tf_noicap;
    private Swing.TextField tf_noicaptv;
    private Swing.TextField tf_noichuyenden;
    private Swing.TextField tf_noichuyendi;
    private Swing.TextField tf_noicutrucuachong;
    private Swing.TextField tf_noicutrucuavo;
    private Swing.TextField tf_noidangky;
    private Swing.TextField tf_noidangkyTT;
    private Swing.TextField tf_noidangkyks;
    private Swing.TextField tf_noidangkylh;
    private Swing.TextField tf_noimat;
    private Swing.TextField tf_noisinh;
    private Swing.TextField tf_noisinhcd;
    private Swing.TextField tf_quanhe;
    private Swing.TextField tf_quanhevoichuho;
    private Swing.TextField tf_quequan;
    private Swing.TextField tf_quequancd;
    private Swing.TextField tf_quoctich;
    private Swing.TextField tf_quoctichcd;
    private Swing.TextField tf_quoctichchong;
    private Swing.TextField tf_quoctichvo;
    private Swing.TextField tf_sodienthoai;
    private Swing.TextField tf_timkiem;
    // End of variables declaration//GEN-END:variables

}
