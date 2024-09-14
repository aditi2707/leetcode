class Solution {

    public void dfs(int k, int[] visited, List<List<Integer>> list, int[] count){

        visited[k] = 1;
        count[0]++;

        for(int i = 0; i < list.get(k).size(); i++){
            count[1]++;
            if(visited[list.get(k).get(i)] == 0){
                dfs(list.get(k).get(i), visited, list, count);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        
        int counter = 0;
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
                int[] count = new int[2];
                dfs(i, visited, list, count);
                count[1] /= 2;
                if((count[0] * (count[0]-1)) == 2 * count[1]){
                    counter++;
                }
            }
            
        }

        return counter;
    }
}
