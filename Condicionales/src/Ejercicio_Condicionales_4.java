//Calculadora de IMC con Recomendaciones
//Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
//calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
//peso, peso normal, sobrepeso, obesidad).


import java.util.Scanner;

public class Ejercicio_Condicionales_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float peso,altura,imc;

        while(true) {
            System.out.print("Ingrese su altura en metros: ");
            altura = sc.nextFloat();

            if(altura>0){
                break;
            } else {}System.out.print("Opcion incorrecta, intentelo nuevamente");
        }
        while(true) {
            System.out.print("Ingrese su peso en kilogramos: ");
            peso = sc.nextFloat();

            if(peso>0){
                break;
            } else {}System.out.print("Opcion incorrecta, intentelo nuevamente");
        }

        imc = (float) (peso / (altura* altura));

        if (imc<=18.5) {
            System.out.print("Su Indice de Masa Corporal es de: " + imc + "\n");
            System.out.print("BAJO PESO: aumenta la ingesta de calorías con alimentos nutritivos y consulta a un nutricionista para equilibrar tu dieta.");
        } else if (imc<=24.9) {
            System.out.print("Su Indice de Masa Corporal es de: " + imc + "\n");
            System.out.print("PESO NORMAL: mantén una dieta balanceada y sigue una rutina de actividad física regular para conservar tu peso saludable.");
            
        }else if (imc<=29.9) {
            System.out.print("Su Indice de Masa Corporal es de: " + imc + "\n");
            System.out.print("SOBREPESO: Controla las porciones, elige alimentos ricos en nutrientes y aumenta la actividad física para evitar subir de peso.");

        }else if (imc > 30) {
            System.out.print("Su Indice de Masa Corporal es de: " + imc + "\n");
            System.out.print("OBESIDAD: Busca apoyo médico o de un nutricionista para crear un plan de pérdida de peso, combinando dieta saludable y ejercicio constante.");

        }

    }
        
}
