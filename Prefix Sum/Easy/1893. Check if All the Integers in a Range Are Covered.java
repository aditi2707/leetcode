class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        // Time Complexity : O(n + 52)

        // Space Complexity : O(52) ~ O(1)
        
        
        int[] prefix = new int[52];

        for(int i = 0; i < ranges.length; i++){
            prefix[ranges[i][0]] += 1;
            prefix[ranges[i][1] + 1] -= 1;
        }

        for(int i = 1; i < 52; i++){
            prefix[i] += prefix[i - 1];

            if(i >= left && i <= right){
                if(prefix[i] <= 0){
                    return false;
                }
            }
        }

        return true;





        
        // int counter = 0;

        // for(int i = left; i <= right; i++){
        //     for(int j = 0; j < ranges.length; j++){
        //         if(i >= ranges[j][0] && i <= ranges[j][1]){
        //             counter++;
        //             break;
        //         }
        //     }
        // }

        // if(counter != right - left + 1){
        //     return false;
        // }

        // return true;
    }
}
