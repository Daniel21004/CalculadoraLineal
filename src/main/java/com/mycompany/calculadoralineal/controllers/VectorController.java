package com.mycompany.calculadoralineal.controllers;

import java.util.Scanner;
import java.util.Locale;
import com.mycompany.calculadoralineal.modelos.Vectores;

public class VectorController {

    Vectores calcularMagnitud;

    public void pedirDatos(Scanner input) {
        double x, y;
        input.useLocale(Locale.US); //Para que pueda ingresar decimales con punto
        System.out.println("Ingrese el valor del eje X:");
        x = input.nextDouble();
        System.out.println("Ingrese el valor del eje Y:");
        y = input.nextDouble();
        calcularMagnitud = new Vectores(x, y);
    }

    public void mostrarResultadoMagnitud() {

        calcularMagnitud.calcularMagnitud();

        System.out.println("*************************");
        System.out.println("\tRESULTADOS");
        System.out.println("*************************");

        System.out.println("X: " + calcularMagnitud.getX());
        System.out.println("Y: " + calcularMagnitud.getY());

        System.out.println("\n|A|= ¯\\/" + calcularMagnitud.getX() + "² + " + calcularMagnitud.getY() + "² = " + calcularMagnitud.getResult());
    }

    public void mostrarResultadoAnguloTeta() {

        calcularMagnitud.calcularTeta();

        System.out.println("*************************");
        System.out.println("\tRESULTADOS");
        System.out.println("*************************");

        System.out.println("X: " + calcularMagnitud.getX());
        System.out.println("Y: " + calcularMagnitud.getY());

        System.out.println("\nRadianes = (" + calcularMagnitud.getY() + "/" + calcularMagnitud.getX() + ") = " + calcularMagnitud.getResult() + " rad");
        System.out.println("Angulo = (" + calcularMagnitud.getY() + "/" + calcularMagnitud.getX() + ") = " + calcularMagnitud.getResultDegrees() + " grados");
    }

}
