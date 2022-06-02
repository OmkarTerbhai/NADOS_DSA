package com.Level_1.Patterns.Program10;


import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }

    public static void solve(int n) {
        int mid = n / 2;
        int outerSpaces = mid;
        int innerSpaces = -1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= outerSpaces; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");//First Star after outerSpaces

            for(int a = 1; a <= innerSpaces; a++) {
                System.out.print("\t");
            }
            if(i > 1 && i < n) {
                System.out.print("*\t");
            }

            if(i <= n / 2) {
                outerSpaces--;
                innerSpaces += 2;
            }
            else {
                outerSpaces++;
                innerSpaces -= 2;
            }
            System.out.println();
        }
    }
}
