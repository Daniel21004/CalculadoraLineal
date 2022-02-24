package com.mycompany.calculadoralineal.controllers;

import com.mycompany.calculadoralineal.modelos.MatrizInversa;
import com.mycompany.calculadoralineal.views.ResultsMatriz;

public class MatrizController {

    private int dimension;
    MatrizInversa newMatrizInversa;
    ResultsMatriz matrices = new ResultsMatriz();

    public MatrizController() {
        this.dimension = matrices.pedirDimension();
        verificarDimensiones();
        matrices.presentarMatriz(newMatrizInversa.getMatrizA(), "A");
        newMatrizInversa.calcularMatrizInversa();
        matrices.presentarMatriz(newMatrizInversa.getMatrizUnidad(), "Inversa");
    }
    
    private void verificarDimensiones() {
        if (dimension == 2 || dimension == 3) {
            inicializarMatriz();
        } else {
            System.out.println("Las dimensiones que se ha ingresado son invalidas.\nSolo se aceptan matrices de dimension 2 y 3, por favor vuelva a intentarlo");
            System.out.println("");
            dimension = 0;
        }
    }
    private void inicializarMatriz() {
        newMatrizInversa = new MatrizInversa(dimension);
        newMatrizInversa.rellenarMatriz();
    }
}
