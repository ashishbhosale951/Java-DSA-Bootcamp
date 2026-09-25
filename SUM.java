package com.ashish;

import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float SUM = num1 + num2;


        System.out.println("SUM = " + SUM);
    }
}
