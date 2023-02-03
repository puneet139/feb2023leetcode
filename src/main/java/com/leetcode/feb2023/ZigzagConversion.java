package com.leetcode.feb2023;

import java.util.Arrays;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        int n = s.length();
        int sections = (int)Math.ceil(n/(2 * numRows - 2.0));
        int numCols = sections * (numRows - 1);

        char[][] matrix = new char[numRows][numCols];
        for (char[] row: matrix) {
            Arrays.fill(row, ' ');
        }
        int currRow = 0;
        int currCol = 0;
        int currentStringIndex = 0;
        int i = 0;
        while(currentStringIndex<n){
            while(currRow<numRows && currentStringIndex<n){
                matrix[currRow][currCol] = s.charAt(currentStringIndex);
                currRow++;
                currentStringIndex++;
            }

            currRow -= 2;
            currCol += 1;

            while(currRow>0 && currCol<numCols && currentStringIndex<n){
                matrix[currRow][currCol] = s.charAt(currentStringIndex);
                currRow--;
                currCol++;
                currentStringIndex++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char[] row:matrix){
            for(char ch:row){
                if(ch!=' '){
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
