package problema2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Problema2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Declaración de Variables
        String x;
        String y;
        String z;
        double m;

        // Entrada de Datos
        System.out.println("Ingrese el valor correspondiente a \"x\": ");
        x = scan.nextLine();

        System.out.println("Ingrese el valor correspondiente a \"y\": ");
        y = scan.nextLine();

        System.out.println("Ingrese el valor correspondiente a \"z\": ");
        z = scan.nextLine();

        // Cálculo de "m"
        // Uso de Cast
        m = (Double.parseDouble(x) + (Double.parseDouble(y)
                / Double.parseDouble(z))) / (Double.parseDouble(x)
                - (Double.parseDouble(y) / Double.
                parseDouble(z)));

        // Salida de Datos usando Cast para presentar x, y y z
        System.out.printf("El valor de m, en base a las variables: \nx = %.2f\n"
                + "\ty = %.2f\n\t\tz = %.1f\nda como resultado: \n\t\t\tm = %."
                + "2f", Double.parseDouble(x), Double.parseDouble(y), Double.
                parseDouble(z), m);
    }

}
