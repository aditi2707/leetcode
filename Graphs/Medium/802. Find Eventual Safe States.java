class Solution {

    private boolean dfs(int[][] graph, int[] visited, int[] pathVisited, int source){

        visited[source] = 1;
        pathVisited[source] = 1;

        for(Integer i: graph[source]){
            if(visited[i] == 0){
                if(dfs(graph, visited, pathVisited, i)){
                    return true;
                }
            }
            else{
                if(pathVisited[i] == 1){
                    return true;
                }
            }
        }

        pathVisited[source] = 0;
        return false;

    }


    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        List<Integer> ans = new ArrayList<>();

        int[] visited = new int[graph.length];
        int[] pathVisited = new int[graph.length];

        for(int i = 0; i < visited.length; i++){
            if(!dfs(graph, visited, pathVisited, i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
