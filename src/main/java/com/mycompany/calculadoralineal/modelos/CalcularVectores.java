package com.mycompany.calculadoralineal.modelos;


public class CalcularVectores {
    
    private double x,y, result, resultDegrees;

    public CalcularVectores(double _x, double _y){
        x = _x;
        y = _y;
    }
    
    public void calcularMagnitud(){
        result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public void calcularTeta() {

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
        resultDegrees =  Math.toDegrees(result);
        String results = String.format("%.4f", resultDegrees);
        return results;
    }
    
    
    
}
