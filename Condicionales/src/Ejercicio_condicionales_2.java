//Calculadora de Descuentos
//Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
//(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
//15% para jubilados. Imprime el precio final después del descuento.


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_condicionales_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float precio, precio_final;
        int categoria;
        List<Integer> categoria_check = Arrays.asList(1, 2, 3, 4);

        while (true) {
            System.out.print("Seleccione su categoria\n");
            System.out.print("(1) Estudiante | (2) Adulto | (3) Jubilado: ");
            categoria = sc.nextInt();

            if (categoria_check.contains(categoria)) {
                break;
            } else {
            }
            System.out.print("Opcion incorrecta, intentelo nuevamente\n");

        }

        while (true) {
            System.out.print("Ingrese el precio del producto: ");

            precio = sc.nextFloat();

            if (precio >= 0) {
                break;
            } else {
            }
            System.out.print("Precio negativo, intentelo nuevamente\n");

        }
        switch (categoria) {

            case 1:
                System.out.print("ESTUDIANTE\n");
                System.out.print("Usted obtiene un descuento del 10%\n");
                precio_final = (float) (precio * 0.90);
                System.out.print("El precio con descuento es de: " + precio_final);
                break;
            case 2:
                System.out.print("ADULTO\n");
                System.out.print("Usted obtiene un descuento del 5%\n");
                precio_final = (float) (precio * 0.95);
                System.out.print("El precio con descuento es de: " + precio_final);
                break;
            case 3:
                System.out.print("JUBILADO\n");
                System.out.print("Usted obtiene un descuento del 15%\n");
                precio_final = (float) (precio * 0.85);
                System.out.print("El precio con descuento es de: " + precio_final);
                break;
        }
    }
            }



