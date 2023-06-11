/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Controlador;

import com.mycompany.lacostaentucasa.Modelo.Empleado_laboral;
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
public class Controlador_empleado_laboral {
    public static void guardar_empleado_laboral(Empleado_laboral emp) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO empleado_laboral VALUES('" + emp.getDoc_Empleado_Laboral()+ "','" + emp.getNombres()+ "','" + emp.getApellidos()+ "','" + emp.getNumero_telefonico()+ "','" + emp.getDireccion()+ "','" + emp.getFecha_nacimiento()+ "','" + emp.getEmail()+ "','" + emp.getId_tipo_empleado()+ "','" + emp.getId_Sucursal()+ "','" + emp.getId_sistema_social()+"')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_laboral.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_empleado_laboral(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado_laboral");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("doc_Empleado_Laboral"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("numero_telefonico"), rs.getString("direccion"), rs.getString("fecha_nacimiento"), rs.getString("email"), rs.getInt("id_tipo_empleado"), rs.getInt("id_Sucursal"), rs.getInt("id_sistema_social")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_laboral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void buscar_empleado_laboral(JTable tabla, DefaultTableModel modelo, int id) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado_laboral where doc_Empleado_Laboral = '"+id+"'");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("doc_Empleado_Laboral"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("numero_telefonico"), rs.getString("direccion"), rs.getString("fecha_nacimiento"), rs.getString("email"), rs.getInt("id_tipo_empleado"), rs.getInt("id_Sucursal"), rs.getInt("id_sistema_social")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_laboral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_empleado_laboral(Empleado_laboral emp) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE empleado_laboral SET Nombres ='" + emp.getNombres() + "',Apellidos='" + emp.getApellidos() + "',Numero_telefonico='" + emp.getNumero_telefonico()+ "',Direccion='" + emp.getDireccion() + "',Fecha_nacimiento='" + emp.getFecha_nacimiento() + "',Email='" + emp.getEmail() + "',id_tipo_empleado='" + emp.getId_tipo_empleado()+ "',id_Sucursal='" + emp.getId_Sucursal()+ "',id_sistema_social='" + emp.getId_sistema_social()+ "' WHERE doc_Empleado_Laboral ='" + emp.getDoc_Empleado_Laboral()+ "'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_laboral.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_empleado_laboral(int id, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM empleado_laboral where doc_Empleado_Laboral = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_laboral.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
}
