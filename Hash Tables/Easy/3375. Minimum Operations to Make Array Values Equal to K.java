class Solution {
    public int minOperations(int[] nums, int k) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        Set<Integer> set = new HashSet<>();
        int min = 101;

        for(Integer i: nums){
            set.add(i);
            min = Math.min(min, i);
        }

        int total = set.size() - 1;

        if(min == k){
            return total;
        }
        if(min < k){
            return -1;
        }

        return total + 1;
    }
}
