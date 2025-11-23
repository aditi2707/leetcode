class Solution {
    public int[] twoSum(int[] nums, int target) {

        /* Naive solution - Take two loops and find the numbers that add up to 
        target. Then return the indices of these numbers in an array.
        Time Complexity : O(n ^ 2)
        Space Complexity : O(1)
        */

        /* Edge cases:
        1. When both numbers are same - Then the other won't be added because the
        first condition would be true.

        2. When there are two different numbers that make up the target, but one
        of the numbers is present more than once - Doesn't matter because map will
        just overwrite the new index.
        */

        

        // Time Complexity : O(n)
        // The loop will run for the entirety of nums elements.

        // Space Complexity : O(n)
        // In the worst case, the hashmap will contain every element except the last


        // For the case if there are duplicates that are NOT involved in two sum, 
        // if we take an array like [3, 7, 3, 9], then it would work fine for first
        // two elements. When it comes to 3 again, then it wouldn't again find 
        // target - 3, so it will put the value in the map. But if you put a new 
        // value with the same key in a map, then it will OVERWRITE the previous 
        // value. So there were no problems.
        // If the involved parties were duplicates, then it will simply return the 
        // array as soon as it finds the other duplicate.
        
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            }
            else{
                return new int[]{map.get(target - nums[i]), i};
            }
        }

        return new int[0];
    }
}
