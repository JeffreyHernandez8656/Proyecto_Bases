/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Conexion {
    private static Connection conexion;

    public static void conectar() {
        String url = "jdbc:mysql://localhost:3306/la_costa_en_tu_casa?serverTimezone=America/Bogota";
        String usr = "root";
        String ctr = "admin";
        try {
            conexion = DriverManager.getConnection(url, usr, ctr);
            JOptionPane.showMessageDialog(null,"Conexión Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Conexion Fallida");
        }
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(Connection conexion) {
        Conexion.conexion = conexion;
    }
}
