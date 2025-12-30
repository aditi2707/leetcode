class Solution {
    public int maxScore(String s) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1)
        
        
        int left = 0;
        int right = 0;

        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                left += 1;
            }
        }

        if(s.charAt(s.length() - 1) == '0'){
            left -= 1;
        }

        for(int i = s.length() - 2; i >= 0; i--){
            if(s.charAt(i + 1) == '1'){
                right += 1;
            }

            max = Math.max(max, left + right);

            if(s.charAt(i) == '0'){
                left -= 1;
            }
        }


        return max;







        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n)
        
        
        // int[] left = new int[s.length()];
        // int right = 0;

        // int max = 0;

        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '0'){
        //         left[i] += 1;
        //     }
        //     if(i != 0){
        //         left[i] += left[i - 1];
        //     }
        // }

        // for(int i = s.length() - 2; i >= 0; i--){
        //     if(s.charAt(i + 1) == '1'){
        //         right += 1;
        //     }

        //     max = Math.max(max, left[i] + right);
        // }


        // return max;







        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 2)

        
        // int[] left = new int[s.length()];
        // int[] right = new int[s.length()];

        // int max = 0;

        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '0'){
        //         left[i] += 1;
        //     }
        //     if(i != 0){
        //         left[i] += left[i - 1];
        //     }
        // }

        // for(int i = s.length() - 2; i >= 0; i--){
        //     if(s.charAt(i + 1) == '1'){
        //         right[i] += 1;
        //     }
        //     right[i] += right[i + 1];

        //     max = Math.max(max, left[i] + right[i]);
        // }


        // return max;
    }
}
