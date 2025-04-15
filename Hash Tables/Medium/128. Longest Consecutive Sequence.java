class Solution {
    public int longestConsecutive(int[] nums) {

        // Time Complexity : O(n)
        // It seems like the TC should be quadratic but for every element, both the
        // loops will run atmost twice, so TC ~ O(n).

        // Space Complexity : O(n)
        // The set will contain at max all elements of num (if they are unique)


        if(nums.length == 0){
            return 0;
        }
        
        Set<Integer> set = new HashSet<>();
        int max = 1;

        for(Integer i: nums){
            set.add(i);
        }

        for(Integer i: set){
            if(!set.contains(i - 1)){
                int num = i;
                int count = 0;
                while(set.contains(num)){
                    count++;
                    num++;
                }
                max = Math.max(max, count);
            }
        }

        return max;



        // // Time Complexity : O(nlog n + n)

        // // Space Complexity : O(1)
        
        
        // if(nums.length == 0){
        //     return 0;
        // }

        // Arrays.sort(nums);
        // int length = 1, temp = 1;

        // for(int i = 1; i < nums.length; i++){

        //     if(nums[i] - nums[i-1] == 1){
        //         temp++;
        //     }
        //     else if(nums[i] == nums[i-1]){
        //         continue;
        //     }
        //     else{
        //         length = Math.max(length, temp);
        //         temp = 1;
        //     }
        // }

        // return Math.max(length, temp);

    }
}
