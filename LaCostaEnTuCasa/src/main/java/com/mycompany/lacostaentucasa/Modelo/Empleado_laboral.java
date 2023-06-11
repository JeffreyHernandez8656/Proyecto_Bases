/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Modelo;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Empleado_laboral {
    private int doc_Empleado_Laboral;
    private String nombres;
    private String apellidos;
    private String numero_telefonico;
    private String direccion;
    private String fecha_nacimiento;
    private String email;
    private int id_tipo_empleado;
    private int id_Sucursal;
    private int id_sistema_social;

    public Empleado_laboral(int doc_Empleado_Laboral, String nombres, String apellidos, String numero_telefonico, String direccion, String fecha_nacimiento, String email, int id_tipo_empleado, int id_Sucursal, int id_sistema_social) {
        this.doc_Empleado_Laboral = doc_Empleado_Laboral;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero_telefonico = numero_telefonico;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.id_tipo_empleado = id_tipo_empleado;
        this.id_Sucursal = id_Sucursal;
        this.id_sistema_social = id_sistema_social;
    }

    public int getDoc_Empleado_Laboral() {
        return doc_Empleado_Laboral;
    }

    public void setDoc_Empleado_Laboral(int doc_Empleado_Laboral) {
        this.doc_Empleado_Laboral = doc_Empleado_Laboral;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(String numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_tipo_empleado() {
        return id_tipo_empleado;
    }

    public void setId_tipo_empleado(int id_tipo_empleado) {
        this.id_tipo_empleado = id_tipo_empleado;
    }

    public int getId_Sucursal() {
        return id_Sucursal;
    }

    public void setId_Sucursal(int id_Sucursal) {
        this.id_Sucursal = id_Sucursal;
    }

    public int getId_sistema_social() {
        return id_sistema_social;
    }

    public void setId_sistema_social(int id_sistema_social) {
        this.id_sistema_social = id_sistema_social;
    }
    
}
