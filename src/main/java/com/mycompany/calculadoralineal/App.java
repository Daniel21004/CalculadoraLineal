package com.mycompany.calculadoralineal;

import com.mycompany.calculadoralineal.views.Menu;
import com.mycompany.calculadoralineal.controllers.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Inicializacion
        Scanner input = new Scanner(System.in);
        Menu newMenu = new Menu();
        MatrizController matrizController;
        VectorController newVectorController = new VectorController();
        int option;

        //Menu
        newMenu.mostrarMenu();
        option = newMenu.retornarEleccion(input);

        switch (option) {
            case 1:
                newVectorController.pedirDatos(input);
                newVectorController.mostrarResultadoMagnitud();
                break;
            case 2:
                newVectorController.pedirDatos(input);
                newVectorController.mostrarResultadoAnguloTeta();
                break;
            case 3:
                matrizController = new MatrizController();
                break;
            default:
                throw new AssertionError("La opcion que has elegido no se encuentra disponible\n");
        }
    }
}
