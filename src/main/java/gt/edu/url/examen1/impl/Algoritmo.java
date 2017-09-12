package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Chudnovsky;

/**
 *
 * @author tuxtor
 */
public class Algoritmo implements Chudnovsky{
    
    private double dividendo, divisor, resultado;
    @Override
    public double calcularPi(int cantidadDigitos) {
        if(cantidadDigitos == 0){
            resultado = (13591409/Math.pow(640320,1.5))*12;
        }
        else{
            
        }
        
        
        return 1/resultado;        
    }
    
    private int Factorial(int i){
        if(i == 0)
        {
            return 1;
        }
        else{
         return i*Factorial(i-1);   
        }
    }
    private double Potencia(double i,double j){
            return Math.pow(i,j);
        }
            
        
    }
    

