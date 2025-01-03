class Solution {

    private void dfs(List<List<Integer>> list, int[] visited, int source, int[] g){

        visited[source] = 1;
        g[0]++;

        for(Integer i: list.get(source)){
            g[1]++;
            if(visited[i] == 0){
                dfs(list, visited, i, g);
            }
        }

        return;
    }


    public int countCompleteComponents(int n, int[][] edges) {
        
        int count = 0;
        int[] visited = new int[n];

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }

        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                int[] g = {0, 0};
                dfs(list, visited, i, g);

                // for undirected: e /= 2
                // for directed: e
                // v * (v - 1) == e

                if(g[0] * (g[0] - 1) == g[1]){
                    count++;
                }
            }
        }

        return count;
    }
}
