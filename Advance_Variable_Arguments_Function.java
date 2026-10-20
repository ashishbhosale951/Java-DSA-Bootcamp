package com.ashish;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

  demo("Ashish", "Rahul");

    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b,String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
    
