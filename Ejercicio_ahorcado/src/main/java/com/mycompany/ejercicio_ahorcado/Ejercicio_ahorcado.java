package com.mycompany.ejercicio_ahorcado;
import java.util.Scanner;
public class Ejercicio_ahorcado {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
          
        Palabra palabra1 = new Palabra("Torta");
        System.out.println("La palabra contiene: " + palabra1.getPalabra().length());
       
        
        for (int i = 6; i>0;) {
            System.out.println("Escriba una Letra para la palabra, tiene " + i + "intentos");
            String letra = sc.nextLine();
                
        }
    }
}
