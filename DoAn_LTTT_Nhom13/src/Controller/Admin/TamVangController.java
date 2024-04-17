/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceDAO.ICongDanDAO;
import InterfaceService.ICongDanService;
import InterfaceService.ITamTruService;
import InterfaceService.ITamVangService;
import Models.CongDanModel;
import Models.TamVangModel;
import Models.TamVangModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.TamVangServiceImpl;
import ServiceImplement.TamVangServiceImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TamVangController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<TamVangModel> listTamVang;
    ITamVangService tamVangService = new TamVangServiceImpl();

    public TamVangController() {
        initComponents();
        listTamVang = tamVangService.findAll();
        model = (DefaultTableModel) tbl_thongTinTamVang.getModel();
        tbl_thongTinTamVang.fixTable(jScrollPane2);
        showTable();
        disableTextField();
    }

    private void showTable() {
        for (TamVangModel tamVang : listTamVang) {
            model.addRow(new Object[]{tamVang.getMaTV(), tamVang.getNgaydk(), tamVang.getNcdi(), tamVang.getNcden(), tamVang.getHoTen(), tamVang.getNgaySinh(), tamVang.getCCCD(), tamVang.getNgayCapCCCD(), tamVang.getNoiCapCCCD(), tamVang.getNgaydi(), tamVang.getNgayve(), tamVang.getLydo()});
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
        tf_noiCapCCCD = new Swing.TextField();
        tf_soCCCD = new Swing.TextField();
        tf_noiChuyenDen = new Swing.TextField();
        tf_maTamVang = new Swing.TextField();
        tf_ngayDangKy = new Swing.TextField();
        tf_ngayCapCCCD = new Swing.TextField();
        tf_noiChuyenDi = new Swing.TextField();
        tf_ngaySinh = new Swing.TextField();
        btn_them = new Swing.Button();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();
        tf_lyDo = new Swing.TextField();
        tf_ngayDi = new Swing.TextField();
        tf_ngayVe = new Swing.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongTinTamVang = new Swing.TableDark();
        btn_loadData = new button.MyButton();
        btn_luuThem = new Swing.Button();
        btn_luuSua = new Swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setLabelText("Họ và tên");

        tf_noiCapCCCD.setLabelText("Nơi cấp CCCD");

        tf_soCCCD.setLabelText("Số CCCD");

        tf_noiChuyenDen.setLabelText("Nơi chuyển đến");

        tf_maTamVang.setLabelText("Mã tạm vắng");

        tf_ngayDangKy.setLabelText("Ngày đăng kí");

        tf_ngayCapCCCD.setLabelText("Ngày cấp CCCD");

        tf_noiChuyenDi.setLabelText("Nơi chuyển đi");

        tf_ngaySinh.setLabelText("Ngày sinh");

        btn_them.setBackground(new java.awt.Color(18, 99, 63));
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setText("Thêm thông tin");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

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
        jLabel1.setText("THÔNG TIN TẠM VẮNG");

        btn_xoaDuLieu.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoaDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaDuLieu.setText("Xóa dữ liệu");
        btn_xoaDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaDuLieuActionPerformed(evt);
            }
        });

        tf_lyDo.setLabelText("Lý do");

        tf_ngayDi.setLabelText("Ngày đi");

        tf_ngayVe.setLabelText("Ngày về");

        tbl_thongTinTamVang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tạm Trú", "Ngày Đăng Ký", "Nơi Chuyển Đi", "Nơi Chuyển Đến", "Họ Tên", "Ngày Sinh", "Số CCCD", "Ngày Cấp CCCD", "Nơi Cấp CCCD", "Ngày Đi", "Ngày Về", "Lý Do"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinTamVang.getTableHeader().setReorderingAllowed(false);
        tbl_thongTinTamVang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinTamVangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinTamVang);

        btn_loadData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/icons8-upload-10.png"))); // NOI18N
        btn_loadData.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_loadData.setRadius(50);
        btn_loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDataActionPerformed(evt);
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

        btn_luuSua.setBackground(new java.awt.Color(18, 99, 63));
        btn_luuSua.setForeground(new java.awt.Color(255, 255, 255));
        btn_luuSua.setText("Lưu sửa");
        btn_luuSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuSuaActionPerformed(evt);
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
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_lyDo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_maTamVang, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ngayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_ngayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_noiChuyenDi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_noiChuyenDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_maTamVang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_noiChuyenDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_noiChuyenDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_lyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_ngayDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_ngayVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_thongTinTamVangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinTamVangMouseClicked
        model = (DefaultTableModel) tbl_thongTinTamVang.getModel();
        int selectedRow = tbl_thongTinTamVang.getSelectedRow();
        tf_maTamVang.setText(model.getValueAt(selectedRow, 0).toString());
        tf_ngayDangKy.setText(model.getValueAt(selectedRow, 1).toString());
        tf_noiChuyenDi.setText(model.getValueAt(selectedRow, 2).toString());
        tf_noiChuyenDen.setText(model.getValueAt(selectedRow, 3).toString());
        tf_hoTen.setText(model.getValueAt(selectedRow, 4).toString());
        tf_ngaySinh.setText(model.getValueAt(selectedRow, 5).toString());
        tf_soCCCD.setText(model.getValueAt(selectedRow, 6).toString());
        tf_ngayCapCCCD.setText(model.getValueAt(selectedRow, 7).toString());
        tf_noiCapCCCD.setText(model.getValueAt(selectedRow, 8).toString());
        tf_ngayDi.setText(model.getValueAt(selectedRow, 9).toString());
        tf_ngayVe.setText(model.getValueAt(selectedRow, 10).toString());
        tf_lyDo.setText(model.getValueAt(selectedRow, 11).toString());

    }//GEN-LAST:event_tbl_thongTinTamVangMouseClicked

    private void btn_loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDataActionPerformed
        ICongDanService congDanService = new CongDanServiceImpl();
        try {

            CongDanModel congDan = new CongDanModel();
            congDan = congDanService.findOne(tf_soCCCD.getText().trim());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            tf_hoTen.setText(congDan.getHoTen());
            tf_soCCCD.setText(congDan.getCCCD());
            String ngayCapCCCD = dateFormat.format(congDan.getNgcCccd());
            tf_ngayCapCCCD.setText(ngayCapCCCD);
            tf_noiCapCCCD.setText(congDan.getNcCccd());
            String ngaySinh = dateFormat.format(congDan.getNgaySinh());
            tf_ngaySinh.setText(ngaySinh);

        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Information not available!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (tf_soCCCD.getText().equals("") || tf_hoTen.getText().equals("") || tf_ngaySinh.getText().equals("") || tf_ngayCapCCCD.getText().equals("") || tf_noiCapCCCD.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Please enter identity number information and load the data!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_noiChuyenDi.setEditable(true);
            tf_noiChuyenDen.setEditable(true);
            tf_ngayVe.setEditable(false);
            tf_ngayDi.setEditable(true);
            tf_lyDo.setEditable(true);
            tf_soCCCD.setEditable(false);
        }

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_luuThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThemActionPerformed
        if (tf_lyDo.getText().equals("") || tf_soCCCD.getText().equals("") || tf_hoTen.getText().equals("") || tf_noiCapCCCD.getText().equals("") || tf_ngayCapCCCD.getText().equals("") || tf_noiChuyenDi.getText().equals("") || tf_noiChuyenDen.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (tamVangService.ifExists(tf_soCCCD.getText().trim()) == 1) {
            JOptionPane dialog = new JOptionPane("Công dân này đã đăng ký tạm trú!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }

        TamVangModel tamVang = new TamVangModel();
        tamVang.setCCCD(tf_soCCCD.getText().trim());
        tamVang.setHoTen(tf_hoTen.getText());
        tamVang.setNoiCapCCCD(tf_noiCapCCCD.getText());
        tamVang.setNcden(tf_noiChuyenDen.getText());
        tamVang.setNcdi(tf_noiChuyenDi.getText());
        try {
            Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinh.getText().trim());
            java.sql.Date sqlDate;
            sqlDate = new java.sql.Date(utilDate.getTime());
            tamVang.setNgaySinh(sqlDate);
        } catch (ParseException ex) {
            return;
        }

//        try {
//            if (isDateValidPresent(tf_ngayDangKy.getText().trim())) {
//                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDangKy.getText().trim());
//                java.sql.Date sqlDate;
//                sqlDate = new java.sql.Date(utilDate.getTime());
//                tamVang.setNgaydk(sqlDate);
//            } else {
//                JOptionPane dialog = new JOptionPane("Lỗi ngày tháng năm ngày đăng ký!", JOptionPane.WARNING_MESSAGE);
//                JDialog jDialog = dialog.createDialog(null);
//                jDialog.setModal(true);
//                jDialog.setVisible(true);
//                return;
//            }
//
//        } catch (ParseException ex) {
//            return;
//        }
        try {
            Calendar today = Calendar.getInstance();
            SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngayDangKy = DateFormat.format(today.getTime());
            Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(ngayDangKy);
            java.sql.Date sqlDate;
            sqlDate = new java.sql.Date(utilDate.getTime());
            tamVang.setNgaydk(sqlDate);
        }catch(Exception e){
            return;
        }

        try {
            if (isDateValidPresent(tf_ngayDi.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDi.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                tamVang.setNgaydi(sqlDate);
            } else {
                JOptionPane dialog = new JOptionPane("Lỗi ngày tháng năm ngày đến!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }
        } catch (ParseException ex) {
            return;
        }

        try {
            String str = calculateDepartureDate(tf_ngayDi.getText().trim());
            Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            tamVang.setNgayve(sqlDate);
        } catch (ParseException ex) {
            Logger.getLogger(TamVangController.class.getName()).log(Level.SEVERE, null, ex);
        }

        tamVang.setLydo(tf_lyDo.getText());
        tamVang.setTrangThai(1);
        listTamVang.add(tamVang);

        if (new TamVangServiceImpl().insert(tamVang)) {
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

    public void showResult() {
        listTamVang = tamVangService.findAll();
        TamVangModel tamVang = listTamVang.get(listTamVang.size() - 1);
        model.fireTableDataChanged();
        model.addRow(new Object[]{tamVang.getMaTV(), tamVang.getNgaydk(), tamVang.getNcdi(), tamVang.getNcden(), tamVang.getHoTen(), tamVang.getNgaySinh(), tamVang.getCCCD(), tamVang.getNgayCapCCCD(), tamVang.getNoiCapCCCD(), tamVang.getNgaydi(), tamVang.getNgayve(), tamVang.getLydo()});
    }
    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (tbl_thongTinTamVang.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Please choose one row!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_noiChuyenDi.setEditable(true);
            tf_noiChuyenDen.setEditable(true);
            tf_ngayVe.setEditable(false);
            tf_ngayDi.setEditable(true);
            tf_lyDo.setEditable(true);
            tf_soCCCD.setEditable(false);
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
        try {
            int selectedRow = tbl_thongTinTamVang.getSelectedRow();
            if (tbl_thongTinTamVang.getRowCount() <= 0) {
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
                TamVangModel tamVang = tamVangService.findOneByMaTV(tf_maTamVang.getText().trim());
                tamVang.setLydo(tf_lyDo.getText());
                tamVang.setNcden(tf_noiChuyenDen.getText());
                tamVang.setNcdi(tf_noiChuyenDi.getText());
                tamVang.setTrangThai(1);

                if (isDateValidPresent(tf_ngayDi.getText().trim())) {
                    Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDi.getText());
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                    tamVang.setNgaydi(sqlDate);

                } else {
                    JOptionPane dialog = new JOptionPane("Lỗi ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }


                try {
                    String strNgayVe = calculateDepartureDate(tf_ngayDi.getText().trim());
                    Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(strNgayVe);
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                    tamVang.setNgaydi(sqlDate);
                } catch (ParseException ex) {
                    Logger.getLogger(TamVangController.class.getName()).log(Level.SEVERE, null, ex);
                }
                String strNgayVe = calculateDepartureDate(tf_ngayDi.getText().trim());

                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDi.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateStrNgayDi = sdf.format(utilDate);
                if (new TamVangServiceImpl().update(tamVang)) {
                    JOptionPane dialog = new JOptionPane("Update success!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_lyDo.getText(), selectedRow, 11);
                    model.setValueAt(strNgayVe, selectedRow, 10);
                    model.setValueAt(dateStrNgayDi, selectedRow, 9);
                    model.setValueAt(tf_noiChuyenDi.getText(), selectedRow, 2);
                    model.setValueAt(tf_noiChuyenDen.getText(), selectedRow, 3);
                    model.fireTableDataChanged();
                } else {
                    JOptionPane dialog = new JOptionPane("Update fail!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
            }
        } catch (ParseException ex) {
            JOptionPane dialog = new JOptionPane("Update fail!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        clear();
        disableTextField();
    }//GEN-LAST:event_btn_luuSuaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed

        int selectedRow = tbl_thongTinTamVang.getSelectedRow();

        if (tbl_thongTinTamVang.getRowCount() <= 0) {
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
            JPanel myPanel = new JPanel();
            int confirm = JOptionPane.showConfirmDialog(myPanel, "Are you sure you want to delete this information?", "", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String id = (String) tbl_thongTinTamVang.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    listTamVang.remove(selectedRow);
                    if (new TamVangServiceImpl().delete(id)) {
                        JOptionPane msg = new JOptionPane("Information deleted successfully!", JOptionPane.INFORMATION_MESSAGE);
                        JDialog jMsg = msg.createDialog(null);
                        jMsg.setModal(true);
                        jMsg.setVisible(true);
                    } else {
                        JOptionPane msgFail = new JOptionPane("Information deleted failed!", JOptionPane.ERROR_MESSAGE);
                        JDialog jMsgFail = msgFail.createDialog(null);
                        jMsgFail.setModal(true);
                        jMsgFail.setVisible(true);
                    }

                } catch (Exception e) {
                    JOptionPane msgFail = new JOptionPane("Information deleted failed!", JOptionPane.ERROR_MESSAGE);
                    JDialog jMsgFail = msgFail.createDialog(null);
                    jMsgFail.setModal(true);
                    jMsgFail.setVisible(true);
                }
            }

            clear();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void clear() {
        tf_soCCCD.setText("");
        tf_hoTen.setText("");
        tf_ngaySinh.setText("");
        tf_maTamVang.setText("");
        tf_ngayCapCCCD.setText("");
        tf_noiCapCCCD.setText("");
        tf_ngayDangKy.setText("");
        tf_noiChuyenDi.setText("");
        tf_noiChuyenDen.setText("");
        tf_lyDo.setText("");
        tf_ngayVe.setText("");
        tf_ngayDi.setText("");
    }

    private void disableTextField() {
        tf_soCCCD.setEditable(true);
        tf_hoTen.setEditable(false);
        tf_ngaySinh.setEditable(false);
        tf_ngayCapCCCD.setEditable(false);
        tf_noiCapCCCD.setEditable(false);
        tf_noiChuyenDi.setEditable(false);
        tf_noiChuyenDen.setEditable(false);
        tf_maTamVang.setEditable(false);
        tf_ngayDangKy.setEditable(false);
        tf_ngayVe.setEditable(false);
        tf_ngayDi.setEditable(false);
        tf_lyDo.setEditable(false);
    }

    public static boolean isDateValid_1(String ngayStr) {

        if (!ngayStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        int year = Integer.parseInt(ngayStr.substring(0, 4));
        int month = Integer.parseInt(ngayStr.substring(5, 7));
        int day = Integer.parseInt(ngayStr.substring(8, 10));

        if (month < 1 || month
                > 12) {
            return false;
        }

        if (day < 1 || day
                > 31) {
            return false;
        }
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    return false;
                }
                break;
        }

        return true;
    }

    private static boolean isDateValidPresent(String ngayCapCCCD) {

        if (!ngayCapCCCD.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        if (!isDateValid_1(ngayCapCCCD)) {
            return false;
        }
        Optional<LocalDate> ngayCapCCCDOptional = Optional.ofNullable(LocalDate.parse(ngayCapCCCD));

        if (ngayCapCCCDOptional.isEmpty()) {
            return false;
        }

        LocalDate ngayCapCCCDDate = ngayCapCCCDOptional.get();
        LocalDate today = LocalDate.now();
        if (ngayCapCCCDDate.isAfter(today)) {
            return false;
        }

        LocalDate threeYearsAgo = today.minusYears(10);
        if (ngayCapCCCDDate.isBefore(threeYearsAgo)) {
            return false;
        }
        return true;
    }

    public static String calculateDepartureDate(String arrivalDateString) throws ParseException {
        SimpleDateFormat arrivalDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date arrivalDate = arrivalDateFormat.parse(arrivalDateString);

        Calendar departureDateCalendar = Calendar.getInstance();
        departureDateCalendar.setTime(arrivalDate);
        departureDateCalendar.add(Calendar.YEAR, 2);

        Date departureDate = departureDateCalendar.getTime();

        // Định dạng ngày khởi hành sang yyyy-MM-dd
        SimpleDateFormat departureDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String departureDateString = departureDateFormat.format(departureDate);

        return departureDateString;
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
    private Swing.TableDark tbl_thongTinTamVang;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_lyDo;
    private Swing.TextField tf_maTamVang;
    private Swing.TextField tf_ngayCapCCCD;
    private Swing.TextField tf_ngayDangKy;
    private Swing.TextField tf_ngayDi;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_ngayVe;
    private Swing.TextField tf_noiCapCCCD;
    private Swing.TextField tf_noiChuyenDen;
    private Swing.TextField tf_noiChuyenDi;
    private Swing.TextField tf_soCCCD;
    // End of variables declaration//GEN-END:variables

}
