package com.company.warmup;

import java.util.List;

public class AngryProfessor {
    // Hakerrank warmup Algorithm
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        int onTime = 0;

        for (Integer time : a) {
            if (time <= 0) {
                onTime++;
            }
        }

        if (onTime >= k) {
            return "NO";
        } else {
            return "YES";
        }

    }

    public static void main(String[] args) {



    }
}