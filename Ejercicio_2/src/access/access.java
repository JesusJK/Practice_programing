package access;

import people.Persona;
/* Niveles de acceso en clases: default y público
Acceso público: Que esaccesible desde cualquier lugar de la app incluso desde otros paquetes
Acceso por defecto; La clase solo puede ser accedible por el mismo paquete*/
public class access { 
    public static void main(String[] args) {
    otherclass other = new otherclass();
    other.sayHello();
        
    Persona person = new Persona("Pepito" , "Perez", 16);
    System.out.println(person.getFullname());
    System.out.println(person.getAge());
    
    }
    
}
