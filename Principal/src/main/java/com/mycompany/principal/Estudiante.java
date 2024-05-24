package com.mycompany.principal;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String codigo;
    private ArrayList<String> actividades;

    public Estudiante(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.actividades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<String> getActividades() {
        return actividades;
    }

    public void agregarActividad(String actividad) {
        if (!actividades.contains(actividad)) {
            actividades.add(actividad);
        }
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + codigo + ")";
    }
}
