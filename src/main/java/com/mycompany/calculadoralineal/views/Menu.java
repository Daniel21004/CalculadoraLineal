package com.mycompany.calculadoralineal.views;

import java.util.Scanner;

public class Menu {
    
    private int option;
       
    public void mostrarMenu(){
        System.out.println("**********************************************");
        System.out.println("\tBIENVENIDO A LA CALCULADORA LINEAL");
        System.out.println("**********************************************");
        
        System.out.println("Elija una de las opciones:");
        
        System.out.println("1. Calcular magnitud de un Vector(2D)");
        System.out.println("2. Calcular angulo teta de un Vector(2D)");
        System.out.println("3. Calcular matriz inversa(2x2)(3x3)");
        System.out.println("Tu eleccion: ");
    }
    
    public int retornarEleccion(Scanner input){
        option = input.nextInt();
        input.nextLine();
        System.out.println("\n");
        return option;
    }
}
