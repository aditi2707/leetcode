class Solution {

    public boolean dfs(List<List<Integer>> graph, int source, int prev, Set<Integer> seen){

        if(seen.contains(source)){
            return false;
        }

        seen.add(source);

        for(int i = 0; i < graph.get(source).size(); i++){
            if(graph.get(source).get(i) == prev){
                continue;
            }
            if(!dfs(graph, graph.get(source).get(i), source, seen)){
                return false;
            }
        }

        return true;
    }

    public boolean validTree(int n, int[][] edges) {

        if(n == 0){
            return true;
        }
        
        List<List<Integer>> graph = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        return dfs(graph, 0, -1, seen) && seen.size() == n;
    }
}
