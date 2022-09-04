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


        // HW 3
        int[] VALUES = {-3, 2, 5, 6, 7};
        boolean RESULT = true;

        for (int N = 1; N < VALUES.length && RESULT; N++)
            if (VALUES[N] < VALUES[N - 1])
                RESULT = false;

        System.out.println (RESULT);


        // HW 4
        int[] original = {5, 4, -7, -2, -1};

        System.out.print ("reversed: ");
        for (int i = original.length - 1; i >= 0; i--)
            System.out.print (original [i] + " ");
        System.out.println ();


        // HW 5
        int[] original2 = {-3, 2, 6, -11};
        int cumulative_sum = 0;

        System.out.print ("cumulative sum: ");
        for (int i = 0; i < original2.length; i++) {
            cumulative_sum = cumulative_sum + original2 [i];
            System.out.print (cumulative_sum + " ");
        }
        System.out.println ();


        // HW 6
        int [] arr = {4, -3, -5, 9, 1, 11};
        int m = 1;
        int [] smaller = new int [arr.length];
        int [] larger = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] > m)
                larger [i] = arr [i];
            else if (arr [i] < m)
                smaller [i] = arr [i];
        }

        System.out.print ("smaller: ");
        for (int s : smaller)
            if (s != 0)
                System.out.print (s + " ");

        System.out.println ();
        System.out.print ("larger: ");
        for (int l : larger)
            if (l != 0)
                System.out.print (l + " ");

    }
}
