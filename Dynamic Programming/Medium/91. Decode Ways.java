class Solution {

    public int decodeWays(char[] c, int i, int[] dp){

        if(i >= c.length){
            return 1;
        }
        if(c[i] == '0'){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int one = decodeWays(c, i + 1, dp);
        int two = 0;

        if(i + 1 < c.length && (c[i] == '1' || (c[i] == '2' && c[i + 1] <= '6'))){
            two = decodeWays(c, i + 2, dp);
        }

        dp[i] = one + two;
        return dp[i];
    }

    public int numDecodings(String s) {

        char[] c = s.toCharArray();

        int next1 = 0, next2 = 0;
        next2 = c[c.length - 1] == '0' ? 0 : 1;

        if(c.length == 1){
            return next2;
        }
        
        int num = Integer.parseInt(s.substring(s.length() - 2));
        if(num < 10 || (num % 10 == 0 && num > 20)){
            next1 = 0;
        }
        else if(num == 10 || num == 20 || num > 26){
            next1 = 1;
        }
        else{
            next1 = 2;
        }

        for(int i = c.length - 3; i >= 0; i--){
            int curr = 0;
            if(c[i] == '0'){
                next2 = next1;
                next1 = curr;
                continue;
            }

            int one = next1;
            int two = 0;

            if((c[i] == '1' || (c[i] == '2' && c[i + 1] <= '6'))){
                two = next2;
            }

            curr = one + two;
            next2 = next1;
            next1 = curr;
        }

        return next1;








        // char[] c = s.toCharArray();

        // int[] dp = new int[c.length];
        // dp[c.length - 1] = c[c.length - 1] == '0' ? 0 : 1;

        // if(c.length == 1){
        //     return dp[0];
        // }
        
        // int num = Integer.parseInt(s.substring(s.length() - 2));
        // if(num < 10 || (num % 10 == 0 && num > 20)){
        //     dp[c.length - 2] = 0;
        // }
        // else if(num == 10 || num == 20 || num > 26){
        //     dp[c.length - 2] = 1;
        // }
        // else{
        //     dp[c.length - 2] = 2;
        // }

        // for(int i = c.length - 3; i >= 0; i--){
        //     if(c[i] == '0'){
        //         dp[i] = 0;
        //         continue;
        //     }

        //     int one = dp[i + 1];
        //     int two = 0;

        //     if((c[i] == '1' || (c[i] == '2' && c[i + 1] <= '6'))){
        //         two = dp[i + 2];
        //     }

        //     dp[i] = one + two;
        // }

        // return dp[0];






        
        // char[] c = s.toCharArray();

        // int[] dp = new int[c.length];
        // Arrays.fill(dp, -1);
        
        // return decodeWays(c, 0, dp);
    }
}
