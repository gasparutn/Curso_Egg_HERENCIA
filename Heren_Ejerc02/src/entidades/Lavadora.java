
/*
Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
 */
package entidades;

public class Lavadora extends Electrodomestico {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, Character consuEnergetico, int peso) {
        super(precio, color, consuEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        System.out.println("\nElija atributos de su lavadora\n");
        creaElectrodomestico();
        System.out.print("Ingrese carga: ");
        this.carga = leer.nextInt();
        leer.nextLine();
    }

    /*
Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
     */
    @Override
    public void precioFinal() {
        super.precioFinal();

        if (carga > 30) {
            this.precio += 500;
        }
        System.out.println("\nEl color es: " + this.color);
        System.out.println("El consumo es: " + this.consuEnergetico);
        System.out.println("Precio final: " + precio);
    }
}
