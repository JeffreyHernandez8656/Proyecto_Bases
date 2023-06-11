/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Controlador;

import com.mycompany.lacostaentucasa.Modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Controlador_venta {
    public static void guardar_Venta(Venta vnt) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO Venta VALUES('" + vnt.getId_venta()+ "','" + vnt.getFecha()+ "','" + vnt.getValor_ganancia()+ "','" + vnt.getId_sucursal()+ "','" + vnt.getDoc_Empleado_Laboral()+ "')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_Venta(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM venta");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("id_venta"), rs.getString("fecha"), rs.getDouble("valor_ganancia"), rs.getInt("id_sucursal"), rs.getInt("doc_Empleado_Laboral")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_Venta(Venta vnt) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE venta SET fecha ='" + vnt.getFecha()+ "',valor_ganancia='" + vnt.getValor_ganancia()+ "',id_sucursal='" + vnt.getId_sucursal()+ "',doc_Empleado_Laboral='" + vnt.getDoc_Empleado_Laboral()+ "' WHERE id_venta ='" + vnt.getId_venta()+ "'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_Venta(int id, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM venta where id_venta = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
}
