package com.epam.training.student_Aliaksandr_Blahirau;

import java.util.Scanner;

public class InputStringProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int number = scan.nextInt();
        System.out.println("Hello " + input);
        System.out.println("number is " + number);

    }
}
