/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.ICongDanService;
import InterfaceService.IKhaiSinhService;
import Models.CongDanModel;
import Models.KhaiSinhModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUAN
 */
public class ThongTinCongDanController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<CongDanModel> listCongDan;
    ICongDanService congDanService = new CongDanServiceImpl();

    public ThongTinCongDanController() {
        initComponents();
        tbl_thongTinCongDan.fixTable(jScrollPane2);
        listCongDan = congDanService.findAll();
        model = (DefaultTableModel) tbl_thongTinCongDan.getModel();
        showTable();
        disableTextField();

    }

    private void showTable() {
        for (CongDanModel congDan : listCongDan) {
            model.addRow(new Object[]{congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_hoTen = new Swing.TextField();
        tf_gioiTinh = new Swing.TextField();
        tf_noiCapCCCD = new Swing.TextField();
        tf_soCCCD = new Swing.TextField();
        tf_email = new Swing.TextField();
        tf_noiSinh = new Swing.TextField();
        tf_maKhaiSinh = new Swing.TextField();
        tf_ngayCapCCCD = new Swing.TextField();
        tf_soDienThoai = new Swing.TextField();
        tf_ngaySinh = new Swing.TextField();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongTinCongDan = new Swing.TableDark();
        btn_luuSua = new Swing.Button();
        btn_luuThem = new Swing.Button();
        btn_loadData = new button.MyButton();
        btn_them = new Swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setLabelText("Họ và tên");

        tf_gioiTinh.setLabelText("Giới tính");

        tf_noiCapCCCD.setLabelText("Nơi cấp CCCD");

        tf_soCCCD.setLabelText("Số CCCD");

        tf_email.setLabelText("Email");

        tf_noiSinh.setLabelText("Nơi sinh");

        tf_maKhaiSinh.setLabelText("Mã khai sinh");

        tf_ngayCapCCCD.setLabelText("Ngày cấp CCCD (yyyy-MM-dd)");

        tf_soDienThoai.setLabelText("Số điện thoại");

        tf_ngaySinh.setLabelText("Ngày sinh");

        btn_sua.setBackground(new java.awt.Color(18, 99, 63));
        btn_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua.setText("Sửa thông tin");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoa.setText("Xóa thông tin");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("THÔNG TIN CÔNG DÂN");

        btn_xoaDuLieu.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoaDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaDuLieu.setText("Xóa dữ liệu");
        btn_xoaDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaDuLieuActionPerformed(evt);
            }
        });

        tbl_thongTinCongDan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khai Sinh", "Số CCCD", "Họ Tên", "Ngày Sinh", "Giới Tính", "Nơi Sinh", "Nơi Cấp CCCD", "Ngày Cấp CCCD", "Số Điện Thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinCongDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinCongDanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinCongDan);
        if (tbl_thongTinCongDan.getColumnModel().getColumnCount() > 0) {
            tbl_thongTinCongDan.getColumnModel().getColumn(3).setPreferredWidth(60);
            tbl_thongTinCongDan.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        btn_luuSua.setBackground(new java.awt.Color(18, 99, 63));
        btn_luuSua.setForeground(new java.awt.Color(255, 255, 255));
        btn_luuSua.setText("Lưu sửa");
        btn_luuSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuSuaActionPerformed(evt);
            }
        });

        btn_luuThem.setBackground(new java.awt.Color(18, 99, 63));
        btn_luuThem.setForeground(new java.awt.Color(255, 255, 255));
        btn_luuThem.setText("Lưu thêm");
        btn_luuThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuThemActionPerformed(evt);
            }
        });

        btn_loadData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/icons8-upload-10.png"))); // NOI18N
        btn_loadData.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_loadData.setRadius(50);
        btn_loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDataActionPerformed(evt);
            }
        });

        btn_them.setBackground(new java.awt.Color(18, 99, 63));
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setText("Thêm thông tin");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_noiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(733, 733, 733)
                        .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinCongDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinCongDanMouseClicked
        model = (DefaultTableModel) tbl_thongTinCongDan.getModel();
        tf_maKhaiSinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 0).toString());
        tf_soCCCD.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 1).toString());
        tf_hoTen.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 2).toString());
        tf_ngaySinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 3).toString());
        tf_gioiTinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 4).toString());
        tf_noiSinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 5).toString());
        tf_noiCapCCCD.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 6).toString());
        tf_ngayCapCCCD.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 7).toString());
        tf_soDienThoai.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 8).toString());
        tf_email.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 9).toString());
    }//GEN-LAST:event_tbl_thongTinCongDanMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int selectedRow = tbl_thongTinCongDan.getSelectedRow();

        if (tbl_thongTinCongDan.getRowCount() <= 0) {
            JOptionPane dialog = new JOptionPane("Empty Table!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow < 0) {
            JOptionPane dialog = new JOptionPane("Please Choose One Row!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow >= 0) {
            String id = (String) tbl_thongTinCongDan.getValueAt(selectedRow, 1);
            model.removeRow(selectedRow);
            listCongDan.remove(selectedRow);
            if (new CongDanServiceImpl().delete(id)) {
                JOptionPane dialog = new JOptionPane("Information deleted successfully!", JOptionPane.INFORMATION_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
            } else {
                JOptionPane dialog = new JOptionPane("Information deleted failed!", JOptionPane.ERROR_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
            }
            clear();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_luuThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThemActionPerformed
        if (tf_maKhaiSinh.getText().equals("") || tf_soCCCD.getText().equals("") || tf_hoTen.getText().equals("") || tf_noiCapCCCD.getText().equals("") || tf_ngayCapCCCD.getText().equals("") || tf_soDienThoai.getText().equals("") || tf_email.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (congDanService.isCCCDIssued(tf_soCCCD.getText()) == true) {
            JOptionPane dialog = new JOptionPane("Số CCCD này đã tồn tại!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (congDanService.countCCCD(tf_maKhaiSinh.getText().trim()) == 1) {
            JOptionPane dialog = new JOptionPane("Mỗi người chỉ có duy nhất 1 số CCCD!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (!isValidCCCD(tf_soCCCD.getText().trim())) {
            JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (!isValidPhoneNumber(tf_soDienThoai.getText().trim())) {
            JOptionPane dialog = new JOptionPane("Số điện thoại không hợp lệ!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (!isValidEmail(tf_email.getText().trim())) {
            JOptionPane dialog = new JOptionPane("Email không hợp lệ!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }

        CongDanModel congDan = new CongDanModel();
        congDan.setCCCD(tf_soCCCD.getText().trim());
        congDan.setHoTen(tf_hoTen.getText());
        congDan.setNcCccd(tf_noiCapCCCD.getText());
        try {
            Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayCapCCCD.getText());
            java.sql.Date sqlDate;
            sqlDate = new java.sql.Date(utilDate.getTime());
            congDan.setNgcCccd(sqlDate);
        } catch (ParseException ex) {
            return;
        }
        congDan.setGioiTinh(tf_gioiTinh.getText());
        try {
            Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinh.getText());
            java.sql.Date sqlDate;
            sqlDate = new java.sql.Date(utilDate.getTime());
            congDan.setNgaySinh(sqlDate);
        } catch (ParseException ex) {
            return;
        }
        congDan.setNoiSinh(tf_noiSinh.getText());
        congDan.setMaKS(tf_maKhaiSinh.getText().trim());
        congDan.setSDT(tf_soDienThoai.getText());
        congDan.setEmail(tf_email.getText());
        congDan.setTrangThai(1);
        listCongDan.add(congDan);

        if (new CongDanServiceImpl().insert(congDan)) {
            JOptionPane dialog = new JOptionPane("Thêm thông tin thành công!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else {
            JOptionPane dialog = new JOptionPane("Thêm thông tin thất bại!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        showResult();
        clear();
        disableTextField();
    }//GEN-LAST:event_btn_luuThemActionPerformed

    private void btn_loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDataActionPerformed

        try {
            if (congDanService.countCCCD(tf_maKhaiSinh.getText().trim()) == 1) {
                CongDanModel congDan = new CongDanModel();
                congDan = congDanService.findOneByMaKS(tf_maKhaiSinh.getText().trim());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tf_hoTen.setText(congDan.getHoTen());
                tf_soDienThoai.setText(congDan.getSDT());
                tf_email.setText(congDan.getEmail());
                tf_soCCCD.setText(congDan.getCCCD());
                String ngayCapCCCD = dateFormat.format(congDan.getNgcCccd());
                tf_ngayCapCCCD.setText(ngayCapCCCD);
                tf_noiCapCCCD.setText(congDan.getNcCccd());
                String ngaySinh = dateFormat.format(congDan.getNgaySinh());
                tf_ngaySinh.setText(ngaySinh);
                tf_gioiTinh.setText(congDan.getGioiTinh());
                tf_noiSinh.setText(congDan.getNoiSinh());
            } else if (congDanService.countCCCD(tf_maKhaiSinh.getText().trim()) == 0) {
                IKhaiSinhService khaiSinhService = new KhaiSinhServiceImpl();
                KhaiSinhModel khaiSinh = new KhaiSinhModel();
                khaiSinh = khaiSinhService.findOne(tf_maKhaiSinh.getText().trim());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tf_hoTen.setText(khaiSinh.getHoTenKS());
                tf_gioiTinh.setText(khaiSinh.getGioiTinh());
                String ngaySinh = dateFormat.format(khaiSinh.getNgaySinh());
                tf_ngaySinh.setText(ngaySinh);
                tf_noiSinh.setText(khaiSinh.getNoiSinh());
                tf_soDienThoai.setText("");
                tf_email.setText("");
                tf_soCCCD.setText("");
                tf_noiCapCCCD.setText("");
                tf_ngayCapCCCD.setText("");
            }

        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Information not available!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }

    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        tf_noiCapCCCD.setEditable(true);
        tf_ngayCapCCCD.setEditable(true);
        tf_email.setEditable(true);
        tf_soDienThoai.setEditable(true);
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
       try {
            int selectedRow = tbl_thongTinCongDan.getSelectedRow();
            if (tbl_thongTinCongDan.getRowCount() <= 0) {
                JOptionPane dialog = new JOptionPane("Empty Table!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            } else if (selectedRow < 0) {
                JOptionPane dialog = new JOptionPane("Please choose one row!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            } else if (selectedRow >= 0) {
                CongDanModel congDan = congDanService.findOne(tf_soCCCD.getText());
                congDan.setHoTen(tf_hoTen.getText());

                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayCapCCCD.getText());
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                congDan.setNgcCccd(sqlDate);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateStr = sdf.format(utilDate);

                congDan.setNcCccd(tf_noiCapCCCD.getText());
                if(!isValidPhoneNumber(tf_soDienThoai.getText())){
                     JOptionPane dialog = new JOptionPane("Invalid phone number!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }else{
                    congDan.setSDT(tf_soDienThoai.getText());
                }
                
                if(!isValidEmail(tf_email.getText())){
                    JOptionPane dialog = new JOptionPane("Invalid email!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }else{
                    congDan.setEmail(tf_email.getText());
                }
                

                if (new CongDanServiceImpl().update(congDan)) {
                    JOptionPane dialog = new JOptionPane("Update success!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_hoTen.getText(), selectedRow, 2);
                    model.setValueAt(tf_noiCapCCCD.getText(), selectedRow, 6);
                    model.setValueAt(dateStr, selectedRow, 7);
                    model.setValueAt(tf_soDienThoai.getText(), selectedRow, 8);
                    model.setValueAt(tf_email.getText(), selectedRow, 9);
                    model.fireTableDataChanged();
                } else {
                    JOptionPane dialog = new JOptionPane("Update fail!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
            }
        } catch (ParseException ex) {
            JOptionPane dialog = new JOptionPane("Update fail!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
       clear();
//        tf_soCCCD.setEditable(true);
//        tf_hoTen.setEditable(true);
//        tf_gioiTinh.setEditable(true);
//        tf_ngaySinh.setEditable(true);
//        tf_noiSinh.setEditable(true);
//        tf_maKhaiSinh.setEditable(true);
    }//GEN-LAST:event_btn_luuSuaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        tf_soCCCD.setEditable(true);
        tf_ngayCapCCCD.setEditable(true);
        tf_noiCapCCCD.setEditable(true);
        tf_email.setEditable(true);
        tf_soDienThoai.setEditable(true);
    }//GEN-LAST:event_btn_themActionPerformed
    public void showResult() {
        //listCongDan = congDanService.findAll();
        CongDanModel congDan = listCongDan.get(listCongDan.size() - 1);
        model.fireTableDataChanged();
        model.addRow(new Object[]{congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail()});
    }

    private void clear() {
        tf_soCCCD.setText("");
        tf_hoTen.setText("");
        tf_ngaySinh.setText("");
        tf_gioiTinh.setText("");
        tf_noiSinh.setText("");
        tf_ngayCapCCCD.setText("");
        tf_noiCapCCCD.setText("");
        tf_maKhaiSinh.setText("");
        tf_soDienThoai.setText("");
        tf_email.setText("");
    }

    private void disableTextField() {
        tf_soCCCD.setEditable(false);
        tf_hoTen.setEditable(false);
        tf_gioiTinh.setEditable(false);
        tf_ngaySinh.setEditable(false);
        tf_noiSinh.setEditable(false);
        tf_ngayCapCCCD.setEditable(false);
        tf_noiCapCCCD.setEditable(false);
        tf_soDienThoai.setEditable(false);
        tf_email.setEditable(false);
    }

    private static boolean isValidCCCD(String cccd) {
        String regex = "^[0-9]{12}$";
        if (!cccd.matches(regex)) {
            return false;
        }
        return cccd.charAt(0) == '0';
    }

    private static boolean isValidPhoneNumber(String phoneNum) {
        String regex = "[0-9]{10}$";
        if (!phoneNum.matches(regex)) {
            return false;
        }
        return phoneNum.charAt(0) == '0';
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btn_loadData;
    private Swing.Button btn_luuSua;
    private Swing.Button btn_luuThem;
    private Swing.Button btn_sua;
    private Swing.Button btn_them;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private Swing.TableDark tbl_thongTinCongDan;
    private Swing.TextField tf_email;
    private Swing.TextField tf_gioiTinh;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_maKhaiSinh;
    private Swing.TextField tf_ngayCapCCCD;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_noiCapCCCD;
    private Swing.TextField tf_noiSinh;
    private Swing.TextField tf_soCCCD;
    private Swing.TextField tf_soDienThoai;
    // End of variables declaration//GEN-END:variables

}
