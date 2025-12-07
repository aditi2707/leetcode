class Solution {
    public int maxScore(int[] cardPoints, int k) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1)

        
        int leftSum = 0, rightSum = 0, max = 0;

        for(int i = 0; i < k; i++){
            leftSum += cardPoints[i];
        }

        int left = k - 1, right = cardPoints.length - 1;

        while(left >= 0){
            max = Math.max(max, leftSum + rightSum);
            leftSum -= cardPoints[left];
            rightSum += cardPoints[right];
            left--;
            right--;
        }

        max = Math.max(max, rightSum);

        return max;
    }
}
