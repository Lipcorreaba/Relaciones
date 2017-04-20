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
public class Product extends DomainObject{
    private String name;
    private String description;
    private Category category;
    private ArrayList<Item> items;

    public Product(String name, String description, ArrayList<Item> items, String id) {
        super(id);
        this.name = name;
        this.description = description;
        this.items = items;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
}
