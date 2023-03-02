package org.example;

import java.time.LocalDate;

public class Juicecoctel extends Coctel {

   private LocalDate fechaVencimiento;

    public Juicecoctel() {
    }

    public Juicecoctel(String nombre, long precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
}
