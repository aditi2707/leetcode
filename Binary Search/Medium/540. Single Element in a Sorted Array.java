class Solution {
    public int singleNonDuplicate(int[] nums) {

        // Time Complexity : O(log n)

        // Space Complexity : O(1)

        int low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            boolean isEvenHalf = (high - mid) % 2 == 0;
            
            if(mid + 1 < nums.length && nums[mid] == nums[mid + 1]){
                if(isEvenHalf){
                    low = mid + 2;
                }
                else{
                    high = mid - 1;
                }
            }
            else if(mid - 1 >= 0 && nums[mid] == nums[mid - 1]){
                if(isEvenHalf){
                    high = mid - 2;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                return nums[mid];
            }
        }

        return -1;



        
        // // Time Complexity : O(n)

        // // Space Complexity : O(n)

        // Set<Integer> set = new HashSet<>();

        // for(int i = 0; i < nums.length; i++){
        //     if(!set.contains(nums[i])){
        //         set.add(nums[i]);
        //     }
        //     else{
        //         set.remove(nums[i]);
        //     }
        // }

        // for(Integer i: set){
        //     return i;
        // }

        // return -1;
    }
}
