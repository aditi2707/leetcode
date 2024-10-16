class Solution {
    public int partitionArray(int[] nums, int k) {
        
        int min = Integer.MIN_VALUE;
        int index = 0;

        int part = 0;

        Arrays.sort(nums);

        min = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i] - min > k){
                min = nums[i];
                part++;
            }
        }

        return part+1;








        // List<List<Integer>> ans = new ArrayList<>();

        // Arrays.sort(nums);

        // ans.add(new ArrayList<>());
        // ans.get(0).add(nums[0]);

        // for(int i = 1; i < nums.length; i++){

        //     if(nums[i] - ans.get(ans.size()-1).get(0) > k){
        //         ans.add(new ArrayList<>());
        //     }

        //     ans.get(ans.size()-1).add(nums[i]);
        // }

        // return ans.size();
    }
}
