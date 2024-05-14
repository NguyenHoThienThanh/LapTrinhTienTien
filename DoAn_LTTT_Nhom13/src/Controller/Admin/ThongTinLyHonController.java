package Controller.Admin;

import InterfaceService.ILyHonService;
import Models.ChungNhanKetHonModel;
import Models.DonChungNhanKetHon;
import Models.LyHonModel;
import ServiceImplement.ChungNhanKetHonServiceImpl;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.LyHonServiceImpl;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThongTinLyHonController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<LyHonModel> listLyHon;
    ILyHonService lyHonService = new LyHonServiceImpl();

    public ThongTinLyHonController() {
        initComponents();
        tbl_thongTinLyHon.fixTable(jScrollPane2);
        listLyHon = lyHonService.findAll();
        model = (DefaultTableModel) tbl_thongTinLyHon.getModel();
        showTable();
        disableTextField();

    }

    private void showTable() {
        for (LyHonModel lyHon : listLyHon) {
            model.addRow(new Object[]{lyHon.getMaLh(), lyHon.getMaCnkh(), lyHon.getCCCDNguoiNopDon(), lyHon.getHoTenNguoiNopDon(), lyHon.getCCCDVO(), lyHon.getHoTenVo(), lyHon.getCCCDChong(), lyHon.getHoTenChong(), lyHon.getNgaydk(), lyHon.getNoidk(), lyHon.getLydo(), lyHon.getTrangThai()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_macnkh = new Swing.TextField();
        tf_CCCDNguoiNopDon = new Swing.TextField();
        tf_hotenchong = new Swing.TextField();
        tf_malh = new Swing.TextField();
        tf_cccdchong = new Swing.TextField();
        tf_cccdvo = new Swing.TextField();
        tf_HoTenNguoiNopDon = new Swing.TextField();
        tf_lydo = new Swing.TextField();
        tf_hotenvo = new Swing.TextField();
        tf_ngaydk = new Swing.TextField();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongTinLyHon = new Swing.TableDark();
        btn_luuSua = new Swing.Button();
        btn_luuThem = new Swing.Button();
        btn_them = new Swing.Button();
        tf_noidk = new Swing.TextField();
        btn_loadData = new button.MyButton();
        btn_xuatDanhSach1 = new Swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_macnkh.setLabelText("Mã Cnkh");

        tf_CCCDNguoiNopDon.setLabelText("CCCD Người nộp đơn");

        tf_hotenchong.setLabelText("Họ tên chồng");

        tf_malh.setLabelText("Mã Ly hôn");

        tf_cccdchong.setLabelText("CCCD Chồng");

        tf_cccdvo.setLabelText("CCCD vợ");

        tf_HoTenNguoiNopDon.setLabelText("Họ tên người nộp đơn");

        tf_lydo.setLabelText("Lý do");

        tf_hotenvo.setLabelText("Họ tên vợ");

        tf_ngaydk.setLabelText("Ngày đăng ký");

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
        jLabel1.setText("THÔNG TIN LY HÔN");

        btn_xoaDuLieu.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoaDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaDuLieu.setText("Xóa dữ liệu");
        btn_xoaDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaDuLieuActionPerformed(evt);
            }
        });

        tbl_thongTinLyHon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Ly hôn", "Mã Cnkh", "CCCD người nộp đơn", "Họ tên người nộp đơn", "CCCD vợ", "Họ tên vợ", "CCCD chồng", "Họ tên chồng", "Ngày đăng ký", "Nơi đăng ký", "Lý do"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinLyHon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinLyHonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinLyHon);
        if (tbl_thongTinLyHon.getColumnModel().getColumnCount() > 0) {
            tbl_thongTinLyHon.getColumnModel().getColumn(3).setPreferredWidth(60);
            tbl_thongTinLyHon.getColumnModel().getColumn(4).setPreferredWidth(50);
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

        btn_them.setBackground(new java.awt.Color(18, 99, 63));
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setText("Thêm thông tin");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        tf_noidk.setLabelText("Nơi đăng ký");

        btn_loadData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/icons8-upload-10.png"))); // NOI18N
        btn_loadData.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_loadData.setRadius(50);
        btn_loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDataActionPerformed(evt);
            }
        });

        btn_xuatDanhSach1.setBackground(new java.awt.Color(18, 99, 63));
        btn_xuatDanhSach1.setForeground(new java.awt.Color(255, 255, 255));
        btn_xuatDanhSach1.setText("Xuất danh sách");
        btn_xuatDanhSach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatDanhSach1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_xuatDanhSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_cccdvo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_malh, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_CCCDNguoiNopDon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cccdchong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_HoTenNguoiNopDon, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(tf_hotenchong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ngaydk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(tf_noidk, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_malh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_macnkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_CCCDNguoiNopDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_HoTenNguoiNopDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_cccdvo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_hotenvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cccdchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_hotenchong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ngaydk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_noidk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tf_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_xuatDanhSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
        tbl_thongTinLyHon.clearSelection();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinLyHonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinLyHonMouseClicked
        model = (DefaultTableModel) tbl_thongTinLyHon.getModel();
        tf_malh.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 0).toString());
        tf_macnkh.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 1).toString());
        tf_CCCDNguoiNopDon.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 2).toString());
        tf_HoTenNguoiNopDon.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 3).toString());
        tf_cccdvo.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 4).toString());
        tf_hotenvo.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 5).toString());
        tf_cccdchong.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 6).toString());
        tf_hotenchong.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 7).toString());
        tf_ngaydk.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 8).toString());
        tf_noidk.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 9).toString());
        tf_lydo.setText(model.getValueAt(tbl_thongTinLyHon.getSelectedRow(), 10).toString());                                                                            
    }//GEN-LAST:event_tbl_thongTinLyHonMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed

        int selectedRow = tbl_thongTinLyHon.getSelectedRow();

        if (tbl_thongTinLyHon.getRowCount() <= 0) {
            JOptionPane dialog = new JOptionPane("Bảng không có dữ liệu!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow < 0) {
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow >= 0) {
            JPanel myPanel = new JPanel();
            int confirm = JOptionPane.showConfirmDialog(myPanel, "Bạn có chắc chắn muốn xóa không?", "", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String id = (String) tbl_thongTinLyHon.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    listLyHon.remove(selectedRow);
                    if (new LyHonServiceImpl().delete(id)) {
                        JOptionPane msg = new JOptionPane("Xóa thành công!", JOptionPane.INFORMATION_MESSAGE);
                        JDialog jMsg = msg.createDialog(null);
                        jMsg.setModal(true);
                        jMsg.setVisible(true);
                    } else {
                        JOptionPane msgFail = new JOptionPane("Xóa thất bại!", JOptionPane.INFORMATION_MESSAGE);
                        JDialog jMsgFail = msgFail.createDialog(null);
                        jMsgFail.setModal(true);
                        jMsgFail.setVisible(true);
                    }

                } catch (Exception e) {
                    JOptionPane msgFail = new JOptionPane("Xóa thất bại!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jMsgFail = msgFail.createDialog(null);
                    jMsgFail.setModal(true);
                    jMsgFail.setVisible(true);
                }
            }

            clear();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_luuThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThemActionPerformed
        if (tf_HoTenNguoiNopDon.getText().equals("") ||
            tf_macnkh.getText().equals("") || tf_hotenchong.getText().equals("") ||
            tf_lydo.getText().equals("") || tf_hotenvo.getText().equals("") ||
            tf_cccdchong.getText().equals("") || tf_CCCDNguoiNopDon.getText().equals("") ||
            tf_cccdvo.getText().equals("") || tf_ngaydk.getText().equals("") ||
            tf_noidk.getText().equals(""))
        {
            JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (!isValidCCCD(tf_CCCDNguoiNopDon.getText().trim())) {
            JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (!(tf_CCCDNguoiNopDon.getText().trim().equals(tf_cccdvo.getText().trim()) || tf_CCCDNguoiNopDon.getText().trim().equals(tf_cccdchong.getText().trim()))) {
            JOptionPane dialog = new JOptionPane("Chỉ có vợ hoặc chồng mới có quyền nộp đơn ly hôn!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        LyHonModel lyHon = new LyHonModel();
        ChungNhanKetHonModel ketHon = new ChungNhanKetHonServiceImpl().findOneByMaKH(tf_macnkh.getText().trim());
        ketHon.setTrangThai(0);
        new ChungNhanKetHonServiceImpl().update(ketHon);
        lyHon.setMaCnkh(tf_macnkh.getText().trim());
        lyHon.setHoTenNguoiNopDon(tf_CCCDNguoiNopDon.getText());
        lyHon.setNoidk(tf_noidk.getText());
        lyHon.setCCCDChong(tf_cccdchong.getText().trim());
        lyHon.setCCCDVO(tf_cccdvo.getText().trim());
        lyHon.setCCCDNguoiNopDon(tf_CCCDNguoiNopDon.getText().trim());
        lyHon.setHoTenChong(tf_hotenchong.getText().trim());
        lyHon.setHoTenVo(tf_hotenvo.getText().trim());
        try {
            if (isDateValid(tf_ngaydk.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaydk.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                lyHon.setNgaydk(sqlDate);
            } else {
                JOptionPane dialog = new JOptionPane("Lỗi định dạng ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }

        } catch (ParseException ex) {
            return;
        }
        lyHon.setLydo(tf_lydo.getText());
        lyHon.setTrangThai(1);
        listLyHon.add(lyHon);
        
        if (new LyHonServiceImpl().insert(lyHon)) {
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

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (tbl_thongTinLyHon.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_macnkh.setEditable(true);
            tf_noidk.setEditable(true);
            tf_lydo.setEditable(true);
            tf_ngaydk.setEditable(true);
        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
        try {
            int selectedRow = tbl_thongTinLyHon.getSelectedRow();
            if (tbl_thongTinLyHon.getRowCount() <= 0) {
                JOptionPane dialog = new JOptionPane("Bảng không có dữ liệu!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            } else if (selectedRow < 0) {
                JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            } else if (selectedRow >= 0) {
                LyHonModel lyHon = lyHonService.findOneByMaLH(tf_malh.getText());
                lyHon.setMaCnkh(tf_macnkh.getText());

                if (isDateValid(tf_ngaydk.getText().trim())) {
                    Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaydk.getText());
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                    lyHon.setNgaydk(sqlDate);

                } else {
                    JOptionPane dialog = new JOptionPane("Lỗi định dạng ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }

                lyHon.setNoidk(tf_noidk.getText());
                lyHon.setLydo(tf_lydo.getText());
                if (new LyHonServiceImpl().update(lyHon)) {
                    JOptionPane dialog = new JOptionPane("Sửa thành công!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_ngaydk.getText(), selectedRow, 8);
                    model.setValueAt(tf_noidk.getText(), selectedRow, 9);
                    model.setValueAt(tf_lydo.getText(), selectedRow, 10);
                    model.fireTableDataChanged();
                } else {
                    JOptionPane dialog = new JOptionPane("Sửa thất bại!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
            }
        } catch (ParseException ex) {
            JOptionPane dialog = new JOptionPane("Sửa thất bại!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        clear();
    }//GEN-LAST:event_btn_luuSuaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        tf_macnkh.setEditable(true);
        tf_CCCDNguoiNopDon.setEditable(true);
        tf_HoTenNguoiNopDon.setEditable(true);
        tf_ngaydk.setEditable(true);
        tf_noidk.setEditable(true);
        tf_lydo.setEditable(true);
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDataActionPerformed
        try {
            DonChungNhanKetHon lyHon = new LyHonServiceImpl().findOneByMaKH(tf_macnkh.getText().trim());
            if (lyHon != null) {
//                DonChungNhanKetHon lyHon = new DonChungNhanKetHon();
//                lyHon = lyHonService.findOneByMaKH(tf_macnkh.getText().trim());
                tf_cccdchong.setText(lyHon.getCCCDChong());
                tf_cccdvo.setText(lyHon.getCCCDVo());
                tf_macnkh.setText(lyHon.getMaCnkh());
                tf_hotenvo.setText(lyHon.getHoTenVo());
                tf_hotenchong.setText(lyHon.getHoTenChong());
                
            } else {
                ILyHonService lyHonService = new LyHonServiceImpl();
//                DonChungNhanKetHon lyHon = new DonChungNhanKetHon();
//                lyHon = lyHonService.findOneByMaKH(tf_macnkh.getText().trim());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tf_cccdchong.setText("");
                tf_cccdvo.setText("");
                tf_macnkh.setText("");
                tf_hotenvo.setText("");
                tf_hotenchong.setText("");

            }

        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Thông tin công dân không tồn tại!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_xuatDanhSach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatDanhSach1ActionPerformed
        if (tbl_thongTinLyHon.getRowCount() != 0) {
            String filePath = "D:\\DanhSachLyHon.xlsx";
            exportToExcel(filePath);
        } else {
            JOptionPane dialog = new JOptionPane("Bảng dữ liệu trống!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
    }//GEN-LAST:event_btn_xuatDanhSach1ActionPerformed
    private void exportToExcel(String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Danh sách ly hôn");

        Cell cell = null;
        XSSFRow roww = sheet.createRow(0);
        cell = roww.createCell(5, CellType.STRING);
        cell.setCellValue("DANH SÁCH LY HÔN");
        // Tiêu đề cột
        Row headerRow = sheet.createRow(2);
        headerRow.createCell(0).setCellValue("Mã ly hôn");
        headerRow.createCell(1).setCellValue("Mã CNKH");
        headerRow.createCell(2).setCellValue("CCCD người nộp đơn");
        headerRow.createCell(3).setCellValue("Họ tên người nộp đơn");
        headerRow.createCell(4).setCellValue("CCCD vợ");
        headerRow.createCell(5).setCellValue("Họ tên vợ");
        headerRow.createCell(6).setCellValue("CCCD chồng");
        headerRow.createCell(7).setCellValue("Họ tên chồng");
        headerRow.createCell(8).setCellValue("Ngày đăng ký");
        headerRow.createCell(9).setCellValue("Nơi đăng ký");
        headerRow.createCell(10).setCellValue("Lý do");

        int sttCounter = 1;
        // Dữ liệu
        for (int i = 0; i < tbl_thongTinLyHon.getRowCount(); i++) {
            Row row = sheet.createRow(i + 3);
            row.createCell(0).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 0));           
            row.createCell(1).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 1)); 
            row.createCell(2).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 2));

            row.createCell(3).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 3));           
            row.createCell(4).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 4)); 
            row.createCell(5).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 5));
            row.createCell(6).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 6));
            row.createCell(7).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 7));

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue(tbl_thongTinLyHon.getValueAt(i, 8).toString());
            
            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue(tbl_thongTinLyHon.getValueAt(i, 9).toString());
            
            row.createCell(10).setCellValue((String) tbl_thongTinLyHon.getValueAt(i, 10));
        }

        // Tự động điều chỉnh độ rộng cột
        for (int i = 0; i < tbl_thongTinLyHon.getColumnCount(); i++) {
            sheet.autoSizeColumn(i);
        }
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Xuất dữ liệu ra file Excel thành công");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất dữ liệu ra file Excel");
        }
    }
    public void showResult() {
        listLyHon = new LyHonServiceImpl().findAll();
        LyHonModel lyHon = listLyHon.get(listLyHon.size() - 1);
        model.fireTableDataChanged();
        model.addRow(new Object[]{lyHon.getMaLh(), lyHon.getMaCnkh(), lyHon.getCCCDNguoiNopDon(), lyHon.getHoTenNguoiNopDon(), lyHon.getCCCDVO(), lyHon.getHoTenVo(), lyHon.getCCCDChong(), lyHon.getHoTenChong(), lyHon.getNgaydk(), lyHon.getNoidk(), lyHon.getLydo(), lyHon.getTrangThai()});
        }

    private void clear() {
        tf_malh.setText("");
        tf_macnkh.setText("");
        tf_ngaydk.setText("");
        tf_CCCDNguoiNopDon.setText("");
        tf_cccdvo.setText("");
        tf_lydo.setText("");
        tf_hotenchong.setText("");
        tf_HoTenNguoiNopDon.setText("");
        tf_hotenvo.setText("");
        tf_cccdchong.setText("");
        tf_noidk.setText("");
    }

    private void disableTextField() {
        tf_malh.setEditable(false);
        tf_macnkh.setEditable(false);
        tf_ngaydk.setEditable(false);
        tf_CCCDNguoiNopDon.setEditable(false);
        tf_cccdvo.setEditable(false);
        tf_lydo.setEditable(false);
        tf_hotenchong.setEditable(false);
        tf_HoTenNguoiNopDon.setEditable(false);
        tf_hotenvo.setEditable(false);
        tf_cccdchong.setEditable(false);
        tf_noidk.setEditable(false);
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

    private static boolean isDateValid(String ngayCapCCCD) {

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
    private Swing.Button btn_xuatDanhSach1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private Swing.TableDark tbl_thongTinLyHon;
    private Swing.TextField tf_CCCDNguoiNopDon;
    private Swing.TextField tf_HoTenNguoiNopDon;
    private Swing.TextField tf_cccdchong;
    private Swing.TextField tf_cccdvo;
    private Swing.TextField tf_hotenchong;
    private Swing.TextField tf_hotenvo;
    private Swing.TextField tf_lydo;
    private Swing.TextField tf_macnkh;
    private Swing.TextField tf_malh;
    private Swing.TextField tf_ngaydk;
    private Swing.TextField tf_noidk;
    // End of variables declaration//GEN-END:variables

}
