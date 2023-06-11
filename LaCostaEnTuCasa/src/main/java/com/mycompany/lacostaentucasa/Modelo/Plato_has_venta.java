/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Modelo;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Plato_has_venta {
    private int id_plato;
    private int id_venta;
    private int cantidad;

    public Plato_has_venta(int id_plato, int id_venta, int cantidad) {
        this.id_plato = id_plato;
        this.id_venta = id_venta;
        this.cantidad = cantidad;
    }

    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
