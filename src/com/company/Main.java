package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        program1();
        program2(8);
        Program3.printVertical(3);
        Program4.printIncrementally(3);
        Program5.printPyrimid(5);
        Program6.printDiamond(3);
        Program7.printDiamondWithName(3, "Selva");
        Program8.printMultiplesOf3and5();
        Program9.generate(30);
    }

    public static void program1(){
        System.out.println("*");
    }

    public static void program2(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
