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
public class People {
    private String name;
    private String id;
    private ArrayList<Pet> pets;
    public People(String name, String id) {
        this.name = name;
        this.id = id;
        this.pets = new ArrayList<>();
    }

    public People() {
    }
    
    public void addPet(Pet p){
        this.pets.add(p);
    }
    public void showPets(){
        for(int i=0;i<pets.size();i++){
            System.out.println(pets.get(i).getId() + " " + pets.get(i).getName());
        }
    }
}
