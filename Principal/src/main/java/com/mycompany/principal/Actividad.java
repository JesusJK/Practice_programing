package com.mycompany.principal;

import java.util.ArrayList;

public class Actividad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Actividad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + estudiantes.size() + " estudiantes inscritos)";
    }
}

