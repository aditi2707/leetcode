class Solution {

    private int dotProd(int[] nums1, int[] nums2, int m, int c1, int n, int c2, int[][] dp){

        if(m >= nums1.length || n >= nums2.length){
            return -1000001;
        }

        if(dp[m][n] != -1000001){
            return dp[m][n];
        }

        int prod = -1000001;

        if(c1 == c2){
            prod = nums1[m] * nums2[n];
        }

        int takeAll = Math.max(prod, prod + dotProd(nums1, nums2, m + 1, c1 + 1, n + 1, c2 + 1, dp));
        int take1 = dotProd(nums1, nums2, m, c1, n + 1, c2, dp);
        int take2 = dotProd(nums1, nums2, m + 1, c1, n, c2, dp);
        int takeNone = dotProd(nums1, nums2, m, c1, n + 1, c2, dp);

        return dp[m][n] = Math.max(takeAll, Math.max(take1, Math.max(take2, takeNone)));
    }


    public int maxDotProduct(int[] nums1, int[] nums2) {

        // Time Complexity : O((m * n) + n)

        // Space Complexity : O(n * 2)
        
        
        int[] next = new int[nums2.length + 1];

        Arrays.fill(next, -1000001);
        
        int c1 = 1, c2 = 1;

        for(int i = nums1.length - 1; i >= 0; i--){
            int[] curr = new int[nums2.length + 1];
            curr[nums2.length] = -1000001;
            for(int j = nums2.length - 1; j >= 0; j--){

                int prod = -1000001;

                if(c1 == c2){
                    prod = nums1[i] * nums2[j];
                }

                int takeAll = Math.max(prod, prod + next[j + 1]);
                int take1 = curr[j + 1];
                int take2 = next[j];
                int takeNone = curr[j + 1];

                int res = Math.max(take1, Math.max(take2, takeNone));
                if(takeAll > res){
                    c1 += 1;
                    c2 += 1;
                }

                curr[j] = Math.max(takeAll, res);
            }
            next = curr;
        }

        return next[0];







        // // Time Complexity : O((m * n) + m + n)

        // // Space Complexity : O(m * n)
        

        // int[][] dp = new int[nums1.length + 1][nums2.length + 1];

        // for(int i = 0; i < nums2.length; i++){
        //     dp[nums1.length][i] = -1000001;
        // }
        // for(int i = 0; i < nums1.length; i++){
        //     dp[i][nums2.length] = -1000001;
        // }

        // int c1 = 1, c2 = 1;

        // for(int i = nums1.length - 1; i >= 0; i--){
        //     for(int j = nums2.length - 1; j >= 0; j--){

        //         int prod = -1000001;

        //         if(c1 == c2){
        //             prod = nums1[i] * nums2[j];
        //         }

        //         int takeAll = Math.max(prod, prod + dp[i + 1][j + 1]);
        //         int take1 = dp[i][j + 1];
        //         int take2 = dp[i + 1][j];
        //         int takeNone = dp[i][j + 1];

        //         int res = Math.max(take1, Math.max(take2, takeNone));
        //         if(takeAll > res){
        //             c1 += 1;
        //             c2 += 1;
        //         }

        //         dp[i][j] = Math.max(takeAll, res);
        //     }
        // }

        // return dp[0][0];







        // // Time Complexity : O((m * n) * 2)

        // // Space Complexity : O((m * n) + (m + n))


        // int[][] dp = new int[nums1.length][nums2.length];

        // for(int i = 0; i < nums1.length; i++){
        //     Arrays.fill(dp[i], -1000001);
        // }
        
        // return dotProd(nums1, nums2, 0, 1, 0, 1, dp);
    }
}
