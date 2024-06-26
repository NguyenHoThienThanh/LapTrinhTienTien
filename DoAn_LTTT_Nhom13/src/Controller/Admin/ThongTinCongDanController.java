package Controller.Admin;

import DAO.ImageUtils;
import InterfaceService.ICongDanService;
import InterfaceService.IKhaiSinhService;
import Models.CongDanModel;
import Models.KhaiSinhModel;
import ServiceImplement.CongDanServiceImpl;
import ServiceImplement.KhaiSinhServiceImpl;
import Swing.TextField;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
        tbl_thongTinCongDan.setColumnAlignment(0, JLabel.CENTER);
        tbl_thongTinCongDan.setCellAlignment(0, JLabel.CENTER);
        tbl_thongTinCongDan.setColumnAlignment(1, JLabel.CENTER);
        tbl_thongTinCongDan.setCellAlignment(1, JLabel.CENTER);
        tbl_thongTinCongDan.setColumnAlignment(5, JLabel.CENTER);
        tbl_thongTinCongDan.setCellAlignment(5, JLabel.CENTER);
        for (CongDanModel congDan : listCongDan) {
            model.addRow(new Object[]{congDan.getID(), congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail(), congDan.getHinhAnh()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        cbx_filter = new Swing.Combobox();
        rd_nu = new javax.swing.JRadioButton();
        rd_nam = new javax.swing.JRadioButton();
        btn_xuatDanhSach = new Swing.Button();
        tf_queQuan = new Swing.TextField();
        btn_chooseFile = new button.MyButton();
        picHinhAnh = new Swing.PictureBox();

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
                "STT", "Mã Khai Sinh", "Số CCCD", "Họ Tên", "Ngày Sinh", "Giới Tính", "Nơi Sinh", "Nơi Cấp CCCD", "Ngày Cấp CCCD", "Số Điện Thoại", "Email", "Hình Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thongTinCongDan.getTableHeader().setReorderingAllowed(false);
        tbl_thongTinCongDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thongTinCongDanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thongTinCongDan);
        if (tbl_thongTinCongDan.getColumnModel().getColumnCount() > 0) {
            tbl_thongTinCongDan.getColumnModel().getColumn(0).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_thongTinCongDan.getColumnModel().getColumn(1).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbl_thongTinCongDan.getColumnModel().getColumn(2).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(2).setPreferredWidth(90);
            tbl_thongTinCongDan.getColumnModel().getColumn(3).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(3).setPreferredWidth(90);
            tbl_thongTinCongDan.getColumnModel().getColumn(4).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbl_thongTinCongDan.getColumnModel().getColumn(5).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(6).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(7).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(8).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(9).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(10).setResizable(false);
            tbl_thongTinCongDan.getColumnModel().getColumn(11).setResizable(false);
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

        cbx_filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Giới tính", "Nơi sinh" }));
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

        btn_xuatDanhSach.setBackground(new java.awt.Color(18, 99, 63));
        btn_xuatDanhSach.setForeground(new java.awt.Color(255, 255, 255));
        btn_xuatDanhSach.setText("Xuất danh sách");
        btn_xuatDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatDanhSachActionPerformed(evt);
            }
        });

        tf_queQuan.setLabelText("Nơi sinh");
        tf_queQuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_queQuanKeyPressed(evt);
            }
        });

        btn_chooseFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/icons8-upload-10.png"))); // NOI18N
        btn_chooseFile.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_chooseFile.setRadius(50);
        btn_chooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooseFileActionPerformed(evt);
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
                        .addGap(25, 25, 25)
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
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(picHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_chooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(tf_soCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rd_nu)
                                                .addGap(28, 28, 28)
                                                .addComponent(rd_nam))
                                            .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(tf_queQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(211, 211, 211)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_loadData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_maKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_chooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(picHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_noiCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ngayCapCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_nu)
                    .addComponent(rd_nam)
                    .addComponent(btn_xuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_luuThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDuLieuActionPerformed
        clear();
        tbl_thongTinCongDan.clearSelection();
    }//GEN-LAST:event_btn_xoaDuLieuActionPerformed

    private void tbl_thongTinCongDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thongTinCongDanMouseClicked
        model = (DefaultTableModel) tbl_thongTinCongDan.getModel();
        tf_maKhaiSinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 1).toString());
        tf_soCCCD.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 2).toString());
        tf_hoTen.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 3).toString());
        tf_ngaySinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 4).toString());
        tf_gioiTinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 5).toString());
        tf_noiSinh.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 6).toString());
        tf_noiCapCCCD.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 7).toString());
        tf_ngayCapCCCD.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 8).toString());
        tf_soDienThoai.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 9).toString());
        tf_email.setText(model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 10).toString());

        byte[] imageData = (byte[]) model.getValueAt(tbl_thongTinCongDan.getSelectedRow(), 11);
        Image image = null;
        try {
            image = ImageIO.read(new ByteArrayInputStream(imageData));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (image != null) {
            ImageIcon icon = new ImageIcon(image);

            // Đặt ImageIcon vào JLabel
            picHinhAnh.setImage(icon);
            picHinhAnh.repaint(); // Cập nhật lại JLabel để hiển thị hình ảnh mới
        } else {
            // Đặt hình ảnh mặc định hoặc thông báo lỗi nếu hình ảnh không thể đọc được
            picHinhAnh.setImage(new ImageIcon(getClass().getResource("/Views/OtherForm/Image/error.png")));
        }
    }//GEN-LAST:event_tbl_thongTinCongDanMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed

        int selectedRow = tbl_thongTinCongDan.getSelectedRow();

        if (tbl_thongTinCongDan.getRowCount() <= 0) {
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
            int confirm = JOptionPane.showConfirmDialog(myPanel, "Bạn có chắc chắn muốn xóa?", "", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String id = (String) tbl_thongTinCongDan.getValueAt(selectedRow, 2);
                    model.removeRow(selectedRow);
                    //listCongDan.remove(selectedRow);
                    if (new CongDanServiceImpl().delete(id)) {
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
        if (tf_maKhaiSinh.getText().equals("") || tf_soCCCD.getText().equals("") || tf_hoTen.getText().equals("") || tf_noiCapCCCD.getText().equals("") || tf_ngayCapCCCD.getText().equals("") || tf_soDienThoai.getText().equals("") || tf_email.getText().equals("") || picHinhAnh.getImage() == null) {
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
            if (isDateValid(tf_ngayCapCCCD.getText().trim())) {
                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayCapCCCD.getText().trim());
                java.sql.Date sqlDate;
                sqlDate = new java.sql.Date(utilDate.getTime());
                congDan.setNgcCccd(sqlDate);
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
        byte[] hinhAnh = null;
        try {
            Icon icon = picHinhAnh.getImage();
            if (icon instanceof ImageIcon) {
                hinhAnh = ImageUtils.imageToByteArray((ImageIcon) icon);
            }
        } catch (Exception e) {
        }
        congDan.setHinhAnh(hinhAnh);
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
                byte[] imageData = (byte[]) congDan.getHinhAnh();
                Image image = null;
                try {
                    image = ImageIO.read(new ByteArrayInputStream(imageData));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (image != null) {
                    ImageIcon icon = new ImageIcon(image);
                    picHinhAnh.setImage(icon);
                    picHinhAnh.repaint();
                } else {
                    picHinhAnh.setImage(new ImageIcon(getClass().getResource("/Views/OtherForm/Image/error.png")));
                }
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
                picHinhAnh.setImage(null);
                picHinhAnh.setBackground(Color.WHITE);
                picHinhAnh.repaint();
            }

        } catch (Exception e) {
            JOptionPane dialog = new JOptionPane("Thông tin công dân không tồn tại!", JOptionPane.INFORMATION_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (tbl_thongTinCongDan.getSelectedRow() < 0) {
            JOptionPane dialog = new JOptionPane("Hãy chọn một hàng!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_noiCapCCCD.setEditable(true);
            tf_ngayCapCCCD.setEditable(true);
            tf_email.setEditable(true);
            tf_soDienThoai.setEditable(true);
            tf_maKhaiSinh.setEditable(false);
            tf_soCCCD.setEditable(false);
            btn_chooseFile.setVisible(true);
        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuSuaActionPerformed
        try {
            int selectedRow = tbl_thongTinCongDan.getSelectedRow();
            if (tbl_thongTinCongDan.getRowCount() <= 0) {
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
                CongDanModel congDan = congDanService.findOne(tf_soCCCD.getText());
                congDan.setHoTen(tf_hoTen.getText());

                if (isDateValid(tf_ngayCapCCCD.getText().trim())) {
                    Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayCapCCCD.getText());
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                    congDan.setNgcCccd(sqlDate);

                } else {
                    JOptionPane dialog = new JOptionPane("Lỗi định dạng ngày tháng năm!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                }

                congDan.setNcCccd(tf_noiCapCCCD.getText());
                if (!isValidPhoneNumber(tf_soDienThoai.getText())) {
                    JOptionPane dialog = new JOptionPane("Số điện thoại không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                } else {
                    congDan.setSDT(tf_soDienThoai.getText());
                }

                if (!isValidEmail(tf_email.getText())) {
                    JOptionPane dialog = new JOptionPane("Email không hợp lệ!", JOptionPane.WARNING_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    return;
                } else {
                    congDan.setEmail(tf_email.getText());
                }

                Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(tf_ngayCapCCCD.getText());
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                congDan.setNgcCccd(sqlDate);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateStr = sdf.format(utilDate);
                byte[] hinhAnh = null;
                try {
                    Icon icon = picHinhAnh.getImage();
                    if (icon instanceof ImageIcon) {
                        hinhAnh = ImageUtils.imageToByteArray((ImageIcon) icon);
                    }
                } catch (Exception e) {
                }
                congDan.setHinhAnh(hinhAnh);
                congDan.setCCCD(tf_soCCCD.getText());
                if (new CongDanServiceImpl().update(congDan)) {
                    JOptionPane dialog = new JOptionPane("Sửa thành công!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog jDialog = dialog.createDialog(null);
                    jDialog.setModal(true);
                    jDialog.setVisible(true);
                    model.setValueAt(tf_hoTen.getText(), selectedRow, 3);
                    model.setValueAt(tf_noiCapCCCD.getText(), selectedRow, 7);
                    model.setValueAt(dateStr, selectedRow, 8);
                    model.setValueAt(tf_soDienThoai.getText(), selectedRow, 9);
                    model.setValueAt(tf_email.getText(), selectedRow, 10);
                    model.setValueAt(congDan.getHinhAnh(), selectedRow, 11);
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
        if (tf_maKhaiSinh.getText().equals("") || tf_hoTen.getText().equals("") || tf_gioiTinh.getText().equals("") || tf_ngaySinh.getText().equals("") || tf_noiSinh.getText().equals("")) {
            JOptionPane dialog = new JOptionPane("Vui lòng nhập mã giấy khai sinh và tải dữ liệu!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }
        if (!isEligibleForCCCD(tf_ngaySinh)) {
            JOptionPane dialog = new JOptionPane("Công dân này chưa đủ tuổi để được cấp CCCD!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        } else {
            tf_soCCCD.setEditable(true);
            tf_ngayCapCCCD.setEditable(true);
            tf_noiCapCCCD.setEditable(true);
            tf_email.setEditable(true);
            tf_soDienThoai.setEditable(true);
            btn_chooseFile.setVisible(true);
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void cbx_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_filterActionPerformed
        tf_queQuan.setText("");
        if (cbx_filter.getSelectedIndex() == 0) {
            rd_nam.setVisible(false);
            rd_nu.setVisible(false);
            clearRadio();
            model.setRowCount(0);
            showTable();

        } else if (cbx_filter.getSelectedIndex() == 1) {
            rd_nam.setVisible(true);
            rd_nu.setVisible(true);
            tf_queQuan.setVisible(false);

        } else if (cbx_filter.getSelectedIndex() == 2) {
            tf_queQuan.setVisible(true);
            rd_nam.setVisible(false);
            rd_nu.setVisible(false);

        }

    }//GEN-LAST:event_cbx_filterActionPerformed

    private void rd_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_nuActionPerformed
        if (cbx_filter.getSelectedIndex() == 1) {
            if (rd_nu.isSelected()) {
                model.setRowCount(0);
                List<CongDanModel> list = new CongDanServiceImpl().filterByGender("Nữ");
                model.fireTableDataChanged();
                for (CongDanModel congDan : list) {
                    model.addRow(new Object[]{congDan.getID(), congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail(), congDan.getHinhAnh()});

                }

            }
        }

    }//GEN-LAST:event_rd_nuActionPerformed

    private void rd_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_namActionPerformed
        if (cbx_filter.getSelectedIndex() == 1) {
            if (rd_nam.isSelected()) {
                model.setRowCount(0);
                List<CongDanModel> list = new CongDanServiceImpl().filterByGender("Nam");
                model.fireTableDataChanged();
                for (CongDanModel congDan : list) {
                    model.addRow(new Object[]{congDan.getID(), congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail(), congDan.getHinhAnh()});
                }
            }
        }
    }//GEN-LAST:event_rd_namActionPerformed

    private void btn_xuatDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatDanhSachActionPerformed
        if (tbl_thongTinCongDan.getRowCount() != 0) {
            String filePath = "D:\\DanhSachCongDan.xlsx";
            exportToExcel(filePath);
        } else {
            JOptionPane dialog = new JOptionPane("Bảng dữ liệu trống!", JOptionPane.WARNING_MESSAGE);
            JDialog jDialog = dialog.createDialog(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            return;
        }

    }//GEN-LAST:event_btn_xuatDanhSachActionPerformed

    private void btn_chooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooseFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage b = ImageIO.read(selectedFile);
                ImageIcon icon = new ImageIcon(b.getScaledInstance(-1, -1, BufferedImage.SCALE_SMOOTH));
                picHinhAnh.setImage(icon);
                picHinhAnh.setBackground(Color.WHITE);
                picHinhAnh.repaint();
                picHinhAnh.setBackground(Color.WHITE);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_btn_chooseFileActionPerformed

    private void tf_queQuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_queQuanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            model.setRowCount(0);
                List<CongDanModel> list = new CongDanServiceImpl().filterByHomeTown(tf_queQuan.getText().trim());
                model.fireTableDataChanged();
                for (CongDanModel congDan : list) {
                    model.addRow(new Object[]{congDan.getID(), congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail(), congDan.getHinhAnh()});
                } 
        }
    }//GEN-LAST:event_tf_queQuanKeyPressed
    

    private void exportToExcel(String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Danh sách công dân");

        Cell cell = null;
        XSSFRow roww = sheet.createRow(0);
        cell = roww.createCell(5, CellType.STRING);
        cell.setCellValue("DANH SÁCH CÔNG DÂN");
        // Tiêu đề cột
        Row headerRow = sheet.createRow(2);
        headerRow.createCell(0).setCellValue("STT");
        headerRow.createCell(1).setCellValue("Mã Khai Sinh");
        headerRow.createCell(2).setCellValue("Số CCCD");
        headerRow.createCell(3).setCellValue("Họ Tên");
        headerRow.createCell(4).setCellValue("Ngày Sinh");
        headerRow.createCell(5).setCellValue("Giới Tính");
        headerRow.createCell(6).setCellValue("Nơi Sinh");
        headerRow.createCell(7).setCellValue("Nơi Cấp CCCD");
        headerRow.createCell(8).setCellValue("Ngày Cấp CCCD");
        headerRow.createCell(9).setCellValue("Số Điện Thoại");
        headerRow.createCell(10).setCellValue("Email");

        int sttCounter = 1;
        // Dữ liệu
        for (int i = 0; i < tbl_thongTinCongDan.getRowCount(); i++) {
            Row row = sheet.createRow(i + 3);
            row.createCell(0).setCellValue((Integer) tbl_thongTinCongDan.getValueAt(i, 0));
            row.createCell(1).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 1));
            row.createCell(2).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 2));
            row.createCell(3).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 3));

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(tbl_thongTinCongDan.getValueAt(i, 4).toString());

            row.createCell(5).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 5));
            row.createCell(6).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 6));
            row.createCell(7).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 7));

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue(tbl_thongTinCongDan.getValueAt(i, 8).toString());

            row.createCell(9).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 9));
            row.createCell(10).setCellValue((String) tbl_thongTinCongDan.getValueAt(i, 10));

        }

        // Tự động điều chỉnh độ rộng cột
        for (int i = 0; i < tbl_thongTinCongDan.getColumnCount(); i++) {
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(5, 3000);
        }
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Xuất dữ liệu ra file Excel thành công");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất dữ liệu ra file Excel");
        }
    }

    public void showResult() {
//        CongDanModel congDan = listCongDan.get(listCongDan.size() - 1);
//        model.fireTableDataChanged();
//        model.addRow(new Object[]{congDan.getID(), congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail(), congDan.getHinhAnh()});
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        listCongDan = congDanService.findAll();
        for (CongDanModel congDan : listCongDan) {
            model.addRow(new Object[]{congDan.getID(), congDan.getMaKS(), congDan.getCCCD(), congDan.getHoTen(), congDan.getNgaySinh(), congDan.getGioiTinh(), congDan.getNoiSinh(), congDan.getNcCccd(), congDan.getNgcCccd(), congDan.getSDT(), congDan.getEmail(), congDan.getHinhAnh()});
        }

    }

    private void clearRadio() {
        buttonGroup1.clearSelection();
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
        picHinhAnh.setImage(null);
        picHinhAnh.setBackground(Color.WHITE);
        picHinhAnh.repaint();
        btn_chooseFile.setVisible(false);
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
        rd_nam.setVisible(false);
        rd_nu.setVisible(false);
        tf_queQuan.setVisible(false);
        picHinhAnh.setEnabled(false);
        btn_chooseFile.setVisible(false);
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

    private static boolean isEligibleForCCCD(TextField tf_ngaySinh) {
        String ngaySinhStr = tf_ngaySinh.getText().trim();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate ngaySinh;

        ngaySinh = LocalDate.parse(ngaySinhStr, formatter);

        LocalDate today = LocalDate.now();

        int years = today.getYear() - ngaySinh.getYear();

        if (ngaySinh.getMonth() == Month.FEBRUARY && ngaySinh.getDayOfMonth() == 29) {

            if (!today.getMonth().equals(Month.FEBRUARY) || today.getDayOfMonth() != 29) {
                years--;
            }
        }

        if (years >= 16) {
            return true;
        } else if (years == 15 && today.getMonthValue() > ngaySinh.getMonthValue()) {
            return true;
        } else if (years == 15 && today.getMonthValue() == ngaySinh.getMonthValue() && today.getDayOfMonth() >= ngaySinh.getDayOfMonth()) {
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

        LocalDate threeYearsAgo = today.minusYears(10);
        if (ngayCapCCCDDate.isBefore(threeYearsAgo)) {
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btn_chooseFile;
    private button.MyButton btn_loadData;
    private Swing.Button btn_luuSua;
    private Swing.Button btn_luuThem;
    private Swing.Button btn_sua;
    private Swing.Button btn_them;
    private Swing.Button btn_xoa;
    private Swing.Button btn_xoaDuLieu;
    private Swing.Button btn_xuatDanhSach;
    private javax.swing.ButtonGroup buttonGroup1;
    private Swing.Combobox cbx_filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private Swing.PictureBox picHinhAnh;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private Swing.TableDark tbl_thongTinCongDan;
    private Swing.TextField tf_email;
    private Swing.TextField tf_gioiTinh;
    private Swing.TextField tf_hoTen;
    private Swing.TextField tf_maKhaiSinh;
    private Swing.TextField tf_ngayCapCCCD;
    private Swing.TextField tf_ngaySinh;
    private Swing.TextField tf_noiCapCCCD;
    private Swing.TextField tf_noiSinh;
    private Swing.TextField tf_queQuan;
    private Swing.TextField tf_soCCCD;
    private Swing.TextField tf_soDienThoai;
    // End of variables declaration//GEN-END:variables

}
