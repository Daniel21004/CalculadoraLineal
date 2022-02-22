package com.mycompany.calculadoralineal.controllers;

import java.util.Scanner;
import java.util.Locale;
import com.mycompany.calculadoralineal.modelos.Vectores;

public class VectorController {

    Vectores vectores;

    public void pedirDatos(Scanner input){
        double x, y;
        input.useLocale(Locale.US); //Para que pueda ingresar decimales con punto
        System.out.println("Ingrese el valor del eje X:");
        x = input.nextDouble();
        System.out.println("Ingrese el valor del eje Y:");
        y = input.nextDouble();
        vectores = new Vectores(x, y);
        System.out.println("\n");
    }

    public void mostrarResultadoMagnitud() {
        System.out.println("*************************");
        System.out.println("\tRESULTADOS");
        System.out.println("*************************");

        System.out.println("X: " + vectores.getX());
        System.out.println("Y: " + vectores.getY());

        System.out.println("\n|A|= ¯\\/" + vectores.getX() + "² + " + vectores.getY() + "² = " + vectores.getResult());
    }

    public void mostrarResultadoAnguloTeta() {
        System.out.println("*************************");
        System.out.println("\tRESULTADOS");
        System.out.println("*************************");

        System.out.println("X: " + vectores.getX());
        System.out.println("Y: " + vectores.getY());

        System.out.println("\nRadianes = (" + vectores.getY() + "/" + vectores.getX() + ") = " + vectores.getResult() + " rad");
        System.out.println("Angulo = (" + vectores.getY() + "/" + vectores.getX() + ") = " + vectores.getResultDegrees() + " grados");
    }

}
