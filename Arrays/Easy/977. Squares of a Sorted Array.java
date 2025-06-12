class Solution {
    public int[] sortedSquares(int[] nums) {

        // Time Complexity : O(n)
        // If the array is sorted in the worst case.

        // Space Complexity : O(1) (ignoring the output array)
        

        int[] ans = new int[nums.length];

        int i = 0, j = nums.length - 1;
        int k = ans.length - 1;

        while(i < j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                ans[k] = (int)Math.pow(nums[i], 2);
                i++;
                k--;
            }
            else if(Math.abs(nums[i]) < Math.abs(nums[j])){
                ans[k] = (int)Math.pow(nums[j], 2);
                j--;
                k--;
            }
            else{
                ans[k] = (int)Math.pow(nums[j], 2);
                k--;
                ans[k] = (int)Math.pow(nums[j], 2);
                k--;
                i++;
                j--;
            }
        }

        ans[0] = (int)Math.pow(nums[i], 2);

        return ans;





        // // Time Complexity : O(n + nlog n)

        // // Space Complexity : O(1) (ignoring the output array)

        
        // int[] ans = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     ans[i] = (int)Math.pow(nums[i], 2);
        // }

        // Arrays.sort(ans);

        // return ans;
    }
}
