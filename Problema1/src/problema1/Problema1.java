package problema1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Problema1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Declaración de Variables
        int horasTrabajadas;
        double costoPorHora;
        double valorSueldo;
        double valorSeguroS;
        
        //Entrada de Datos
        System.out.println("Ingrese el valor correspondiente al número de horas"
                + " trabajadas: ");
        horasTrabajadas = scan.nextInt();

        System.out.println("Ingrese el valor correspondiente al costo por hora"
                + " oficial: ");
        costoPorHora = scan.nextDouble();

        // Cálculo de Valor mensual a pagar al trabajador
        valorSueldo = horasTrabajadas * costoPorHora;
        
        // Valor del descuento al Seguro social
        valorSeguroS = valorSueldo * 0.10;
        
        //Salida de Datos
        System.out.printf("Total a pagar: %.2f\nValor del descuento al Seguro "
                + "Social: %.2f", valorSueldo, valorSeguroS);
    }

}
