package com.mycompany.calculadoralineal.modelos;

public class MatrizIdentidad extends Matriz {

    protected double matrizIdentidad[][];

    public MatrizIdentidad(int _dimension) {
        super(_dimension);
        matrizIdentidad = generarMatriz();
    }

    @Override
    public void rellenarMatriz() {
        for (int i = 0; i < super.dimension; i++) {
            matrizIdentidad[i][i] = 1;
        }
    }
    

}
