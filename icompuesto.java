// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class icompuesto {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int c,n;
        double m,i;
        String nombre;
        
        System.out.println("Bienvenido: ");
        nombre=teclado.nextLine();
        
        System.out.println("Ingrese su capital: ");
        c=teclado.nextInt();
        
        System.out.println("El interes sera de: ");
        i=teclado.nextDouble();
        
        System.out.println("Numero de periodos: ");
        n=teclado.nextInt();
        
        i=i/100;
        m=(i*c);
        m=m*n;
        
    
        
        System.out.println("El interes Compuesto de: "+nombre+" Sera de: "+m);
    }
}
