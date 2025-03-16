class Solution {

    private void backtracking(Map<Integer, int[]> map, List<List<Integer>> ans, 
    List<Integer> temp, int source){

        if(source == map.size() - 1){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(Integer i: map.get(source)){
            temp.add(i);
            backtracking(map, ans, temp, i);
            temp.remove(temp.size() - 1);
        }

        return;
    }


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i < graph.length; i++){
            map.put(i, graph[i]);
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        backtracking(map, ans, temp, 0);

        return ans;
    }
}
