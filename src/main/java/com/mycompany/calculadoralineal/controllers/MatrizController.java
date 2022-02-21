package com.mycompany.calculadoralineal.controllers;

import java.util.Scanner;
import com.mycompany.calculadoralineal.modelos.MatrizInversa;

public class MatrizController {

    private int dimension;
    MatrizInversa newMatrizInversa;
    Scanner input = new Scanner(System.in);

    public MatrizController() {
        pedirDimension();
        verificarDimensiones();
    }

    public void pedirDimension() {
        System.out.println("\nIngrese la dimension de la matriz:");
        dimension = input.nextInt();
        input.nextLine();
    }

    public void verificarDimensiones() {
        if (dimension == 2 || dimension == 3) {
            inicializarMatriz();
        } else {
            System.out.println("Las dimensiones que se ha ingresado son invalidas.\nSolo se aceptan matrices de dimension 2 y 3, por favor vuelva a intentarlo");
            dimension = 0;
        }
    }

    public void inicializarMatriz() {
        newMatrizInversa = new MatrizInversa(dimension);
        newMatrizInversa.rellenarMatriz();
        newMatrizInversa.calcularMatrizInversa();
    }

    public void presentarMatriz() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.format("[%f] ", newMatrizInversa.matrizUnidad[i][j]);
            }
            System.out.println("\n");
        }
    }
}
