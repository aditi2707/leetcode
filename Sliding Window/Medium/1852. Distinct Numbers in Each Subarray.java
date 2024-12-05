class Solution {
    public int[] distinctNumbers(int[] nums, int k) {
        
        int[] ans = new int[nums.length - k + 1];
        int ind = 0;
        Map<Integer, Integer> map = new HashMap<>();

        int i = 0, j = 0;

        while(j < nums.length){
            if((j - i + 1) <= k){
                if(!map.containsKey(nums[j])){
                    map.put(nums[j], 1);
                }
                else{
                    map.put(nums[j], map.get(nums[j]) + 1);
                }
                j++;
            }
            else{
                ans[ind] = map.size();
                ind++;
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
                if(!map.containsKey(nums[j])){
                    map.put(nums[j], 1);
                }
                else{
                    map.put(nums[j], map.get(nums[j]) + 1);
                }
                j++;
            }
        }

        ans[ind] = map.size();

        return ans;
    }
}
