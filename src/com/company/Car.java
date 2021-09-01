
package com.company;
import java.util.Scanner;
public class Car {
    private int year;
    double volume;
    String name;


    public  Car(){
        int  year;
        double volume;
        String name;

    }
    public Car (int year,double volume,String name){
        this.year = year;
       this.volume = volume;
       this.name = name;
    }


    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year <= 1990 ){
            System.out.println("Введите год выше 1990 :");
            }
        else {
            this.year = year;
        }


    }
}



