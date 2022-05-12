/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.main;
import java.util.Scanner;

/**
 *
 * @author 51923
 */
public class Compuesto {
    
Scanner teclado=new Scanner(System.in);
     private String nombre;
     private int c,n;
     private double m,i;

 
    public void IngresarDatos2()
    {
        System.out.println("Ingrese su nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Ingrese su capital: ");
        c=teclado.nextInt();
        
        System.out.println("Ingrese el interes: ");
        i=teclado.nextDouble();
        
        System.out.println("Ingrese el numero de periodos: ");
        n=teclado.nextInt();
    }
    
   public void ObtenerResultado()
    {
        i=i/100;
        m=(i*c);
        m=m*n;
    }
    public void MostrarDatos2()
    {
        System.out.println("Alumno: "+nombre);
        System.out.println("Su importe acumulado sera de : "+m);
    }
}
