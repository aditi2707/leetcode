class Solution {

    private void pascalTriangle(int n, List<Integer> prev, List<Integer> curr, int i, int j){

        if(i == 0){
            curr.add(1);
            pascalTriangle(n, prev, curr, i + 1, j);
            return;
        }
        if(i == j){
            curr.add(1);
            return;
        }

        curr.add(prev.get(i) + prev.get(i - 1));

        pascalTriangle(n, prev, curr, i + 1, j);
        return;
    }


    private void pascalTriangle(int n, List<List<Integer>> ans, int i, int j){

        if(i == 0){
            ans.add(new ArrayList<>());
            ans.get(n).add(1);
            pascalTriangle(n, ans, i + 1, j);
            return;
        }
        if(i == j){
            ans.get(n).add(1);
            return;
        }

        int num = ans.get(n - 1).get(i) + ans.get(n - 1).get(i - 1);
        ans.get(n).add(num);

        pascalTriangle(n, ans, i + 1, j);
        return;
    }
    

    public List<List<Integer>> generate(int numRows) {

         List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);

        for(int i = 1; i < numRows; i++){
            List<Integer> prev = ans.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            pascalTriangle(i, prev, curr, 0, i);
            ans.add(curr);
        }
        
        return ans;





        // List<List<Integer>> ans = new ArrayList<>();
        // ans.add(new ArrayList<>());
        // ans.get(0).add(1);

        // for(int i = 1; i < numRows; i++){
        //     pascalTriangle(i, ans, 0, i);
        // }
        
        // return ans;




        
        
       // List<List<Integer>> ans = new ArrayList<>();
       // List<Integer> prev = new ArrayList<>();

       // if(numRows == 0){
       //      return ans;
       //  }

       //  ans.add(new ArrayList<>());
       //  ans.get(0).add(1);

       
       // for(int i = 1; i < numRows; i++){
       //      List<Integer> curr = new ArrayList<>();
       //      curr.add(1);
       //      for(int j = 1; j < prev.size(); j++){
       //          // if(j == 0 || j == i){
       //          //     ans.get(i).add(1);
       //          //     continue;
       //          // }
       //          //ans.get(i).add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
       //          curr.add(prev.get(j) + prev.get(j-1));
       //      }
       //      curr.add(1);
       //      ans.add(curr);
       //      prev = curr;
       //  }

       // return ans;
    }
}
