package com.company;

/**
 * Created by selvaram on 1/10/15.
 */
public class Program4 {
    public static void printIncrementally(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
