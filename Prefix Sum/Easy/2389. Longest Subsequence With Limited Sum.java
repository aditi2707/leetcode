class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        // Time Complexity : O(nlog n + n + mlog n)

        // Space Complexity : O(n)

        
        Arrays.sort(nums);
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int[] ans = new int[queries.length];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for(int i = 0; i < queries.length; i++){
            int count = 0;
            int low = 0, high = prefix.length - 1;

            while(low <= high){
                int mid = (low + high) / 2;

                if(prefix[mid] <= queries[i]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            if(high < 0){
                count = 0;
            }
            else{
                count += high + 1;
            }

            ans[i] = count;
        }

        return ans;








        // // Time Complexity : O(nlog n + n + (m * n))

        // // Space Complexity : O(n)

        
        // Arrays.sort(nums);
        // int[] prefix = new int[nums.length];
        // prefix[0] = nums[0];
        // int[] ans = new int[queries.length];

        // for(int i = 1; i < nums.length; i++){
        //     prefix[i] = nums[i] + prefix[i - 1];
        // }

        // for(int i = 0; i < queries.length; i++){
        //     int count = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(prefix[j] <= queries[i]){
        //             count++;
        //             ans[i] = count;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }

        // return ans;
    }
}
