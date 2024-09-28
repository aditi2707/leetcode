class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {

        int counter = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){

            if(set.contains(nums[i] - diff)){
                if(set.contains(nums[i] + diff)){
                    counter++;
                }
            }
        }

        return counter;






        // int counter = 0;

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         for(int k = j+1; k < nums.length; k++){
        //             if((nums[i]+diff == nums[j]) && (nums[j]+diff == nums[k])){
        //                 counter++;
        //             }
        //         }
        //     }
        // }
        // return counter;






        // HashMap<Integer, Integer> triplets = new HashMap<>();
        
        
        // ArrayList<Integer> triplets = new ArrayList<>();
        // for(int i = 0; i < nums.length; i++){
        //     triplets.add(nums[i]);
        // }

        

        // for(int i = 0; i < nums.length; i++){
        //     if(triplets.contains(nums[i] + diff)){
        //         if(triplets.contains(nums[i] + (diff * 2))){
        //             counter++;
        //         }
        //     }
        // }

        // return counter;


    }
}
