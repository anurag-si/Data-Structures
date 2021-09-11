package com.arrays;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int A[]={7,10,4,3,20,15};
        int n=A.length;
        int k=4;

        Arrays.sort(A);

        System.out.print(A[k-1]);
    }
}
