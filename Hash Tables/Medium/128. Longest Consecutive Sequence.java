class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        
        Set<Integer> set = new HashSet<>();
        int length = 1;

        for(Integer i: nums){
            set.add(i);
        }

        for(int i = 0; i < nums.length; i++){

            if(!set.contains(nums[i]-1)){
                int n = nums[i];
                int temp = 0;

                while(set.contains(n)){
                    temp++;
                    n++;
                }

                length = Math.max(length, temp);
            }
        }
        

        return length;









        
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
