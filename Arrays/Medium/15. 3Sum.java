class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Time Complexity : O(nlog n + (n ^ 2))
        // The first while loop will run for every element in the for loop so the 
        // TC becomes n ^ 2. The second while loop does not increse the complexity;
        // it is just moving the low pointer to avoid any repeated triplets. The
        // sort algorithm takes O(nlog n) TC.

        // Space Complexity : O(1)
        

        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int target = 0 - nums[i];
            int low = i + 1, high = nums.length - 1;

            while(low < high){
                if(nums[low] + nums[high] > target){
                    high--;
                }
                else if(nums[low] + nums[high] < target){
                    low++;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    ans.add(temp);

                    int num = nums[low];
                    while(low < high && nums[low] == num){
                        low++;
                    }
                }
            }
        }

        return ans;
    }
}
