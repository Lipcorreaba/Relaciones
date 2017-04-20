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
public class Persona {
    private ArrayList<Carro> carros;
    public Persona() {
        this.carros = new ArrayList<>();
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void agregarCarros(Carro carros) {
        this.carros.add(carros);
    }
    
}
