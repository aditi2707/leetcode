class Solution {

    public int countKDifference(int[] nums, int k) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i] - k)){
                count += map.get(nums[i] - k);
            }
            if(map.containsKey(nums[i] + k)){
                count += map.get(nums[i] + k);
            }

            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        return count;




        // Arrays.sort(nums);
        // int count = 0;

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(Math.abs(nums[i] - nums[j]) == k){
        //             count++;
        //         }
        //         if(Math.abs(nums[i] - nums[j]) > k){
        //             break;
        //         }
        //     }
        // }

        // return count;





        
        // for(int i = 0; i < nums.length-1; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int diff = (int)(Math.abs(nums[i] - nums[j]));
        //         if(diff == k){
        //             counter++;
        //         }
        //     }
        // }
        // return counter;
    }
}
