class Solution {

    public int findExpItem(int primeOne, int primeTwo, int[] dp, int n, int max){

        if(n == primeOne*primeTwo){
            return max;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        if(n % primeOne == 0 || n % primeTwo == 0){
            dp[n] = 1;
        }
        else{
            if(dp[n-primeOne] != 1){
                if(dp[Math.abs(n-primeTwo)] != 1){
                    dp[n] = 0;
                    max = Math.max(max, n);
                }
            }
            else{
                dp[n] = 1;
            }
        }
        return findExpItem(primeOne, primeTwo, dp, n+1, max);
    }


    public int mostExpensiveItem(int primeOne, int primeTwo) {

        int[] dp = new int[primeOne * primeTwo];

        for(int i = 1; i < primeOne * primeTwo; i++){
            if(i < Math.min(primeOne, primeTwo)){
                dp[i] = 1;
            }
            if(i % primeOne == 0 || i % primeTwo == 0){
                continue;
            }
            if(dp[Math.abs(i - primeOne)] == 1 || dp[Math.abs(i - primeTwo)] == 1){
                dp[i] = 1;
            }
        }

        for(int i = dp.length - 1; i > 0; i--){
            if(dp[i] == 1){
                return i;
            }
        }

        return -1;





        
        
        // int[] dp = new int[primeOne*primeTwo];
        // int max = 0;

        // if(primeOne < primeTwo)
        //     max = findExpItem(primeOne, primeTwo, dp, primeOne+1, 0);
        // else
        //     max = findExpItem(primeTwo, primeOne, dp, primeTwo+1, 0);
        
        // if(max == 0){
        //     return primeOne-1;
        // }
        // return max;





        



        // int max = 0;
        // int[] dp = new int[primeOne*primeTwo];
        // if(primeOne < primeTwo){
        //     for(int j = primeOne+1; j < primeOne*primeTwo; j++){
        //         if(j % primeOne == 0 || j % primeTwo == 0){
        //             dp[j] = 1;
        //             continue;
        //         }
        //         if(dp[j-primeOne] != 1){
        //             if(dp[Math.abs(j-primeTwo)] != 1){
        //                 dp[j] = 0;
        //                 max = Math.max(max, j);
        //             }   
        //         }
        //         else{
        //             dp[j] = 1;
        //         }
        //     }
        //     if(max == 0){
        //         return primeOne-1;
        //     }
        // }
        // else{
        //     for(int j = primeTwo+1; j < primeOne*primeTwo; j++){
        //         if(j % primeOne == 0 || j % primeTwo == 0){
        //             dp[j] = 1;
        //             continue;
        //         }
        //         if(dp[j-primeTwo] != 1){
        //             if(dp[Math.abs(j-primeOne)] != 1){
        //                 dp[j] = 0;
        //                 max = Math.max(max, j);
        //             }
        //         }
        //         else{
        //             dp[j] = 1;
        //         }
        //     }
        //     if(max == 0){
        //         return primeTwo-1;
        //     }
        // }

        // return max;
    }
}
