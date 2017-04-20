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
public class Date {
    private int day;
    private int month;
    private int year;
    private String[] namesDay;
    private String[] namesMonths;   
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.namesDay = new String[7];
        this.namesMonths = new String[12];
    }

    public Date(int day, int month, int year, String[] namesDay, String[] namesMonths) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.namesDay = namesDay;
        this.namesMonths = namesMonths;
    }
    
    public boolean isLeapYear(int year){
        boolean f=false;
        if(year % 4 ==0){
            f=true;
        }
        return f;
    }
    
}
