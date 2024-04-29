package Controller.Admin;

import DAOImplement.KhaiSinhDAOImpl;
import InterfaceService.IKhaiSinhService;
import Models.KhaiSinhModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import Swing.TextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ThongTinKhaiSinhController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<KhaiSinhModel> listKhaiSinh;
    List<KhaiSinhModel> listChuaDuyet;
    IKhaiSinhService khaiSinhService = new KhaiSinhServiceImpl();

    public ThongTinKhaiSinhController() {
        initComponents();
        tbl_thongTinCongDan.fixTable(jScrollPane2);
        listKhaiSinh = khaiSinhService.findAll();
        model = (DefaultTableModel) tbl_thongTinCongDan.getModel();
        showTable();
        if(cbx_loaiDon.getSelectedIndex() == 0){
            btn_luuThem.setVisible(false);
        }
        disableTextField();

    }

    private void showTable() {
        for (KhaiSinhModel khaiSinh : listKhaiSinh) {
            model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});
        }
    }

    private void showTableChuaDuyet() {
        listChuaDuyet = khaiSinhService.findAllChuaDuyet();
        for (KhaiSinhModel khaiSinh : listChuaDuyet) {
            model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_ngayDangKy1 = new Swing.TextField();
        tf_hoTen = new Swing.TextField();
        tf_gioiTinh = new Swing.TextField();
        tf_CCCDNguoiDangKy = new Swing.TextField();
        tf_quocTich = new Swing.TextField();
        tf_CCCDCha = new Swing.TextField();
        tf_noiSinh = new Swing.TextField();
        tf_maKhaiSinh = new Swing.TextField();
        tf_quanHe = new Swing.TextField();
        tf_queQuan = new Swing.TextField();
        tf_ngaySinh = new Swing.TextField();
        btn_sua = new Swing.Button();
        btn_xoa = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        btn_xoaDuLieu = new Swing.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongTinCongDan = new Swing.TableDark();
        btn_luuSua = new Swing.Button();
        btn_luuThem = new Swing.Button();
        tf_danToc = new Swing.TextField();
        tf_CCCDMe = new Swing.TextField();
        tf_ngayDangKy = new Swing.TextField();
        tf_noiDangKy = new Swing.TextField();
        cbx_loaiDon = new Swing.Combobox();
        lbl_loaiDon = new javax.swing.JLabel();

        tf_ngayDangKy1.setLabelText("Ngày đăng ký");

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setLabelText("Họ và tên");

        tf_gioiTinh.setLabelText("Giới tính");

        tf_CCCDNguoiDangKy.setLabelText("Số CCCD người đăng ký");

        tf_quocTich.setLabelText("Quốc tịch");

        tf_CCCDCha.setLabelText("Số CCCD cha");

        tf_noiSinh.setLabelText("Nơi sinh");

        tf_maKhaiSinh.setLabelText("Mã khai sinh");

        tf_quanHe.setLabelText("Quan hệ với người khai sinh");

        tf_queQuan.setLabelText("Quê quán");

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
        jLabel1.setText("THÔNG TIN KHAI SINH");

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
                "Mã Khai Sinh", "Họ Tên", "Giới Tính", "Ngày Sinh", "Dân tộc", "Quốc Tịch", "Nơi Sinh", "Quê Quán", "CCCD Cha", "CCCD Mẹ", "CCCD Người Đăng Ký", "Quan Hệ", "Ngày Đăng Ký", "Nơi Đăng Ký"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            tbl_thongTinCongDan.getColumnModel().getColumn(0).setHeaderValue("Mã Khai Sinh");
            tbl_thongTinCongDan.getColumnModel().getColumn(1).setHeaderValue("Họ Tên");
            tbl_thongTinCongDan.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbl_thongTinCongDan.getColumnModel().getColumn(2).setHeaderValue("Giới Tính");
            tbl_thongTinCongDan.getColumnModel().getColumn(3).setPreferredWidth(60);
            tbl_thongTinCongDan.getColumnModel().getColumn(3).setHeaderValue("Ngày Sinh");
            tbl_thongTinCongDan.getColumnModel().getColumn(4).setHeaderValue("Dân tộc");
            tbl_thongTinCongDan.getColumnModel().getColumn(5).setHeaderValue("Quốc Tịch");
            tbl_thongTinCongDan.getColumnModel().getColumn(6).setHeaderValue("Nơi Sinh");
            tbl_thongTinCongDan.getColumnModel().getColumn(7).setHeaderValue("Quê Quán");
            tbl_thongTinCongDan.getColumnModel().getColumn(8).setHeaderValue("CCCD Cha");
            tbl_thongTinCongDan.getColumnModel().getColumn(9).setHeaderValue("CCCD Mẹ");
            tbl_thongTinCongDan.getColumnModel().getColumn(10).setHeaderValue("CCCD Người Đăng Ký");
            tbl_thongTinCongDan.getColumnModel().getColumn(11).setHeaderValue("Quan Hệ");
            tbl_thongTinCongDan.getColumnModel().getColumn(12).setHeaderValue("Ngày Đăng Ký");
            tbl_thongTinCongDan.getColumnModel().getColumn(13).setHeaderValue("Nơi Đăng Ký");
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
        btn_luuThem.setText("Duyệt thông tin");
        btn_luuThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuThemActionPerformed(evt);
            }
        });

        tf_danToc.setLabelText("Dân tộc");

        tf_CCCDMe.setLabelText("Số CCCD mẹ");

        tf_ngayDangKy.setLabelText("Ngày đăng ký");

        tf_noiDangKy.setLabelText("Nơi đăng ký");

        cbx_loaiDon.setBorder(null);
        cbx_loaiDon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Đơn Đã Duyệt", "Đơn Chưa Duyệt" }));
        cbx_loaiDon.setLabeText("");
        cbx_loaiDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_loaiDonActionPerformed(evt);
            }
        });

        lbl_loaiDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_loaiDon.setForeground(new java.awt.Color(21, 110, 71));
        lbl_loaiDon.setText("ĐƠN ĐÃ DUYỆT");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_quocTich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_CCCDNguoiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_hoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(tf_quanHe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_CCCDCha, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(tf_noiDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_loaiDon)
                                .addGap(637, 637, 637)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_CCCDMe, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbx_loaiDon, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217)
                                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tf_quocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_CCCDCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_CCCDMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_CCCDNguoiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_quanHe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbx_loaiDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_loaiDon)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinCongDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinCongDanMouseClicked
        model = (DefaultTableModel) tbl_thongTinCongDan.getModel();
        tf_maKhaiSinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 0).toString());
        tf_hoTen.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 1).toString());
        tf_gioiTinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 2).toString());
        tf_ngaySinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 3).toString());
        tf_danToc.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 4).toString());
        tf_quocTich.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 5).toString());
        tf_noiSinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 6).toString());
        tf_queQuan.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 7).toString());
        tf_CCCDCha.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 8).toString());
        tf_CCCDMe.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 9).toString());
        tf_CCCDNguoiDangKy.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 10).toString());
        tf_quanHe.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 11).toString());
        tf_ngayDangKy.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 12).toString());
        tf_noiDangKy.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 13).toString());


    }//GEN-LAST:event_tbl_thongTinCongDanMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed

        int selectedRow = tbl_thongTinCongDan.getSelectedRow();
        if (tbl_thongTinCongDan.getRowCount() <= 0 ) {
            JOptionPane dialog = new JOptionPane("Không có đơn cần xóa!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }else if (selectedRow < 0) {
            JOptionPane dialog = new JOptionPane("Please Choose One Row!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow >= 0) {
            JPanel myPanel = new JPanel();
            int confirm = JOptionPane.showConfirmDialog(myPanel, "Are you sure you want to delete this information?", "", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String id = (String) tbl_thongTinCongDan.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    //listKhaiSinh.remove(selectedRow);
                    if (new KhaiSinhServiceImpl().delete(id)) {
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
        if(tbl_thongTinCongDan.getRowCount() <= 0 ){
            JOptionPane dialog = new JOptionPane("Không có đơn cần duyệt!", JOptionPane.INFORMATION_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
        } else {
            if (tbl_thongTinCongDan.getSelectedRow() >= 0) {
                if (tf_noiDangKy.getText().equals("") || tf_quocTich.getText().equals("") || tf_hoTen.getText().equals("") || tf_CCCDNguoiDangKy.getText().equals("") || tf_quanHe.getText().equals("") || tf_queQuan.getText().equals("") || tf_CCCDCha.getText().equals("") || tf_CCCDMe.getText().equals("") || tf_danToc.getText().equals("") || tf_gioiTinh.getText().equals("") || tf_ngayDangKy.getText().equals("") || tf_noiSinh.getText().equals("")) {
                    JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDCha.getText()) == false) || (!isValidCCCD(tf_CCCDCha.getText().trim()))) {
                    JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }

                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDMe.getText()) == false) || (!isValidCCCD(tf_CCCDMe.getText().trim()))) {
                    JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDNguoiDangKy.getText()) == false) || (!isValidCCCD(tf_CCCDNguoiDangKy.getText().trim()))) {
                    JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }

                KhaiSinhModel khaiSinh = khaiSinhService.findOneChuaDuyet(tf_maKhaiSinh.getText().trim());
                khaiSinh.setMaKS(tf_maKhaiSinh.getText().trim());
                khaiSinh.setQuocTich(tf_quocTich.getText().trim());
                khaiSinh.setHoTenKS(tf_hoTen.getText());
                khaiSinh.setNguoiKhaiSinh(tf_CCCDNguoiDangKy.getText().trim());
                khaiSinh.setGioiTinh(tf_gioiTinh.getText());
                khaiSinh.setNoiSinh(tf_noiSinh.getText());
                khaiSinh.setQueQuan(tf_queQuan.getText());
                khaiSinh.setCha(tf_CCCDCha.getText().trim());
                khaiSinh.setMe(tf_CCCDMe.getText().trim());
                khaiSinh.setQuanHe(tf_quanHe.getText());
                khaiSinh.setDanToc(tf_danToc.getText());
                khaiSinh.setNoiDk(tf_noiDangKy.getText());
                khaiSinh.setTrangThai(1);
                try {
                    if (isDateValid(tf_ngayDangKy.getText().trim())) {
                        Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDangKy.getText().trim());
                        java.sql.Date sqlDate;
                        sqlDate = new java.sql.Date(utilDate.getTime());
                        khaiSinh.setNgayDk(sqlDate);
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
                        khaiSinh.setNgaySinh(sqlDate);
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

                listKhaiSinh.add(khaiSinh);

                if (new KhaiSinhDAOImpl().update(khaiSinh)) {
                    if(listChuaDuyet.contains(khaiSinh)){
                        listChuaDuyet.remove(khaiSinh);
                    }
                    model.removeRow(tbl_thongTinCongDan.getSelectedRow());
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

            }else if(tbl_thongTinCongDan.getSelectedRowCount() < 0 ){
                    JOptionPane dialog = new JOptionPane("Không có đơn chưa duyệt!", JOptionPane.INFORMATION_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
                    }
            if (cbx_loaiDon.getSelectedIndex() == 0) {
                showResult();
                clear();
                disableTextField();
            } else {
                //listChuaDuyet.remove(khaiSinh);
                
                //showTableChuaDuyet();
            }
        }

    }//GEN-LAST:event_btn_luuThemActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (cbx_loaiDon.getSelectedIndex() == 1) {
            JOptionPane dialog = new JOptionPane("Đơn chưa duyệt không thể chỉnh sửa!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (tbl_thongTinCongDan.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Please choose one row!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_quocTich.setEditable(true);
            tf_hoTen.setEditable(true);
            tf_gioiTinh.setEditable(true);
            tf_ngaySinh.setEditable(true);
            tf_noiSinh.setEditable(true);
            tf_quanHe.setEditable(true);
            tf_CCCDNguoiDangKy.setEditable(true);
            tf_queQuan.setEditable(true);
            tf_CCCDCha.setEditable(true);
            tf_danToc.setEditable(true);
            tf_ngayDangKy.setEditable(true);
            tf_CCCDMe.setEditable(true);
            tf_noiDangKy.setEditable(true);
        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
        try {
            int selectedRow = tbl_thongTinCongDan.getSelectedRow();
            if (cbx_loaiDon.getSelectedIndex() == 1) {
                JOptionPane dialog = new JOptionPane("Đơn chưa duyệt không thể chỉnh sửa!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }
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
                if (tf_noiDangKy.getText().equals("") || tf_quocTich.getText().equals("") || tf_hoTen.getText().equals("") || tf_CCCDNguoiDangKy.getText().equals("") || tf_quanHe.getText().equals("") || tf_queQuan.getText().equals("") || tf_CCCDCha.getText().equals("") || tf_CCCDMe.getText().equals("") || tf_danToc.getText().equals("") || tf_gioiTinh.getText().equals("") || tf_ngayDangKy.getText().equals("") || tf_noiSinh.getText().equals("")) {
                    JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDCha.getText()) == false)|| (!isValidCCCD(tf_CCCDCha.getText().trim())) ) {
                    JOptionPane dialog = new JOptionPane("Số CCCD cha không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }

                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDMe.getText()) == false) || (!isValidCCCD(tf_CCCDMe.getText().trim()))) {
                    JOptionPane dialog = new JOptionPane("Số CCCD mẹ không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDNguoiDangKy.getText()) == false) || (!isValidCCCD(tf_CCCDNguoiDangKy.getText().trim()))) {
                    JOptionPane dialog = new JOptionPane("Số CCCD người đăng ký không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                KhaiSinhModel khaiSinh = new KhaiSinhModel();
                khaiSinh = khaiSinhService.findOne(tf_maKhaiSinh.getText().trim());
                khaiSinh.setQuocTich(tf_quocTich.getText().trim());
                khaiSinh.setHoTenKS(tf_hoTen.getText());
                khaiSinh.setNguoiKhaiSinh(tf_CCCDNguoiDangKy.getText().trim());
                
                khaiSinh.setNoiSinh(tf_noiSinh.getText());
                khaiSinh.setQueQuan(tf_queQuan.getText());
                khaiSinh.setCha(tf_CCCDCha.getText().trim());
                khaiSinh.setMe(tf_CCCDMe.getText().trim());
                khaiSinh.setQuanHe(tf_quanHe.getText());
                khaiSinh.setDanToc(tf_danToc.getText());
                khaiSinh.setNoiDk(tf_noiDangKy.getText());
                khaiSinh.setTrangThai(1);
                
                if(tf_gioiTinh.getText().trim().equals("Nam") || tf_gioiTinh.getText().trim().equals("nam")){
                    khaiSinh.setGioiTinh(tf_gioiTinh.getText());
                }else if(tf_gioiTinh.getText().trim().equals("Nữ") || tf_gioiTinh.getText().trim().equals("Nu") || tf_gioiTinh.getText().trim().equals("nu") || tf_gioiTinh.getText().trim().equals("nữ")){
                    khaiSinh.setGioiTinh(tf_gioiTinh.getText());
                }else{
                    JOptionPane dialog = new JOptionPane("Giới tính nam hoặc nữ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                try {
                    if (isDateValid(tf_ngayDangKy.getText().trim())) {
                        Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayDangKy.getText().trim());
                        java.sql.Date sqlDate;
                        sqlDate = new java.sql.Date(utilDate.getTime());
                        khaiSinh.setNgayDk(sqlDate);
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
                        khaiSinh.setNgaySinh(sqlDate);
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

                String ngayDangKy = sdf.format(sql);
                if (new KhaiSinhServiceImpl().update(khaiSinh)) {
                    JOptionPane dialog = new JOptionPane("Update success!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_hoTen.getText(), selectedRow, 1);
                    model.setValueAt(tf_gioiTinh.getText(), selectedRow, 2);
                    model.setValueAt(ngaySinh, selectedRow, 3);
                    model.setValueAt(tf_danToc.getText(), selectedRow, 4);
                    model.setValueAt(tf_quocTich.getText(), selectedRow, 5);
                    model.setValueAt(tf_noiSinh.getText(), selectedRow, 6);
                    model.setValueAt(tf_queQuan.getText(), selectedRow, 7);
                    model.setValueAt(tf_CCCDCha.getText(), selectedRow, 8);
                    model.setValueAt(tf_CCCDMe.getText(), selectedRow, 9);
                    model.setValueAt(tf_CCCDNguoiDangKy.getText(), selectedRow, 10);
                    model.setValueAt(tf_quanHe.getText(), selectedRow, 11);
                    model.setValueAt(ngayDangKy, selectedRow, 12);
                    model.setValueAt(tf_noiDangKy.getText(), selectedRow, 13);
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

    private void cbx_loaiDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_loaiDonActionPerformed
        if (cbx_loaiDon.getSelectedIndex() == 0) {
            lbl_loaiDon.setText("ĐƠN ĐÃ DUYỆT");
            showTable();
            btn_luuThem.setVisible(false);
        } else {
            listChuaDuyet = khaiSinhService.findAllChuaDuyet();
            if (listChuaDuyet == null) {
                JOptionPane dialog = new JOptionPane("Không có đơn cần duyệt!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }
            lbl_loaiDon.setText("ĐƠN CHƯA DUYỆT");
            model.setRowCount(0);

            showTableChuaDuyet();
            btn_luuThem.setVisible(true);
        }
    }//GEN-LAST:event_cbx_loaiDonActionPerformed
    public void showResult() {
        model = new DefaultTableModel();
        listKhaiSinh = khaiSinhService.findAll();
        KhaiSinhModel khaiSinh = listKhaiSinh.get(listKhaiSinh.size() - 1);
        model.setRowCount(0);
        model.fireTableDataChanged();
        model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});
    }

    private void clear() {
        tf_quocTich.setText("");
        tf_hoTen.setText("");
        tf_ngaySinh.setText("");
        tf_gioiTinh.setText("");
        tf_ngayDangKy.setText("");
        tf_noiSinh.setText("");
        tf_quanHe.setText("");
        tf_CCCDNguoiDangKy.setText("");
        tf_queQuan.setText("");
        tf_maKhaiSinh.setText("");
        tf_CCCDCha.setText("");
        tf_CCCDMe.setText("");
        tf_danToc.setText("");
        tf_noiDangKy.setText("");
    }

    private void disableTextField() {
        tf_quocTich.setEditable(false);
        tf_hoTen.setEditable(false);
        tf_gioiTinh.setEditable(false);
        tf_ngaySinh.setEditable(false);
        tf_noiSinh.setEditable(false);
        tf_quanHe.setEditable(false);
        tf_CCCDNguoiDangKy.setEditable(false);
        tf_queQuan.setEditable(false);
        tf_CCCDCha.setEditable(false);
        tf_CCCDMe.setEditable(false);
        tf_noiDangKy.setEditable(false);
        tf_danToc.setEditable(false);
        tf_ngayDangKy.setEditable(false);
        tf_maKhaiSinh.setEditable(false);
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

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button btn_luuSua;
    private Swing.Button btn_luuThem;
    private Swing.Button btn_sua;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private Swing.Combobox cbx_loaiDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_loaiDon;
    private Swing.TableDark tbl_thongTinCongDan;
    private Swing.TextField tf_CCCDCha;
    private Swing.TextField tf_CCCDMe;
    private Swing.TextField tf_CCCDNguoiDangKy;
    private Swing.TextField tf_danToc;
    private Swing.TextField tf_gioiTinh;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_maKhaiSinh;
    private Swing.TextField tf_ngayDangKy;
    private Swing.TextField tf_ngayDangKy1;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_noiDangKy;
    private Swing.TextField tf_noiSinh;
    private Swing.TextField tf_quanHe;
    private Swing.TextField tf_queQuan;
    private Swing.TextField tf_quocTich;
    // End of variables declaration//GEN-END:variables

}
