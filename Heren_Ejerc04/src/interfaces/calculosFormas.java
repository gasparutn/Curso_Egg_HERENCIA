/*
 *vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos 
para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán 
las formas y se mostrará el resultado final.
 */
package interfaces;


public interface calculosFormas {
    
    public double perimetro();
    public double area();
    double PI=Math.PI;       
    
    
}
