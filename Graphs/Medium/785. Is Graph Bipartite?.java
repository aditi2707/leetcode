class Solution {

    private boolean dfs(List<List<Integer>> adjList, int src, int color, int[] visited){

        visited[src] = color;

        for(Integer i: adjList.get(src)){
            if(visited[i] != -1){
                if(visited[i] == color){
                    return false;
                }
            }
            else{
                int c = -1;
                if(color == 0){
                    c = 1;
                }
                else{
                    c = 0;
                }
                if(!dfs(adjList, i, c, visited)){
                    return false;
                }
            }
        }

        return true;
    }






    private boolean bfs(List<List<Integer>> adjList, int src, int[] visited){

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{src, 0});

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int u = poll[0];
            int c = poll[1];

            for(Integer i: adjList.get(u)){
                if(visited[i] != -1 && visited[i] == c){
                    return false;
                }
                else if(visited[i] == -1){
                    if(c == 0){
                        visited[i] = 1;
                        queue.add(new int[]{i, 1});
                    }
                    else{
                        visited[i] = 0;
                        queue.add(new int[]{i, 0});
                    }
                }
                
            }
        }

        return true;
    }


    public boolean isBipartite(int[][] graph) {

        // Time Complexity : O(V + V + 2E + V + 2E)

        // Space Complexity : O(V + 2E + V + V)

        
        List<List<Integer>> adjList = new ArrayList<>();
        int[] visited = new int[graph.length];

        Arrays.fill(visited, -1);

        for(int i = 0; i < graph.length; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < graph.length; i++){
            for(Integer j: graph[i]){
                adjList.get(i).add(j);
            }
        }

        for(int i = 0; i < graph.length; i++){
            if(visited[i] == -1){
                if(!dfs(adjList, i, 0, visited)){
                    return false;
                }
            }
        }

        return true;







        // // Time Complexity : O(V + V + 2E + V + 2E)

        // // Space Complexity : O(V + 2E + V + V)

        
        // List<List<Integer>> adjList = new ArrayList<>();
        // int[] visited = new int[graph.length];

        // Arrays.fill(visited, -1);

        // for(int i = 0; i < graph.length; i++){
        //     adjList.add(new ArrayList<>());
        // }

        // for(int i = 0; i < graph.length; i++){
        //     for(Integer j: graph[i]){
        //         adjList.get(i).add(j);
        //     }
        // }

        // for(int i = 0; i < graph.length; i++){
        //     if(visited[i] == -1){
        //         if(!bfs(adjList, i, 0, visited)){
        //             return false;
        //         }
        //     }
        // }

        // return true;
    }
}
