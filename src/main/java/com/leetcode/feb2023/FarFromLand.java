package com.leetcode.feb2023;

import java.util.LinkedList;
import java.util.Queue;

public class FarFromLand {
    public int maxDistance(int[][] grid) {
        int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> onePos = new LinkedList<>();
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    onePos.add(new int[]{i,j});
                }
                visited[i][j] = grid[i][j];
            }
        }

        int maxDistance = -1;
        while(onePos.size()!=0){
            int qSize = onePos.size();
            while(qSize-- > 0){
                int[] q = onePos.poll();
                for(int[] dir:direction){
                    int x = dir[0] + q[0];
                    int y = dir[1] + q[1];

                    if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && visited[x][y]==0){
                        visited[x][y]  = 1;
                        onePos.add(new int[]{x,y});
                    }
                }

            }
            maxDistance++;
        }
        return (maxDistance==0)?-1:maxDistance;
    }
}
