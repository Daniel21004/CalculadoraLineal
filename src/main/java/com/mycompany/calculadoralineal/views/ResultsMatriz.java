package com.mycompany.calculadoralineal.views;

import java.util.Scanner;

public class ResultsMatriz {
    
    private int dimension;
    Scanner input = new Scanner(System.in);
    
    public int pedirDimension() {
        System.out.println("\nIngrese la dimension de la matriz:");
        dimension = input.nextInt();
        input.nextLine();
        System.out.println("");
        return dimension;
    }
    
    public void presentarMatriz(double[][] matriz, String id) {
        System.out.println("\nMatriz " + id);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.format("[%.2f]   ", matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
