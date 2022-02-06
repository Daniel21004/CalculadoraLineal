package com.mycompany.calculadoralineal.modelos;

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

    /*
//Quizas se le puede aplicar polimorfismo
    public double[][] rellenarMatriz(double matriz[][]) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                pedirValores(i, j);
                matriz[i][j] = valor; //Checar porque puede dar error
            }
        }
        return matriz;
    }
//Quizas se le puede aplicar polimorfismo

    public double[][] rellenarMatrizIdentidad(double matriz[][]) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
        return matriz;
    }
     */
    public abstract void rellenarMatriz();


    
    public double pedirValores(int fila, int columna) {
        System.out.println("Inserte un valor para la matriz A en la posicion ["+fila+"]["+columna+"]");
        valor = input.nextDouble();
        return valor;
    }

}
