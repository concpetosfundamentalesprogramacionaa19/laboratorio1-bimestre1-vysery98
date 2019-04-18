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

        String legal = MiClase1.edad > 18 ? " y mayor de edad" : " y menor de "
                + "edad";
        System.out.printf("Nombre: \n\t%s\nApellido: \n\t%s\nEdad: \n\t%s%s", 
                MiClase2.nombre, MiClase3.apellido , MiClase1.edad, legal);

    }
}
