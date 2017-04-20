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
public class Banco {
    private String code;
    private ArrayList<Tipo> tipos;
    private ArrayList<Cuenta> cuentas;

    public Banco(String code, ArrayList<Tipo> tipos, ArrayList<Cuenta> cuentas) {
        this.code = code;
        this.tipos = tipos;
        this.cuentas = cuentas;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
}
