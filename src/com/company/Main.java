package com.company;

public class Main {

    public static void main(String[] args) {
        // HW 1
        int [] integers = {2, 5, -3, 11, 193, -2};

        for (int i : integers)
            System.out.print (i + "  ");

        System.out.println();

        int sum = 0;
        for (int s : integers)
            sum = sum + s;
        System.out.println (sum);
    }
}
