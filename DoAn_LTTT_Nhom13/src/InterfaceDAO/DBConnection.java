/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceDAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DBConnection {
    private final static String serverName = "DESKTOP-5LUVMA2";
    private final static String dbName = "QuanLyDanCuDoThi";
    private final static String portNumber = "1433";
    private final static String instance = "";
    private final static String userID = "GiaThuanSenpai";
    private final static String password = "giathuan123";

    public static Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" 
            + dbName + ";user=" + userID + ";password=" + password + ";encrypt=false;";
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }
    
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            System.out.print("Success");
        } catch (Exception e) {
            
        }
    }
}
