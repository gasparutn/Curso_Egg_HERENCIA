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
public class BarcoNormal extends Barcos {
    protected int CaballosDeFuerza;

    public BarcoNormal(int CaballosDeFuerza, String Matricula, int Eslora, int anio) {
        super(Matricula, Eslora, anio);
        this.CaballosDeFuerza = CaballosDeFuerza;
    }

    public BarcoNormal() {
    }

    public int getCaballosDeFuerza() {
        return CaballosDeFuerza;
    }

    public void setCaballosDeFuerza(int CaballosDeFuerza) {
        this.CaballosDeFuerza = CaballosDeFuerza;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nCaballos de fuerza: " + CaballosDeFuerza; 
    }
    
    
    
}
