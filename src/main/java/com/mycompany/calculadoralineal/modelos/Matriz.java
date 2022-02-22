package com.mycompany.calculadoralineal.modelos;

import java.util.Locale;
import java.util.Scanner;

public abstract class Matriz {

    protected int dimension;
    protected double valor;
    private Scanner input = new Scanner(System.in);

    public Matriz(int _dimension) {
        this.dimension = _dimension;
    }

    public double[][] generarMatriz() {
        return new double[dimension][dimension];
    }

    public abstract void rellenarMatriz();
    
    public double pedirValores(int fila, int columna) {
        input.useLocale(Locale.ENGLISH);
        System.out.println("Inserte un valor para la matriz A en la posicion ["+fila+"]["+columna+"]");
        valor = input.nextDouble();
        return valor;
    }

}
