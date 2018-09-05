package com.varun;

public class ValidateIPv4 {

    public boolean isValidNum(int s){
        if(s<0 || s>255)
            return false;
        return true;
    }
    public boolean isValidIP(String s){
        //Write your code here
        if(s.length()>0){
            String[] arr = s.split("\\.");
            if(arr.length != 4)
                return false;

            for(String i: arr){
                if(i.length()>3)
                    return false;
                if(i.length()==3){
                    return isValidNum(Integer.parseInt(i));
                }
            }
        }

        return true;
    }

    public boolean isValidIP2(String s){
        if(s.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))
            return true;
        else
            return false;
    }
}
