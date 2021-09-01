package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Домашка №5

        Car car1 = new Car();
        car1.setYear(2000);
        car1.volume = 3.2;
        car1.name = "BMW";
        System.out.println("Год машины : " + " " + car1.getYear() + " " + "Объем : " + " " + car1.volume + " " + "Название машины" + " " + car1.name );

        Car car2 = new Car(2014,1.8,"Honda FIT");
        System.out.println("Год машины : " + " " + car2.getYear() + " " + "Объем : " + "," + car2.volume + " " + "Название машины" + " " + car2.name );

        Car car3 = new Car();
        car3.setYear(2012);
        car3.volume = 2.0;
        car3.name = "BMW";
        System.out.println("Год машины : " + " " + car3.getYear() + " " + "Объем : " + " " + car3.volume + " " + "Название машины" + " " + car3.name );

        Scanner name1 = new Scanner(System.in);
        String name;
        String age;
        System.out.println("Введите своё ФИО :");
        name = name1.nextLine();
        System.out.println("Введите ваш возраст : ");
        age = name1.nextLine();
        System.out.println(" Здравствуйте : " + name + " " + "Ваш возраст : " + " " + age);

    }
}
