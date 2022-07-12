/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.calculosFormas;
import java.util.Scanner;

public class Rectangulo implements calculosFormas {

    double perimetro;
    double base;
    double altura;

    public Rectangulo() {
    }

    public Rectangulo(double perimetro, double base, double altura) {
        this.perimetro = perimetro;
        this.base = base;
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.print("Introduzca la base del rectangulo: ");
        this.base = leer.nextDouble();
        System.out.print("Ahora introduzca la altura: ");
        this.altura = leer.nextDouble();
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override

    public double perimetro() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }

    @Override
    public double area() {
        double area = base * altura;
        return area;
    }

}
