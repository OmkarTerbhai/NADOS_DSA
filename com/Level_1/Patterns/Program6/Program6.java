package com.Level_1.Patterns.Program6;


public class Program6 {
    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }

    public static void solve(int n) {
        int mid = (n / 2) + 1;

        int stars = mid;
        int spaces = 1;

        for(int i = 1;i <= n; i++) {
            for(int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            //stars = mid;
            for(int d = 1; d <= spaces; d++) {
                System.out.print("\t");
            }
            for(int y = 1; y <= stars; y++) {
                System.out.print("*\t");
            }
            //stars = mid;

            if(i < mid) {
                stars--;
                spaces += 2;
            }
            else {
                stars++;
                spaces -= 2;
            }

            System.out.println();
        }
    }
}
