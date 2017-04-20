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
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        People p1=new People("Alberto","123");
        People p2=new People("Mery","456");
        Cat k=new Cat(true,"C1","Yuki","negro");
        Dog j=new Dog("Pug","D1","Machas","Blanco con negro");
        Hamster ks=new Hamster(34.7,"H1","Lou","Cafe con blanco");
        ArrayList<Pet> pets=new ArrayList<>();
        pets.add(k);
        pets.add(j);
        pets.add(ks);
        Vet v=new Vet(pets);
        int c=manageVet(v);
        switch(c){
            case 1:
                int ch=0;
                System.out.println("1. Perro");
                System.out.println("2. Gato");
                System.out.println("3. Hamster");
                ch=leer.nextInt();
                switch(ch){
                    case 1:
                        String id=leer.next();
                        String name=leer.next();
                        String hairColor=leer.next();
                        String breed=leer.next();
                        Dog d=new Dog(breed,id,name,hairColor);
                        v.addPet(d);
                        break;
                    case 2:
                        String id1=leer.next();
                        String name1=leer.next();
                        String hairColor1=leer.next();
                        boolean isHunter=leer.nextBoolean();
                        Cat ca=new Cat(isHunter,id1,name1,hairColor1);
                        v.addPet(ca);
                        break;
                    case 3:
                        String id2=leer.next();
                        String name2=leer.next();
                        String hairColor2=leer.next();
                        double weight=leer.nextInt();
                        Hamster ham=new Hamster(weight,id2,name2,hairColor2);
                        v.addPet(ham);
                        break;
                    default:
                        System.out.println("Invalido");
                }
                break;
            case 2:
                int ch1=0;
                System.out.println("1. Perro");
                System.out.println("2. Gato");
                System.out.println("3. Hamster");
                ch1=leer.nextInt();
                switch(ch1){
                    case 1:
                        v.showPetsByType("Perro");
                        String ids=leer.next();
                        String idf=leer.next();
                        String name=leer.next();
                        People owner=new People(name, idf);
                        for(int u=0;u<v.getPets().size();u++){
                            if(v.getPets().get(u).getId()==ids){
                                v.getPets().get(u).setOwner(owner);
                            }
                        }
                        break;
                    case 2:
                        v.showPetsByType("Gato");
                        String ids1=leer.next();
                        String idf1=leer.next();
                        String name1=leer.next();
                        People owner1=new People(name1, idf1);
                        for(int u=0;u<v.getPets().size();u++){
                            if(v.getPets().get(u).getId()==ids1){
                                v.getPets().get(u).setOwner(owner1);
                            }
                        }
                        break;
                    case 3:
                        v.showPetsByType("Hasmter");
                        String ids2=leer.next();
                        String idf2=leer.next();
                        String name2=leer.next();
                        People owner2=new People(name2, idf2);
                        for(int u=0;u<v.getPets().size();u++){
                            if(v.getPets().get(u).getId()==ids2){
                                v.getPets().get(u).setOwner(owner2);
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalido");
                }
                break;
            case 3:
                v.showPets();
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
    public void readPets(Vet v){
        v.showPets();
    }
    public static int manageVet(Vet v){
        Scanner leer=new Scanner(System.in);
        int c=0;
        System.out.println("1. Comprar Mascota");
        System.out.println("2. Vender Mascota");
        System.out.println("3. Listar Mascotas");
        c=leer.nextInt();
        return c;
    }
}
