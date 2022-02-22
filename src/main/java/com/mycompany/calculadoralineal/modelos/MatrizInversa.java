package com.mycompany.calculadoralineal.modelos;

public class MatrizInversa extends Matriz {

    public double matrizA[][];
    public double matrizUnidad[][]; 
    MatrizIdentidad matrizIdentidad;

    public MatrizInversa(int dimension) {
        super(dimension);
        matrizA = generarMatriz();
        matrizIdentidad = new MatrizIdentidad(dimension);
        matrizIdentidad.rellenarMatriz();
        matrizUnidad = matrizIdentidad.matrizIdentidad; 
    }

    public void calcularMatrizInversa() {
        double valorTemp;
        for (int i = 0; i < super.dimension; i++) {
            valorTemp = matrizA[i][i];
            dividirFilas(valorTemp, i);
            operarFilas(i);
        }
    }

    public void operarFilas(int filaActual) {
        for (int i = 0; i < super.dimension; i++) {
            double temp = matrizA[i][filaActual];
            for (int j = 0; j < super.dimension; j++) {
                if (i != filaActual) {
                    matrizA[i][j] += ((temp * -1) * matrizA[filaActual][j]);
                    matrizUnidad[i][j] += ((temp * -1) * matrizUnidad[filaActual][j]);
                }
            }
        }
    }

    public void dividirFilas(double valor, int i) {
        for (int j = 0; j < super.dimension; j++) {
            matrizA[i][j] /= valor;
            matrizUnidad[i][j] /= valor;
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
