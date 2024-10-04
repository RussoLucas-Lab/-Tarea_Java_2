//Evaluador de Hábitos Saludables
//Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
//ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
//hábitos saludables basada en estos datos.


import java.util.Scanner;

public class Ejercicio_Condicionales_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float tiempo_ejercicio;
        int horas_sueno,comidas_diarias;

        while(true) {
            System.out.print("Ingrese cuantos minutos de ejercicio diario realiza: ");
            tiempo_ejercicio = sc.nextFloat();

            if(tiempo_ejercicio>0){
                break;
            } else {System.out.print("Opcion incorrecta, intentelo nuevamente");}
        }
        while(true) {
            System.out.print("Ingrese cuantas horas duerme al día: ");
            horas_sueno = sc.nextInt();

            if(horas_sueno>0){
                break;
            } else {System.out.print("Opcion incorrecta, intentelo nuevamente");}
        }
        while(true) {
            System.out.print("Ingrese cuantas comidas realiza al día: ");
            comidas_diarias = sc.nextInt();

            if(comidas_diarias>0){
                break;
            } else {System.out.print("Opcion incorrecta, intentelo nuevamente");}
        }

        if(tiempo_ejercicio < 30){
            System.out.print("Poco ejercicio, se recomienda menos 30 minutos al día de actividad física moderada\n");
        } else {System.out.print("Buena cantidad de ejercicio, siga asi.\n");}
        if(horas_sueno < 9 && horas_sueno > 7){
            System.out.print("Buena cantidad de horas de sueño diario, siga asi\n");
        } else {System.out.print("Usted esta durmiendo poco/mucho\n");}
        if(comidas_diarias >= 3){
            System.out.print("Buena cantida de comidas diarias, siga asi\n");
        } else {System.out.print("Usted esta comiendo mucho\n");}
    }

}
