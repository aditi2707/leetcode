class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.size(); i++){
            
            list.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }

        for(int i = 0; i < n; i++){
            if(list.get(i).size() == 0){
                ans.add(i);
            }
        }

        return ans;
    }
}
