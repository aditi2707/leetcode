class Solution {
    public int largestAltitude(int[] gain) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int prefix = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++){
            prefix += gain[i];
            max = Math.max(max, prefix);
        }

        return max;





        // // Time Complexity : O(n)

        // // Space Complexity : O(n)

        
        // int[] prefix = new int[gain.length + 1];
        // int max = 0;

        // for(int i = 0; i < gain.length; i++){
        //     prefix[i + 1] = prefix[i] + gain[i];
        //     max = Math.max(max, prefix[i + 1]);
        // }

        // return max;
    }
}
