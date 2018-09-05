package com.varun;

public class PrintPattern {

    void printForN(int n){
        for(int line=0;line<n*2-1;line++){
            for(int i=0;i<n*2-1;i++){
                System.out.print(1+Math.max(Math.abs(n-i-1), Math.abs(n-line-1)));
            }
            System.out.println();
        }
    }
}
