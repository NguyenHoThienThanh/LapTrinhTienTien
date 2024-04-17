/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller.Admin;

import InterfaceService.ICongDanService;
import InterfaceService.IThueService;
import Models.CongDanModel;
import Models.ThueModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.ThueServiceImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUAN
 */
public class ThongTinThueController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<ThueModel> listThue;
    IThueService thueService = new ThueServiceImpl();

    public ThongTinThueController() {
        initComponents();
        tbl_thongTinThue.fixTable(jScrollPane2);
        listThue = thueService.findAll();
        model = (DefaultTableModel) tbl_thongTinThue.getModel();
        showTable();
        disableTextField();

    }

    private void showTable() {
        for (ThueModel thue : listThue) {
            model.addRow(new Object[]{thue.getMasothue(), thue.getHoten(), thue.getSoCMT_CCCD(), thue.getCoquanthue(), thue.getNgaythaydoithongtingannhat()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_hoTen = new Swing.TextField();
        tf_maSoThue = new Swing.TextField();
        tf_coQuanThue = new Swing.TextField();
        tf_ngayThayDoi = new Swing.TextField();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongTinThue = new Swing.TableDark();
        btn_luuSua = new Swing.Button();
        btn_luuThem = new Swing.Button();
        btn_loadData = new button.MyButton();
        btn_them = new Swing.Button();
        tf_soCCCD = new Swing.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setLabelText("Họ và tên");

        tf_maSoThue.setLabelText("Mã số thuế");

        tf_coQuanThue.setLabelText("Cơ quan thuế");

        tf_ngayThayDoi.setLabelText("Ngày thay đổi gần nhất");

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
        jLabel1.setText("THÔNG TIN THUẾ");

        btn_xoaDuLieu.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoaDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaDuLieu.setText("Xóa dữ liệu");
        btn_xoaDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaDuLieuActionPerformed(evt);
            }
        });

        tbl_thongTinThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Số Thuế", "Tên Người Nộp Thuế", "Số CCCD", "Cơ Quan Thuế", "Ngày Thay Đổi Gần Nhất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinThue.getTableHeader().setReorderingAllowed(false);
        tbl_thongTinThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinThueMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinThue);
        if (tbl_thongTinThue.getColumnModel().getColumnCount() > 0) {
            tbl_thongTinThue.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbl_thongTinThue.getColumnModel().getColumn(4).setPreferredWidth(100);
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

        tf_soCCCD.setLabelText("Số CCCD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_maSoThue, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))
                                    .addComponent(btn_loadData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tf_coQuanThue, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(328, 328, 328)
                                .addComponent(tf_ngayThayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_maSoThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_coQuanThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayThayDoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinThueMouseClicked
        model = (DefaultTableModel) tbl_thongTinThue.getModel();
        tf_maSoThue.setText(model.getValueAt(tbl_thongTinThue.getSelectedRow(), 0).toString());
        tf_ngayThayDoi.setText(model.getValueAt(tbl_thongTinThue.getSelectedRow(), 4).toString());
        tf_soCCCD.setText(model.getValueAt(tbl_thongTinThue.getSelectedRow(), 2).toString());
        tf_hoTen.setText(model.getValueAt(tbl_thongTinThue.getSelectedRow(), 1).toString());
        tf_coQuanThue.setText(model.getValueAt(tbl_thongTinThue.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tbl_thongTinThueMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int selectedRow = tbl_thongTinThue.getSelectedRow();

        if (tbl_thongTinThue.getRowCount() <= 0) {
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
                    String id = (String) tbl_thongTinThue.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    listThue.remove(selectedRow);
                    if (new ThueServiceImpl().delete(id)) {
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

    private void btn_luuThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThemActionPerformed
        if (tf_ngayThayDoi.getText().equals("") || tf_soCCCD.getText().equals("") || tf_hoTen.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
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

        ThueModel thue = new ThueModel();
        thue.setHoten(tf_hoTen.getText());
        try {
            if (isDateValidPresent(tf_ngayThayDoi.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayThayDoi.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                thue.setNgaythaydoithongtingannhat(sqlDate);
            } else {
                JOptionPane dialog = new JOptionPane("Lỗi ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }

        } catch (ParseException ex) {
            return;
        }
        thue.setSoCMT_CCCD(tf_soCCCD.getText().trim());
        thue.setCoquanthue(tf_coQuanThue.getText());
        thue.setTrangThai(1);
        listThue.add(thue);

        if (new ThueServiceImpl().insert(thue)) {
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
        ICongDanService congDanService = new CongDanServiceImpl();
        try {
            if (!isValidCCCD(tf_soCCCD.getText().trim())) {
                JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }
            CongDanModel congDan = new CongDanModel();
            congDan = congDanService.findOne(tf_soCCCD.getText().trim());
            tf_hoTen.setText(congDan.getHoTen());
        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Information not available!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }

    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (tbl_thongTinThue.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Please choose one row!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_maSoThue.setEditable(false);
            tf_ngayThayDoi.setEditable(true);
            tf_coQuanThue.setEditable(true);
            tf_soCCCD.setEditable(false);
        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
        try {
            int selectedRow = tbl_thongTinThue.getSelectedRow();
            if (tbl_thongTinThue.getRowCount() <= 0) {
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
                ThueModel thue = thueService.findOneByMaSoThue(tf_maSoThue.getText());
                thue.setHoten(tf_hoTen.getText());
                thue.setSoCMT_CCCD(tf_soCCCD.getText().trim());
                thue.setCoquanthue(tf_coQuanThue.getText());
                thue.setTrangThai(1);
                try {
                    if (isDateValidPresent(tf_ngayThayDoi.getText().trim())) {
                        Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayThayDoi.getText().trim());
                        java.sql.Date sqlDate;
                        sqlDate = new java.sql.Date(utilDate.getTime());
                        thue.setNgaythaydoithongtingannhat(sqlDate);
                    } else {
                        JOptionPane dialog = new JOptionPane("Lỗi ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                        JDialog jDialog = dialog.createDialog(null);
                        jDialog.setModal(true);
                        jDialog.setVisible(true);
                        return;
                    }

                } catch (ParseException ex) {
                    return;
                }

                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayThayDoi.getText().trim());
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

                if (new ThueServiceImpl().update(thue)) {
                    JOptionPane dialog = new JOptionPane("Update success!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_coQuanThue.getText(), selectedRow, 3);
                    model.setValueAt(sqlDate, selectedRow, 4);
                    model.fireTableDataChanged();
                } else {
                    JOptionPane dialog = new JOptionPane("Update fail!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
            }
        } catch (Exception e) {
        }
        clear();
        disableTextField();
    }//GEN-LAST:event_btn_luuSuaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (tf_hoTen.getText().equals("") || tf_soCCCD.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Please enter identity number information and load the data!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_soCCCD.setEditable(false);
            tf_maSoThue.setEditable(false);
            tf_coQuanThue.setEditable(true);
            tf_ngayThayDoi.setEditable(true);
        }


    }//GEN-LAST:event_btn_themActionPerformed
    public void showResult() {
        listThue = thueService.findAll();
        ThueModel thue = listThue.get(listThue.size() - 1);
        model.fireTableDataChanged();
        model.addRow(new Object[]{thue.getMasothue(), thue.getHoten(), thue.getSoCMT_CCCD(), thue.getCoquanthue(), thue.getNgaythaydoithongtingannhat()});
    }

    private void clear() {
        tf_soCCCD.setText("");
        tf_hoTen.setText("");
        tf_coQuanThue.setText("");
        tf_maSoThue.setText("");
        tf_ngayThayDoi.setText("");
    }

    private void disableTextField() {
        tf_soCCCD.setEditable(true);
        tf_hoTen.setEditable(false);
        tf_coQuanThue.setEditable(false);
        tf_maSoThue.setEditable(false);
        tf_ngayThayDoi.setEditable(false);
    }

    private static boolean isValidCCCD(String cccd) {
        String regex = "^[0-9]{12}$";
        if (!cccd.matches(regex)) {
            return false;
        }
        return cccd.charAt(0) == '0';
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
    private Swing.TableDark tbl_thongTinThue;
    private Swing.TextField tf_coQuanThue;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_maSoThue;
    private Swing.TextField tf_ngayThayDoi;
    private Swing.TextField tf_soCCCD;
    // End of variables declaration//GEN-END:variables

}
