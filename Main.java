/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 51923
 */
public class Main {
    
    public static void main(String[] args) {
        Promedio objeto1=new Promedio();
        objeto1.IngresarDatos();
        objeto1.ObtenerPromedio();
        objeto1.MostrarDatos();
        
        Compuesto objeto2=new Compuesto();
        objeto2.IngresarDatos2();
        objeto2.ObtenerResultado();
        objeto2.MostrarDatos2();
    }    
     
}
