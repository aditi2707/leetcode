class Solution {
    public int maxFrequencyElements(int[] nums) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, count = 0;

        for(Integer i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
                if(1 > max){
                    max = 1;
                    count = 1;
                }
                else if(max == 1){
                    count++;
                }
            }
            else{
                map.put(i, map.get(i) + 1);
                if(map.get(i) > max){
                    max = map.get(i);
                    count = 1;
                }
                else if(map.get(i) == max){
                    count++;
                }
            }
        }

        return max * count;

    }
}
