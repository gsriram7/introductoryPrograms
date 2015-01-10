package com.company;

/**
 * Created by selvaram on 1/10/15.
 */
public class Program5 {
    public static void printPyrimid(int n) {
        int row, c, temp;
        temp = n;
        for (row = 1; row <= n; row++) {
            for (c = 1; c < temp; c++)
                System.out.print(" ");
            temp--;
            for (c = 1; c <= 2 * row - 1; c++)
                System.out.print("*");
            System.out.println();
        }
    }
}
