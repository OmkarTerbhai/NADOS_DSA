package com.Level_1.Patterns.Program8;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }

    public static void solve(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= n; j++) {
                if(i == j) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }
}
