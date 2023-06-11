/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacostaentucasa.Controlador;

import com.mycompany.lacostaentucasa.Vista.Vista_Empleado_laboral;
import com.mycompany.lacostaentucasa.Vista.Vista_Venta;
import com.mycompany.lacostaentucasa.Vista.Vista_menu;
import com.mycompany.lacostaentucasa.Vista.Vista_plato_has_venta;
import com.mycompany.lacostaentucasa.Vista.Vista_sucursal;

/**
 *
 * @author Jeffrey Hernandez
 */
public class Controlador_pantallas {
    private static Vista_menu pantalla_menu;
    private static Vista_Empleado_laboral pantalla_empleado;
    private static Vista_Venta pantalla_venta;
    private static Vista_plato_has_venta pantalla_plato_has_venta;
    private static Vista_sucursal pantalla_sucursal;
    
    public static void abrir_pantalla_menu(){
        if(pantalla_menu == null){
            pantalla_menu = new Vista_menu();
        }
        pantalla_menu.setVisible(true);
        pantalla_menu.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_menu(){
        pantalla_menu.setVisible(false);
        pantalla_menu= null;
    }
    
    
    public static void abrir_pantalla_empleado(){
        if(pantalla_empleado == null){
            pantalla_empleado = new Vista_Empleado_laboral();
        }
        pantalla_empleado.setVisible(true);
        pantalla_empleado.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_empleado(){
        pantalla_empleado.setVisible(false);
        pantalla_empleado= null;
    }
    
    public static void abrir_pantalla_venta(){
        if(pantalla_venta == null){
            pantalla_venta = new Vista_Venta();
        }
        pantalla_venta.setVisible(true);
        pantalla_venta.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_venta(){
        pantalla_venta.setVisible(false);
        pantalla_venta= null;
    }
    
    public static void abrir_pantalla_plato_has_venta(){
        if(pantalla_plato_has_venta == null){
            pantalla_plato_has_venta = new Vista_plato_has_venta();
        }
        pantalla_plato_has_venta.setVisible(true);
        pantalla_plato_has_venta.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_plato_has_venta(){
        pantalla_plato_has_venta.setVisible(false);
        pantalla_plato_has_venta= null;
    }
    
    public static void abrir_pantalla_sucursal(){
        if(pantalla_sucursal == null){
            pantalla_sucursal = new Vista_sucursal();
        }
        pantalla_sucursal.setVisible(true);
        pantalla_sucursal.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_sucursal(){
        pantalla_sucursal.setVisible(false);
        pantalla_sucursal= null;
    }
}
