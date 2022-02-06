package com.mycompany.calculadoralineal.modelos;

public class MatrizIdentidad extends Matriz {

    protected double matrizIdentidad[][];
    private int dimension;

    public MatrizIdentidad(int _dimension) {
        super(_dimension);
        this.dimension = _dimension;
        matrizIdentidad = generarMatriz();
    }

    @Override
    public void rellenarMatriz() {
        for (int i = 0; i < dimension; i++) {
            matrizIdentidad[i][i] = 1;
        }
    }

}
