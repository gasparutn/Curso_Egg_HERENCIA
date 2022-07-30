/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juani
 */
public class Alquiler {

    private String Nombre;
    private long DNI;
    private Calendar Fecha_inicio;
    private Calendar Fecha_fin;
    private int Amarre;
    private Barcos Barco;

    public Alquiler(String Nombre, long DNI, Calendar Fecha_inicio, Calendar Fecha_fin, int Amarre, Barcos Barco) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        this.Amarre = Amarre;
        this.Barco = Barco;
    }

    public Alquiler() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Calendar getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(Calendar Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public Calendar getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(Calendar Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
    }

    public int getAmarre() {
        return Amarre;
    }

    public void setAmarre(int Amarre) {
        this.Amarre = Amarre;
    }

    public Barcos getBarco() {
        return Barco;
    }

    public void setBarco(Barcos Barco) {
        this.Barco = Barco;
    }

    Scanner sc = new Scanner(System.in);

    public void nuevoAlquiler(ArrayList<Barcos> barcos) {
        System.out.println("\t----  Crear nuevo alquiler ----");
        System.out.print("Nombre: ");
        this.Nombre = sc.nextLine();

        System.out.print("DNI: ");
        this.DNI = sc.nextLong();

        System.out.print("Fecha de inicio de alquiler (dd mm aaaa): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        sc.nextLine();

        Fecha_inicio = Calendar.getInstance();
        this.Fecha_inicio.set(anio, mes, dia);

        System.out.print("Fecha de finalizacion de alquiler (dd mm aaaa): ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();
        sc.nextLine();

        Fecha_fin = Calendar.getInstance();
        this.Fecha_fin.set(anio, mes, dia);

        System.out.println("Barco:");
        System.out.println("Instruccion para los barcos");
        System.out.println("El multiplicador que acompaña al precio depende de las condiciones de cada barco");
        System.out.println("Veleros        - Cantidad de dias + 10 veces el tamanio de la eslora + N° de mastiles.");
        System.out.println("Barcos a Motor - Cantidad de dias + 10 veces el tamanio de la eslora + CV del motor.");
        System.out.println("Yates de lujo  - Cantidad de dias + 10 veces el tamanio de la eslora + CV del motor + Cantidad de camarotes\n");

        if (barcos.isEmpty()) {
            System.out.println("No hay barcos disponibles");
        } else {
            int i = 1;
            for (Barcos bar : barcos) {
                System.out.print("Barco N°" + i + " (");
                if (bar instanceof BarcoEspecial) {
                    BarcoEspecial b1 = (BarcoEspecial) bar;
                    System.out.println("Especial)");
                    System.out.println(b1.toString());
                    System.out.println("Multiplicador: " + calcularMultiplicador(b1) + "\n");
                } else if (bar instanceof BarcoNormal) {
                    BarcoNormal b1 = (BarcoNormal) bar;
                    System.out.println("A motor)");
                    System.out.println(b1.toString());
                    System.out.println("Multiplicador: " + calcularMultiplicador(b1) + "\n");
                } else if (bar instanceof Velero) {
                    Velero b1 = (Velero) bar;
                    System.out.println("Velero)");
                    System.out.println(b1.toString());
                    System.out.println("Multiplicador: " + calcularMultiplicador(b1) + "\n");
                }
                i++;
            }

            while (true) {
                System.out.print("Indique el numero del barco que desea alquilar: ");
                int num = sc.nextInt();

                if (num <= barcos.size() && num > 0) {
                    Iterator<Barcos> it = barcos.iterator();
                    for (int j = 0; j < num; j++) {
                        Barcos b1 = it.next();
                        if (j == num - 1) {
                            this.Barco = b1;
                            it.remove();
                        }
                    }
                    break;
                } else {
                    System.out.println("ERROR. Numero invalido");
                }
            }
            System.out.println("Numero de amarre: ");
            this.Amarre = sc.nextInt();
            sc.nextLine();

            System.out.println("\nEnhorabuena! Usted alquilo el barco");
            System.out.println("Datos del alquiler:");
            System.out.println("Desde: " + Fecha_inicio.getTime().getDate() + "/" + Fecha_inicio.getTime().getMonth() + "/" + (Fecha_inicio.getTime().getYear() + 1900));
            System.out.println("Hasta: " + Fecha_fin.getTime().getDate() + "/" + Fecha_fin.getTime().getMonth() + "/" + (Fecha_fin.getTime().getYear() + 1900));
            System.out.println("Matricula del barco: " + Barco.getMatricula());
            System.out.println("Amarre N°: " + Amarre);
            System.out.println("Multiplicador: " + calcularMultiplicador(Barco));
        }
        System.out.println("---------------------------------------------------------------------------------");

    }

    private int calcularMultiplicador(Barcos bar) {
        long finMS = Fecha_fin.getTimeInMillis();
        long inicioMS = Fecha_inicio.getTimeInMillis();

        int dias = (int) (Math.abs(finMS - inicioMS) / (1000 * 60 * 60 * 24));

        int multiplicador = dias * 10 * bar.getEslora();

        if (bar instanceof BarcoEspecial) {
            BarcoEspecial b1 = (BarcoEspecial) bar;
            multiplicador += b1.getCaballosDeFuerza();
            multiplicador += b1.getN_Camarotes();
        } else if (bar instanceof BarcoNormal) {
            BarcoNormal b1 = (BarcoNormal) bar;
            multiplicador += b1.getCaballosDeFuerza();
        } else if (bar instanceof Velero) {
            Velero b1 = (Velero) bar;
            multiplicador += b1.getMastiles();

        }

        return multiplicador;
    }

}
