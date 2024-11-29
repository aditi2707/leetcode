class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i = 1; i <= k; i++){
            set.add(i);
        }

        for(int i = nums.size() - 1; i >= 0; i--){
            if(set.size() == 0){
                break;
            }
            if(set.contains(nums.get(i))){
                set.remove(nums.get(i));
            }
            ans++;
        }

        return ans;
    }
}
