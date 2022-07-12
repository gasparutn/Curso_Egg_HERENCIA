package entidades;

import interfaces.calculosFormas;
import java.util.Scanner;

/**
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
public class Circulo implements calculosFormas {

    Double radio;

    public Circulo() {
    }

    public Circulo(Double radio, Double base, Double perimetro) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void radioactualizar() {
        System.out.print("Ingrese radio del ciruclo:\n");
        this.radio = leer.nextDouble();
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public double perimetro() {

        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

}
