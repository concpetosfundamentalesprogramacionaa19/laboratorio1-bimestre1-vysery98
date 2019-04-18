package paqueteprincipal;

import paquete1.*;
import paquete2.*;
import paquete3.*;

/**
 *
 * @author Fernando
 */
public class Principal {

    public static void main(String[] args) {

        // Usando la forma: expresion_logica ? expresion1 : expresion2
        String legal = MiClase1.edad > 18 ? " y mayor de edad" : " y menor de "
                + "edad";

        //Salida de Datos
        System.out.printf("Nombre: \n\t%s\nApellido: \n\t%s\nEdad: \n\t%s%s",
                MiClase2.nombre, MiClase3.apellido, MiClase1.edad, legal);

    }
}
