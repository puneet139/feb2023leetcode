package com.leetcode.feb2023;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }

        int len1 = s.length();
        int len2 = p.length();

        int[] count = new int[26];
        for(int i=0;i<len2;i++){
            count[p.charAt(i)-'a']++;
            count[s.charAt(i)-'a']--;
        }

        if(allCountZero(count)){
            ans.add(0);
        }

        for(int j=len2;j<len1;j++){
            count[s.charAt(j)-'a']--;
            count[s.charAt(j-len2)-'a']++;
            if(allCountZero(count)){
                ans.add(j-len2+1);
            }
        }
        return ans;
    }

    private boolean allCountZero(int[] count){
        for(int i=0;i< count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
