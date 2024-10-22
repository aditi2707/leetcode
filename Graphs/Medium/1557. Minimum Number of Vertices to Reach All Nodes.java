class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        int[] inDeg = new int[n];
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < edges.size(); i++){
            inDeg[edges.get(i).get(1)]++;
        }

        for(int i = 0; i < n; i++){
            if(inDeg[i] == 0){
                ans.add(i);
            }
        }

        return ans;




        // Map<Integer, Integer> inDeg = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();

        // for(int i = 0; i < edges.size(); i++){
        //     if(!inDeg.containsKey(edges.get(i).get(1))){
        //         inDeg.put(edges.get(i).get(1), 1);
        //     }
        //     else{
        //         inDeg.put(edges.get(i).get(1), inDeg.get(edges.get(i).get(1)) + 1);
        //     }
        //     if(!inDeg.containsKey(edges.get(i).get(0))){
        //         inDeg.put(edges.get(i).get(0), 0);
        //     }
        // }

        // for(Integer i: inDeg.keySet()){
        //     if(inDeg.get(i) == 0){
        //         ans.add(i);
        //     }
        // }

        // return ans;





        


        
        
        // List<List<Integer>> list = new ArrayList<>();
        // List<Integer> ans = new ArrayList<>();

        // for(int i = 0; i < n; i++){
        //     list.add(new ArrayList<>());
        // }

        // for(int i = 0; i < edges.size(); i++){
            
        //     list.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        // }

        // for(int i = 0; i < n; i++){
        //     if(list.get(i).size() == 0){
        //         ans.add(i);
        //     }
        // }

        // return ans;
    }
}
