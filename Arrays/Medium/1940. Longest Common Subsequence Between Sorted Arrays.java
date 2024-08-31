class Solution {

    public List<Integer> subsequence(List<Integer> arr1, int[] arr2, int m, int n, List<Integer> temp){

        if(m == arr1.size() || n == arr2.length){
            return temp;
        }

        if(arr1.get(m) == arr2[n]){
            temp.add(arr1.get(m));
            return subsequence(arr1, arr2, m+1, n+1, temp);
        }
        else if(arr1.get(m) < arr2[n]){
            return subsequence(arr1, arr2, m+1, n, temp);
        }
        else{
            return subsequence(arr1, arr2, m, n+1, temp);
        }
    }

    public List<Integer> longestCommonSubsequence(int[][] arrays) {
        
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < arrays[0].length; i++){
            ans.add(arrays[0][i]);
        }

        for(int i = 1; i < arrays.length; i++){
            List<Integer> temp = new ArrayList<>();
            ans = subsequence(ans, arrays[i], 0, 0, temp);
        }

        return ans;




        // List<Integer> ans = new ArrayList<>();
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int max = 0;

        // for(int i = 0; i < arrays.length; i++){
        //     for(int j = 0; j < arrays[i].length; j++){
        //         if(!map.containsKey(arrays[i][j])){
        //             map.put(arrays[i][j], 1);
        //         }
        //         else{
        //             map.put(arrays[i][j], map.get(arrays[i][j])+1);
        //         }
        //         if(map.get(arrays[i][j]) == arrays.length){
        //             ans.add(arrays[i][j]);
        //         }
        //     }
        // }

        // return ans;
    }
}
