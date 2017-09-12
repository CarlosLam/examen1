package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Chudnovsky;
import gt.edu.url.examen1.api.Reportero;

/**
 *
 * @author tuxtor
 */
public class Main {
    
    public static void main(String[] args) {
        Chudnovsky di = new Algoritmo();
        System.out.println(di.calcularPi(0));
        Reportero r = new Tenis();
        System.out.println(r.calcularGanador(7,0));
        
        
        
    }
    
}
