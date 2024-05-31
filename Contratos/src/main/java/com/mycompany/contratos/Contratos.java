package com.mycompany.contratos;

import com.mycompany.contratos.being.Human;

public class Contratos {

    public static void main(String[] args) {
        Human human = new Human((int) 1.65,"Pepe");
        
        human.walk();
        human.run();
        human.sleep();
    }
}
// Proxima clase POLIMORFISMO