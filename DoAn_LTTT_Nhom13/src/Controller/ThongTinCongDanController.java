/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller;

import InterfaceDAO.ICongDanDAO;
import InterfaceService.ICongDanService;
import Models.CongDanModel;
import ServiceImplement.CongDanServiceImpl;
import java.util.List;
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
        listCongDan = congDanService.findAll();
        model = (DefaultTableModel) tbl_thongTinCongDan.getModel();
        
        showTable();

    }

    private void showTable() {
        for (CongDanModel congDan : listCongDan) {
            model.addRow(new Object[]{congDan.getMaKS(),  congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(),  congDan.getSDT(), congDan.getEmail()});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_thongTinCongDan = new javax.swing.JTable();
        btn_them = new Swing.Button();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setLabelText("Họ và tên");

        tf_gioiTinh.setLabelText("Giới tính");

        tf_noiCapCCCD.setLabelText("Nơi cấp CCCD");

        tf_soCCCD.setLabelText("Số CCCD");

        tf_email.setLabelText("Email");

        tf_noiSinh.setLabelText("Nơi sinh");

        tf_maKhaiSinh.setLabelText("Mã khai sinh");

        tf_ngayCapCCCD.setLabelText("Ngày cấp CCCD");

        tf_soDienThoai.setLabelText("Số điện thoại");

        tf_ngaySinh.setLabelText("Ngày sinh");

        tbl_thongTinCongDan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khai Sinh", "Số CCCD", "Họ Tên", "Ngày Sinh", "Giới Tính", "Nơi Sinh", "Nơi Cấp CCCD", "Ngày Cấp CCCD", "Số Điện Thoại", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinCongDan.setShowGrid(false);
        tbl_thongTinCongDan.getTableHeader().setReorderingAllowed(false);
        tbl_thongTinCongDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinCongDanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_thongTinCongDan);

        btn_them.setBackground(new java.awt.Color(18, 99, 63));
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setText("Thêm thông tin");

        btn_sua.setBackground(new java.awt.Color(18, 99, 63));
        btn_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua.setText("Sửa thông tin");

        btn_xoa.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoa.setText("Xóa thông tin");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_noiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_soDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(289, 289, 289)
                                        .addComponent(jLabel1)))
                                .addGap(0, 13, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_sua;
    private Swing.Button btn_them;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_thongTinCongDan;
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
