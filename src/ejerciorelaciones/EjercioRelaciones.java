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
public class EjercioRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. Ruedas[] rueda=new Ruedas[4];
        for(int i=0;i<4;i++){
            rueda[i]=new Ruedas();
        }
        Motor motor=new Motor();
        Motor motor1=new Motor();
        Carro c1=new Carro(rueda,motor);
        Carro c2=new Carro(rueda,motor1);
        Persona p=new Persona();
        p.agregarCarros(c1);
        p.agregarCarros(c2);
        for(int j=0;j<p.getCarros().size();j++){
            System.out.println(p.getCarros().get(j));
        }*/
        /* 2. Date d=new Date();
        Tipo t1=new Tipo("a1");
        Tipo t2=new Tipo("b5");
        ArrayList<Tipo> tipos=new ArrayList<>();
        tipos.add(t1);
        tipos.add(t2);
        Cuenta c1=new Cuenta(1,35.7,d,"Alberto");
        Cuenta c2=new Cuenta(2,65.3,d,"Maria");
        c1.agregarMovimiento(d, 32.5, 34, t2);
        c1.agregarMovimiento(d, 32, 40, t1);
        c2.agregarMovimiento(d, 23, 34, t1);
        c2.agregarMovimiento(d, 67, 40, t2);
        ArrayList<Cuenta> cuentas=new ArrayList<>();
        cuentas.add(c1);
        cuentas.add(c2);
        Banco banco=new Banco("w23f",tipos,cuentas);
        for(int i=0;i<banco.getCuentas().size();i++){
            System.out.println(banco.getCuentas().get(i).getDateCreation().toString() + "-"
            + banco.getCuentas().get(i).getNumero() + "-" + banco.getCuentas().get(i).getSoldeCourant() + "-"
            + banco.getCuentas().get(i).getNomCliente());
            for(int j=0;j<banco.getCuentas().get(i).getMovimientos().size();j++){
                System.out.println(" " + banco.getCuentas().get(i).getMovimientos());
            }
        }*/
        /* 3. Date d1=new Date();
        Date d2=new Date();
        Date d3=new Date();
        Date d4=new Date();
        Date d5=new Date();
        Date d6=new Date();
        Segmento s1=new Segmento(d1,d2);
        Segmento s2=new Segmento(d3,d4);
        ArrayList<Segmento> s=new ArrayList<>();
        s.add(s1);
        s.add(s2);
        Dia dia1=new Dia(d1,"Lunes",s);
        Dia dia2=new Dia(d2,"Martes",s);
        Dia dia3=new Dia(d3,"Jueves",s);
        Dia dia4=new Dia(d4,"Viernes",s);
        Dia[] dias=new Dia[4];
        dias[0]=dia1;
        dias[1]=dia2;
        dias[2]=dia3;
        dias[3]=dia4;
        ArrayList<Semana> semanas=new ArrayList<>();
        ArrayList<Semana> semanas1=new ArrayList<>();
        ArrayList<Sala> salas=new ArrayList<>();
        Semana se1=new Semana(1,dias,salas);
        Semana se2=new Semana(2,dias,salas);
        Semana se3=new Semana(3,dias,salas);
        Sala sala1=new Sala(semanas);
        Sala sala2=new Sala(semanas);
        semanas.add(se1);
        semanas.add(se3);
        semanas1.add(se2);
        semanas1.add(se1);
        salas.add(sala1);
        salas.add(sala2);
        Programacion p=new Programacion(salas);
        for(int i=0;i<p.getSalas().size();i++){
            for(int j=0;j<p.getSalas().get(i).getSemanas().size();j++){
                System.out.print("Sala " + i + " Semana " + p.getSalas().get(i).getSemanas().get(j).getNumber() + ": ");
                for(int k=0;k<p.getSalas().get(i).getSemanas().get(j).getDiasLaborales().length;k++){
                    System.out.println(p.getSalas().get(i).getSemanas().get(j).getDiasLaborales()[k].getName());
                    for(int g=0;g<p.getSalas().get(i).getSemanas().get(j).getDiasLaborales()[k].getSegmentos().size();g++){
                        System.out.println(p.getSalas().get(i).getSemanas().get(j).getDiasLaborales()[k].getSegmentos().get(g).getHeureDebut().toString());
                    }
                }
            }
        }*/
        
    }
    
}
