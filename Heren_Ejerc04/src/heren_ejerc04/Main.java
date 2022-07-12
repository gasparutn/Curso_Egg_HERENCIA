package heren_ejerc04;

import entidades.Rectangulo;
import entidades.Circulo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo cirperim = new Circulo();
        cirperim.radioactualizar();
        System.out.println("*************************************************");
        System.out.println("El perimetro del circulo es: " + cirperim.perimetro());
        System.out.println("El area del ciruclo es: " + cirperim.area());
        System.out.println("*************************************************");
        Rectangulo RectaPerim = new Rectangulo();
        RectaPerim.crearRectangulo();
        System.out.println("**************************************************");
        System.out.println("El perimetro del rectangulo es: " + RectaPerim.perimetro());
        System.out.println("El area del rectangulo es: " + RectaPerim.area());
    }
}
