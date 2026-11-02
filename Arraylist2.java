package com.ashish;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(234);
        list.add(654);
        list.add(543);
        list.add(8765);
        list.add(357);
        list.add(765);
        list.add(28);
        list.add(6);
        list.add(99);
        list.add(633);
        list.add(2349);
        list.add(64);
        list.add(33);

         System.out.println(list.contains(64));


    }
}
