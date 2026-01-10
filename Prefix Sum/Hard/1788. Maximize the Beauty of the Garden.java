class Solution {
    public int maximumBeauty(int[] flowers) {

        // Time Complexity : O(n + n)

        // Space Complexity : O(n + n)
        
        
        int[] beautyPrefix = new int[flowers.length];
        beautyPrefix[0] = Math.max(0, flowers[0]);

        int max = Integer.MIN_VALUE;

        Map<Integer, int[]> map = new HashMap<>();

        for(int i = 1; i < flowers.length; i++){
            beautyPrefix[i] = beautyPrefix[i - 1];
        
            if(beautyPrefix[i] + flowers[i] >= beautyPrefix[i - 1]){
                beautyPrefix[i] += flowers[i];
            }
        }

        for(int i = 0; i < flowers.length; i++){
            if(!map.containsKey(flowers[i])){
                map.put(flowers[i], new int[2]);
                map.get(flowers[i])[0] = i;
            }
            else{
                map.get(flowers[i])[1] = i;
                int startInd = map.get(flowers[i])[0];
                if(startInd == 0){
                    if(flowers[startInd] < 0){
                        max = Math.max(max, beautyPrefix[i] + flowers[i] + flowers[startInd]);
                    }
                    else{
                        max = Math.max(max, beautyPrefix[i]);
                    }
                }
                else{
                    if(flowers[startInd] < 0){
                        max = Math.max(max, beautyPrefix[i] + flowers[i] + flowers[startInd] - beautyPrefix[startInd - 1]);
                    }
                    else{
                        max = Math.max(max, beautyPrefix[i] - beautyPrefix[startInd - 1]);
                    }
                }
            }
        }

        return max;
    }
}
