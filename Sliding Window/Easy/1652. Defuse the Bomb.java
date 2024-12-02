class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] ans = new int[code.length];

        if(k == 0){
            return ans;
        }

        if(k > 0){
            int i = 0, j = k, sum = 0;

            for(int p = 0; p <= k; p++){
                sum += code[p];
            }

            while(i < code.length){
                ans[i] = sum - code[i];
                j++;
                if(j >= code.length){
                    j = 0;
                }
                sum += code[j];
                sum -= code[i];
                i++;
            }
        }
        else{
            int i = code.length - 1 + k, j = code.length - 1, sum = 0;

            for(int p = code.length - 1; p >= code.length - 1 + k; p--){
                sum += code[p];
            }

            while(j >= 0){
                ans[j] = sum - code[j];
                i--;
                if(i < 0){
                    i = code.length - 1;
                }
                sum += code[i];
                sum -= code[j];
                j--;
            }
        }

        return ans;
    }
}
