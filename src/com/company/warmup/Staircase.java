package com.company.warmup;

public class Staircase {

    public static void staircase(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {
        StringBuilder stair = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                if (j + i >= n) {
                    stair.append("#");
                } else {
                    stair.append(" ");
                }
            }
            System.out.println(stair);
        }
    }

    public static void main(String[] args) {

        staircase(6);
    }
}
