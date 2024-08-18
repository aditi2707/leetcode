class Solution {

    public List<List<Integer>> generate(int numRows) {
        
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> prev = new ArrayList<>();

       if(numRows == 0){
            return ans;
        }

        ans.add(new ArrayList<>());
        ans.get(0).add(1);

       
       for(int i = 1; i < numRows; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1; j < prev.size(); j++){
                // if(j == 0 || j == i){
                //     ans.get(i).add(1);
                //     continue;
                // }
                //ans.get(i).add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                curr.add(prev.get(j) + prev.get(j-1));
            }
            curr.add(1);
            ans.add(curr);
            prev = curr;
        }

       return ans;
    }
}
