package com.mycompany.principal;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Registro {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Actividad> actividades;

    public Registro() {
        estudiantes = new ArrayList<>();
        actividades = new ArrayList<>();
    }

    public void registrarEstudiante(String nombre, String apellido, String actividadNombre) throws EstudianteYaRegistradoException, IOException {
        String codigo = generarCodigo(nombre, apellido);
        Estudiante estudiante = buscarEstudiantePorCodigo(codigo);

        if (estudiante != null) {
            estudiante.agregarActividad(actividadNombre);
        } else {
            estudiante = new Estudiante(nombre, apellido, codigo);
            estudiante.agregarActividad(actividadNombre);
            estudiantes.add(estudiante);
        }

        Actividad actividad = buscarActividadPorNombre(actividadNombre);
        if (actividad == null) {
            actividad = new Actividad(actividadNombre);
            actividades.add(actividad);
        }
        actividad.agregarEstudiante(estudiante);
        guardarDatos();
    }

    private Estudiante buscarEstudiantePorCodigo(String codigo) {
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    private Actividad buscarActividadPorNombre(String nombre) {
        for (Actividad a : actividades) {
            if (a.getNombre().equals(nombre)) {
                return a;
            }
        }
        return null;
    }

    private String generarCodigo(String nombre, String apellido) throws IOException {
        Random random = new Random();
        String codigo = (nombre.charAt(0) + apellido.charAt(0) + apellido.charAt(1) + apellido.charAt(2)).toLowerCase();
        codigo += random.nextInt(1000);

        while (buscarEstudiantePorCodigo(codigo) != null) {
            codigo = (nombre.charAt(0) + apellido.charAt(0) + apellido.charAt(1) + apellido.charAt(2)).toLowerCase();
            codigo += random.nextInt(1000);
        }

        return codigo;
    }

    public void listarEstudiantesPorActividad() {
        for (Actividad actividad : actividades) {
            System.out.println(actividad);
            for (Estudiante estudiante : actividad.getEstudiantes()) {
                System.out.println(" - " + estudiante);
            }
        }
    }

    public void listarTotalEstudiantes() {
        System.out.println("Total de estudiantes inscritos: " + estudiantes.size());
    }

    private void guardarDatos() throws IOException {
        guardarEstudiantes();
        guardarActividades();
    }

    private void guardarEstudiantes() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("estudiantes.txt"));
        for (Estudiante estudiante : estudiantes) {
            writer.write(estudiante.getNombre() + "," + estudiante.getApellido() + "," + estudiante.getCodigo() + "\n");
        }
        writer.close();
    }

    private void guardarActividades() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("actividades.txt"));
        for (Actividad actividad : actividades) {
            writer.write(actividad.getNombre() + "\n");
            for (Estudiante estudiante : actividad.getEstudiantes()) {
                writer.write(" - " + estudiante.getCodigo() + "\n");
            }
        }
        writer.close();
    }
}
