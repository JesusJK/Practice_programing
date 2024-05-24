package com.mycompany.revision_1parcial;

import com.mycompany.revision_1parcial.car.Vehicle;
import com.mycompany.revision_1parcial.car.VehicleType;


public class Revision_1parcial {
     public static void main(String[] args) {
         System.out.println("EL vehiculo es un " + VehicleType.CAMION); 
         Vehicle vehiculo1 = new Vehicle(VehicleType.CARRO, "Eduard", 5);
         System.out.println("El carro tiene " + vehiculo1.getSizecapacity() + " De capacidad");
         vehiculo1.setSizecapacity(6);
         System.out.println("El carro tiene " + vehiculo1.getSizecapacity() + " De capacidad");
        
        
    }
}     
