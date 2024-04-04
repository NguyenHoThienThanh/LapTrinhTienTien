/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller;

import Chart.ModelChart;
import DAOImplement.KhaiSinhDAOImpl;
import DAOImplement.ThongKeDAOImpl;
import InterfaceDAO.IKhaiSinhDAO;
import InterfaceDAO.IThongKeDAO;
import Models.ThongKeModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUAN
 */
public class ChartKhaiSinhController extends javax.swing.JPanel {

    List<ThongKeModel> listThongKe = new ArrayList<>();
    IThongKeDAO thongKeDAO = new ThongKeDAOImpl();
    public ChartKhaiSinhController() {
        initComponents();
        chart.setTitle("Chart Data");
        chart.addLegend("Khai Sinh", Color.decode("#7b4397"), Color.decode("#dc2430"));
        setDataDKKSTheoThang();
    }
   
    public void setDataDKKSTheoThang(){
        listThongKe = thongKeDAO.thongKeDKKSTheoThang();
        for( int i = listThongKe.size() -1 ;i>=0;i--){
            ThongKeModel thongKe = listThongKe.get(i);
            chart.addData(new ModelChart(thongKe.getThang(), new double[]{thongKe.getSoLuongKhaiSinh()}));
        }
        chart.start();
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new Chart.PanelShadow();
        chart = new Chart.CurveLineChart();

        panelShadow1.setBackground(new java.awt.Color(34, 59, 69));
        panelShadow1.setColorGradient(new java.awt.Color(17, 38, 47));

        chart.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Chart.CurveLineChart chart;
    private Chart.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
