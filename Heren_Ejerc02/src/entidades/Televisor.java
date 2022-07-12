package entidades;

public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean TDT = true;

    public Televisor() {
    }

    public Televisor(int resolucion) {
        this.resolucion = resolucion;
    }

    public Televisor(int resolucion, int precio, String color, Character consuEnergetico, int peso) {
        super(precio, color, consuEnergetico, peso);
        this.resolucion = resolucion;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        System.out.println("\nElija atributos de su Televisor\n");
        creaElectrodomestico();
        System.out.println("Ingrese resolucion: ");
        this.resolucion = leer.nextInt();
        System.out.println("Tiene TDA SI/NO");
        String r = leer.next();
        if (r.equalsIgnoreCase("NO")) {
            TDT = false;
        }
        if (r.equalsIgnoreCase("SI"));
        TDT = true;

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            this.precio = (int) (precio * 1.30);
        }
        if (TDT == true) {
            this.precio += 500;
        }
        System.out.println("\nEl color es: " + this.color);
        System.out.println("El consumo es: " + this.consuEnergetico);
        System.out.println("Precio final: " + precio);

    }

}
