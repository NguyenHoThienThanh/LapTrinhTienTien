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

import java.util.List;
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
        tabbedPaneCustom1.setEnabledAt(2, false);
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
        panelThue = new javax.swing.JPanel();
        tf_masothue = new Swing.TextField();
        tf_hotenthue = new Swing.TextField();
        tf_coquanthue = new Swing.TextField();
        tf_ngaythaydoithongtin = new Swing.TextField();
        btn_timkiem = new button.MyButton();
        panelGCNKH = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cnkh = new javax.swing.JTable();
        btn_backFromGCNKHToDon = new button.MyButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tamtru = new javax.swing.JTable();
        btn_backFromTTToDon = new button.MyButton();
        panelGCT = new javax.swing.JPanel();
        tf_machungtu = new Swing.TextField();
        tf_cccdgct = new Swing.TextField();
        tf_hotengct = new Swing.TextField();
        tf_ngaysinhgct = new Swing.TextField();
        tf_ngaymat = new Swing.TextField();
        tf_noimat = new Swing.TextField();
        tf_lydogct = new Swing.TextField();
        btn_backFromGCTToDon = new button.MyButton();
        panelKS = new javax.swing.JPanel();
        tf_hotenks = new Swing.TextField();
        tf_maks = new Swing.TextField();
        tf_noisinh = new Swing.TextField();
        tf_gioitinh = new Swing.TextField();
        tf_ngaysinhks = new Swing.TextField();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_tamvang = new javax.swing.JTable();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_lyhon = new javax.swing.JTable();
        btn_backFromLHToDon = new button.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        panelDon.setBackground(new java.awt.Color(255, 255, 255));

        tf_timkiem.setLabelText("Nhập CCCD");
        tf_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_timkiemActionPerformed(evt);
            }
        });

        jLabel1.setText("Quản lý đơn");

        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(21, 110, 71));

        panelXemDon.setBackground(new java.awt.Color(255, 255, 255));
        panelXemDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));

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
        btn_donkethon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email-heart-outline-custom (1).png"))); // NOI18N
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
                .addContainerGap(137, Short.MAX_VALUE)
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
                    .addGroup(panelXemDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_donkethon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelXemDonLayout.createSequentialGroup()
                            .addComponent(btn_donkhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)))
                    .addComponent(btn_dontamtru, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dontamvang, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelXemDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_thongtincongdan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_donlyhon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_giaychungtu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(407, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Xem đơn từ", panelXemDon);

        panelHoKhau.setBackground(new java.awt.Color(255, 255, 255));
        panelHoKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cccdchuho, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_hotenthanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_hotenchuho, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_quanhevoichuho, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
            .addGroup(panelHoKhauLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHoKhauLayout.setVerticalGroup(
            panelHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoKhauLayout.createSequentialGroup()
                .addGap(56, 56, 56)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Hộ khẩu", panelHoKhau);

        panelThue.setBackground(new java.awt.Color(255, 255, 255));
        panelThue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));

        tf_masothue.setLabelText("Mã số thuế");

        tf_hotenthue.setLabelText("Họ tên");

        tf_coquanthue.setLabelText("Cơ quan thuế");

        tf_ngaythaydoithongtin.setLabelText("Ngày thay đổi thông tin gần nhất");

        javax.swing.GroupLayout panelThueLayout = new javax.swing.GroupLayout(panelThue);
        panelThue.setLayout(panelThueLayout);
        panelThueLayout.setHorizontalGroup(
            panelThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThueLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_coquanthue, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(tf_masothue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(panelThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_hotenthue, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(tf_ngaythaydoithongtin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        panelThueLayout.setVerticalGroup(
            panelThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThueLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_masothue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenthue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_coquanthue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaythaydoithongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(567, Short.MAX_VALUE))
        );

        tabbedPaneCustom1.addTab("Thuế", panelThue);

        btn_timkiem.setBackground(new java.awt.Color(21, 110, 71));
        btn_timkiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_timkiem.setText("Search");
        btn_timkiem.setBorderColor(new java.awt.Color(21, 110, 71));
        btn_timkiem.setBorderPainted(false);
        btn_timkiem.setColor(new java.awt.Color(21, 110, 71));
        btn_timkiem.setColorClick(new java.awt.Color(141, 240, 197));
        btn_timkiem.setColorOver(new java.awt.Color(61, 212, 146));
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
                .addGroup(panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDonLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(274, 274, 274)
                        .addComponent(tf_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        panelDonLayout.setVerticalGroup(
            panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(panelDon, "card2");

        tbl_cnkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CNKH", "Giấy tờ tùy thân vợ", "Họ tên vợ", "Ngày sinh vợ", "Dân tộc vợ", "Quốc tịch vợ", "Nơi trú vợ", "Giấy tờ tùy thân chồng", "Họ tên chồng", "Ngày sinh chồng", "Dân tộc chồng", "Quốc tịch chồng", "Nơi cư trú chồng", "Ngày đăng kí kết hôn", "Nơi đăng ký kết hôn"
            }
        ));
        tbl_cnkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cnkhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cnkh);

        btn_backFromGCNKHToDon.setBackground(new java.awt.Color(255, 0, 0));
        btn_backFromGCNKHToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromGCNKHToDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/previous.png"))); // NOI18N
        btn_backFromGCNKHToDon.setText("Back");
        btn_backFromGCNKHToDon.setBorderColor(new java.awt.Color(255, 0, 0));
        btn_backFromGCNKHToDon.setHideActionText(true);
        btn_backFromGCNKHToDon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_backFromGCNKHToDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_backFromGCNKHToDon.setIconTextGap(2);
        btn_backFromGCNKHToDon.setMargin(new java.awt.Insets(2, 1, 3, 14));
        btn_backFromGCNKHToDon.setRadius(15);
        btn_backFromGCNKHToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromGCNKHToDonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelGCNKHLayout = new javax.swing.GroupLayout(panelGCNKH);
        panelGCNKH.setLayout(panelGCNKHLayout);
        panelGCNKHLayout.setHorizontalGroup(
            panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCNKHLayout.createSequentialGroup()
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGCNKHLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGCNKHLayout.createSequentialGroup()
                                .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGCNKHLayout.createSequentialGroup()
                                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_hotenchong, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGCNKHLayout.createSequentialGroup()
                                        .addComponent(tf_ngaysinhchong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_quoctichchong, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelGCNKHLayout.createSequentialGroup()
                                        .addComponent(tf_giaytotuythanchong, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_dantocchong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_noicutrucuachong, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_noicutrucuavo, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelGCNKHLayout.createSequentialGroup()
                                            .addComponent(tf_giaytotuythanvo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_dantocvo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelGCNKHLayout.createSequentialGroup()
                                            .addComponent(tf_ngaysinhvo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_quoctichvo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(panelGCNKHLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btn_backFromGCNKHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panelGCNKHLayout.setVerticalGroup(
            panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGCNKHLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_backFromGCNKHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hotenchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaysinhchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctichchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinhvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctichvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_giaytotuythanchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantocchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_giaytotuythanvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantocvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_noicutrucuavo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noicutrucuachong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGCNKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
        );

        add(panelGCNKH, "card3");

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

        jLabel3.setText("Lịch sử đơn");

        tbl_tamtru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tạm trú", "Ngày đăng ký", "Nơi đăng ký", "Họ tên", "Ngày sinh", "CCCD", "Nơi cấp CCCD", "Ngày cấp CCCD", "Ngày đến", "Ngày đi", "Ngày đăng ký"
            }
        ));
        tbl_tamtru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tamtruMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_tamtru);

        btn_backFromTTToDon.setText("myButton1");
        btn_backFromTTToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromTTToDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTTLayout = new javax.swing.GroupLayout(panelTT);
        panelTT.setLayout(panelTTLayout);
        panelTTLayout.setHorizontalGroup(
            panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTLayout.createSequentialGroup()
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTTLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_cccd, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(tf_matamtru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tf_ngayden, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTTLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(tf_ngaydi, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tf_ngaydangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTTLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelTTLayout.createSequentialGroup()
                                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_hoten, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(tf_noicap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(35, 35, 35)
                                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(tf_ngaycap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(tf_noidangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelTTLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_backFromTTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        panelTTLayout.setVerticalGroup(
            panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_backFromTTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_matamtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noicap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaycap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngayden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangkyTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        add(panelTT, "card4");

        tf_machungtu.setLabelText("Mã chứng tử");

        tf_cccdgct.setLabelText("CCCD");

        tf_hotengct.setLabelText("Họ và tên");

        tf_ngaysinhgct.setLabelText("Ngày sinh");

        tf_ngaymat.setLabelText("Ngày mất");

        tf_noimat.setLabelText("Nơi mất");

        tf_lydogct.setLabelText("Lý do");

        btn_backFromGCTToDon.setText("myButton1");
        btn_backFromGCTToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromGCTToDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGCTLayout = new javax.swing.GroupLayout(panelGCT);
        panelGCT.setLayout(panelGCTLayout);
        panelGCTLayout.setHorizontalGroup(
            panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCTLayout.createSequentialGroup()
                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGCTLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelGCTLayout.createSequentialGroup()
                                .addComponent(tf_machungtu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(tf_cccdgct, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(tf_hotengct, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGCTLayout.createSequentialGroup()
                                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_ngaysinhgct, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_noimat, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ngaymat, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(tf_lydogct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelGCTLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_backFromGCTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        panelGCTLayout.setVerticalGroup(
            panelGCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGCTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btn_backFromGCTToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addContainerGap(628, Short.MAX_VALUE))
        );

        add(panelGCT, "card5");

        tf_hotenks.setLabelText("Họ tên");

        tf_maks.setLabelText("Mã khai sinh");

        tf_noisinh.setLabelText("Nơi sinh");

        tf_gioitinh.setLabelText("Giới tính");

        tf_ngaysinhks.setLabelText("Ngày sinh");

        tf_quequan.setLabelText("Quê quán");

        tf_dantoc.setLabelText("Dân tộc");

        tf_quoctich.setLabelText("Quốc tịch");

        tf_cccdcha.setLabelText("CCCD Cha");

        tf_cccdme.setLabelText("CCCD Me");

        tf_ngaydangkyks.setLabelText("Ngày đăng ký");

        tf_cccdnguoikhaisinh.setLabelText("CCCD người khai sinh");

        tf_quanhe.setLabelText("Quan hệ");

        tf_noidangkyks.setLabelText("Nơi đăng ký");

        brn_backFromKSToDon.setText("myButton2");
        brn_backFromKSToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brn_backFromKSToDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKSLayout = new javax.swing.GroupLayout(panelKS);
        panelKS.setLayout(panelKSLayout);
        panelKSLayout.setHorizontalGroup(
            panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKSLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(brn_backFromKSToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelKSLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKSLayout.createSequentialGroup()
                        .addComponent(tf_hotenks, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_maks, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_noisinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelKSLayout.createSequentialGroup()
                        .addComponent(tf_ngaysinhks, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_quoctich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelKSLayout.createSequentialGroup()
                        .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cccdcha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cccdnguoikhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cccdme, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_quanhe, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelKSLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tf_ngaydangkyks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelKSLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                                .addComponent(tf_noidangkyks, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        panelKSLayout.setVerticalGroup(
            panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKSLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(brn_backFromKSToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hotenks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_maks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaysinhks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quoctich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangkyks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdnguoikhaisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quanhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noidangkyks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(544, Short.MAX_VALUE))
        );

        add(panelKS, "card6");

        panelTV.setBackground(new java.awt.Color(255, 255, 255));

        btn_backFromTVToDon.setBackground(new java.awt.Color(0, 0, 255));
        btn_backFromTVToDon.setForeground(new java.awt.Color(255, 255, 255));
        btn_backFromTVToDon.setText("Back");
        btn_backFromTVToDon.setBorderColor(new java.awt.Color(255, 255, 255));
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

        jLabel4.setText("Lịch sử đơn");

        tf_lydotv.setLabelText("Lý do");

        tbl_tamvang.setBackground(new java.awt.Color(204, 204, 204));
        tbl_tamvang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_tamvang.setForeground(new java.awt.Color(255, 255, 51));
        tbl_tamvang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tạm vắng", "Ngày đăng ký", "Nơi chuyển đi", "Nới chuyển đến", "Họ tên", "Ngày sinh", "CCCD", "Nơi cấp CCCD", "Ngày đi", "Ngày về", "Lí do"
            }
        ));
        tbl_tamvang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tamvangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_tamvang);

        javax.swing.GroupLayout panelTVLayout = new javax.swing.GroupLayout(panelTV);
        panelTV.setLayout(panelTVLayout);
        panelTVLayout.setHorizontalGroup(
            panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTVLayout.createSequentialGroup()
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTVLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btn_backFromTVToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelTVLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(tf_matamvang, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(tf_hotentv, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tf_ngaysinhtv, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tf_cccdtv, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTVLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelTVLayout.createSequentialGroup()
                                    .addComponent(tf_noicaptv, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(tf_ngayditv, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_ngayve, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelTVLayout.createSequentialGroup()
                                    .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_noichuyendi, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_ngaydangkytv, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_lydotv, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_noichuyenden, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelTVLayout.setVerticalGroup(
            panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTVLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_backFromTVToDon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_matamvang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotentv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaysinhtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noicaptv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayditv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noichuyendi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noichuyenden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ngaydangkytv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lydotv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        add(panelTV, "card7");

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

        btn_backFromTTCDToDon.setText("myButton2");
        btn_backFromTTCDToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromTTCDToDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTTCDLayout = new javax.swing.GroupLayout(panelTTCD);
        panelTTCD.setLayout(panelTTCDLayout);
        panelTTCDLayout.setHorizontalGroup(
            panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTCDLayout.createSequentialGroup()
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTTCDLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelTTCDLayout.createSequentialGroup()
                                .addComponent(tf_ngaysinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_noisinhcd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_quoctichcd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(tf_dantoccd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTTCDLayout.createSequentialGroup()
                                .addComponent(tf_hotencd, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tf_gioitinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(tf_cccdcd, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTTCDLayout.createSequentialGroup()
                                .addComponent(tf_quequancd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelTTCDLayout.createSequentialGroup()
                                .addComponent(tf_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelTTCDLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_backFromTTCDToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        panelTTCDLayout.setVerticalGroup(
            panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTTCDLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_backFromTTCDToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTTCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hotencd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_gioitinhcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addContainerGap(537, Short.MAX_VALUE))
        );

        add(panelTTCD, "card8");

        tf_malyhon.setLabelText("Mã ly hôn");

        tf_macnkhlh.setLabelText("Mã CNKH");

        tf_hotennguoinopdon.setLabelText("Họ tên người nộp đơn");

        tf_cccdnguoinopdon.setLabelText("CCCD người nộp đơn");

        tf_hotenvolh.setLabelText("Họ tên vợ");

        tf_hotenchonglh.setLabelText("Họ tên chồng");

        tf_cccdvo.setLabelText("CCCD vợ");

        tf_cccdchong.setLabelText("CCCD chồng");

        tf_noidangkylh.setLabelText("Nơi đăng ký");

        tf_ngaydangkylh.setLabelText("Ngày đăng ký");

        tf_lydolh.setLabelText("Lý do");

        jLabel5.setText("Lịch sử đơn");

        tbl_lyhon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ly hôn", "Mã CNKH", "Họ tên người nộp đơn", "CCCD người nộp đơn", "Họ tên vợ", "CCCD Vợ", "Họ tên chồng", "CCCD Chồng", "Nơi đăng ký", "Ngày đăng ký", "Lý do"
            }
        ));
        tbl_lyhon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_lyhonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_lyhon);

        btn_backFromLHToDon.setText("myButton2");
        btn_backFromLHToDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backFromLHToDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLHLayout = new javax.swing.GroupLayout(panelLH);
        panelLH.setLayout(panelLHLayout);
        panelLHLayout.setHorizontalGroup(
            panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLHLayout.createSequentialGroup()
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLHLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLHLayout.createSequentialGroup()
                                .addComponent(tf_malyhon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_macnkhlh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_hotennguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_cccdnguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLHLayout.createSequentialGroup()
                                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hotenvolh, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cccdvo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_hotenchonglh, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addComponent(tf_cccdchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelLHLayout.createSequentialGroup()
                                .addComponent(tf_noidangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(tf_ngaydangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_lydolh, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLHLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_backFromLHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelLHLayout.setVerticalGroup(
            panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLHLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btn_backFromLHToDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_malyhon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_macnkhlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotennguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdnguoinopdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hotenvolh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hotenchonglh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cccdvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cccdchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noidangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaydangkylh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lydolh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        add(panelLH, "card9");
    }// </editor-fold>//GEN-END:initComponents

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

    private void loadThue(String search1, String search2) {
        search1 = tf_timkiem.getText().trim();
        search2 = tf_timkiem.getText().trim();
        thue = thueService.findOneByCCCD(search1, search2);

        tf_masothue.setText(thue.getMasothue());
        tf_hotenthue.setText(thue.getHoten());
        tf_coquanthue.setText(thue.getCoquanthue());
        tf_ngaythaydoithongtin.setText(String.valueOf(thue.getNgaythaydoithongtingannhat()));

        tf_masothue.setEditable(false);
        tf_hotenthue.setEditable(false);
        tf_coquanthue.setEditable(false);
        tf_ngaythaydoithongtin.setEditable(false);

    }

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
            model.addRow(new Object[]{tthk.getCCCDNguoiThan(), tthk.getHoTenNguoiThan(), tthk.getNgaySinh(), tthk.getQuanHeVoiChuHo()});
        }
    }
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

    private void btn_backFromGCNKHToDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backFromGCNKHToDonActionPerformed
        // TODO add your handling code here:
        panelGCNKH.setVisible(false);
        panelDon.setVisible(true);
    }//GEN-LAST:event_btn_backFromGCNKHToDonActionPerformed

    private void tf_giaytotuythanchongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_giaytotuythanchongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_giaytotuythanchongActionPerformed

    private void tf_dantocchongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dantocchongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dantocchongActionPerformed

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

    private void tbl_lyhonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_lyhonMouseClicked
        // TODO add your handling code here:
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

    private void setEnabledButton() {
        tabbedPaneCustom1.setEnabledAt(1, false);
        tabbedPaneCustom1.setEnabledAt(2, false);

        thongTinCaNhan = congDanService.findTTCN(tf_timkiem.getText().trim());
        if (thongTinCaNhan.getCCCD() == null) {
            btn_thongtincongdan.setEnabled(false);
            btn_thongtincongdan.setColor(new Color(176, 176, 176));
            btn_thongtincongdan.setBackground(new Color(176, 176, 176));
            btn_thongtincongdan.setBorderColor(new Color(176, 176, 176));
            btn_thongtincongdan.setColorClick(new Color(176, 176, 176));
            btn_thongtincongdan.setColorOver(new Color(176, 176, 176));
        }
        else if(thongTinCaNhan.getCCCD() != null){
            btn_thongtincongdan.setEnabled(true);
            btn_thongtincongdan.setColor(new Color(255,0,0));
            btn_thongtincongdan.setBackground(new Color(255,0,0));
            btn_thongtincongdan.setBorderColor(new Color(255,0,0));
            btn_thongtincongdan.setColorClick(new Color(255,204,204));
            btn_thongtincongdan.setColorOver(new Color(255,153,153));
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
            btn_donkhaisinh.setColor(new Color(176, 176, 176));
            btn_donkhaisinh.setBackground(new Color(176, 176, 176));
            btn_donkhaisinh.setBorderColor(new Color(176, 176, 176));
            btn_donkhaisinh.setColorClick(new Color(176, 176, 176));
            btn_donkhaisinh.setColorOver(new Color(176, 176, 176));
        }
        else if(khaiSinhModel.getMaKS() != null){
            btn_donkhaisinh.setEnabled(true);
            btn_donkhaisinh.setColor(new Color(255,0,0));
            btn_donkhaisinh.setBackground(new Color(255,0,0));
            btn_donkhaisinh.setBorderColor(new Color(255,0,0));
            btn_donkhaisinh.setColorClick(new Color(255,204,204));
            btn_donkhaisinh.setColorOver(new Color(255,153,153));
        }
        listDonTamTru = tamTruService.findAllTT(tf_timkiem.getText().trim());
        if (listDonTamTru.isEmpty()) {
            btn_dontamtru.setEnabled(false);
            btn_dontamtru.setColor(new Color(176, 176, 176));
            btn_dontamtru.setBackground(new Color(176, 176, 176));
            btn_dontamtru.setBorderColor(new Color(176, 176, 176));
            btn_dontamtru.setColorClick(new Color(176, 176, 176));
            btn_dontamtru.setColorOver(new Color(176, 176, 176));
        }
        else if(!listDonTamTru.isEmpty()){
            btn_dontamtru.setEnabled(true);
            btn_dontamtru.setColor(new Color(255,0,0));
            btn_dontamtru.setBackground(new Color(255,0,0));
            btn_dontamtru.setBorderColor(new Color(255,0,0));
            btn_dontamtru.setColorClick(new Color(255,204,204));
            btn_dontamtru.setColorOver(new Color(255,153,153));
        }
        listDonTamVang = tamVangService.findAllTV(tf_timkiem.getText().trim());
        if (listDonTamVang.isEmpty()) {
            btn_dontamvang.setEnabled(false);
            btn_dontamvang.setColor(new Color(176, 176, 176));
            btn_dontamvang.setBackground(new Color(176, 176, 176));
            btn_dontamvang.setBorderColor(new Color(176, 176, 176));
            btn_dontamvang.setColorClick(new Color(176, 176, 176));
            btn_dontamvang.setColorOver(new Color(176, 176, 176));
        }
        else if(!listDonTamVang.isEmpty()){
            btn_dontamvang.setEnabled(true);
            btn_dontamvang.setColor(new Color(255,0,0));
            btn_dontamvang.setBackground(new Color(255,0,0));
            btn_dontamvang.setBorderColor(new Color(255,0,0));
            btn_dontamvang.setColorClick(new Color(255,204,204));
            btn_dontamvang.setColorOver(new Color(255,153,153));
        }
        listLyHon = lyHonService.findAllLH(tf_timkiem.getText().trim(), tf_timkiem.getText().trim());
        if (listLyHon.isEmpty()) {
            btn_donlyhon.setEnabled(false);
            btn_donlyhon.setColor(new Color(176, 176, 176));
            btn_donlyhon.setBackground(new Color(176, 176, 176));
            btn_donlyhon.setBorderColor(new Color(176, 176, 176));
            btn_donlyhon.setColorClick(new Color(176, 176, 176));
            btn_donlyhon.setColorOver(new Color(176, 176, 176));
        }
        else if(!listLyHon.isEmpty()){
            btn_donlyhon.setEnabled(true);
            btn_donlyhon.setColor(new Color(255,0,0));
            btn_donlyhon.setBackground(new Color(255,0,0));
            btn_donlyhon.setBorderColor(new Color(255,0,0));
            btn_donlyhon.setColorClick(new Color(255,204,204));
            btn_donlyhon.setColorOver(new Color(255,153,153));
        }
        giayChungTuModel = chungTuService.findAllGCT(tf_timkiem.getText().trim());
        if (giayChungTuModel.getCCCD() == null) {
            btn_giaychungtu.setEnabled(false);
            btn_giaychungtu.setColor(new Color(176, 176, 176));
            btn_giaychungtu.setBackground(new Color(176, 176, 176));
            btn_giaychungtu.setBorderColor(new Color(176, 176, 176));
            btn_giaychungtu.setColorClick(new Color(176, 176, 176));
            btn_giaychungtu.setColorOver(new Color(176, 176, 176));
        }
        else if(giayChungTuModel.getCCCD() != null){
            btn_giaychungtu.setEnabled(true);
            btn_giaychungtu.setColor(new Color(255,0,0));
            btn_giaychungtu.setBackground(new Color(255,0,0));
            btn_giaychungtu.setBorderColor(new Color(255,0,0));
            btn_giaychungtu.setColorClick(new Color(255,204,204));
            btn_giaychungtu.setColorOver(new Color(255,153,153));
        }
        thue = thueService.findOneByCCCD(tf_timkiem.getText().trim(), tf_timkiem.getText().trim());
        if (thue.getHoten() == null) {
            tabbedPaneCustom1.setEnabledAt(2, false);
        } else if (thue.getHoten() != null) {
            tabbedPaneCustom1.setEnabledAt(2, true);
            loadThue(tf_timkiem.getText().trim(), tf_timkiem.getText().trim());
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
    private button.MyButton btn_backFromGCNKHToDon;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelDon;
    private javax.swing.JPanel panelGCNKH;
    private javax.swing.JPanel panelGCT;
    private javax.swing.JPanel panelHoKhau;
    private javax.swing.JPanel panelKS;
    private javax.swing.JPanel panelLH;
    private javax.swing.JPanel panelTT;
    private javax.swing.JPanel panelTTCD;
    private javax.swing.JPanel panelTV;
    private javax.swing.JPanel panelThue;
    private javax.swing.JPanel panelXemDon;
    private Swing.TabbedPaneCustom tabbedPaneCustom1;
    private javax.swing.JTable tbl_cnkh;
    private Swing.TableDark tbl_hokhau;
    private javax.swing.JTable tbl_lyhon;
    private javax.swing.JTable tbl_tamtru;
    private javax.swing.JTable tbl_tamvang;
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
    private Swing.TextField tf_coquanthue;
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
    private Swing.TextField tf_hotenthue;
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
    private Swing.TextField tf_masothue;
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
    private Swing.TextField tf_ngaythaydoithongtin;
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
