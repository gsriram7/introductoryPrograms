package com.company;

/**
 * Created by selvaram on 1/10/15.
 */
public class Program7 {
    public static void printDiamondWithName(int n, String name) {
        int c, k, space = 1;
        space = n - 1;
        for (k = 1; k <= n; k++) {
            for (c = 1; c <= space; c++)
                System.out.print(" ");
            space--;
            if(space < 0){
                System.out.print(name);
            }
            else
                for (c = 1; c <= 2 * k - 1; c++)
                    System.out.print("*");
            System.out.print("\n");
        }
        space = 1;
        for (k = 1; k <= n - 1; k++) {
            for (c = 1; c <= space; c++)
                System.out.print(" ");
            space++;
            for (c = 1; c <= 2 * (n - k) - 1; c++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
