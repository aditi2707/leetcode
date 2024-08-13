class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int c = 0;

        if(nums.length == 0){
            ans.add(new ArrayList<>());
            ans.get(0).add(lower);
            ans.get(0).add(upper);
            return ans;
        }

        if(nums[0] > lower){
            ans.add(new ArrayList<>());
            ans.get(0).add(lower);
            ans.get(0).add(nums[0]-1);
            c++;
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] > 1){
                ans.add(new ArrayList<>());
                ans.get(c).add(nums[i-1]+1);
                ans.get(c).add(nums[i]-1);
                c++;
            }
            // if(nums[i] == k){
            //     k++;
            // }
            // else{
            //     ans.add(new ArrayList<>());
            //     ans.get(c).add(k);
            //     while(k != nums[i]){
            //         k++;
            //     }
            //     ans.get(c).add(k-1);
                
            //     c++;
            //     k++;
            // }
        }

        if(upper > nums[nums.length-1]){
            ans.add(new ArrayList<>());
            ans.get(c).add(nums[nums.length-1]+1);
            ans.get(c).add(upper);
        }

        return ans;
    }
}
