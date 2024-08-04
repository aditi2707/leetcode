class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        int counter = 0;
        int low = 0, high = nums.size()-1;

        Collections.sort(nums);

        while(low < high){
            if(nums.get(low) + nums.get(high) < target){
                counter += high - low;
                low++;
            }
            else{
                high--;
            }
        }

        // for(int i = 0; i < nums.size(); i++){
        //     for(int j = i+1; j < nums.size(); j++){
        //         if(nums.get(i) + nums.get(j) < target){
        //             counter++;
        //         }
        //     }
        // }

        return counter;
    }
}
