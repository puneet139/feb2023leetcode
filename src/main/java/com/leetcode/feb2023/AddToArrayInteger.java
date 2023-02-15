package com.leetcode.feb2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> kDigits = new ArrayList<>();
        for(;k!=0;k=k/10){
            kDigits.add(k%10);
        }
        int len = num.length-1;
        int start = 0;
        int carry = 0;
        while(start<kDigits.size() && len>=0){
            int value = num[len] + carry + kDigits.get(start);
            if(value>=10){
                carry = value/10;
                value = value%10;
            }else{
                carry = 0;
            }
            start++;
            len--;
            answer.add(value);
        }
        for(int j=start;j<kDigits.size();j++){
            int val = carry + kDigits.get(j);
            if(val>=10){
                carry = val/10;
                val = val%10;
            }else{
                carry = 0;
            }
            answer.add(val);
        }
        for(int j=len;j>=0;j--){
            int val = carry + num[j];
            if(val>=10){
                carry = val/10;
                val = val%10;
            }else{
                carry = 0;
            }
            answer.add(val);
        }
        if(carry!=0){
            answer.add(carry);
        }
        Collections.reverse(answer);
        return answer;
    }
}
