package com.Level_1.Patterns.Program2;

public class Program2 {
    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }
    static void solve(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
