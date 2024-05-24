package com.mycompany.ejemplo_exeptions;
import java.util.Scanner;
public class Ejemplo_exeptions {

    public static void main(String[] args) throws Exception {
        System.out.println("Escriba un numero");
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        Even even = new Even();
        
        try {
        even.isEven(number);
        } catch (Exception e){   // e es la variable que se nombra para definir el error
            System.out.println("Ha ocurrido un error, " + e.getMessage());
        }
    }
}
