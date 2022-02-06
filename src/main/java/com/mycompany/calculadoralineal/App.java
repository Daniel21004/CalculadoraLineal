package com.mycompany.calculadoralineal;

import com.mycompany.calculadoralineal.menu.Menu;
import com.mycompany.calculadoralineal.controllers.VectorController;

import com.mycompany.calculadoralineal.modelos.CalcularMatrizInversa;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Inicializacion
        Scanner input = new Scanner(System.in);
        Menu newMenu = new Menu();
        VectorController newVectorController = new VectorController();
        int option;
        
        CalcularMatrizInversa mInversa = new CalcularMatrizInversa(2);
        mInversa.rellenarMatriz();
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(mInversa.matrizA[i][j] + ",");
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(mInversa.matrizUnidad[i][j] + ",");
            }
        }
/*
        //Menu
        newMenu.mostrarMenu();
        option = input.nextInt();

        switch (option) {
            case 1:
                newVectorController.pedirDatos(input);
                newVectorController.mostrarResultadoMagnitud();
                break;

            case 2:
                newVectorController.pedirDatos(input);
                newVectorController.mostrarResultadoAnguloTeta();
                break;
            default:

        }
*/
    }
}
