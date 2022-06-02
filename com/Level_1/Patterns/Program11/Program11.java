package com.Level_1.Patterns.Program11;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }
    private static void solve(int n) {
        int no = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(no + "\t");
                no++;
            }
            System.out.println();
        }
    }
}
