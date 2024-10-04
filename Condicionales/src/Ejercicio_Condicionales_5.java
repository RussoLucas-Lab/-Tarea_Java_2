//Juego de Piedra, Papel o Tijera
//Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
//elige una opción al azar y determina quién gana. Imprime el resultado del juego.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_Condicionales_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc,exit;
        Boolean a = true;
        List<Integer> opc_check = Arrays.asList(1, 2, 3);

        while (a == true) {
            System.out.print("Bienvenido al juego Piedra, Papel o Tijeras\n");

            while (true) {

                System.out.print("Seleccione: (1) Papel | (2) Tijera | (3) Piedra: ");

                opc = sc.nextInt();

                if (opc_check.contains(opc)) {
                    break;
                } else {
                    System.out.print("Opcion incorrecta, intentelo nuevamente\n");
                }
            }
            Random random = new Random();
            int opc_random = random.nextInt(3) + 1;

            switch (opc) {
                case 1:
                        if (opc_random == 1) {
                            System.out.print("\nEMPATE\n");
                            System.out.print("Tu y la maquina eligen papel\n");
                            break;
                        } else if (opc_random == 2) {
                            System.out.print("\nPIERDES\n");
                            System.out.print("Tu eliges papel y la maquina elige tijera\n");
                            break;
                        } else if (opc_random == 3) {
                            System.out.print("\nGANAS\n");
                            System.out.print("Tu eliges papel y la maquina elige piedra\n");
                            break;
                        }
                    case 2:
                        if (opc_random == 2) {
                            System.out.print("\nEMPATE\n");
                            System.out.print("Tu y la maquina eligen tijera\n");
                            break;
                        } else if (opc_random == 3) {
                            System.out.print("\nPIERDES\n");
                            System.out.print("Tu eliges tijera y la maquina elige piedra\n");
                            break;
                        } else if (opc_random == 1) {
                            System.out.print("\nGANAS\n");
                            System.out.print("Tu eliges tijera y la maquina elige papel\n");
                            break;
                        }
                    case 3:
                        if (opc_random == 3) {
                            System.out.print("\nEMPATE\n");
                            System.out.print("Tu y la maquina eligen piedra\n");
                            break;
                        } else if (opc_random == 1) {
                            System.out.print("\nPIERDES\n");
                            System.out.print("Tu eliges piedra y la maquina elige papel\n");
                            break;
                        } else if (opc_random == 2) {
                            System.out.print("\nGANAS\n");
                            System.out.print("Tu eliges papel y la maquina elige tijera\n");
                            break;
                        }
                }

            while(true) {
                System.out.print("¿Deseas jugar de nuevo? (1) Si | (0) No: ");
                exit = sc.nextInt();
                if (exit == 1) {
                    break;
                } else if (exit == 0) {
                    a = false;
                    break;
                }else {System.out.print("Opcion incorrecta, intentelo de nuevo\n");}
            }
        }
    }
}