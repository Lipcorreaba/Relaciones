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
public class Vet {
    private ArrayList<Pet> pets;
    public Vet(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    
    public void removePet(Pet pet){
        this.pets.remove(pet);
    }
    public void addPet(Pet pet){
        this.pets.add(pet);
    }
    public void showPetsByType(String s){
        int p=1;
        int g=1;
        int h=1;
        if(s=="Perro"){
        for(int i=0;i<pets.size();i++){
            if(pets.get(i).sound()=="guau"){
                System.out.println("Perro: "+ p + ".." + pets.get(i).getName());
                p++;
            }
        }
        }
        if(s=="Gato"){
        for(int i=0;i<pets.size();i++){
            if(pets.get(i).sound()=="nya"){
                System.out.println("Gato: "+ g + ".." + pets.get(i).getName());
                g++;
            }
        }
        }
        if(s=="Hamster"){
        for(int i=0;i<pets.size();i++){
            if(pets.get(i).sound()=="guau"){
                System.out.println("Perro: "+ h + ".." + pets.get(i).getName());
                h++;
            }
        }
        }
    }
    public void showPets(){
        for(int i=0;i<pets.size();i++){
            System.out.println(pets.get(i).getName());
        }
    }
}
