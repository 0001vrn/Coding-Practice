package com.varun;

import java.util.*;

public class MostFrequentWord {

    String getMostFrequentWord(String str){
        String[] arr = str.split(" ");
        Map<String, Integer> map = new TreeMap<>();

        for(String i: arr){
            map.compute(i, (key, val)->{
               if(val == null)
                   return 1;
               else
                   return val+1;
            });
        }
        // Traverse through map to find the candidate
        // with maximum votes.
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }

            // If there is a tie, pick lexicographically
            // smaller.
            else if (val == maxValueInMap &&
                    winner.compareTo(key) > 0)
                winner = key;
        }

        return winner;
    }
}
