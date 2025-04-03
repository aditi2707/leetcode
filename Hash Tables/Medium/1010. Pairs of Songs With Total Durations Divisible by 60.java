class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        // Time Dcomplexity : O(n)

        // Space Complexity : O(n)
        
        
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < time.length; i++){
            int remainder = 60 - (time[i] % 60);
            if(map.containsKey(remainder)){
                ans += map.get(remainder);
            }
            if(60 - remainder != 0){
                if(!map.containsKey(60 - remainder)){
                    map.put(60 - remainder, 1);
                }
                else{
                    map.put(60 - remainder, map.get(60 - remainder) + 1);
                }
            }
            else{
                if(!map.containsKey(60)){
                    map.put(60, 1);
                }
                else{
                    map.put(60, map.get(60) + 1);
                }
            }
        }
        

        return ans;
    }
}
