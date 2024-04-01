package com.mycompany.ejercicio_superheroes;

public class Superheroes {
    String name;
    String Description;
    boolean layer;  

    public Superheroes(String name, String Description, boolean layer) {
        this.name = name;
        this.Description = Description;
        this.layer = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean isLayer() {
        return layer;
    }

    public void setLayer(boolean layer) {
        this.layer = layer;
    }

    @Override
    public String toString() {
        return "Superheroes" + "El nombres del superheroe es:" + name + ", su Descripcion es:" + Description + ", y es " + layer + "que tiene capa";
    }
    
    
}

