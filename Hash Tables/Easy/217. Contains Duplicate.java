class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Time Complexity : O(n)
        // The for loop will run for every element in the worst case.

        // Space Complexity : O(n)
        // The set will carry every element in case of all unique elements.
        

        Set<Integer> set = new HashSet<>();

        for(Integer i: nums){
            if(set.contains(i)){
                return true;
            }
            else{
                set.add(i);
            }
        }

        return false;



        // // Time Complexity : O(nlog n + n)
        // // Sorting takes nlog n time and the for loop will run for every element in
        // // the worst case.

        // // Space Complexity : O(1)

        // Arrays.sort(nums);
        
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums[i - 1]){
        //         return true;
        //     }
        // }

        // return false;
    }
}
