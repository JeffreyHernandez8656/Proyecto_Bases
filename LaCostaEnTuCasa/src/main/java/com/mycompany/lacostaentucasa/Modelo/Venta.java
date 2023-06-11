/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Modelo;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Venta {
    private int id_venta;
    private String fecha;
    private double valor_ganancia;
    private int id_sucursal;
    private int doc_Empleado_Laboral;

    public Venta(int id_venta, String fecha, double valor_ganancia, int id_sucursal, int doc_Empleado_Laboral) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.valor_ganancia = valor_ganancia;
        this.id_sucursal = id_sucursal;
        this.doc_Empleado_Laboral = doc_Empleado_Laboral;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValor_ganancia() {
        return valor_ganancia;
    }

    public void setValor_ganancia(double valor_ganancia) {
        this.valor_ganancia = valor_ganancia;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getDoc_Empleado_Laboral() {
        return doc_Empleado_Laboral;
    }

    public void setDoc_Empleado_Laboral(int doc_Empleado_Laboral) {
        this.doc_Empleado_Laboral = doc_Empleado_Laboral;
    }
    
    
}
