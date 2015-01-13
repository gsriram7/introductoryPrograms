package com.company;

public class Program9 {
    public static void generate(int num){
        int i=1,j,k;
        while(i<=num){
            k=0;
            if(num%i==0){
                j=1;
                while(j<=i){
                    if(i%j==0)
                        k++;
                    j++;
                }
                if(k==2)
                    System.out.println(i + "\t");
            }
            i++;
        }
    }

}
