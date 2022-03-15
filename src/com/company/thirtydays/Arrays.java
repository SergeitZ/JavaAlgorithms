package com.company.thirtydays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();


        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);

        System.out.println(arr);

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
