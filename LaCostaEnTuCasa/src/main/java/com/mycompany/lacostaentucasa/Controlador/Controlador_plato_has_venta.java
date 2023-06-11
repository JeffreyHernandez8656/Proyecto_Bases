/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Controlador;

import com.mycompany.lacostaentucasa.Modelo.Plato_has_venta;
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
public class Controlador_plato_has_venta {
    public static void guardar_Plato_has_venta(Plato_has_venta phv) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO Plato_has_venta VALUES('" + phv.getId_plato()+ "','" + phv.getId_venta()+ "','" + phv.getCantidad()+ "')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_plato_has_venta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_Plato_has_venta(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Plato_has_venta");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("id_plato"), rs.getInt("id_venta"), rs.getInt("cantidad")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_plato_has_venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_Plato_has_venta(Plato_has_venta phv) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE Plato_has_venta SET cantidad ='" + phv.getCantidad()+ "' WHERE id_plato ='" + phv.getId_plato()+ "' and id_venta ='" + phv.getId_venta()+ "'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_plato_has_venta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_Plato_has_venta(int id_plato, int id_venta, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM Plato_has_venta where id_plato = '" + id_plato + "' and id_venta = '" + id_venta + "'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_plato_has_venta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
}
