package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class migratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

    /*
    Iterate through the list
    Create a hashmap to store the count of each bird type
    Iterate
    Determine which bird type was spotted more than once
    if
     */
        HashMap<Integer, Integer> birdsSpotted = new HashMap<>();

        int type = 0;
        for (int i = 0; i < arr.size(); i++) {

            birdsSpotted.put(arr.get(i), Collections.frequency(arr, arr.get(i)));
        }

        for (Integer amount : birdsSpotted.values()) {

            if (amount > type) {
                type = amount;
            }
        }
        return type;
    }
}
