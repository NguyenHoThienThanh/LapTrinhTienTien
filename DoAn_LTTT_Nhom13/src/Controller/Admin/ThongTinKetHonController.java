package Controller.Admin;

import InterfaceService.IChungNhanKetHonService;
import Models.ChungNhanKetHonModel;
import Models.CongDanModel;
import Models.ThongTinCaNhan;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.ChungNhanKetHonServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import ServiceImplement.LyHonServiceImpl;
import Swing.TextField;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
        btn_loadData = new button.MyButton();
        btn_loadData1 = new button.MyButton();
        btn_xuatDanhSach = new Swing.Button();

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

        btn_loadData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/icons8-upload-10.png"))); // NOI18N
        btn_loadData.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_loadData.setRadius(50);
        btn_loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDataActionPerformed(evt);
            }
        });

        btn_loadData1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/icons8-upload-10.png"))); // NOI18N
        btn_loadData1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_loadData1.setRadius(50);
        btn_loadData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadData1ActionPerformed(evt);
            }
        });

        btn_xuatDanhSach.setBackground(new java.awt.Color(18, 99, 63));
        btn_xuatDanhSach.setForeground(new java.awt.Color(255, 255, 255));
        btn_xuatDanhSach.setText("Xuất danh sách");
        btn_xuatDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatDanhSachActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_noiOChong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_noiOVo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_maKetHon, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_hoTenVo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_CCCDVo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_hoTenChong, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_CCCDChong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_loadData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_quocTichVo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_quocTichChong, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ngaySinhChong, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_danTocChong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_hoTenVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_maKetHon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_CCCDVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_noiOVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_hoTenChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_CCCDChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_loadData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_quocTichVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_quocTichChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ngaySinhChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_danTocChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_noiOChong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
        tbl_thongTinKetHon.clearSelection();
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
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (selectedRow >= 0) {
            JPanel myPanel = new JPanel();
            int confirm = JOptionPane.showConfirmDialog(myPanel, "Bạn có chắc chắn muốn xóa không?", "", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String id = (String) tbl_thongTinKetHon.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    //listKetHon.remove(selectedRow);
                    if (new ChungNhanKetHonServiceImpl().delete(id)) {
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
        if (ketHonService.ifExists(tf_CCCDChong.getText().trim(), tf_CCCDVo.getText().trim()) != 0) {
            JOptionPane dialog = new JOptionPane("Công dân này đã kết hôn!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
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
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
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
                    JOptionPane dialog = new JOptionPane("Sửa thành công!", JOptionPane.INFORMATION_MESSAGE);
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
//        tf_noiOVo.setEditable(true);
//        tf_hoTenVo.setEditable(true);
//        tf_quocTichVo.setEditable(true);
//        tf_ngaySinh.setEditable(true);
//        tf_hoTenChong.setEditable(true);
//        tf_noiOChong.setEditable(true);
//        tf_quocTichChong.setEditable(true);
//        tf_CCCDChong.setEditable(true);
//        tf_danToc.setEditable(true);
        tf_ngayDangKy.setEditable(true);
//        tf_CCCDVo.setEditable(true);
        tf_noiDangKy.setEditable(true);
//        tf_danTocChong.setEditable(true);
//        tf_ngaySinhChong.setEditable(true);
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDataActionPerformed

        try {
            if (new CongDanServiceImpl().checkCCCDExist(tf_CCCDVo.getText().trim())) {
                ThongTinCaNhan ttcn = new CongDanServiceImpl().findOneByCCCD(tf_CCCDVo.getText().trim());
                
                if (!ttcn.getGioiTinh().equals("Nữ") || !ttcn.getGioiTinh().equals("Nu")) {
                    JOptionPane dialog = new JOptionPane("Vui lòng nhập CCCD của vợ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                tf_danToc.setText(ttcn.getDanToc());
                tf_ngaySinh.setText(ttcn.getNgaySinh().toString());
                tf_quocTichVo.setText(ttcn.getQuocTich());
                tf_noiOVo.setText(ttcn.getDiaChi());
                tf_hoTenVo.setText(ttcn.getHoTen());

            }

        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Thông tin công dân không tồn tại!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_loadData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadData1ActionPerformed
        try {
            if (new CongDanServiceImpl().checkCCCDExist(tf_CCCDChong.getText().trim())) {
                ThongTinCaNhan ttcn = new CongDanServiceImpl().findOneByCCCD(tf_CCCDChong.getText().trim());
                 if (!ttcn.getGioiTinh().equals("Nam")) {
                    JOptionPane dialog = new JOptionPane("Vui lòng nhập CCCD của chồng!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                tf_danTocChong.setText(ttcn.getDanToc());
                tf_ngaySinhChong.setText(ttcn.getNgaySinh().toString());
                tf_quocTichChong.setText(ttcn.getQuocTich());
                tf_noiOChong.setText(ttcn.getDiaChi());
                tf_hoTenChong.setText(ttcn.getHoTen());

            }

        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Thông tin công dân không tồn tại!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }//GEN-LAST:event_btn_loadData1ActionPerformed

    private void btn_xuatDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatDanhSachActionPerformed
        if (tbl_thongTinKetHon.getRowCount() != 0) {
            String filePath = "D:\\DanhSachKetHon.xlsx";
            exportToExcel(filePath);
        } else {
            JOptionPane dialog = new JOptionPane("Bảng dữ liệu trống!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
    }//GEN-LAST:event_btn_xuatDanhSachActionPerformed
                                                
    private void exportToExcel(String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Danh sách kết hôn");

        Cell cell = null;
        XSSFRow roww = sheet.createRow(0);
        cell = roww.createCell(6, CellType.STRING);
        cell.setCellValue("DANH SÁCH KẾT HÔN");
        // Tiêu đề cột
        Row headerRow = sheet.createRow(2);
        headerRow.createCell(0).setCellValue("Mã kết hôn");
        headerRow.createCell(1).setCellValue("CCCD vợ");
        headerRow.createCell(2).setCellValue("Họ tên vợ");
        headerRow.createCell(3).setCellValue("Ngày sinh vợ");
        headerRow.createCell(4).setCellValue("Dân tộc vợ");
        headerRow.createCell(5).setCellValue("Quốc tịch vợ");
        headerRow.createCell(6).setCellValue("Nơi cư trú vợ");
        headerRow.createCell(7).setCellValue("CCCD chồng");
        headerRow.createCell(8).setCellValue("Họ tên chồng");
        headerRow.createCell(9).setCellValue("Ngày sinh chồng");
        headerRow.createCell(10).setCellValue("Dân tộc chồng");
        headerRow.createCell(11).setCellValue("Quốc tịch chồng");
        headerRow.createCell(12).setCellValue("Nơi cư trú chồng");
        headerRow.createCell(13).setCellValue("Ngày đăng ký");
        headerRow.createCell(14).setCellValue("Nơi đăng ký");

        int sttCounter = 1;
        // Dữ liệu
        for (int i = 0; i < tbl_thongTinKetHon.getRowCount(); i++) {
            Row row = sheet.createRow(i + 3);
            row.createCell(0).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 0));           
            row.createCell(1).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 1)); 
            row.createCell(2).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 2));
            
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(tbl_thongTinKetHon.getValueAt(i, 3).toString());

            row.createCell(4).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 4));           
            row.createCell(5).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 5)); 
            row.createCell(6).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 6));
            row.createCell(7).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 7));
            row.createCell(8).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 8));

            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue(tbl_thongTinKetHon.getValueAt(i, 9).toString());
            
            row.createCell(10).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 10));
            row.createCell(11).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 11));
            row.createCell(12).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 12));
            
            cell = row.createCell(13, CellType.STRING);
            cell.setCellValue(tbl_thongTinKetHon.getValueAt(i, 13).toString());
            
            row.createCell(14).setCellValue((String) tbl_thongTinKetHon.getValueAt(i, 14));
        }

        // Tự động điều chỉnh độ rộng cột
        for (int i = 0; i < tbl_thongTinKetHon.getColumnCount(); i++) {
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
        tf_danToc.setEditable(false);
        tf_ngayDangKy.setEditable(false);
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
    private button.MyButton btn_loadData;
    private button.MyButton btn_loadData1;
    private Swing.Button btn_luuSua;
    private Swing.Button btn_luuThem;
    private Swing.Button btn_sua;
    private Swing.Button btn_them;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private Swing.Button btn_xuatDanhSach;
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
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_ngaySinhChong;
    private Swing.TextField tf_noiDangKy;
    private Swing.TextField tf_noiOChong;
    private Swing.TextField tf_noiOVo;
    private Swing.TextField tf_quocTichChong;
    private Swing.TextField tf_quocTichVo;
    // End of variables declaration//GEN-END:variables

}
