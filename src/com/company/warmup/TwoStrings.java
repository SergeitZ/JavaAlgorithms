package com.company.warmup;

import java.util.*;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        boolean containsSubstring = false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), i);
        }

        for (int j = 0; j < s2.length(); j++) {
            if (map.containsKey(s2.charAt(j))) {
                containsSubstring = true;
                break;
            }
        }
        return containsSubstring ? "YES" : "NO";

    }
    public static void main(String[] args) {
        System.out.println(twoStrings("Hello", "World"));
        System.out.println(twoStrings("Sergio", "Elda"));
    }
}