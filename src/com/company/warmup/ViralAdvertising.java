package com.company.warmup;

public class ViralAdvertising {
    // Hackerrank Implementation Algorigthm

    public static int viralAdvertising(int n) {
        // Write your code here
        int shared = 5;
        int liked = 0;
        int cumulative = 0;

        for (int i = 0; i < n; i++) {
            liked = (int) Math.floor(shared/2);
            shared = liked * 3;
            cumulative += liked;
        }

        return cumulative;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }
}
