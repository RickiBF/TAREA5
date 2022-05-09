// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class promedio {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int T1,T2,T3,T4,T5,EMC,EF;
        double PTA,PROMF;
        String alumno;
        
        System.out.println("Ingrese su nombre: ");
        alumno=teclado.nextLine();
        
        System.out.println("Ingrese su primera tarea: ");
        T1=teclado.nextInt();
        
        System.out.println("Ingrese su segunda tarea: ");
        T2=teclado.nextInt();
        
        System.out.println("Ingrese su tercera tarea: ");
        T3=teclado.nextInt();
        
        System.out.println("Ingrese su cuarta tarea: ");
        T4=teclado.nextInt();
        
        System.out.println("Ingrese su quinta tarea: ");
        T5=teclado.nextInt();
        
        PTA=(T1+T2+T3+T4+T5)/5;
        
        System.out.println("Su promedio de tareas es: "+PTA);
        
        System.out.println("Ingrese su Examen de medio curso: ");
        EMC=teclado.nextInt();
        
        System.out.println("Ingrese su Examen final: ");
        EF=teclado.nextInt();
        
        PROMF=(PTA+EMC+EF)/3;
    
        
        System.out.println("BIENVENIDO ALUMNO: "+alumno+" Su promedio final es: "+PROMF);
    }
}
