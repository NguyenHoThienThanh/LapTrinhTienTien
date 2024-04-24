package Controller.Admin;

import InterfaceService.IChungNhanKetHonService;
import Models.ChungNhanKetHonModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.ChungNhanKetHonServiceImpl;
import ServiceImplement.LyHonServiceImpl;
import Swing.TextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ThongTinKetHonController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<ChungNhanKetHonModel> listKetHon;
    IChungNhanKetHonService ketHonService = new ChungNhanKetHonServiceImpl();

    public ThongTinKetHonController() {
        initComponents();
        tbl_thongTinKetHon.fixTable(jScrollPane2);
        listKetHon = ketHonService.findAllKetHon();
        model = (DefaultTableModel) tbl_thongTinKetHon.getModel();
        showTable();

        disableTextField();

    }

    private void showTable() {
        for (ChungNhanKetHonModel ketHon : listKetHon) {
            model.addRow(new Object[]{ketHon.getMaCnkh(), ketHon.getCCCDVo(), ketHon.getHoTenVo(), ketHon.getNgaySinhVo(), ketHon.getDanTocVo(), ketHon.getQuocTichVo(), ketHon.getNoiCuTruVo(), ketHon.getCCCDChong(), ketHon.getHoTenChong(), ketHon.getNgaySinhChong(), ketHon.getDanTocChong(), ketHon.getQuocTichChong(), ketHon.getNoiCuTruChong(), ketHon.getNgaydk(), ketHon.getNoidk()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_ngayDangKy1 = new Swing.TextField();
        tf_hoTenVo = new Swing.TextField();
        tf_quocTichVo = new Swing.TextField();
        tf_noiOChong = new Swing.TextField();
        tf_noiOVo = new Swing.TextField();
        tf_CCCDChong = new Swing.TextField();
        tf_hoTenChong = new Swing.TextField();
        tf_maKetHon = new Swing.TextField();
        tf_quocTichChong = new Swing.TextField();
        tf_ngaySinh = new Swing.TextField();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongTinKetHon = new Swing.TableDark();
        btn_luuSua = new Swing.Button();
        btn_luuThem = new Swing.Button();
        tf_danToc = new Swing.TextField();
        tf_CCCDVo = new Swing.TextField();
        tf_ngayDangKy = new Swing.TextField();
        tf_noiDangKy = new Swing.TextField();
        tf_ngaySinhChong = new Swing.TextField();
        tf_danTocChong = new Swing.TextField();
        btn_them = new Swing.Button();

        tf_ngayDangKy1.setLabelText("Ngày đăng ký");

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTenVo.setLabelText("Họ và tên vợ");

        tf_quocTichVo.setLabelText("Quốc tịch vợ");

        tf_noiOChong.setLabelText("Nơi cư trú chồng");

        tf_noiOVo.setLabelText("Nơi cư trú vợ");

        tf_CCCDChong.setLabelText("Số CCCD chồng");

        tf_hoTenChong.setLabelText("Họ và tên chồng");

        tf_maKetHon.setLabelText("Mã kết hôn");

        tf_quocTichChong.setLabelText("Quốc tịch chồng");

        tf_ngaySinh.setLabelText("Ngày sinh vợ");

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
        jLabel1.setText("THÔNG TIN KẾT HÔN");

        btn_xoaDuLieu.setBackground(new java.awt.Color(18, 99, 63));
        btn_xoaDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaDuLieu.setText("Xóa dữ liệu");
        btn_xoaDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaDuLieuActionPerformed(evt);
            }
        });

        tbl_thongTinKetHon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Kết Hôn", "CCCD Vợ", "Họ Tên Vợ", "Ngày Sinh Vợ", "Dân Tộc Vợ", "Quốc Tịch Vợ", "Nơi Cư Trú Vợ", "CCCD Chồng", "Họ Tên Chồng", "Ngày Sinh Chồng", "Dân Tộc Chồng", "Quốc Tịch Chồng", "Nơi Cư Trú Chồng", "Ngày Đăng Ký", "Nơi Đăng Ký"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinKetHon.getTableHeader().setReorderingAllowed(false);
        tbl_thongTinKetHon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinKetHonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinKetHon);
        if (tbl_thongTinKetHon.getColumnModel().getColumnCount() > 0) {
            tbl_thongTinKetHon.getColumnModel().getColumn(3).setPreferredWidth(60);
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

        tf_danToc.setLabelText("Dân tộc vợ");

        tf_CCCDVo.setLabelText("Số CCCD vợ");

        tf_ngayDangKy.setLabelText("Ngày đăng ký");

        tf_noiDangKy.setLabelText("Nơi đăng ký");

        tf_ngaySinhChong.setLabelText("Ngày sinh chồng");

        tf_danTocChong.setLabelText("Dân tộc chồng");

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
                .addGap(352, 352, 352)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_noiOChong, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(449, 449, 449))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_noiOVo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_maKetHon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_hoTenChong, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_CCCDChong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_hoTenVo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_CCCDVo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_quocTichVo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(tf_quocTichChong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_ngaySinhChong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_danTocChong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_hoTenVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_maKetHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_CCCDVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quocTichVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_noiOVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_hoTenChong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_quocTichChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_CCCDChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_ngaySinhChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_danTocChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noiOChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinKetHonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinKetHonMouseClicked
        model = (DefaultTableModel) tbl_thongTinKetHon.getModel();
        tf_maKetHon.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 0).toString());
        tf_CCCDVo.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 1).toString());
        tf_hoTenVo.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 2).toString());

        tf_ngaySinh.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 3).toString());
        tf_danToc.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 4).toString());
        tf_quocTichVo.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 5).toString());
        tf_noiOVo.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 6).toString());

        tf_CCCDChong.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 7).toString());
        tf_hoTenChong.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 8).toString());
        tf_ngaySinhChong.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 9).toString());
        tf_danTocChong.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 10).toString());
        tf_quocTichChong.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 11).toString());

        tf_noiOChong.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 12).toString());
        tf_ngayDangKy.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 13).toString());
        tf_noiDangKy.setText(model.getValueAt(tbl_thongTinKetHon.getSelectedRow(), 14).toString());


    }//GEN-LAST:event_tbl_thongTinKetHonMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed

        int selectedRow = tbl_thongTinKetHon.getSelectedRow();
        if (tbl_thongTinKetHon.getRowCount() <= 0) {
            JOptionPane dialog = new JOptionPane("Không có đơn cần xóa!", JOptionPane.WARNING_MESSAGE);
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
                    String id = (String) tbl_thongTinKetHon.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    //listKetHon.remove(selectedRow);
                    if (new ChungNhanKetHonServiceImpl().delete(id)) {
                        JOptionPane msg = new JOptionPane("Information deleted successfully!", JOptionPane.INFORMATION_MESSAGE);
                        JDialog jMsg = msg.createDialog(null);
                        jMsg.setModal(true);
                        jMsg.setVisible(true);
                    } else {
                        JOptionPane msgFail = new JOptionPane("Information deleted failed!", JOptionPane.INFORMATION_MESSAGE);
                        JDialog jMsgFail = msgFail.createDialog(null);
                        jMsgFail.setModal(true);
                        jMsgFail.setVisible(true);
                    }

                } catch (Exception e) {
                    JOptionPane msgFail = new JOptionPane("Information deleted failed!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jMsgFail = msgFail.createDialog(null);
                    jMsgFail.setModal(true);
                    jMsgFail.setVisible(true);
                }
            }

            clear();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_luuThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThemActionPerformed

        if (tf_noiDangKy.getText().equals("") || tf_noiOVo.getText().equals("") || tf_hoTenVo.getText().equals("") || tf_noiOChong.getText().equals("") || tf_quocTichChong.getText().equals("") || tf_CCCDChong.getText().equals("") || tf_CCCDVo.getText().equals("") || tf_danToc.getText().equals("") || tf_quocTichVo.getText().equals("") || tf_ngayDangKy.getText().equals("") || tf_hoTenChong.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDChong.getText()) == false) || (!isValidCCCD(tf_CCCDChong.getText().trim()))) {
            JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }

        if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDVo.getText()) == false) || (!isValidCCCD(tf_CCCDVo.getText().trim()))) {
            JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }

        if (!isEligibleForMarriage(tf_ngaySinhChong.getText().trim())) {
            JOptionPane dialog = new JOptionPane("Không đủ tuổi kết hôn!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }

        if (!isEligibleForMarriage(tf_ngaySinh.getText().trim())) {
            JOptionPane dialog = new JOptionPane("Không đủ tuổi kết hôn!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        ChungNhanKetHonModel ketHon = new ChungNhanKetHonModel();
        ketHon.setNoiCuTruVo(tf_noiOVo.getText().trim());
        ketHon.setHoTenVo(tf_hoTenVo.getText());
        ketHon.setNoiCuTruChong(tf_noiOChong.getText().trim());
        ketHon.setQuocTichVo(tf_quocTichVo.getText());
        ketHon.setHoTenChong(tf_hoTenChong.getText());
        ketHon.setQuocTichChong(tf_quocTichChong.getText());
        ketHon.setCCCDChong(tf_CCCDChong.getText().trim());
        ketHon.setCCCDVo(tf_CCCDVo.getText().trim());
        ketHon.setDanTocVo(tf_danToc.getText());
        ketHon.setDanTocChong(tf_danTocChong.getText());
        ketHon.setNoidk(tf_noiDangKy.getText());
        ketHon.setTrangThai(1);
        try {
            if (isDateValid(tf_ngayDangKy.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDangKy.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                ketHon.setNgaydk(sqlDate);
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

        try {
            if (isDateValid(tf_ngaySinh.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinh.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                ketHon.setNgaySinhVo(sqlDate);
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

        try {
            if (isDateValid(tf_ngaySinhChong.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinhChong.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                ketHon.setNgaySinhChong(sqlDate);
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
        listKetHon.add(ketHon);

        if (new ChungNhanKetHonServiceImpl().insert(ketHon)) {

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

        if (tbl_thongTinKetHon.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Please choose one row!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_noiOVo.setEditable(true);
            tf_hoTenVo.setEditable(true);
            tf_quocTichVo.setEditable(true);
            tf_ngaySinh.setEditable(true);
            tf_hoTenChong.setEditable(true);
            tf_noiOChong.setEditable(true);
            tf_quocTichChong.setEditable(true);
            tf_CCCDChong.setEditable(true);
            tf_danToc.setEditable(true);
            tf_ngayDangKy.setEditable(true);
            tf_CCCDVo.setEditable(true);
            tf_noiDangKy.setEditable(true);
            tf_danTocChong.setEditable(true);
            tf_ngaySinhChong.setEditable(true);

        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
        try {
            int selectedRow = tbl_thongTinKetHon.getSelectedRow();

            if (tbl_thongTinKetHon.getRowCount() <= 0) {
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
                if (tf_noiDangKy.getText().equals("") || tf_noiOVo.getText().equals("") || tf_hoTenVo.getText().equals("") || tf_noiOChong.getText().equals("") || tf_quocTichChong.getText().equals("") || tf_CCCDChong.getText().equals("") || tf_CCCDVo.getText().equals("") || tf_danToc.getText().equals("") || tf_quocTichVo.getText().equals("") || tf_ngayDangKy.getText().equals("") || tf_hoTenChong.getText().equals("")) {
                    JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDChong.getText()) == false) || (!isValidCCCD(tf_CCCDChong.getText().trim()))) {
                    JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }

                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDVo.getText()) == false) || (!isValidCCCD(tf_CCCDVo.getText().trim()))) {
                    JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                
                if (!isEligibleForMarriage(tf_ngaySinhChong.getText().trim())) {
                    JOptionPane dialog = new JOptionPane("Không đủ tuổi kết hôn!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }

                if (!isEligibleForMarriage(tf_ngaySinh.getText().trim())) {
                    JOptionPane dialog = new JOptionPane("Không đủ tuổi kết hôn!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                ChungNhanKetHonModel ketHon = new ChungNhanKetHonModel();
                ketHon = ketHonService.findOneByMaKH(tf_maKetHon.getText().trim());
                ketHon.setMaCnkh(tf_maKetHon.getText().trim());
                ketHon.setNoiCuTruVo(tf_noiOVo.getText().trim());
                ketHon.setHoTenVo(tf_hoTenVo.getText());
                ketHon.setNoiCuTruChong(tf_noiOChong.getText().trim());
                ketHon.setQuocTichVo(tf_quocTichVo.getText());
                ketHon.setHoTenChong(tf_hoTenChong.getText());
                ketHon.setQuocTichChong(tf_quocTichChong.getText());
                ketHon.setCCCDChong(tf_CCCDChong.getText().trim());
                ketHon.setCCCDVo(tf_CCCDVo.getText().trim());
                ketHon.setDanTocVo(tf_danToc.getText());
                ketHon.setDanTocChong(tf_danTocChong.getText());
                ketHon.setNoidk(tf_noiDangKy.getText());
                ketHon.setTrangThai(1);
                try {
                    if (isDateValid(tf_ngayDangKy.getText().trim())) {
                        Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDangKy.getText().trim());
                        java.sql.Date sqlDate;
                        sqlDate = new java.sql.Date(utilDate.getTime());
                        ketHon.setNgaydk(sqlDate);
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

                try {
                    if (isDateValid(tf_ngaySinh.getText().trim())) {
                        Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinh.getText().trim());
                        java.sql.Date sqlDate;
                        sqlDate = new java.sql.Date(utilDate.getTime());
                        ketHon.setNgaySinhVo(sqlDate);
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

                try {
                    if (isDateValid(tf_ngaySinhChong.getText().trim())) {
                        Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinhChong.getText().trim());
                        java.sql.Date sqlDate;
                        sqlDate = new java.sql.Date(utilDate.getTime());
                        ketHon.setNgaySinhChong(sqlDate);
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
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinh.getText().trim());
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                String ngaySinh = sdf.format(sqlDate);
                Date util = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDangKy.getText().trim());
                java.sql.Date sql = new java.sql.Date(util.getTime());

                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngaySinhChong.getText().trim());
                java.sql.Date SDate = new java.sql.Date(date.getTime());
                String ngaySinhChong = sdf.format(SDate);

                String ngayDangKy = sdf.format(sql);
                if (new ChungNhanKetHonServiceImpl().update(ketHon)) {
                    JOptionPane dialog = new JOptionPane("Update success!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_hoTenVo.getText(), selectedRow, 2);
                    model.setValueAt(tf_quocTichVo.getText(), selectedRow, 5);
                    model.setValueAt(ngaySinh, selectedRow, 3);
                    model.setValueAt(tf_danToc.getText(), selectedRow, 4);
                    model.setValueAt(tf_noiOVo.getText(), selectedRow, 6);
                    model.setValueAt(tf_hoTenChong.getText(), selectedRow, 8);
                    model.setValueAt(ngaySinhChong, selectedRow, 9);
                    model.setValueAt(tf_danTocChong.getText(), selectedRow, 10);
                    model.setValueAt(tf_quocTichChong.getText(), selectedRow, 11);
                    model.setValueAt(tf_CCCDChong.getText(), selectedRow, 7);
                    model.setValueAt(tf_CCCDVo.getText(), selectedRow, 1);
                    model.setValueAt(tf_noiOChong.getText(), selectedRow, 12);
                    model.setValueAt(ngayDangKy, selectedRow, 13);
                    model.setValueAt(tf_noiDangKy.getText(), selectedRow, 14);
                    model.fireTableDataChanged();
                } else {
                    JOptionPane dialog = new JOptionPane("Update fail!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
            }
            clear();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_luuSuaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        tf_noiOVo.setEditable(true);
        tf_hoTenVo.setEditable(true);
        tf_quocTichVo.setEditable(true);
        tf_ngaySinh.setEditable(true);
        tf_hoTenChong.setEditable(true);
        tf_noiOChong.setEditable(true);
        tf_quocTichChong.setEditable(true);
        tf_CCCDChong.setEditable(true);
        tf_danToc.setEditable(true);
        tf_ngayDangKy.setEditable(true);
        tf_CCCDVo.setEditable(true);
        tf_noiDangKy.setEditable(true);
        tf_danTocChong.setEditable(true);
        tf_ngaySinhChong.setEditable(true);
    }//GEN-LAST:event_btn_themActionPerformed
    public void showResult() {
        listKetHon = ketHonService.findAllKetHon();
        ChungNhanKetHonModel ketHon = listKetHon.get(listKetHon.size() - 1);
        model.fireTableDataChanged();
        model.addRow(new Object[]{ketHon.getMaCnkh(), ketHon.getCCCDVo(), ketHon.getHoTenVo(), ketHon.getNgaySinhVo(), ketHon.getDanTocVo(), ketHon.getQuocTichVo(), ketHon.getNoiCuTruVo(), ketHon.getCCCDChong(), ketHon.getHoTenChong(), ketHon.getNgaySinhChong(), ketHon.getDanTocChong(), ketHon.getQuocTichChong(), ketHon.getNoiCuTruChong(), ketHon.getNgaydk(), ketHon.getNoidk()});
    }

    private void clear() {
        tf_noiOVo.setText("");
        tf_hoTenVo.setText("");
        tf_ngaySinh.setText("");
        tf_quocTichVo.setText("");
        tf_ngaySinh.setText("");
        tf_hoTenChong.setText("");
        tf_noiOChong.setText("");
        tf_quocTichChong.setText("");
        tf_maKetHon.setText("");
        tf_CCCDChong.setText("");
        tf_CCCDVo.setText("");
        tf_danToc.setText("");
        tf_noiDangKy.setText("");
        tf_ngaySinhChong.setText("");
        tf_danTocChong.setText("");
        tf_ngayDangKy.setText("");
    }

    private void disableTextField() {
        tf_noiOVo.setEditable(false);
        tf_hoTenVo.setEditable(false);
        tf_quocTichVo.setEditable(false);
        tf_ngaySinh.setEditable(false);
        tf_hoTenChong.setEditable(false);
        tf_noiOChong.setEditable(false);
        tf_quocTichChong.setEditable(false);
        tf_CCCDChong.setEditable(false);
        tf_danToc.setEditable(false);
        tf_ngayDangKy.setEditable(false);
        tf_CCCDVo.setEditable(false);
        tf_noiDangKy.setEditable(false);
        tf_danTocChong.setEditable(false);
        tf_ngaySinhChong.setEditable(false);
        tf_maKetHon.setEditable(false);
    }

    private static boolean isValidCCCD(String cccd) {
        String regex = "^[0-9]{12}$";
        if (!cccd.matches(regex)) {
            return false;
        }
        return cccd.charAt(0) == '0';
    }

    private static boolean isEligibleForMarriage(String ngaySinhStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ngaySinh = LocalDate.parse(ngaySinhStr, formatter);

        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(ngaySinh, today);

        int years = (int) (daysBetween / 365);
        int months = (int) ((daysBetween % 365) / 30);
        int days = (int) ((daysBetween % 365) % 30);

        if (years >= 18) {
            return true;
        } else if (years == 17 && months >= 8) { // 8 months after 17th birthday
            return true;
        } else if (years == 17 && months == 7 && days >= ngaySinh.getDayOfMonth()) { // 7th month and same or after birth day
            return true;
        } else {
            return false;
        }
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

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_luuSua;
    private Swing.Button btn_luuThem;
    private Swing.Button btn_sua;
    private Swing.Button btn_them;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private Swing.TableDark tbl_thongTinKetHon;
    private Swing.TextField tf_CCCDChong;
    private Swing.TextField tf_CCCDVo;
    private Swing.TextField tf_danToc;
    private Swing.TextField tf_danTocChong;
    private Swing.TextField tf_hoTenChong;
    private Swing.TextField tf_hoTenVo;
    private Swing.TextField tf_maKetHon;
    private Swing.TextField tf_ngayDangKy;
    private Swing.TextField tf_ngayDangKy1;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_ngaySinhChong;
    private Swing.TextField tf_noiDangKy;
    private Swing.TextField tf_noiOChong;
    private Swing.TextField tf_noiOVo;
    private Swing.TextField tf_quocTichChong;
    private Swing.TextField tf_quocTichVo;
    // End of variables declaration//GEN-END:variables

}
