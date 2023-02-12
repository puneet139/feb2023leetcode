package com.leetcode.feb2023;

import java.util.*;

public class MinimumFuelCost {

    public long minimumFuelCost(int[][] roads, int seats) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int n = roads.length + 1;
        int[] degree = new int[n];
        for(int[] edges:roads){
            adjList.computeIfAbsent(edges[0], k -> new ArrayList<Integer>()).add(edges[1]);
            adjList.computeIfAbsent(edges[1], k -> new ArrayList<Integer>()).add(edges[0]);
            degree[edges[0]]++;
            degree[edges[1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<n;i++){
            if(degree[i]==1){
                q.add(i);
            }
        }
        long fuel  = 0;
        int[] representative = new int[n];
        Arrays.fill(representative,1);
        while(!q.isEmpty()){
            int node = q.poll();
            if(!adjList.containsKey(node)){
                continue;
            }
            fuel += Math.ceil((double)representative[node]/seats);

            for(Integer neighbours:adjList.get(node)){
                degree[neighbours]--;
                representative[neighbours] += representative[node];
                if (degree[neighbours] == 1 && neighbours != 0) {
                    q.offer(neighbours);
                }
            }

        }

        return fuel;
    }
}
