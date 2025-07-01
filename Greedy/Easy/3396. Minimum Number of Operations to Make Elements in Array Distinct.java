class Solution {
    public int minimumOperations(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        

        Set<Integer> set = new HashSet<>();
        
        int i = nums.length - 1;

        while(i >= 0){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                i--;
            }
            else{
                break;
            }
        }

        if((i + 1) % 3 != 0){
            return ((i + 1) / 3) + 1;
        }

        return (i + 1) / 3;
    }
}
