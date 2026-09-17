package com.diagnostic;

import java.util.Scanner;

public class medium2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        bEx();

    }


    static void bEx(){
        float a = 0.1F;
        float b = 0.2F;
        float c = a + b;
        System.out.println(c == 0.3);
        System.out.println(c);
    }
}
