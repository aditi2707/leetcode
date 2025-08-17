class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        // Time Complexity : O(nums.length + queries.length)

        // Space Complexity : O(nums.length)

        
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[queries.length];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                list.add(i);
            }
        }

        for(int i = 0; i < queries.length; i++){
            if(queries[i] > list.size()){
                ans[i] = -1;
            }
            else{
                ans[i] = list.get(queries[i] - 1);
            }
        }

        return ans;





        // // Time Complexity : O(nums.length + queries.length)

        // // Space Complexity : O(nums.length)

        
        // Map<Integer, Integer> map = new HashMap<>();
        // int[] ans = new int[queries.length];
        // int count = 0;
        // int max = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == x){
        //         map.put(count + 1, i);
        //         count += 1;
        //         max = count;
        //     }
        // }

        // for(int i = 0; i < queries.length; i++){
        //     if(queries[i] > max){
        //         ans[i] = -1;
        //     }
        //     else{
        //         ans[i] = map.get(queries[i]);
        //     }
        // }

        // return ans;
    }
}
