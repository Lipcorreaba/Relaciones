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
public class Domain_Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it=new Item("A",3500,"A1");
        Item it1=new Item("B",4200,"G5");
        Item it2=new Item("C",3450,"R3");
        ArrayList<Item> item=new ArrayList<>();
        item.add(it);
        item.add(it1);
        item.add(it2);
        Product p1=new Product("Queso","cheese",item,"E4");
        Product p2=new Product("Papa","potato",item,"T4");
        Product p3=new Product("Hielo","ice",item,"W8");
        ArrayList<Product> products=new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        Category cat=new Category("Comida","food",products,"D7");
        for(int i=0;i<cat.getProducts().size();i++){
            System.out.println(cat.getProducts().get(i).getName());
            for(int j=0;j<cat.getProducts().get(i).getItems().size();j++){
                System.out.println(cat.getProducts().get(i).getItems().get(j).getName()
                +"..."+cat.getProducts().get(i).getItems().get(j).getUnitCost());
            }
        }
    }
    
}
