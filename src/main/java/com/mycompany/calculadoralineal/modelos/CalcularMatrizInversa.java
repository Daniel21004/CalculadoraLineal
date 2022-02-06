package com.mycompany.calculadoralineal.modelos;

import com.mycompany.calculadoralineal.modelos.MatrizIdentidad;

public class CalcularMatrizInversa extends Matriz {

    public double matrizA[][]; //cambiar mas tarde
    public double matrizUnidad[][]; // cambiar mas tarde
    private int dimension;
    MatrizIdentidad matrizIdentidad;

    public CalcularMatrizInversa(int _dimension) {
        super(_dimension);
        matrizA = generarMatriz();
        this.dimension = _dimension;
        matrizIdentidad = new MatrizIdentidad(_dimension);
        matrizIdentidad.rellenarMatriz();
        matrizUnidad = matrizIdentidad.matrizIdentidad;
    }

    @Override
    public void rellenarMatriz() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizA[i][j] = pedirValores(i,j);
            }
        }
    }

}
