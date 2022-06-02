package com.Level_1.Patterns.Program4;

public class Program4 {
    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }
    static void solve(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i <= j)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
