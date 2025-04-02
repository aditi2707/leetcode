class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {

        // Time Complexity : O(n + length)
        // Space Complexity : O(length) (for output array)

        int[] ans = new int[length];

        for(int i = 0; i < updates.length; i++){
            int start = updates[i][0];
            int end = updates[i][1];
            int val = updates[i][2];

            ans[start] += val;
            if(end + 1 < length){
                ans[end + 1] -= val;
            }
        }

        for(int i = 1; i < ans.length; i++){
            ans[i] += ans[i - 1];
        }

        return ans;

        // // Time Complexity : O(n ^ 2)
        // // Space Complexity : O(length) (for output array)
        
        // int[] ans = new int[length];

        // for(int i = 0; i < updates.length; i++){
        //     for(int j = updates[i][0]; j <= updates[i][1]; j++){
        //         ans[j] += updates[i][2];
        //     }
        // }

        // return ans;
    }
}
