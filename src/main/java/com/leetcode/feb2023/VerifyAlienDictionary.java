package com.leetcode.feb2023;

public class VerifyAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] alphabetArray = new int[26];
        for(int i=0;i<order.length();i++){
            alphabetArray[order.charAt(i)-'a'] = i;
        }
        for(int i=1;i<words.length;i++){
            if(bigger(words[i-1],words[i],alphabetArray)){
                return false;
            }
        }
        return true;
    }

    private boolean bigger(String s1,String s2,int[] alphabetArray){
        int n = s1.length();
        int m = s2.length();
        for(int i=0;i<n && i<m;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return (alphabetArray[s1.charAt(i)-'a']>alphabetArray[s2.charAt(i)-'a']);
            }
        }
        return n>m;
    }

}
