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
public class Category extends DomainObject{
    private String name;
    private String description;
    ArrayList<Product> products;
    public Category(String name, String description, ArrayList<Product> products, String id) {
        super(id);
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
}
