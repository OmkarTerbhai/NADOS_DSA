package com.Level_1.Patterns.Program13;


import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt();
        solve(n);
    }
    private static void solve(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(findnCr(i, j) + "\t");
            }
            System.out.println();
        }
    }
    private static int fact(int n) {
        int iNo = 1;
        for(int i = 1;  i <= n; i++) {
            iNo *= i;
        }
        return iNo;
    }
    private static int findnCr(int n, int r) {
        int iNo1 = fact(n);
        int iNo2 = fact(n - r);
        int iNo3 = fact(r);

        return iNo1 / (iNo2 * iNo3);
    }
}
