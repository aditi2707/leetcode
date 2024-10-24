class Solution {
    public int[] countBits(int n) {
        
        if(n == 0){
            return new int[]{0};
        }

        int[] ones = new int[n + 1];
        ones[0] = 0;
        ones[1] = 1;

        int multiplier = 2;
        int compare = 0;

        for(int i = 2; i <= n; i++){

            if(multiplier * 2 == i){
                multiplier = i;
            }

            ones[i] = 1 + ones[i - multiplier];


            // if(multiplier == i){
            //     compare = multiplier;
            //     multiplier *= 2;
            // }
            // ones[i] = 1 + ones[i - compare];
        }

        return ones;








        // int[] ones = new int[n+1];
        // ones[0] = 0;

        // for(int i = 1; i <= n; i++){
        //     int num = i;

        //     while(num > 0){
        //         if(ones[num] != 0){
        //             ones[i] += ones[num];
        //             break;
        //         }
        //         int d = num % 2;
        //         if(d == 1){
        //             ones[i]++;
        //         }
        //         num = num >> 1;
        //     }
        // }

        // return ones;




        
        // int[] ones = new int[n+1];
        // ones[0] = 0;

        // for(int i = 1; i <= n; i++){
        //     int num = i;
        //     while(num > 0){
        //         ones[i]++;
        //         num = num & (num-1);
        //     }
        // }

        // return ones;
    }
}
