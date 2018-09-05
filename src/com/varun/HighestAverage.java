package com.varun;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;

public class HighestAverage {

    int getMaxLengthValidSet(ArrayList<ArrayList<Long>> listOfSet, int k){
        int len = 0;
        for(ArrayList<Long> i: listOfSet){
            try{
                OptionalDouble average = i.stream().mapToDouble(a -> a).average();
                if(average.getAsDouble() < k)
                    len = Math.max(len, i.size());
            }
            catch (NoSuchElementException e){
                continue;
            }
        }

        return len;
    }

    ArrayList<ArrayList<Long>> getListOfSet(String[] arr, int n){

        ArrayList<ArrayList<Long>> listOfSet = new ArrayList();

        for (int i = 0; i < (1<<n); i++)
        {
            ArrayList<Long> set = new ArrayList();

            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0){
                    set.add(Long.parseLong(arr[j]));
                }
            if(set.size()>1)
            listOfSet.add(set);
        }

        return listOfSet;
    }

}
