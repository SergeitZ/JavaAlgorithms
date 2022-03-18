package com.company.thirtydays;

public class BinaryNumbers {
    // Day 10

    public static void main(String[] args) {

        int n = 5;
        // int count the max consecutive is in the binary representation of the int

        // int

        // convert to binary
        String bin = Integer.toBinaryString(n);
        // n = 125,
        // bin = "1111101"

        // find max consecutive is -> count the consecutive 1s
        // for -> iterate through the lenght of the string chartat (index)
        // forEach -> iterate through each character individually
        // split -> split the string into a string[] of groups of is.

        int currentConsecutive = 0;
        int maxConsecutive = 0;
        for (char digit : bin.toCharArray()) {
            currentConsecutive++;
            if (digit == '0') {
                currentConsecutive = 0;
            }
            if (currentConsecutive > maxConsecutive) {
                maxConsecutive = currentConsecutive;
            }
        }
        System.out.println(maxConsecutive);
    }
}
