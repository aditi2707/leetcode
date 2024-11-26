class Solution {
    public boolean divideArray(int[] nums) {

        int count = 0;
        int xor = 0;

        Arrays.sort(nums);

        for(Integer i: nums){
            xor ^= i;
            if(xor != 0){
                count++;
            }
        }

        return count == nums.length / 2;






        
        // Map<Integer, Integer> map = new HashMap<>();

        // for(Integer i: nums){
        //     if(!map.containsKey(i)){
        //         map.put(i, 1);
        //     }
        //     else{
        //         map.put(i, map.get(i) + 1);
        //     }
        // }

        // for(Integer i: map.values()){
        //     if(i % 2 == 1){
        //         return false;
        //     }
        // }

        // return true;
    }
}
