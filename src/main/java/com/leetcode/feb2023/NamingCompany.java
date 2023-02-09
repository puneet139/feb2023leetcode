package com.leetcode.feb2023;

import java.util.HashSet;
import java.util.Set;

public class NamingCompany {

    public long distinctNames(String[] ideas) {
        Set<String>[] words = new HashSet[26];
        for(int i=0;i<26;i++){
            words[i] = new HashSet<String>();
        }

        for(String idea:ideas){
            words[idea.charAt(0)-'a'].add(idea.substring(1));
        }
        long count = 0l;
        for(int i=0;i<25;i++){
            for(int j=i+1;j<26;j++){
                long mutual = 0l;
                for(String str:words[i]){
                    if(words[j].contains(str)){
                        mutual++;
                    }
                }
                count += 2 * (words[i].size()-mutual) * (words[j].size()-mutual);
            }
        }

        return count;
    }
}
