package com.mycompany.calculadoralineal.controllers;

import com.mycompany.calculadoralineal.modelos.MatrizInversa;
import com.mycompany.calculadoralineal.views.ResultsMatriz;

public class MatrizController {

	private int dimension;
	MatrizInversa newMatrizInversa;
	ResultsMatriz matrices = new ResultsMatriz();

	public MatrizController() {
		this.dimension = matrices.pedirDimension();
		inicializarMatriz();
		matrices.presentarMatriz(newMatrizInversa.getMatrizA(), "A");
		newMatrizInversa.calcularMatrizInversa();
		matrices.presentarMatriz(newMatrizInversa.getMatrizUnidad(), "Inversa");
	}

	private boolean verificarDimensiones() {
		if (dimension == 2 || dimension == 3) {
			return true;
		} else {
			System.out.println("Las dimensiones que se ha ingresado son invalidas.\nSolo se aceptan matrices de dimension 2 y 3, por favor vuelva a intentarlo");
			System.out.println("");
			dimension = 0;
			return false;
		}
	}

	private void inicializarMatriz() {
		if (verificarDimensiones()) {
			newMatrizInversa = new MatrizInversa(dimension);
			newMatrizInversa.rellenarMatriz();
		}
	}
}
