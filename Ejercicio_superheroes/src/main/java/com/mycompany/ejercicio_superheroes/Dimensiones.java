package com.mycompany.ejercicio_superheroes;

public class Dimensiones {
    double alto;
    double ancho;
    double profundidad;
    double volumen;

    public Dimensiones() {
    }

    public Dimensiones(double alto, double ancho, double profundidad, double volumen) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.volumen = volumen;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    public void getVolumen(){
        volumen = alto*ancho*profundidad; 
    }

    @Override
    public String toString() {
        return "Las dimensiones de la figura son:" + "El alto de " + alto + ", el ancho de " + ancho + ", la profundidad de " + profundidad + " y el volumen de" + volumen ;
    }
    
    
}
