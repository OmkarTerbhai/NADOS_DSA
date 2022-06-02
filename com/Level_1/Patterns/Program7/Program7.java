package com.Level_1.Patterns.Program7;


import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        solve(scn.nextInt());
    }

    public static void solve(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if (i == j) {
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

