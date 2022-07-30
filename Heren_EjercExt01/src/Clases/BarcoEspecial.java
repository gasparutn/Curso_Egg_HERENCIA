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
public class BarcoEspecial extends BarcoNormal{
    private int N_Camarotes;

    public BarcoEspecial() {
    }

    public BarcoEspecial(int N_Camarotes, int CaballosDeFuerza, String Matricula, int Eslora, int anio) {
        super(CaballosDeFuerza, Matricula, Eslora, anio);
        this.N_Camarotes = N_Camarotes;
    }

    public int getN_Camarotes() {
        return N_Camarotes;
    }

    public void setN_Camarotes(int N_Camarotes) {
        this.N_Camarotes = N_Camarotes;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de camarotes: " + N_Camarotes; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
