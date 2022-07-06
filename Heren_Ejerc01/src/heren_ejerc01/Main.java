
package heren_ejerc01;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Main   {

    
    public static void main(String[] args) {
        
        Animal perro = new Perro("Pepe","choclos",5,"beagle");
        
        System.out.println(perro.toString());
        Animal gato = new Gato("Simon","ratas",10,"siames");
        System.out.println(gato.toString());
        Animal caballo = new Caballo("Raul","pasto",7,"mestizo");
        System.out.println(caballo.toString());
    }

    @Override
    public String toString() {
        return "Main{" + '}';
    }
    
}
