/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {

        // Time Complexity : O(1000 + 1000)

        // Space Complexity : O(1)

        
        List<List<Integer>> ans = new ArrayList<>();
        int i = 1, j = 1000;
        
        while(i <= 1000 && j >= 1){
            int val = customfunction.f(i, j);
            if(val == z){
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(j);
                ans.add(pair);
                i++;
                j--;
            }
            else if(val < z){
                i++;
            }
            else{
                j--;
            }
        }

        return ans;






        // // Time Complexity : O(log 500 + (high * 2))

        // // Space Complexity : O(1)

        
        // int low = 1, high = 500;
        // List<List<Integer>> ans = new ArrayList<>();

        // while(low <= high){
        //     int mid = (low + high) / 2;

        //     if(z <= customfunction.f(mid, mid)){
        //         low = mid + 1;
        //     }
        //     else{
        //         high = mid - 1;
        //     }
        // }

        // for(int i = 1; i <= high; i++){
        //     for(int j = i; j <= high; j++){

        //         if(customfunction.f(i, j) == z){
        //             List<Integer> pair = new ArrayList<>();
        //             pair.add(i);
        //             pair.add(j);
        //             ans.add(pair);
        //         }

        //         if(i != j){
        //             if(customfunction.f(j, i) == z){
        //                 List<Integer> pair = new ArrayList<>();
        //                 pair.add(j);
        //                 pair.add(i);
        //                 ans.add(pair);
        //             }
        //         }
        //     }
        // }

        // return ans;
    }
}
