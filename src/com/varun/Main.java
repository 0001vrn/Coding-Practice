package com.varun;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
        public static void main(String args[] ) throws Exception {
            // Write your code here
            Scanner s = new Scanner(System.in);
            int n = Integer.parseInt(s.nextLine());
            String[] arr = s.nextLine().split(" ");

            ArrayList<ArrayList<Integer>> listOfSet = getListOfSet(arr, n);

            int q = Integer.parseInt(s.nextLine());

            while(q-->0){
                int k = Integer.parseInt(s.nextLine());
                System.out.println(getMaxLengthValidSet(listOfSet, k));
            }


        }

        static int getMaxLengthValidSet(ArrayList<ArrayList<Integer>> listOfSet, int k){
            int len = 0;
            for(ArrayList<Integer> i: listOfSet){
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

        static ArrayList<ArrayList<Integer>> getListOfSet(String[] arr, int n){

            ArrayList<ArrayList<Integer>> listOfSet = new ArrayList();
            // Run a loop for printing all 2^n
            // subsets one by obe
            for (int i = 0; i < (1<<n); i++)
            {
                ArrayList<Integer> set = new ArrayList();
                // Print current subset
                for (int j = 0; j < n; j++)

                    // (1<<j) is a number with jth bit 1
                    // so when we 'and' them with the
                    // subset number we get which numbers
                    // are present in the subset and which
                    // are not
                    if ((i & (1 << j)) > 0){
                        set.add(Integer.parseInt(arr[j]));
                    }

                listOfSet.add(set);
            }

            return listOfSet;
        }

}
