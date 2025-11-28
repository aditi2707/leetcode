class Solution {
    public int titleToNumber(String columnTitle) {

        // Time Complexity : O(n)

        // Space Complexity : O(n)
        
        
        char[] arr = columnTitle.toCharArray();
        int index = 0, ans = 0;

        for(int i = arr.length - 1; i >= 0; i--){
            ans += (int)(Math.pow(26, index)) * ((arr[i] - 'A') + 1);
            index++;
        }

        return ans;
    }
}
