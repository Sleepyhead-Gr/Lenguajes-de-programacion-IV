/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2026_2_avtividad3;
import java.sql.Connection;
import java.sql.DriverManager;




/**
 *
 * @author grecr
 */
public class Conexion {
    
   public Connection getConnection() {

    Connection con = null;

    String base = "bancobd";
    String url = "jdbc:mysql://localhost:3306/" + base;
    String user = "root";
    String password = "";

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(url, user, password);

        System.out.println("Conexión exitosa");

    } catch (Exception e) {

        e.printStackTrace();

    }

    return con;
}
}