package ua.lviv.IoT.lab2;

import ua.lviv.IoT.lab2.chemicals.Detergents;
import ua.lviv.IoT.lab2.chemicals.Kitchens;
import ua.lviv.IoT.lab2.chemicals.Toiletries;

public class Main {

    public static void main (String [] arg){

        Detergents example1 = new Detergents(100, 500, "Samsung", 7.5, true);
        Toiletries example2 = new Toiletries(50, 1000, "Xiaomi", 85, 10);
        Kitchens example3 = new Kitchens(25, 1500, "Apple", 27, false);

        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
    }
}