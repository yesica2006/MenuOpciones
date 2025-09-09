package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //programa para crear un ciclo
        //y crear un menu de opciones
        Integer opcionSeleccionada=0;
        while (opcionSeleccionada != 5){
            System.out.println("Menu de opciones");
            System.out.println("****************");
            System.out.println("➕dijita 1 para sumar");
            System.out.println("➖digita 2 para restar");
            System.out.println("❌dita 3 para multiplicar");
            System.out.println("➗digita 4 para dividir");
            System.out.println("➡digita 5 para salir del programa");
            Scanner leerTeclado= new Scanner(System.in);
            System.out.println("selecciona una apcion por favor: 😎");
            opcionSeleccionada= leerTeclado.nextInt();
            
            //Evaluando caminos segun la opcion del usuario:
            if(opcionSeleccionada==1) {
                System.out.println("SUMANDO...");
            } else if (opcionSeleccionada==2) {
                System.out.println("RESTANDO...");
            }else if (opcionSeleccionada==3){
                System.out.println("ULTIPLICANDO...");
            } else if (opcionSeleccionada==4) {
                System.out.println("DIVIDIENDO...");
            } else if (opcionSeleccionada==5) {
                System.out.println("SALIENDO...");
            }else{
                System.out.println("OPCION INVALIDA...");
            }
        }
        }

    }
}