package com.leetcode.feb2023;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        int[] count = new int[26];
        int len1 = s1.length();
        int len2 = s2.length();

        for(int i=0;i<len1;i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }

        if(allZeroCount(count)){
            return true;
        }

        for(int j=len1;j<len2;j++){
            count[s2.charAt(j)-'a']--;
            count[s2.charAt(j-len1)-'a']++;
            if(allZeroCount(count)){
                return true;
            }
        }

        return false;
    }

    private boolean allZeroCount(int[] count){
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
