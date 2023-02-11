package com.leetcode.feb2023;

import java.util.*;

public class ShortestPathAlternateColor {

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer,List<List<Integer>>> adjList = new LinkedHashMap<>();

        for(int[] redE:redEdges){
            adjList.computeIfAbsent(redE[0], k -> new ArrayList<List<Integer>>()).add(Arrays.asList(redE[1],0));
        }

        for(int[] blueE:blueEdges){
            adjList.computeIfAbsent(blueE[0], k -> new ArrayList<List<Integer>>()).add(Arrays.asList(blueE[1],1));
        }

        boolean[][] visited = new boolean[n][2];
        int[] answer = new int[n];
        Arrays.fill(answer,-1);
        answer[0] = 0;
        visited[0][0] = true;
        visited[0][1] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0,0,-1});
        while(!q.isEmpty()){
            int[] node = q.poll();
            int neighbour = node[0];
            int steps = node[1];
            int prevColor = node[2];

            if(!adjList.containsKey(neighbour)){
                continue;
            }


            for(List<Integer> l:adjList.get(neighbour)){
                int ne = l.get(0);
                int color = l.get(1);

                if(!visited[ne][color] && color!=prevColor){
                    if(answer[ne]==-1){
                        answer[ne] = 1 + steps;
                    }

                    visited[ne][color] = true;
                    q.add(new int[]{ne,1+steps,color});
                }
            }
        }
        return answer;
    }
}
