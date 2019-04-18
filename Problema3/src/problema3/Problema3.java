package problema3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Problema3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Declaración de Variables
        String nota1;
        String nota2;
        String nota3;
        double promedio;

        // Entrada de Datos
        System.out.println("Ingrese la nota 1: ");
        nota1 = scan.nextLine();

        System.out.println("Ingrese la nota 2: ");
        nota2 = scan.nextLine();

        System.out.println("Ingrese la nota 3: ");
        nota3 = scan.nextLine();

        // Cálculo del promedio
        // Uso de Cast
        promedio = (Double.parseDouble(nota1) + Double.parseDouble(nota2)
                + Double.parseDouble(nota3)) / 3;

        // Usando la forma: expresion_logica ? expresion1 : expresion2
        String resultado = promedio>14 ? "pasa el año" : "no pasa el año" ;
        
        // Salida de Datos
        System.out.printf(resultado);
    }

}
