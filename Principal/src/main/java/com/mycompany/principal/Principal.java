package com.mycompany.principal;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Registro registro = new Registro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes por actividad");
            System.out.println("3. Listar total de estudiantes");
            System.out.println("4. Salir");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del estudiante: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese la actividad: ");
                    String actividad = scanner.nextLine();

                    try {
                        registro.registrarEstudiante(nombre, apellido, actividad);
                        System.out.println("Estudiante registrado exitosamente.");
                    } catch (EstudianteYaRegistradoException | IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    registro.listarEstudiantesPorActividad();
                    break;
                case 3:
                    registro.listarTotalEstudiantes();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}