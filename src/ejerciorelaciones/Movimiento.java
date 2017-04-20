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
public class Movimiento {
    private Date date;
    private double soldePrecedent;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(Date date, double soldePrecedent, double cantidad, Tipo tipo) {
        this.date = date;
        this.soldePrecedent = soldePrecedent;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
    
}
