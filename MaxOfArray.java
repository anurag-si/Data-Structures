package com.arrays;

public class Main {

    public static void main(String[] args) {
        int A[]={2,9,4,5,10};
        int n=A.length;
        int a=A[0];

        for(int i=0;i<n;i++){
            int b=A[i];
            if(a<b){
                a=b;
            }
            else
                continue;
        }

        System.out.print(a);

    }
}