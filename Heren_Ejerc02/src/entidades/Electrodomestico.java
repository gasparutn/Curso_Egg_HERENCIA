package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected int precio;
    protected String color;
    protected Character consuEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, Character consuEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consuEnergetico = consuEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = +1000;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsuEnergetico() {
        return consuEnergetico;
    }

    public void setConsuEnergetico(Character consuEnergetico) {
        this.consuEnergetico = consuEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        char letras = letra;
        if (letras == 'A' || letras == 'B' || letras == 'C' || letras == 'D' || letras == 'E' || letras == 'F') {
            this.setConsuEnergetico(letras);
        } else {
            this.setConsuEnergetico('F');
        }
    }

    public void comprobarcolor(String color) {
        String colores = color;
        if (colores.equalsIgnoreCase("blanco") || colores.equalsIgnoreCase("negro") || colores.equalsIgnoreCase("rojo") || colores.equalsIgnoreCase("azul") || colores.equalsIgnoreCase("gris")) {
            this.setColor(colores);
        } else {
            this.setColor("blanco");
        }
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void creaElectrodomestico() {

        System.out.print("Ingrese el color: ");
        String coolor = leer.next();
        this.color = coolor;
        System.out.print("Ingrese el consumo: ");
        char consumo = leer.next().charAt(0);
        this.consuEnergetico = consumo;
        System.out.print("Ingrese peso: ");

        int peso = leer.nextInt();
        this.peso = peso;

        comprobarConsumoEnergetico(consumo);
        comprobarcolor(color);
        this.precio = 1000;

    }

    protected void precioFinal() {
        int preciofinal;

        switch (this.consuEnergetico) {
            case 'A':
                preciofinal = this.consuEnergetico + 1000;
                this.precio = preciofinal;
                break;
            case 'B':
                preciofinal = this.consuEnergetico + 800;
                this.precio = preciofinal;
                break;
            case 'C':
                preciofinal = this.consuEnergetico + 600;
                this.precio = preciofinal;
                break;
            case 'D':
                preciofinal = this.consuEnergetico + 500;
                this.precio = preciofinal;
                break;
            case 'E':
                preciofinal = this.consuEnergetico + 300;
                this.precio = preciofinal;
            case 'F':
                preciofinal = this.consuEnergetico + 100;
                this.precio = preciofinal;
                break;
        }

        int preciodefinitivo;
        if (this.peso > 1 && this.peso < 19) {
            preciodefinitivo = this.precio + 100;
            this.precio = preciodefinitivo;
        } else if (this.peso > 20 && this.peso < 49) {
            preciodefinitivo = this.precio + 500;
            this.precio = preciodefinitivo;
        } else if (this.peso > 50 && this.precio < 79) {
            preciodefinitivo = this.precio + 800;
            this.precio = preciodefinitivo;
        } else if (this.precio > 80) {
            preciodefinitivo = this.precio + 100;
            this.precio = preciodefinitivo;
        }

    }

}
