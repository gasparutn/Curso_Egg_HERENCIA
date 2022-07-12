package heren_ejerc02;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Heren_Ejerc02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        List<Electrodomestico> varios = new ArrayList(4);

        for (int i = 0; i < 4; i++) {
            System.out.println("Electrodomestico numero>>>>>>>>>>>> " + (i + 1) + "\nPara lavadora tilde '1'. \nPara un televisor, tilde '2' ");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Lavadora lav1 = new Lavadora();
                    lav1.crearLavadora();
                    lav1.precioFinal();
                    varios.add(lav1);
                    break;
                case 2:
                    Televisor tv1 = new Televisor();
                    tv1.crearTelevisor();
                    tv1.precioFinal();
                    varios.add(tv1);
                    break;
                default:
                    System.out.println("Ha ingresador un opcion incorrecta");
                    break;

            }

        }

        System.out.println("los precios de los electrodomesticos son: ");

        Double sumtotal = 0d;

        for (Electrodomestico aux : varios) {
            sumtotal = sumtotal + aux.getPrecio();

        }
        System.out.println("la suma total es: " + sumtotal);
    }

}
