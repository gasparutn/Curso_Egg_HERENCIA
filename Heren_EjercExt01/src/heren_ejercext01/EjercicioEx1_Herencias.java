/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Clases.Alquiler;
import Clases.BarcoEspecial;
import Clases.BarcoNormal;
import Clases.Barcos;
import Clases.Velero;
import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class EjercicioEx1_Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Barcos b1 = new BarcoEspecial(5,200, "AD 123 DS2", 13, 2004);
           Barcos b2 = new BarcoEspecial(2,150, "EW 543 LS4", 9, 2015);
           Barcos b3 = new BarcoNormal(90, "FF 555 FE3", 25, 2020);
           Barcos b4 = new Velero(2, "GF 323 GR4", 6, 1989);
           
           ArrayList<Barcos> barcos = new ArrayList();
           
           barcos.add(b1);
           barcos.add(b2);
           barcos.add(b3);
           barcos.add(b4);
           
           Alquiler a1 = new Alquiler();
           
           a1.nuevoAlquiler(barcos);
           
           System.out.println(a1.getNombre());
           
           
           
    }
    
}
