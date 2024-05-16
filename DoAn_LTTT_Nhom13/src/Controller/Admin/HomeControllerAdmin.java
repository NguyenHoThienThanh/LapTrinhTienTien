package Controller.Admin;

import InterfaceService.ICongDanService;
import InterfaceService.IDangNhapService;
import InterfaceService.IDanhGiaService;
import InterfaceService.IKhaiSinhService;
import Menu.MenuEvent;
import Models.CongDanModel;
import Models.DangNhapModel;
import Models.DanhGiaModel;
import Models.KhaiSinhModel;
import Models.ThongTinCaNhan;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.DangNhapServiceImpl;
import ServiceImplement.DanhGiaServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class HomeControllerAdmin extends javax.swing.JFrame {

    String currentUser = Login_RegisterController.AppContext.userName;
    List<DanhGiaModel> listDanhGia = new ArrayList<>();

    IDanhGiaService danhGiaService = new DanhGiaServiceImpl();
    ICongDanService congDanService = new CongDanServiceImpl();
    IKhaiSinhService khaiSinhService = new KhaiSinhServiceImpl();

    IDangNhapService dangNhapService = new DangNhapServiceImpl();
    DangNhapModel dn = dangNhapService.findOne(currentUser);

    public HomeControllerAdmin() {
        initComponents();
        starRatingStatistics();
        totalCongDan();
        avgAge();
        LocalDate ngayHienTai = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ngayHienTaiFormatted = ngayHienTai.format(formatter);
        lbl_localDate.setText(ngayHienTaiFormatted);
        menu2.setMenuEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                if (index == 0) {
                    showForm(panel1);
                } else if (index == 1 && subIndex == 1) {
                    showForm(new ThongTinCongDanController());
                } else if (index == 1 && subIndex == 2) {
                    showForm(new ThongTinKhaiSinhController());
                } else if (index == 1 && subIndex == 3) {
                    showForm(new ThongTinGiayChungTuController());
                } else if (index == 1 && subIndex == 4) {
                    showForm(new ThongTinHoKhauController());
                } else if (index == 1 && subIndex == 5) {
                    showForm(new ThongTinChiTietHoKhauController());
                } else if (index == 1 && subIndex == 6) {
                    showForm(new TamTruController());
                } else if (index == 1 && subIndex == 7) {
                    showForm(new TamVangController());
                } else if (index == 1 && subIndex == 8) {
                    showForm(new ThongTinKetHonController());
                } else if (index == 1 && subIndex == 9) {
                    showForm(new ThongTinLyHonController());
                } else if (index == 1 && subIndex == 10) {
                    showForm(new QuanLyTaiKhoanController());
                } else if (index == 2) {
                    showForm(new TraCuuDonController());
                } else if (index == 3 && subIndex == 1) {
                    showForm(new ChartKhaiSinhController());
                } else if (index == 3 && subIndex == 2) {
                    showForm(new ChartChungTuController());
                } else if (index == 3 && subIndex == 3) {
                    showForm(new ChartKetHonController());
                } else if (index == 3 && subIndex == 4) {
                    showForm(new ChartLyHonController());
                } else if (index == 4) {
                    showForm(new DanhGiaController());
                }
            }
        });
    }

    private void starRatingStatistics() {
        double avg_rating_tongquan = 0;
        double avg_rating_thuantien = 0;
        double avg_rating_dedang = 0;
        double avg_rating_chinhxac = 0;
        double avg_rating_trucquan = 0;
        listDanhGia = danhGiaService.findAll();
        for (DanhGiaModel dg : listDanhGia) {
            avg_rating_tongquan += dg.getTongQuan();
            avg_rating_thuantien += dg.getThuanTien();
            avg_rating_dedang += dg.getDeDang();
            avg_rating_chinhxac += dg.getChinhXac();
            avg_rating_trucquan += dg.getTrucQuan();
        }
        rating_tongquan.setStar((int) Math.round(avg_rating_tongquan / listDanhGia.size()));
        rating_thuantien.setStar((int) Math.round(avg_rating_thuantien / listDanhGia.size()));
        rating_dedang.setStar((int) Math.round(avg_rating_dedang / listDanhGia.size()));
        rating_chinhxac.setStar((int) Math.round(avg_rating_chinhxac / listDanhGia.size()));
        rating_trucquan.setStar((int) Math.round(avg_rating_trucquan / listDanhGia.size()));
    }

    private void showForm(Component com) {
        panel.removeAll();
        panel.add(com);
        panel.repaint();
        panel.revalidate();
    }

    private void showChangePasswordDialog() {
        JPasswordField currentPasswordField = new JPasswordField(15);
        JPasswordField newPasswordField = new JPasswordField(15);
        JPasswordField confirmPasswordField = new JPasswordField(15);

        JLabel currentPasswordLabel = new JLabel("Mật khẩu cũ:");
        JLabel newPasswordLabel = new JLabel("Mật khẩu mới:");
        JLabel confirmPasswordLabel = new JLabel("Xác nhận mật khẩu mới:");

        // Tạo panel chứa các thành phần giao diện
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(currentPasswordLabel, gbc);

        gbc.gridx = 1;
        panel.add(currentPasswordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(newPasswordLabel, gbc);

        gbc.gridx = 1;
        panel.add(newPasswordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(confirmPasswordLabel, gbc);

        gbc.gridx = 1;
        panel.add(confirmPasswordField, gbc);

        // Đặt kích thước tối thiểu cho hộp thoại
        UIManager.put("OptionPane.minimumSize", new Dimension(400, 200));

        // Hiển thị hộp thoại
        int option = JOptionPane.showConfirmDialog(null, panel, "Đổi mật khẩu",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Xử lý sự kiện khi người dùng nhấn nút "OK"
        if (option == JOptionPane.OK_OPTION) {
            String currentPassword = new String(currentPasswordField.getPassword()).trim();
            String newPassword = new String(newPasswordField.getPassword()).trim();
            String confirmPassword = new String(confirmPasswordField.getPassword()).trim();

            if (!isCurrentPasswordMatched(currentPassword)) {
                JOptionPane.showMessageDialog(null, "Mật khẩu cũ không chính xác!");
                return;
            }
            if (isPasswordCurrent(newPassword, currentPassword)) {
                JOptionPane.showMessageDialog(null, "Mật khẩu cũ không thể giống mật khẩu mới!");
                return;
            }
            if (!isValidPassword(newPassword)) {
                JOptionPane.showMessageDialog(null, "Mật khẩu mới không hợp lệ!");
                return;
            }
            if (!isPasswordConfirmed(newPassword, confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Xác nhận mật khẩu mới không khớp!");
                return;
            }
            boolean changed = changePassword(currentPassword, newPassword);
            if (changed) {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thất bại!");
            }
        }
    }

    private boolean isValidPassword(String newPassword) {
        // Kiểm tra tính hợp lệ của mật khẩu mới
        return newPassword.length() >= 6;
    }

    private boolean isPasswordCurrent(String currentPassword, String newPassword) {
        return currentPassword.trim().equals(newPassword);
    }

    private boolean isPasswordConfirmed(String newPassword, String confirmPassword) {
        return newPassword.equals(confirmPassword);
    }

    private boolean isCurrentPasswordMatched(String currentPassword) {
        currentUser = Login_RegisterController.AppContext.userName;

        // Kiểm tra tính chính xác của mật khẩu cũ
        return currentPassword.equals(dn.getMatKhau().trim());
    }

    private boolean changePassword(String currentPassword, String newPassword) {
        currentUser = Login_RegisterController.AppContext.userName;
        // Cập nhật mật khẩu mới
        dn.setMatKhau(newPassword);
        boolean updated = dangNhapService.update(dn);
        if (updated) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneWin111 = new Swing.ScrollPaneWin11();
        menu2 = new Menu.Menu();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new Swing.Button();
        panel = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        scrollPaneWin112 = new Swing.ScrollPaneWin11();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelRound5 = new Swing.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_localDate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rating_tongquan = new Star_Rating.StarRating();
        rating_trucquan = new Star_Rating.StarRating();
        rating_thuantien = new Star_Rating.StarRating();
        rating_dedang = new Star_Rating.StarRating();
        rating_chinhxac = new Star_Rating.StarRating();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_totalCongDan = new Swing.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_totalCongDan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelRound6 = new Swing.PanelRound();
        panelRound7 = new Swing.PanelRound();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_checkAge = new javax.swing.JLabel();
        panel_totalCongDan1 = new Swing.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_averageAge = new javax.swing.JLabel();
        chartGioiTinhController1 = new Controller.Admin.ChartGioiTinhController();
        jLabel6 = new javax.swing.JLabel();
        imageAvatar1 = new Swing.ImageAvatar();
        jLabel19 = new javax.swing.JLabel();
        btn_changepassword = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        scrollPaneWin111.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setViewportView(menu2);

        header.setBackground(new java.awt.Color(21, 110, 71));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN");

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout-custom.png"))); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.CardLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(919, 539));

        scrollPaneWin112.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin112.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneWin112.setToolTipText("");
        scrollPaneWin112.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPaneWin112.setPreferredSize(new java.awt.Dimension(637, 589));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("QUẢN LÝ THÔNG TIN CÔNG DÂN");

        panelRound5.setBackground(new java.awt.Color(204, 255, 204));
        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Chào mừng bạn đã trở lại");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Trang thông tin chính thức của công dân");

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        lbl_localDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_localDate.setForeground(new java.awt.Color(153, 153, 153));
        lbl_localDate.setText("18/04/2024");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Đánh giá công dân khi sử dụng:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tổng quan");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Thuận tiện");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Dễ dàng");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Chính xác");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Trực quan");

        panel_totalCongDan.setBackground(new java.awt.Color(102, 0, 102));
        panel_totalCongDan.setRoundBottomLeft(30);
        panel_totalCongDan.setRoundBottomRight(30);
        panel_totalCongDan.setRoundTopLeft(30);
        panel_totalCongDan.setRoundTopRight(30);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calculator-variant-outline-custom.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TỔNG DÂN SỐ");

        lbl_totalCongDan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_totalCongDan.setForeground(new java.awt.Color(255, 255, 255));
        lbl_totalCongDan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_totalCongDan.setText("6");

        javax.swing.GroupLayout panel_totalCongDanLayout = new javax.swing.GroupLayout(panel_totalCongDan);
        panel_totalCongDan.setLayout(panel_totalCongDanLayout);
        panel_totalCongDanLayout.setHorizontalGroup(
            panel_totalCongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalCongDanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panel_totalCongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(lbl_totalCongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_totalCongDanLayout.setVerticalGroup(
            panel_totalCongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalCongDanLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_totalCongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_totalCongDanLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(panel_totalCongDanLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_totalCongDan)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Thống kê dân số");

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelRound7.setBackground(new java.awt.Color(102, 102, 255));
        panelRound7.setRoundBottomLeft(30);
        panelRound7.setRoundBottomRight(30);
        panelRound7.setRoundTopLeft(30);
        panelRound7.setRoundTopRight(30);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calendar-account-outline-custom.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TRONG TUỔI LAO ĐỘNG");

        lbl_checkAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_checkAge.setForeground(new java.awt.Color(255, 255, 255));
        lbl_checkAge.setText("6");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound7Layout.createSequentialGroup()
                        .addComponent(lbl_checkAge)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_checkAge)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_totalCongDan1.setBackground(new java.awt.Color(255, 153, 153));
        panel_totalCongDan1.setRoundBottomLeft(30);
        panel_totalCongDan1.setRoundBottomRight(30);
        panel_totalCongDan1.setRoundTopLeft(30);
        panel_totalCongDan1.setRoundTopRight(30);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calculator-variant-outline-custom.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TUỔI TRUNG BÌNH");

        lbl_averageAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_averageAge.setForeground(new java.awt.Color(255, 255, 255));
        lbl_averageAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_averageAge.setText("6");

        javax.swing.GroupLayout panel_totalCongDan1Layout = new javax.swing.GroupLayout(panel_totalCongDan1);
        panel_totalCongDan1.setLayout(panel_totalCongDan1Layout);
        panel_totalCongDan1Layout.setHorizontalGroup(
            panel_totalCongDan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalCongDan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_totalCongDan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(lbl_averageAge, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel_totalCongDan1Layout.setVerticalGroup(
            panel_totalCongDan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_totalCongDan1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_totalCongDan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_totalCongDan1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_averageAge))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        chartGioiTinhController1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(panel_totalCongDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(400, 400, 400)
                        .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_localDate))
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chartGioiTinhController1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(194, 194, 194)
                                    .addComponent(panel_totalCongDan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(51, 51, 51)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rating_thuantien, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rating_tongquan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rating_dedang, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(51, 51, 51)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rating_trucquan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rating_chinhxac, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(panelRound7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 40, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_localDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_tongquan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_thuantien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(rating_dedang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(rating_chinhxac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating_trucquan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chartGioiTinhController1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_totalCongDan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_totalCongDan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(205, 205, 205))
        );

        scrollPaneWin112.setViewportView(jPanel1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Hồ sơ của bạn");

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/avatar_admin.jpg"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(21, 110, 71));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ADMIN");

        btn_changepassword.setBackground(new java.awt.Color(21, 110, 71));
        btn_changepassword.setForeground(new java.awt.Color(255, 255, 255));
        btn_changepassword.setText("Đổi mật khẩu");
        btn_changepassword.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_changepassword.setColor(new java.awt.Color(21, 110, 71));
        btn_changepassword.setColorClick(new java.awt.Color(141, 240, 197));
        btn_changepassword.setColorOver(new java.awt.Color(61, 212, 146));
        btn_changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changepasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(btn_changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollPaneWin112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel.add(panel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn đăng xuất khỏi tài khoản?", "Exit Program Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            Login_RegisterController lg = new Login_RegisterController();
            lg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changepasswordActionPerformed
        // TODO add your handling code here:
        showChangePasswordDialog();
    }//GEN-LAST:event_btn_changepasswordActionPerformed

    private void totalCongDan() {
        List<KhaiSinhModel> list;
        list = khaiSinhService.findAll();
        lbl_totalCongDan.setText(String.valueOf(list.size()));
    }

    private void avgAge() {
        double sum = 0;
        int eligibleCount = 0;
        List<ThongTinCaNhan> list = congDanService.getNgaySinh();

        if (list.isEmpty()) {
            lbl_averageAge.setText("0");
            lbl_checkAge.setText("0");
            return;
        }

        for (ThongTinCaNhan ttcn : list) {
            Date ngaySinhDate = ttcn.getNgaySinh();
            LocalDate ngaySinh = convertToLocalDate(ngaySinhDate);
            int tuoi = tinhTuoi(ngaySinh);
            sum += tuoi;
            if (tuoi >= 18 && tuoi < 60) {
                eligibleCount++;
            }
        }

        int avgAge = (int) Math.round(sum / list.size()); // Làm tròn kết quả về số nguyên
        lbl_averageAge.setText(String.valueOf(avgAge));
        lbl_checkAge.setText(String.valueOf(eligibleCount));
    }

    public int tinhTuoi(LocalDate ngaySinh) {
        LocalDate ngayHienTai = LocalDate.now();
        Period period = Period.between(ngaySinh, ngayHienTai);
        return period.getYears();
    }

    private LocalDate convertToLocalDate(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeControllerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeControllerAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btn_changepassword;
    private Swing.Button btn_logout;
    private Controller.Admin.ChartGioiTinhController chartGioiTinhController1;
    private javax.swing.JPanel header;
    private Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_averageAge;
    private javax.swing.JLabel lbl_checkAge;
    private javax.swing.JLabel lbl_localDate;
    private javax.swing.JLabel lbl_totalCongDan;
    private Menu.Menu menu2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private Swing.PanelRound panelRound5;
    private Swing.PanelRound panelRound6;
    private Swing.PanelRound panelRound7;
    private Swing.PanelRound panel_totalCongDan;
    private Swing.PanelRound panel_totalCongDan1;
    private Star_Rating.StarRating rating_chinhxac;
    private Star_Rating.StarRating rating_dedang;
    private Star_Rating.StarRating rating_thuantien;
    private Star_Rating.StarRating rating_tongquan;
    private Star_Rating.StarRating rating_trucquan;
    private Swing.ScrollPaneWin11 scrollPaneWin111;
    private Swing.ScrollPaneWin11 scrollPaneWin112;
    // End of variables declaration//GEN-END:variables
}
