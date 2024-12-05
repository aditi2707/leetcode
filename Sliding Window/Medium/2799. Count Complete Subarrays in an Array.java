class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        Set<Integer> distinct = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        int i = 0, j = 0;
        int count = 0;

        for(Integer k: nums){
            distinct.add(k);
        }

        while(j < nums.length){

            if(!map.containsKey(nums[j])){
                map.put(nums[j], 1);
            }
            else{
                map.put(nums[j], map.get(nums[j]) + 1);
            }

            if(map.size() < distinct.size()){
                j++;
            }
            else{
                while(map.size() == distinct.size() && i <= j){
                    count += nums.length - j;
                    map.put(nums[i], map.get(nums[i]) - 1);
                    if(map.get(nums[i]) == 0){
                        map.remove(nums[i]);
                    }
                    i++;
                }
                j++;
            }
        }

        return count;
    }
}
