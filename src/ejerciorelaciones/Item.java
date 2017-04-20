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
public class Item extends DomainObject{
    private String name;
    private double unitCost;
    private Product product;

    public Item(String name, double unitCost, String id) {
        super(id);
        this.name = name;
        this.unitCost = unitCost;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public double getUnitCost() {
        return unitCost;
    }
    
}
