package com.leetcode.feb2023;

public class FruitsInBaskets {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1){
            return 1;
        }

        if(fruits.length==2){
            return 2;
        }
        int max = 2;
        int lastFruitCount = 0;
        int answer = Integer.MIN_VALUE;
        int key1 = -1;
        int key2 = -1;
        for(int fruit:fruits){
            if(fruit==key1 || fruit==key2){
                max++;
            }else {
                max = lastFruitCount + 1;
            }

            if(fruit==key2){
                lastFruitCount++;
            }else{
                lastFruitCount = 1;
            }

            if(fruit!=key2){
                key1 = key2;
                key2 = fruit;
            }
            answer = Math.max(answer,max);
        }
        answer = Math.max(answer,max);
        return answer;
    }

}
