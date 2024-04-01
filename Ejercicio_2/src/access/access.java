package access;
import java.util.Scanner;
import people.Persona;

/* Niveles de acceso en clases: default y público
Acceso público: Que esaccesible desde cualquier lugar de la app incluso desde otros paquetes
Acceso por defecto; La clase solo puede ser accedible por el mismo paquete*/

public class access { 
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Esciba su Nombre:");
    String name = sc.nextLine();
    System.out.println("Escriba su apellido");
    String lastname = sc.nextLine();
    otherclass saludo = new otherclass();    //
    saludo.sayHello();       //la variable llama a la clase "sayhello" y lo imprime
        
    Persona person = new Persona(name , lastname, 16);
    System.out.println(person.getFullname());
    System.out.println(person.getAge());
    
    
    
    }
    
}
