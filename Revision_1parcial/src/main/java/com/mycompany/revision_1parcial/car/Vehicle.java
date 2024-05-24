package com.mycompany.revision_1parcial.car;
//Investigar arraylists, los tipo package y type, ademas de saber sobre los enum


public class Vehicle {
    //private Arraylist package;
    private VehicleType type;
    private String carplate;
    private int sizecapacity; 

    public Vehicle(VehicleType type, String carplate, int sizecapacity) {
        this.type = type;
        this.carplate = carplate;
        this.sizecapacity = sizecapacity;
    }

    public int getSizecapacity() {
        return sizecapacity;
    }

    public void setSizecapacity(int sizecapacity) {
        this.sizecapacity = sizecapacity;
    }

    
    
    
    
}
