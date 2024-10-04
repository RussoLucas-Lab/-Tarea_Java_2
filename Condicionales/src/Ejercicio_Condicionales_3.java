//Sistema de Recomendación de Libros
//Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
//ciencia ficción) y luego recomiende un libro basado en su elección.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio_Condicionales_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int genero;
        List<Integer> genero_check = Arrays.asList(1, 2, 3, 4);

        while(true) {
            System.out.print("¿Qué genero de libro le interesa leer hoy?\n");
            System.out.print("(1) Accion | (2) Comedia | (3) Drama | (4) Ciencia Ficcion: ");
            genero = sc.nextInt();

            if(genero_check.contains(genero)){
                break;
            } else {}System.out.print("Opcion incorrecta, intentelo nuevamente\n");
        }
        switch (genero) {
            case 1:
                System.out.print("\nFANTACIA\n");
                System.out.print("El nombre del viento – Patrick Rothfuss\n" +
                        "La vida de Kvothe, un héroe, músico y mago, contada por él mismo en una taberna. Primera parte de Crónica del Asesino de Reyes, con un mundo lleno de magia y aventura.\n" +
                        "\n" +
                        "El señor de los anillos – J.R.R. Tolkien\n" +
                        "Un clásico de la fantasía épica, sigue a Frodo Bolsón y su grupo en una misión para destruir el Anillo Único y salvar la Tierra Media.\n" +
                        "\n" +
                        "La saga de Geralt de Rivia (El último deseo) – Andrzej Sapkowski\n" +
                        "Una colección de cuentos que presentan a Geralt, un cazador de monstruos, en un mundo lleno de magia, criaturas fantásticas y dilemas morales.\n");
                break;
            case 2:
                System.out.print("\nMISTERIO\n");
                System.out.print("El código Da Vinci – Dan Brown\n" +
                        "Un thriller que combina arte, historia y religión mientras el simbólogo Robert Langdon desentraña un misterio antiguo.\n" +
                        "\n" +
                        "El asesinato de Roger Ackroyd – Agatha Christie\n" +
                        "Un clásico del misterio con el detective Hércules Poirot en el centro de una investigación que tiene uno de los giros más sorprendentes de la historia del género.\n" +
                        "\n" +
                        "La chica del tren – Paula Hawkins\n" +
                        "Una historia de suspense psicológico que sigue a una mujer cuyas observaciones desde un tren la llevan a involucrarse en un misterio.\n");
                break;
            case 3:
                System.out.print("\nROMANCE\n");
                System.out.print("Orgullo y prejuicio – Jane Austen\n" +
                        "Un clásico del romance que narra la relación entre la ingeniosa Elizabeth Bennet y el orgulloso Sr. Darcy.\n" +
                        "\n" +
                        "Yo antes de ti – Jojo Moyes\n" +
                        "Un romance moderno que cuenta la historia de una joven cuidadora y su relación con un hombre tetrapléjico que le cambia la vida.\n" +
                        "\n" +
                        "Bajo la misma estrella – John Green\n" +
                        "Un conmovedor romance juvenil entre dos adolescentes que se enfrentan a sus luchas personales con el cáncer.\n");
                break;
            case 4:
                System.out.print("\nCIENCIA FICCION\n");
                System.out.print("Dune – Frank Herbert\n" +
                        "Una obra maestra de la ciencia ficción épica que narra la vida de Paul Atreides en un mundo desértico, donde se libra una lucha por el control del recurso más valioso del universo.\n" +
                        "\n" +
                        "Neuromante – William Gibson\n" +
                        "Un libro pionero en el subgénero ciberpunk, donde la inteligencia artificial y el ciberespacio juegan papeles cruciales en un futuro distópico.\n" +
                        "\n" +
                        "Fundación – Isaac Asimov\n" +
                        "La primera novela de la famosa Saga de la Fundación, explora el colapso de un imperio galáctico y los intentos por preservar el conocimiento y la civilización.\n");
                break;



        }

    }
}
