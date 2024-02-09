/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//import java.sql.Connection; 
//import java.sql.DriverManager; 
//import java.sql.SQLException; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiMysql {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/pbo2024";
        String user = "root";
        String password = ""; // Ganti dengan password database Anda

        // Memuat driver JDBC MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC MySQL tidak ditemukan!");
            e.printStackTrace();
            return null;
        }

        // Membuat koneksi ke database
        Connection koneksi = DriverManager.getConnection(url, user, password);
        return koneksi;
    }

    public static void main(String[] args) {
        try {
            Connection koneksi = getConnection();
            if (koneksi != null) {
                System.out.println("Koneksi ke database berhasil!");
            } else {
                System.out.println("Koneksi ke database gagal!");
            }
        } catch (SQLException e) {
            System.out.println("Error koneksi: " + e.getMessage());
        }
    }
}


		