package Controller.Admin;

import DAOImplement.KhaiSinhDAOImpl;
import InterfaceService.IKhaiSinhService;
import Models.KhaiSinhModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import java.awt.event.KeyEvent;
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
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThongTinKhaiSinhController extends javax.swing.JPanel {

    DefaultTableModel model;
    List<KhaiSinhModel> listKhaiSinh;
    List<KhaiSinhModel> listChuaDuyet;
    IKhaiSinhService khaiSinhService = new KhaiSinhServiceImpl();

    public ThongTinKhaiSinhController() {
        initComponents();
        tbl_thongTinKhaiSinh.fixTable(jScrollPane2);
        listKhaiSinh = khaiSinhService.findAll();
        model = (DefaultTableModel) tbl_thongTinKhaiSinh.getModel();
        showTable();
        disableTextField();

    }

    private void showTable() {
        for (KhaiSinhModel khaiSinh : listKhaiSinh) {
            model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tf_hoTen = new Swing.TextField();
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
        tbl_thongTinKhaiSinh = new Swing.TableDark();
        btn_luuSua = new Swing.Button();
        btn_luuThem = new Swing.Button();
        tf_danToc = new Swing.TextField();
        tf_CCCDMe = new Swing.TextField();
        tf_ngayDangKy = new Swing.TextField();
        tf_noiDangKy = new Swing.TextField();
        btn_themThongTin = new Swing.Button();
        cbx_gioiTinh = new Swing.Combobox();
        btn_xuatDanhSach = new Swing.Button();
        cbx_filter = new Swing.Combobox();
        rd_nu = new javax.swing.JRadioButton();
        rd_nam = new javax.swing.JRadioButton();
        tf_filterQueQuan = new Swing.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tf_hoTen.setLabelText("Họ và tên");

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

        tbl_thongTinKhaiSinh.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_thongTinKhaiSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinKhaiSinhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinKhaiSinh);
        if (tbl_thongTinKhaiSinh.getColumnModel().getColumnCount() > 0) {
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(0).setHeaderValue("Mã Khai Sinh");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(1).setHeaderValue("Họ Tên");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(2).setHeaderValue("Giới Tính");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(3).setPreferredWidth(60);
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(3).setHeaderValue("Ngày Sinh");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(4).setHeaderValue("Dân tộc");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(5).setHeaderValue("Quốc Tịch");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(6).setHeaderValue("Nơi Sinh");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(7).setHeaderValue("Quê Quán");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(8).setHeaderValue("CCCD Cha");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(9).setHeaderValue("CCCD Mẹ");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(10).setHeaderValue("CCCD Người Đăng Ký");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(11).setHeaderValue("Quan Hệ");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(12).setHeaderValue("Ngày Đăng Ký");
            tbl_thongTinKhaiSinh.getColumnModel().getColumn(13).setHeaderValue("Nơi Đăng Ký");
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

        tf_danToc.setLabelText("Dân tộc");

        tf_CCCDMe.setLabelText("Số CCCD mẹ");

        tf_ngayDangKy.setLabelText("Ngày đăng ký");

        tf_noiDangKy.setLabelText("Nơi đăng ký");

        btn_themThongTin.setBackground(new java.awt.Color(18, 99, 63));
        btn_themThongTin.setForeground(new java.awt.Color(255, 255, 255));
        btn_themThongTin.setText("Thêm thông tin");
        btn_themThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themThongTinActionPerformed(evt);
            }
        });

        cbx_gioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
        cbx_gioiTinh.setSelectedIndex(-1);
        cbx_gioiTinh.setLabeText("Giới tính");
        cbx_gioiTinh.setLineColor(new java.awt.Color(21, 110, 71));

        btn_xuatDanhSach.setBackground(new java.awt.Color(18, 99, 63));
        btn_xuatDanhSach.setForeground(new java.awt.Color(255, 255, 255));
        btn_xuatDanhSach.setText("Xuất danh sách");
        btn_xuatDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatDanhSachActionPerformed(evt);
            }
        });

        cbx_filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Giới tính", "Quê quán" }));
        cbx_filter.setLabeText("");
        cbx_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_filterActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_nu);
        rd_nu.setText("Nữ");
        rd_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_nuActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_nam);
        rd_nam.setText("Nam");
        rd_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_namActionPerformed(evt);
            }
        });

        tf_filterQueQuan.setLabelText("Quê quán");
        tf_filterQueQuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_filterQueQuanKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_CCCDNguoiDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_quocTich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_hoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_quanHe, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_queQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbx_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_CCCDCha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_noiDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(tf_ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_CCCDMe, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(tf_danToc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_filterQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(rd_nu)
                                .addGap(18, 18, 18)
                                .addComponent(rd_nam)
                                .addGap(50, 50, 50)
                                .addComponent(cbx_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_themThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_quocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_CCCDNguoiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbx_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_CCCDCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_CCCDMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(tf_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_quanHe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ngayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_noiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rd_nu)
                        .addComponent(rd_nam)
                        .addComponent(tf_filterQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_themThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
        tbl_thongTinKhaiSinh.clearSelection();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinKhaiSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinKhaiSinhMouseClicked
        model = (DefaultTableModel) tbl_thongTinKhaiSinh.getModel();
        tf_maKhaiSinh.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 0).toString());
        tf_hoTen.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 1).toString());
        cbx_gioiTinh.setSelectedItem(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 2).toString());
        tf_ngaySinh.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 3).toString());
        tf_danToc.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 4).toString());
        tf_quocTich.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 5).toString());
        tf_noiSinh.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 6).toString());
        tf_queQuan.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 7).toString());
        tf_CCCDCha.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 8).toString());
        tf_CCCDMe.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 9).toString());
        tf_CCCDNguoiDangKy.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 10).toString());
        tf_quanHe.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 11).toString());
        tf_ngayDangKy.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 12).toString());
        tf_noiDangKy.setText(model.getValueAt(tbl_thongTinKhaiSinh.getSelectedRow(), 13).toString());


    }//GEN-LAST:event_tbl_thongTinKhaiSinhMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed

        int selectedRow = tbl_thongTinKhaiSinh.getSelectedRow();
        if (tbl_thongTinKhaiSinh.getRowCount() <= 0) {
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
            int confirm = JOptionPane.showConfirmDialog(myPanel, "Bạn có chắc chắn muốn xóa không", "", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String id = (String) tbl_thongTinKhaiSinh.getValueAt(selectedRow, 0);
                    model.removeRow(selectedRow);
                    //listKhaiSinh.remove(selectedRow);
                    if (new KhaiSinhServiceImpl().delete(id)) {
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

        try {
            if (tf_noiDangKy.getText().equals("") || tf_quocTich.getText().equals("") || tf_hoTen.getText().equals("") || tf_CCCDNguoiDangKy.getText().equals("") || tf_quanHe.getText().equals("") || tf_queQuan.getText().equals("") || tf_CCCDCha.getText().equals("") || tf_CCCDMe.getText().equals("") || tf_danToc.getText().equals("") || tf_ngayDangKy.getText().equals("") || tf_noiSinh.getText().equals("")) {
                JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }
            if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDCha.getText()) == false) || (!isValidCCCD(tf_CCCDCha.getText().trim()))) {
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
                JOptionPane dialog = new JOptionPane("Số CCCD không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                JDialog jDialog = dialog.createDialog(null);
                jDialog.setModal(true);
                jDialog.setVisible(true);
                return;
            }

            KhaiSinhModel khaiSinh = new KhaiSinhModel();
            khaiSinh.setMaKS(tf_maKhaiSinh.getText().trim());
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

            if (cbx_gioiTinh.getSelectedIndex() == 0) {
                khaiSinh.setGioiTinh((String) cbx_gioiTinh.getSelectedItem());
            } else if (cbx_gioiTinh.getSelectedIndex() == 1) {
                khaiSinh.setGioiTinh((String) cbx_gioiTinh.getSelectedItem());
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

            listKhaiSinh.add(khaiSinh);

            if (new KhaiSinhDAOImpl().update(khaiSinh)) {
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

        } catch(Exception e){
                e.printStackTrace();
        }
        showResult();
        clear();
        disableTextField();


    }//GEN-LAST:event_btn_luuThemActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed

        if (tbl_thongTinKhaiSinh.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_quocTich.setEditable(true);
            tf_hoTen.setEditable(true);
            cbx_gioiTinh.setEnabled(true);
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
            int selectedRow = tbl_thongTinKhaiSinh.getSelectedRow();

            if (tbl_thongTinKhaiSinh.getRowCount() <= 0) {
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
                if (tf_noiDangKy.getText().equals("") || tf_quocTich.getText().equals("") || tf_hoTen.getText().equals("") || tf_CCCDNguoiDangKy.getText().equals("") || tf_quanHe.getText().equals("") || tf_queQuan.getText().equals("") || tf_CCCDCha.getText().equals("") || tf_CCCDMe.getText().equals("") || tf_danToc.getText().equals("") || tf_ngayDangKy.getText().equals("") || tf_noiSinh.getText().equals("")) {
                    JOptionPane dialog = new JOptionPane("Hãy nhập đầy đủ thông tin!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }
                if ((new CongDanServiceImpl().checkCCCDExist(tf_CCCDCha.getText()) == false) || (!isValidCCCD(tf_CCCDCha.getText().trim()))) {
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
                if (cbx_gioiTinh.getSelectedIndex() == -1) {
                    JOptionPane dialog = new JOptionPane("Vui lòng chọn giới tính!", JOptionPane.WARNING_MESSAGE);
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

                if (cbx_gioiTinh.getSelectedIndex() == 0) {
                    khaiSinh.setGioiTinh((String) cbx_gioiTinh.getSelectedItem());
                } else if (cbx_gioiTinh.getSelectedIndex() == 1) {
                    khaiSinh.setGioiTinh((String) cbx_gioiTinh.getSelectedItem());
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
                    JOptionPane dialog = new JOptionPane("Sửa thành công!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_hoTen.getText(), selectedRow, 1);
                    model.setValueAt((String) cbx_gioiTinh.getSelectedItem(), selectedRow, 2);
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
                    JOptionPane dialog = new JOptionPane("Sửa thất bại!", JOptionPane.INFORMATION_MESSAGE);
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

    private void btn_themThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themThongTinActionPerformed
        tf_quocTich.setEditable(true);
        tf_hoTen.setEditable(true);
        cbx_gioiTinh.setEnabled(true);
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
    }//GEN-LAST:event_btn_themThongTinActionPerformed

    private void btn_xuatDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatDanhSachActionPerformed
        if (tbl_thongTinKhaiSinh.getRowCount() != 0) {
            String filePath = "D:\\DanhSachKhaiSinh.xlsx";
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
        XSSFSheet sheet = workbook.createSheet("Danh sách khai sinh");

        Cell cell = null;
        XSSFRow roww = sheet.createRow(0);
        cell = roww.createCell(5, CellType.STRING);
        cell.setCellValue("DANH SÁCH KHAI SINH");

        // Tiêu đề cột
        Row headerRow = sheet.createRow(2);
        headerRow.createCell(0).setCellValue("STT");
        headerRow.createCell(1).setCellValue("Mã Khai Sinh");
        headerRow.createCell(2).setCellValue("Họ Tên");
        headerRow.createCell(3).setCellValue("Giới Tính");
        headerRow.createCell(4).setCellValue("Ngày Sinh");
        headerRow.createCell(5).setCellValue("Dân Tộc");
        headerRow.createCell(6).setCellValue("Quốc Tịch");
        headerRow.createCell(7).setCellValue("Nơi Sinh");
        headerRow.createCell(8).setCellValue("Quê Quán");
        headerRow.createCell(9).setCellValue("Số CCCD Cha");
        headerRow.createCell(10).setCellValue("Số CCCD Mẹ");
        headerRow.createCell(11).setCellValue("Số CCCD Người Đăng Ký");
        headerRow.createCell(12).setCellValue("Quan Hệ");
        headerRow.createCell(13).setCellValue("Ngày Đăng Ký");
        headerRow.createCell(14).setCellValue("Nơi Đăng Ký");

        int sttCounter = 1;
        // Dữ liệu
        for (int i = 0; i < tbl_thongTinKhaiSinh.getRowCount(); i++) {
            Row row = sheet.createRow(i + 3);
            row.createCell(0).setCellValue(sttCounter++);
            row.createCell(1).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 0));
            row.createCell(2).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 1));
            row.createCell(3).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 2));

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(tbl_thongTinKhaiSinh.getValueAt(i, 3).toString());

            row.createCell(5).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 4));
            row.createCell(6).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 5));
            row.createCell(7).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 6));
            row.createCell(8).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 7));
            row.createCell(9).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 8));
            row.createCell(10).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 9));
            row.createCell(11).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 10));
            row.createCell(12).setCellValue((String) tbl_thongTinKhaiSinh.getValueAt(i, 11));
            cell = row.createCell(13, CellType.STRING);
            cell.setCellValue(tbl_thongTinKhaiSinh.getValueAt(i, 12).toString());
            cell = row.createCell(14, CellType.STRING);
            cell.setCellValue(tbl_thongTinKhaiSinh.getValueAt(i, 13).toString());

        }

        // Tự động điều chỉnh độ rộng cột
        for (int i = 0; i < tbl_thongTinKhaiSinh.getColumnCount(); i++) {
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(5, 3000);
            sheet.setColumnWidth(14, 5000);
        }
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Xuất dữ liệu ra file Excel thành công");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất dữ liệu ra file Excel");
        }
    }

    private void cbx_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_filterActionPerformed
        tf_filterQueQuan.setText("");
        if (cbx_filter.getSelectedIndex() == 0) {
            rd_nam.setVisible(false);
            rd_nu.setVisible(false);
            clearRadio();
            model.setRowCount(0);
            showTable();

        } else if (cbx_filter.getSelectedIndex() == 1) {
            rd_nam.setVisible(true);
            rd_nu.setVisible(true);
            tf_filterQueQuan.setVisible(false);

        } else if (cbx_filter.getSelectedIndex() == 2) {
            tf_filterQueQuan.setVisible(true);
            rd_nam.setVisible(false);
            rd_nu.setVisible(false);

        }

    }//GEN-LAST:event_cbx_filterActionPerformed

    private void rd_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_nuActionPerformed
        if (cbx_filter.getSelectedIndex() == 1) {
            if (rd_nu.isSelected()) {
                model.setRowCount(0);
                List<KhaiSinhModel> list = new KhaiSinhServiceImpl().filterByGender("Nữ");
                model.fireTableDataChanged();
                for (KhaiSinhModel khaiSinh : list) {
                    model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});

                }

            }
        }
    }//GEN-LAST:event_rd_nuActionPerformed

    private void rd_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_namActionPerformed
        if (cbx_filter.getSelectedIndex() == 1) {
            if (rd_nam.isSelected()) {
                model.setRowCount(0);
                List<KhaiSinhModel> list = new KhaiSinhServiceImpl().filterByGender("Nam");
                model.fireTableDataChanged();
                for (KhaiSinhModel khaiSinh : list) {
                    model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});
                }
            }
        }
    }//GEN-LAST:event_rd_namActionPerformed

    private void tf_filterQueQuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_filterQueQuanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            model.setRowCount(0);
            List<KhaiSinhModel> list = new KhaiSinhServiceImpl().filterByHomeTown(tf_filterQueQuan.getText().toString());
            for (KhaiSinhModel khaiSinh : list) {
                model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});
            }
        }
    }//GEN-LAST:event_tf_filterQueQuanKeyPressed
    public void showResult() {
        model = new DefaultTableModel();
        listKhaiSinh = khaiSinhService.findAll();
        KhaiSinhModel khaiSinh = listKhaiSinh.get(listKhaiSinh.size() - 1);
        model.setRowCount(0);
        model.fireTableDataChanged();
        model.addRow(new Object[]{khaiSinh.getMaKS(), khaiSinh.getHoTenKS(), khaiSinh.getGioiTinh(), khaiSinh.getNgaySinh(), khaiSinh.getDanToc(), khaiSinh.getQuocTich(), khaiSinh.getNoiSinh(), khaiSinh.getQueQuan(), khaiSinh.getCha(), khaiSinh.getMe(), khaiSinh.getNguoiKhaiSinh(), khaiSinh.getQuanHe(), khaiSinh.getNgayDk(), khaiSinh.getNoiDk()});
    }

    private void clearRadio() {
        buttonGroup1.clearSelection();
    }

    private void clear() {
        tf_quocTich.setText("");
        tf_hoTen.setText("");
        tf_ngaySinh.setText("");
        cbx_gioiTinh.setSelectedIndex(-1);
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
        cbx_gioiTinh.setEnabled(false);
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
        rd_nam.setVisible(false);
        rd_nu.setVisible(false);
        tf_filterQueQuan.setVisible(false);
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
    private Swing.Button btn_themThongTin;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private Swing.Button btn_xuatDanhSach;
    private javax.swing.ButtonGroup buttonGroup1;
    private Swing.Combobox cbx_filter;
    private Swing.Combobox cbx_gioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private Swing.TableDark tbl_thongTinKhaiSinh;
    private Swing.TextField tf_CCCDCha;
    private Swing.TextField tf_CCCDMe;
    private Swing.TextField tf_CCCDNguoiDangKy;
    private Swing.TextField tf_danToc;
    private Swing.TextField tf_filterQueQuan;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_maKhaiSinh;
    private Swing.TextField tf_ngayDangKy;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_noiDangKy;
    private Swing.TextField tf_noiSinh;
    private Swing.TextField tf_quanHe;
    private Swing.TextField tf_queQuan;
    private Swing.TextField tf_quocTich;
    // End of variables declaration//GEN-END:variables

}
