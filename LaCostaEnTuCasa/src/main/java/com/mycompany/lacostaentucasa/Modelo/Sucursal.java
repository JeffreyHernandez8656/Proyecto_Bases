/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Modelo;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Sucursal {
    private int id_sucursal;
    private String nombre;
    private int numero_empleados;
    private int id_ciudad;

    public Sucursal(int id_sucursal, String nombre, int numero_empleados, int id_ciudad) {
        this.id_sucursal = id_sucursal;
        this.nombre = nombre;
        this.numero_empleados = numero_empleados;
        this.id_ciudad = id_ciudad;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_empleados() {
        return numero_empleados;
    }

    public void setNumero_empleados(int numero_empleados) {
        this.numero_empleados = numero_empleados;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }
    
}
