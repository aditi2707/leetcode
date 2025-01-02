class Solution {

    private void dfs(int[][] isConnected, int[] visited, int source){

        visited[source] = 1;

        for(int i = 0; i < isConnected[source].length; i++){
            if(isConnected[source][i] == 1 && visited[i] == 0){
                dfs(isConnected, visited, i);
            }
        }

        return;
    }

    public int findCircleNum(int[][] isConnected) {
        
        int[] visited = new int[isConnected.length];
        int count = 0;

        for(int i = 0; i < isConnected.length; i++){
            if(visited[i] == 0){
                count++;
                dfs(isConnected, visited, i);
            }
        }
        
        return count;
    }
}
