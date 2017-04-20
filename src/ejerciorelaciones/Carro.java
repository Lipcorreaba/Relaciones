/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciorelaciones;

/**
 *
 * @author Usuario
 */
public class Carro {
    private Ruedas[] ruedas;
    private Chasis chasis;
    private Motor motor;    
    public Carro(Ruedas[] ruedas, Motor motor) {
        this.ruedas = ruedas;
        this.chasis = new Chasis();
        this.motor = motor;
    }
}
