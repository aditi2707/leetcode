class Solution {
   
    public int maxRepeating(String sequence, String word) {
        
        int[] dp = new int[sequence.length()+1];
        int max = 0;

        int m = sequence.length();
        int n = word.length();

        for(int i = n; i <= m; i++){
            if(sequence.substring(i-n, i).equals(word)){
                dp[i] = dp[i-n] + 1;
                max = Math.max(max, dp[i]);
            }
        }

        return max;
        
        
        
        
        // int counter = 0;
        // String repeat = word;

        // while(sequence.contains(repeat)){
        //     counter++;
        //     repeat += word;
        // }

        // return counter;
    }
}
