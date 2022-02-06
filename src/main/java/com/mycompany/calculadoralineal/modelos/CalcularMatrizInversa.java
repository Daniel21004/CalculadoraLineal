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

    public double[][] calcularMatrizInversa() {
        double valorTemp = 0;
        boolean posicionIguales;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                posicionIguales = (i == j);

                if (posicionIguales) {
                    valorTemp = matrizA[i][j];
                    dividirFilas(valorTemp, i);
                    operarColumnas(i);
                }
            }
        }

        return matrizUnidad;

    }

    public void operarColumnas(int columna) {
        for (int i = 0; i < dimension; i++) {
            if (i != columna) {
                matrizA[i][columna] += ((matrizA[i][columna] * -1) * matrizA[columna][columna]);
                matrizUnidad[i][columna] += ((matrizUnidad[i][columna] * -1) * matrizUnidad[columna][columna]);
            }
        }
    }

    public void dividirFilas(double valor, int fila) {
        for (int j = 0; j < dimension; j++) {
            matrizA[fila][j] /= valor;
            matrizUnidad[fila][j] /= valor;
        }
    }

    @Override
    public void rellenarMatriz() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizA[i][j] = pedirValores(i, j);
            }
        }
    }

}
