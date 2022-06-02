package com.Level_1.Patterns.Program14;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }
    private static void solve(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
