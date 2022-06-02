package com.Level_1.Patterns.Program12;


import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }

    private static void solve(int n) {
        int no = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(printFibonacciRow(no) + "\t");
                no++;
            }
            System.out.println();
        }
    }

    private static int printFibonacciRow(int n) {
        int a = 1;
        int b = 0;
        int c = 0;//Fibonacci Number holder


        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;//First number becomes new first
            b = c;//Second becomes new second i.e. last fibonacci
        }
        return c;
    }
}
