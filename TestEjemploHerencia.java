package EjemploHerencia;

import java.util.Scanner;

public class TestEjemploHerencia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              
        System.out.println("Ingrese un numero:");
        int a = in.nextInt();
        
        System.out.println("Ingrese otro numero");
        int b = in.nextInt();
        
        SubclaseEjemploHerencia subClase = new SubclaseEjemploHerencia(a, b);
        
        System.out.println(subClase.getA() + " + " + subClase.getB() + " = " + subClase.sumar());
        
    }
    
}
