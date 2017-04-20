/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciorelaciones;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Semana {
    private int number;
    private Dia[] diasLaborales;
    private ArrayList<Sala> salas;

    public Semana(int number, Dia[] diasLaborales, ArrayList<Sala> salas) {
        this.number = number;
        this.diasLaborales = diasLaborales;
        this.salas = salas;
    }
    public ArrayList<Segmento> calcularSegmentosLibres(){
        ArrayList<Segmento> f=new ArrayList<>();
        return f;
    }

    public int getNumber() {
        return number;
    }

    public Dia[] getDiasLaborales() {
        return diasLaborales;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }
    
}
