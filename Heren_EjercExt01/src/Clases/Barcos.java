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
public class Barcos {
    protected String Matricula;
    protected int Eslora;
    protected int anio;

    public Barcos() {
    }

    public Barcos(String Matricula, int Eslora, int anio) {
        this.Matricula = Matricula;
        this.Eslora = Eslora;
        this.anio = anio;
    }

    
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getEslora() {
        return Eslora;
    }

    public void setEslora(int Eslora) {
        this.Eslora = Eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Matricula: " + Matricula + "\nEslora: " + Eslora + "\nAnio: " + anio;
    }
    
    
}
