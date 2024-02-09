///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package gas;
//
//
//
////
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.SQLException;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Koneksi {
//    private static Connection koneksi;
//    
//    public static  Connection getConnection() throws SQLException {
//        String db = "jdbc:mysql//localhost:3307/pbo2024";
//        String user = "root";
//        String pass = "";
//        
//        if(koneksi == null){
//            koneksi = DriverManager.getConnection(db,user,pass);
//      
//        }
//        
//        return koneksi;
//    }
//}
//
