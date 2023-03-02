package org.example;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digita la cantidad de producto: ");
        int cantidadProducto=entrada.nextInt();
        System.out.println("la cantidad fue: "+ cantidadProducto);

        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        //como asignar una fecha en especifico
        LocalDate fecha2 = LocalDate.of(2023,2,24);
        System.out.println(fecha2);

        //encontrar la diferencia entre dos fechas
        long diferenciaEntreFechas= ChronoUnit.DAYS.between(fecha,fecha2);
        System.out.println(diferenciaEntreFechas);



    }
}