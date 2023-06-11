/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lacostaentucasa;

import com.mycompany.lacostaentucasa.Controlador.Conexion;
import com.mycompany.lacostaentucasa.Controlador.Controlador_pantallas;

/**
 *
 * @author Jeffrey Hernandez
 */
public class LaCostaEnTuCasa {

    public static void main(String[] args) {
        Conexion.conectar();
        Controlador_pantallas.abrir_pantalla_menu();
    }
}
