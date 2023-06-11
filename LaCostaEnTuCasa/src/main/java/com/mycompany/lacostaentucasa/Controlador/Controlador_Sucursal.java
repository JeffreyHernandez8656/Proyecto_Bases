/*
 * Click nbfs://nbhost/SystemFileSystem/Tscllates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Tscllates/Classes/Class.java to edit this tscllate
 */
package com.mycompany.lacostaentucasa.Controlador;

import com.mycompany.lacostaentucasa.Modelo.Sucursal;
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
public class Controlador_Sucursal {
    public static void guardar_sucursal(Sucursal scl) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO sucursal VALUES('" + scl.getId_sucursal()+ "','" + scl.getNombre()+ "','" + scl.getNumero_empleados()+ "','" + scl.getId_ciudad()+ "')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Sucursal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_sucursal(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM sucursal");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("id_sucursal"), rs.getString("nombre"), rs.getInt("numero_empleados"), rs.getInt("id_ciudad")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_sucursal(Sucursal scl) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE sucursal SET nombre ='" + scl.getNombre()+ "',numero_empleados='" + scl.getNumero_empleados()+ "',id_ciudad='" + scl.getId_ciudad()+ "' WHERE id_sucursal ='" + scl.getId_sucursal()+ "'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Sucursal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_sucursal(int id, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM sucursal where id_sucursal = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Sucursal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
}
