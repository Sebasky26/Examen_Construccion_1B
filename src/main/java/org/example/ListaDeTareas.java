package org.example;// ListaDeTareas.java

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTareas {
    protected List<Tarea> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
        System.out.println("Tarea agregada: " + descripcion);
    }

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas disponibles.");
        } else {
            System.out.println("Tus tareas:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    public void marcarTareaComoCompletada(int numeroTarea) {
        if (numeroTarea < 1 || numeroTarea > tareas.size()) {
            System.out.println("Número de tarea inválido.");
        } else {
            tareas.get(numeroTarea - 1).marcarComoCompletada();
            System.out.println("Tarea marcada como completada: " + tareas.get(numeroTarea - 1).getDescripcion());
        }
    }

    public static void main(String[] args) {
        ListaDeTareas app = new ListaDeTareas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la aplicación de Lista de Tareas!");
        while (true) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar una tarea como completada");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    app.agregarTarea(descripcion);
                    break;
                case 2:
                    app.listarTareas();
                    break;
                case 3:
                    System.out.print("Introduce el número de la tarea a completar: ");
                    int numeroTarea = scanner.nextInt();
                    app.marcarTareaComoCompletada(numeroTarea);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}
