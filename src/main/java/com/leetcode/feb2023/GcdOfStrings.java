package com.leetcode.feb2023;

public class GcdOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if(!(str2+str1).equals(str1+str2)){
            return "";
        }

        int gcdVal = gcd(str1.length(),str2.length());
        return str2.substring(0,gcdVal);
    }

    private int gcd(int p,int q){
        if(q==0){
            return p;
        }
        return gcd(q,p%q);
    }

}
