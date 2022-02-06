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

    }
}
