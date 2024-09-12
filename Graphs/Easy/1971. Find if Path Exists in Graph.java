class Solution {

    public boolean dfs(HashMap<Integer, List<Integer>> adjList, int[] visited, int source, int destination){

        visited[source] = 1;

        for(int i = 0; i < adjList.get(source).size(); i++){
            if(visited[adjList.get(source).get(i)] == 0){
                if(adjList.get(source).get(i) == destination){
                    return true;
                }
                if(dfs(adjList, visited, adjList.get(source).get(i), destination)){
                    return true;
                }
            }
        }
        
        return false;
    }

    public boolean bfs(HashMap<Integer, List<Integer>> adjList, int[] visited, int source, int destination){

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = 1;

        while(!queue.isEmpty()){
            int v = queue.poll();
            if(v == destination){
                return true;
            }
            for(int i = 0; i < adjList.get(v).size(); i++){
                
                if(adjList.get(v).get(i) == destination){
                    return true;
                }

                if(visited[adjList.get(v).get(i)] == 0){
                    visited[adjList.get(v).get(i)] = 1;
                    queue.add(adjList.get(v).get(i));
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        int[] visited = new int[n];

        if(n == 1 || source == destination){
            return true;
        }

        for(int i = 0; i < edges.length; i++){

            if(!adjList.containsKey(edges[i][0])){
                adjList.put(edges[i][0], new ArrayList<>());
            }
            adjList.get(edges[i][0]).add(edges[i][1]);

            if(!adjList.containsKey(edges[i][1])){
                adjList.put(edges[i][1], new ArrayList<>());
            }
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        // return bfs(adjList, visited, source, destination);

        return dfs(adjList, visited, source, destination);
    }
}
