package com.epam.training.student_Aliaksandr_Blahirau;

import java.io.IOException;

public class FirstProgram {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            System.out.println("code: " + x);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
