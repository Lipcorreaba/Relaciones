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
public class Cuenta {
    private int numero;
    private double soldeCourant;
    private Date dateCreation;
    private String nomCliente;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int numero, double soldeCourant, Date dateCreation, String nomCliente) {
        this.numero = numero;
        this.soldeCourant = soldeCourant;
        this.dateCreation = dateCreation;
        this.nomCliente = nomCliente;
        this.movimientos = new ArrayList<>();
    }
    public void agregarMovimiento(Date date, double soldePrecedent, double cantidad, Tipo tipo) {
        Movimiento movimiento=new Movimiento(date,soldePrecedent,cantidad,tipo);
        this.movimientos.add(movimiento);
    }  

    public int getNumero() {
        return numero;
    }

    public double getSoldeCourant() {
        return soldeCourant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
    
}
