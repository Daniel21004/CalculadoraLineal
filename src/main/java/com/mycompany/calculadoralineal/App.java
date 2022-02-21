package com.mycompany.calculadoralineal;

import com.mycompany.calculadoralineal.menu.Menu;
import com.mycompany.calculadoralineal.controllers.*;

import com.mycompany.calculadoralineal.modelos.MatrizInversa;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Inicializacion
        Scanner input = new Scanner(System.in);
        Menu newMenu = new Menu();
        MatrizController newMatrizController;
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
            case 3:
                newMatrizController = new MatrizController();
                newMatrizController.presentarMatriz();
                break;
        }
         
    }
}
