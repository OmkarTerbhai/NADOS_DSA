package com.Level_1.Patterns.Program9;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }
    public static void solve(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= n; j++) {
                if(i + j == n + 1 && i != j) {
                    System.out.print("*\t");
                }
                else if(i == j) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
