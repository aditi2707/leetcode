class Solution {
    public int[] queryResults(int limit, int[][] queries) {

        // Time Complexity : O(queries.length)

        // Space Complexity : O(queries.length * 2)
        
        
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> colors = new HashMap<>();
        int[] ans = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(!map.containsKey(ball)){
                map.put(ball, color);
                colors.put(color, colors.getOrDefault(color, 0) + 1);
            }
            else{
                int tempColor = map.get(ball);
                colors.put(tempColor, colors.get(tempColor) - 1);
                if(colors.get(tempColor) == 0){
                    colors.remove(tempColor);
                }
                map.put(ball, color);
                colors.put(color, colors.getOrDefault(color, 0) + 1);
            }

            ans[i] = colors.size();
        }

        return ans;
    }
}
