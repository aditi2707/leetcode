class Solution {
    public int minimumDistance(int n, List<List<Integer>> edges, int s, int[] marked) {

        // Time Complexity : O(V + V + marked.length + E + Elog V)

        // Space Complexity : O(V + E + V + marked.length + (V * V - 1))
        // The graph can be a complete graph, so the minHeap may hold every edge
        // at some point.


        List<List<int[]>> adjList = new ArrayList<>();
        int[] distance = new int[n];
        Set<Integer> set = new HashSet<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0]? a[1] - b[1] : a[0] - b[0];
        });

        Arrays.fill(distance, Integer.MAX_VALUE);

        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        for(Integer i: marked){
            set.add(i);
        }

        for(List<Integer> i: edges){
            int u = i.get(0);
            int v = i.get(1);
            int wt = i.get(2);

            adjList.get(u).add(new int[]{v, wt});
        }

        distance[s] = 0;
        minHeap.add(new int[]{0, s});

        while(!minHeap.isEmpty()){
            int[] poll = minHeap.poll();
            int minDist = poll[0];
            int u = poll[1];

            if(set.contains(u)){
                return minDist;
            }

            for(int[] i: adjList.get(u)){
                int v = i[0];
                int wt = i[1];

                if(wt + minDist < distance[v]){
                    distance[v] = wt + minDist;
                    minHeap.add(new int[]{distance[v], v});
                }
            }
        }

        return -1;



        // // Time Complexity : O(V + V + E + Elog V + marked.length)

        // // Space Complexity : O(V + E + V + (V * V - 1))
        // // The graph can be a complete graph, so the minHeap may hold every edge
        // // at some point.

        
        // List<List<int[]>> adjList = new ArrayList<>();
        // int[] distance = new int[n];
        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0]? a[1] - b[1] : a[0] - b[0];
        // });

        // Arrays.fill(distance, Integer.MAX_VALUE);

        // for(int i = 0; i < n; i++){
        //     adjList.add(new ArrayList<>());
        // }

        // for(List<Integer> i: edges){
        //     int u = i.get(0);
        //     int v = i.get(1);
        //     int wt = i.get(2);

        //     adjList.get(u).add(new int[]{v, wt});
        // }

        // distance[s] = 0;
        // minHeap.add(new int[]{0, s});

        // while(!minHeap.isEmpty()){
        //     int[] poll = minHeap.poll();
        //     int minDist = poll[0];
        //     int u = poll[1];

        //     for(int[] i: adjList.get(u)){
        //         int v = i[0];
        //         int wt = i[1];

        //         if(wt + minDist < distance[v]){
        //             distance[v] = wt + minDist;
        //             minHeap.add(new int[]{distance[v], v});
        //         }
        //     }
        // }

        // int ans = Integer.MAX_VALUE;

        // for(Integer i: marked){
        //     ans = Math.min(ans, distance[i]);
        // }

        // return ans == Integer.MAX_VALUE? -1 : ans;
    }
}
