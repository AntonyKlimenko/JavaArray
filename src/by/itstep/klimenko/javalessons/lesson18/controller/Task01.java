package by.itstep.klimenko.javalessons.lesson18.controller;

import by.itstep.klimenko.javalessons.lesson18.view.Printer;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size array: ");
        int size;


        do {
            Printer.print("Input size of array: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int [] array = new int [size];


        //logic

        //output result




    }

}