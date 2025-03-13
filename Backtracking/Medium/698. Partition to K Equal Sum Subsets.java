class Solution {

    private boolean backtracking(int[] nums, int index, int target, int sum, int k, 
    boolean[] used){

        if(k == 0){
            return true;
        }

        if(sum == target){
            return backtracking(nums, 0, target, 0, k - 1, used);
        }

        for(int i = index; i < nums.length; i++){

            if(used[i] || sum + nums[i] > target){
                continue;
            }

            used[i] = true;
            if(backtracking(nums, i + 1, target, sum + nums[i], k, used)){
                return true;
            }
            used[i] = false;
        }

        return false;
    }


    public boolean canPartitionKSubsets(int[] nums, int k) {
        
        int sum = 0;
        boolean[] used = new boolean[nums.length];
        
        for(Integer i: nums){
            sum += i;
        }

        if(sum % k != 0){
            return false;
        }

        int target = sum / k;

        return backtracking(nums, 0, target, 0, k, used);
    }
}
