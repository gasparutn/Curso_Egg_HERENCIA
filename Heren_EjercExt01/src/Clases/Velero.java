/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author juani
 */
public class Velero extends Barcos {
    
    private int Mastiles;

    public Velero() {
    }

    public Velero(int Mastiles, String Matricula, int Eslora, int anio) {
        super(Matricula, Eslora, anio);
        this.Mastiles = Mastiles;
    }
    
    public int getMastiles() {
        return Mastiles;
    }

    public void setMastiles(int Mastiles) {
        this.Mastiles = Mastiles;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMastiles: " + Mastiles; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
