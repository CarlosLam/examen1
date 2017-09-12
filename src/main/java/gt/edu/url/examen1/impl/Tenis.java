package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.Reportero;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *Clase para el ejercicio #3
 * Esperamos que sea la que se lleve el equipo al hombro. 
 * @author lam_m
 */
public class Tenis implements Reportero {

    /**
     *Lista que almacenara la letra del ganador o almacenara otra letra
     */
    public char[] miLista = new char[6];
    
    /**
     * Mediante comparaaciones se decide al ganador
     * @param a es el número de juegos que gano el participante A
     * @param b es el número de juegos que gano el participante B
     * @return El ganador, si todavía esta en progreso o sí es invalida las opciones
     */
    @Override
    public String calcularGanador(int a, int b) {
        if(a>b){
            if(a == 7){
                if(b == 5||b==6){
                    IngresarGanador('A');
                    return "A gana el set";
                }
                else{
                    IngresarGanador('C');
                    return "No es valido";
                }
            }
            else if(a==6){
                if(b<5 && b>=0)
                {
                    IngresarGanador('A');
                    return "A gana el set";
                }
                else if(b == 5){
                    IngresarGanador('C');
                    return "Estan en juego";
                } 
                else{
                    IngresarGanador('C');
                    return "No es valido";
                }
            }
            else{
                if(a>7){
                    IngresarGanador('C');
                    return "no es valido";
                }
                else if(a + b < 11 && a + b >= 0)
                {
                    IngresarGanador('C');
                    return "Sigue en juego";
                }
            }
            
        }
        if(b>a){
            if(b == 7){
                if(a == 5||a==6){
                    IngresarGanador('B');
                    return "B gana el set";
                }
                else{
                    IngresarGanador('C');
                    return "No es valido";
                }
            }
            else if(b==6){
                if(a<5 && a>=0)
                {
                    IngresarGanador('B');
                    return "B gana el set";
                }
                else if(a == 5){
                    IngresarGanador('C');
                    return "Estan en juego";
                } 
                else{
                    IngresarGanador('C');
                    return "No es valido";
                }
            }
            else{
                if(b>7){
                    IngresarGanador('C');
                    return "no es valido";
                }
                else if(a + b < 11 && a + b >= 0)
                {
                    IngresarGanador('C');
                    return "Sigue en juego";
                }
            }
            
        }
        else{
            if(a==b && a <7|| a>=0){
                IngresarGanador('C');
                return "Sigue en juego";
            }
            
        }
        
            IngresarGanador('C');
        return "No es valido";
            
       
    }
    /**
     *Se calcula el campeon en base a los datos existentes en la lista 
     * @return El jugador ganador
     */
    @Override
    public String calcularCampeon() {
        int ganadorA=0;
        int ganadorB = 0;
        for(int i =0; i<miLista.length;i++){
            if(miLista[i] == 'A'){
                ganadorA++;
            }
            else if(miLista[i] == 'B'){
                ganadorB++;
            }
        }
        if(ganadorA > ganadorB){
            return "Campeón A";
        }
        else if(ganadorB > ganadorA){
            return "Campeón B";
        }
        else{
            return "No hay ganador";
        }
    }
    /**
     * Se recuerda la letra del ganador de un juego
     * @param juego se ingresa EL NUMERO de juego
     * @return El nombre del jugador
     */
    @Override
    public String recordarGanador(int juego) {
        
        return Character.toString(miLista[juego-1]);
    }
    /**
     * Metodo para agregar al ganador A, B o C en caso de no haber ganador
     * @param ganador Letra que sera almacenada en la lista
     */
    private void IngresarGanador(char ganador){
        for(int i =0; i<miLista.length;i++){
            if(miLista[i] != 'A' || miLista[i] != 'B' || miLista[i] != 'C'){
                miLista[i] = ganador;
                break;
            }
        }
            
    }
}
