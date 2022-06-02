package com.Level_1.Patterns.Program5;

public class Program5 {
    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }
    static void solve(int n) {
        int mid = n / 2;

        int spaces = mid;
        int stars = 1;

        for(int i = 1; i <= n; i++) {
            //Iterate and print spaces first for each row
            for(int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            //Iterate and print stars after spaces on each row
            for(int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            if(i <= mid) {
                stars += 2;
                spaces--;
            }
            else {
                stars -= 2;
                spaces++;
            }
            System.out.println();
        }
    }
}

