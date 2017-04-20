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
public class Sala {
    private ArrayList<Semana> semanas;

    public Sala(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }
    
}
