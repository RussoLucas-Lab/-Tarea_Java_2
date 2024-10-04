// Sistema de Recomendación de Actividades
//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//recomiende una actividad basada en su estado de ánimo.


import java.util.Scanner;

public class Ejercicio_Condicionales_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Qué bien! Te recomiendo salir a pasear y disfrutar del día.");
                break;
            case "triste":
                System.out.println("Lo siento. Te recomiendo ver una película que te guste o hablar con un amigo.");
                break;
            case "enérgico":
                System.out.println("¡Genial! Te recomiendo hacer ejercicio o alguna actividad al aire libre.");
                break;
            case "relajado":
                System.out.println("¡Qué bien! Te recomiendo leer un libro o escuchar música relajante.");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Por favor, elige entre feliz, triste, enérgico o relajado.");
                break;
        }

    }
}



