package com.arrays;

public class Reverse_Array{
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int n = A.length;

        Reverse(A, 0, n - 1);
        printArray(A, n);
    }


    public static void Reverse(int B[], int s, int p) {
        while (s < p) {
            int T = B[s];
            B[s] = B[p];
            B[p] = T;
            s++;
            p--;
        }
    }

    public static void printArray(int B[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(B[i]);
        }
    }
}