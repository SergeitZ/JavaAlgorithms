package com.company.thirtydays;

public class Recursion3 {
    // day 9
    public static int factorial(int n) {
        // Write your code here
        if (n <= 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        // write your code here
        System.out.println(factorial(3));
    }
}
