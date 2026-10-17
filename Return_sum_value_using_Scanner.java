package com.ashish;

import java.util.Scanner;

public class return_Value_sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
}

//return the value
    static int sum2() {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

        // remember after return sum nothing will execute below it
    }

}
