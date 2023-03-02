package org.example;

public class Padre {
    private String nombre;
    private final String apellido  = "Ardila";
    private long fortuna; // long un dato mas largo

    public Padre() {
    }

    public Padre(String nombre, long fortuna) {
        this.nombre = nombre;
        this.fortuna = fortuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public long getFortuna() {
        return fortuna;
    }

    public void setFortuna(long fortuna) {
        this.fortuna = fortuna;
    }
}
