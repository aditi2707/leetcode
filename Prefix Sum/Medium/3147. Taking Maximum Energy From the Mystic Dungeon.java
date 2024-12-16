class Solution {

    public int mysticDungeon(int[] energy, int i, int k, int[] dp){

        if(i >= energy.length){
            return -1001;
        }

        if(i > energy.length - 1 - k){
            return energy[i];
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int transport = energy[i] + mysticDungeon(energy, i + k, k, dp);

        dp[i] = transport;
        return dp[i];
    }

    public int maximumEnergy(int[] energy, int k) {

        int[] prefix = new int[energy.length];
        int max = -1001;

        for(int i = energy.length - k; i < energy.length; i++){
            prefix[i] = energy[i];
            max = Math.max(max, prefix[i]);
        }

        for(int i = energy.length - k - 1; i >= 0; i--){
            prefix[i] = energy[i] + prefix[i + k];
            max = Math.max(max, prefix[i]);
        }

        return max;





        
        // int max = -1001;
        // int[] dp = new int[energy.length];
        // Arrays.fill(dp, -1);

        // for(int i = 0; i < energy.length; i++){
        //     max = Math.max(max, mysticDungeon(energy, i, k, dp));
        // }
        
        // return max;
    }
}
