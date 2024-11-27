package org.example;

public class Tarea {
    private String descripcion;
    private boolean estaCompletada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.estaCompletada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean estaCompletada() {
        return estaCompletada;
    }

    public void marcarComoCompletada() {
        this.estaCompletada = true;
    }

    @Override
    public String toString() {
        return (estaCompletada ? "[✔] " : "[ ] ") + descripcion;
    }
}
