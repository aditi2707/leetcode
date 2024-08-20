class Solution {

    public int countOnes(int n, int[] ans){
        if(n == 1){
            return 1;
        }

        if(ans[n] != 0){
            return ans[n];
        }

        if(n % 2 != 0){
            ans[n] = 1 + countOnes(n/2, ans);
            return ans[n];
        }
        ans[n] = countOnes(n/2, ans);
        return ans[n];
    }

    
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];
        if(n == 0){
            return ans;
        }

        for(int i = 1; i <= n; i++){
            // if(i == 1 || i == 2){
            //     ans[i] = 1;
            // }
            // if(ans[i] != 0){
            //     continue;
            // }
            // else{
            //     if(i % 2 != 0){
            //         ans[i] += 1 + ans[i/2];
            //     }
            //     else{
            //         ans[i] += ans[i/2];
            //     }
            // }
            
            ans[i] = countOnes(i, ans);
        }

        return ans;
    }
}
