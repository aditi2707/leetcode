class Solution {
    public boolean scoreBalance(String s) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(n)
        
        
        int[] left = new int[s.length()];
        int right = 0;

        left[0] = (s.charAt(0) - 'a') + 1;

        for(int i = 1; i < s.length(); i++){
            left[i] = left[i - 1] + (s.charAt(i) - 'a') + 1;
        }

        for(int i = s.length() - 2; i >= 0; i--){
            right += (s.charAt(i + 1) - 'a') + 1;

            if(left[i] == right){
                return true;
            }
        }

        return false;







        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 2)

        
        // int[] left = new int[s.length()];
        // int[] right = new int[s.length()];

        // left[0] = (s.charAt(0) - 'a') + 1;

        // for(int i = 1; i < s.length(); i++){
        //     left[i] = left[i - 1] + (s.charAt(i) - 'a') + 1;
        // }

        // for(int i = s.length() - 2; i >= 0; i--){
        //     right[i] = right[i + 1] + (s.charAt(i + 1) - 'a') + 1;

        //     if(left[i] == right[i]){
        //         return true;
        //     }
        // }

        // return false;
    }
}
