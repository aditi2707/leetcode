class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();

        if(nums.length == 0){
            return ans;
        }
        if(nums.length == 1){
            ans.add(String.valueOf(nums[0]));
            return ans;
        }
        
        int i = 0;
        int start = 0;

        while(i < nums.length - 1){
            if(nums[i + 1] - nums[i] != 1){
                if(nums[start] == nums[i]){
                    ans.add(String.valueOf(nums[i]));
                }
                else{
                    ans.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[i]));
                }

                start = i + 1;
            }
            i++;
        }

        if(nums[nums.length - 1] - nums[nums.length - 2] == 1){
            ans.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[nums.length - 1]));
        }
        else{
            ans.add(String.valueOf(nums[nums.length - 1]));
        }

        return ans;
    }
}
