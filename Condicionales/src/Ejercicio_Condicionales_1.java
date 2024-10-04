//Sistema de Recomendación de Películas
//Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
//ciencia ficción) y luego recomiende una película basada en su elección


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_Condicionales_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int genero;
        List<Integer> genero_check = Arrays.asList(1,2,3,4);

        while(true) {
            System.out.print("¿Qué genero de película le interesa ver hoy?\n");
            System.out.print("(1) Accion | (2) Comedia | (3) Drama | (4) Ciencia Ficcion: ");
            genero = sc.nextInt();

            if(genero_check.contains(genero)){
                break;
            } else {}System.out.print("Opcion incorrecta, intentelo nuevamente");
        }
        switch (genero) {
            case 1:
                System.out.print("\nACCION\n");
                System.out.print("Mad Max: Fury Road (2015) - Un apocalipsis en el desierto con persecuciones vertiginosas y escenas de acción impresionantes.\n" +
                        "John Wick (2014) - Un ex-asesino a sueldo desata su furia después de perder a su perro.\n" +
                        "Die Hard (1988) - Un clásico de acción con Bruce Willis enfrentando terroristas en un rascacielos.\n" +
                        "Gladiator (2000) - Historia épica de venganza en la Roma antigua.\n" +
                        "The Dark Knight (2008) - Batman se enfrenta al anárquico Joker en esta obra maestra de Christopher Nolan.\n");
                break;
            case 2:
                System.out.print("\nCOMEDIA\n");
                System.out.print("Superbad (2007) - Dos amigos intentan tener la mejor noche de sus vidas antes de graduarse.\n" +
                        "The Hangover (2009) - Una despedida de soltero en Las Vegas que termina en una serie de situaciones caóticas.\n" +
                        "Groundhog Day (1993) - Un hombre revive el mismo día una y otra vez, con resultados hilarantes.\n" +
                        "Dumb and Dumber (1994) - Dos amigos muy torpes que se meten en situaciones absurdas.\n" +
                        "Bridesmaids (2011) - Una historia divertida sobre la preparación para una boda, llena de momentos incómodos y risas.\n");
                break;
            case 3:
                System.out.print("\nDRAMA\n");
                System.out.print("The Shawshank Redemption (1994) - La historia de un hombre injustamente encarcelado y su lucha por la libertad.\n" +
                        "A Beautiful Mind (2001) - Basada en la vida del matemático John Nash y su lucha contra la esquizofrenia.\n" +
                        "Schindler's List (1993) - La poderosa historia de un hombre que salvó a miles durante el Holocausto.\n" +
                        "Forrest Gump (1994) - Un hombre con un corazón puro atraviesa varios momentos históricos de Estados Unidos.\n" +
                        "La La Land (2016) - Una historia romántica y conmovedora sobre dos soñadores en Los Ángeles.\n");
                break;
            case 4:
                System.out.print("\nCIENCIA FICCION\n");
                System.out.print("Inception (2010) - Un thriller que explora el mundo de los sueños y la manipulación de la mente.\n" +
                        "Blade Runner 2049 (2017) - La secuela de un clásico que explora temas filosóficos sobre la identidad y la humanidad.\n" +
                        "The Matrix (1999) - Un mundo virtual creado por máquinas en el que los humanos están atrapados sin saberlo.\n" +
                        "Interstellar (2014) - Una odisea espacial que explora el tiempo, el amor y la supervivencia de la humanidad.\n" +
                        "Ex Machina (2014) - Un thriller psicológico sobre la inteligencia artificial y los dilemas éticos que plantea.\n");
                break;



        }
    }
}
