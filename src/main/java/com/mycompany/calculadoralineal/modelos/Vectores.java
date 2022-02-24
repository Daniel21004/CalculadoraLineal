package com.mycompany.calculadoralineal.modelos;

public class Vectores {

	private double x, y, result, resultDegrees;

	public Vectores(double x, double y) {
		this.x = x;
		this.y = y;
		calcularMagnitud();
		calcularTeta();
	}

	private void calcularMagnitud() {
		result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	private void calcularTeta() {

		result = Math.atan((y / x));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getResult() {
		String results = String.format("%.4f", result);
		return results;
	}

	public String getResultDegrees() {
		resultDegrees = Math.toDegrees(result);
		String results = String.format("%.4f", resultDegrees);
		return results;
	}

}
