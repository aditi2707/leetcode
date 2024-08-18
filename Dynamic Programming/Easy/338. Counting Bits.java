class Solution {

    public int decToBin(int[] ans, int n){
        
        if(n == 1){
            return 1;
        }

        if(ans[n] != -1){
            return ans[n];
        }

        if(n % 2 != 0){
            ans[n] = decToBin(ans, n/2) + 1;
            return ans[n];
        }
        
        return decToBin(ans, n/2);
    }
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];

        if(n == 0){
            return ans;
        }

        for(int i = 2; i < n+1; i++){
            ans[i] = -1;
        }
        ans[0] = 0;
        ans[1] = 1;
        
        for(int i = 2; i < ans.length; i++){
            if(i % 2 != 0){
                ans[i] = ans[i/2] + 1;
            }
            else{
                ans[i] = ans[i/2];
            }
        }

        return ans;
    }
}
