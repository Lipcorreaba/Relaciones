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
public class Pet {
    private String id;
    private String name;
    private String hairColor;
    private People owner;
    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
        this.owner = new People();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }
    
    public String sound(){
        return "a";
    }

    public void setOwner(People owner) {
        this.owner = owner;
    }
    
}
