package by.itstep.klimenko.javalessons.lesson18_19.controller;

import by.itstep.klimenko.javalessons.lesson18_19.util.ArrayInitializer;
import by.itstep.klimenko.javalessons.lesson18_19.util.Convertor;
import by.itstep.klimenko.javalessons.lesson18_19.view.Printer;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            Printer.print("Input size of array: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int [] array = new int [size];

        //ArrayInitializer.userInt(array);

        ArrayInitializer.randomInit(array);

        Printer.print(Convertor.toString(array));


        //logic

        //output result




    }

}
