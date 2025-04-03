class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        // Time Complexity : O(nlog n + nlog n)

        // Space Complexity : O(spells_length) (for the output array)
        
        
        Arrays.sort(potions);
        int[] ans = new int[spells.length];

        for(int i = 0; i < spells.length; i++){
            int low = 0, high = potions.length - 1;
            int target = spells[i];
            while(low <= high){
                int mid = low + (high - low) / 2;
                long prod = (long)target * potions[mid];
                if(prod >= success){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            if(low < potions.length){
                ans[i] = potions.length - low;
            }
        }

        return ans;
    }
}
