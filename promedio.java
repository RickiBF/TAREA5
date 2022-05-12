package com.mycompany.main;
import java.util.Scanner;

/**
 *
 * @author 51923
 */
public class Promedio {
    Scanner teclado=new Scanner(System.in);
     private String nombre;
     private int EMC,EF,PTA;
     private double PROMF;

 
    public void IngresarDatos()
    {
        System.out.println("Ingrese su nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Ingrese su promedio de tareas academicas: ");
        PTA=teclado.nextInt();
        
        System.out.println("Ingrese su examen de medio curso: ");
        EMC=teclado.nextInt();
        
        System.out.println("Ingrese su examen final: ");
        EF=teclado.nextInt();
    }
    
   public void ObtenerPromedio()
    {
        PROMF=(PTA+EMC+EF)/3;
    }
    public void MostrarDatos()
    {
        System.out.println("Alumno: "+nombre);
        System.out.println("Su promedio sera de : "+PROMF);
    }
}
