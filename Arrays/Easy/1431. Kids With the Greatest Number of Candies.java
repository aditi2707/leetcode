class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        // Time Complexity : O(n * 2)

        // Space Complexity : O(1) (ignoring the output array)

        
        int max = 0;
        List<Boolean> ans = new ArrayList<>();

        for(Integer i: candies){
            max = Math.max(max, i);
        }

        for(Integer i: candies){
            if(i + extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;

    }
}
