class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        int sum = 0;

        for(int i = 0; i < chalk.length; i++){
            sum += chalk[i];
            if(sum > k){
                return i;
            }
        }

        sum = k % sum;

        for(int i = 0; i < chalk.length; i++){
            if(chalk[i] <= sum){
                sum -= chalk[i];
            }
            else{
                return i;
            }
        }
        return -1;


        //int i = 0;
        // while(chalk[i] <= k){
        //     if(chalk[i] <= k){
        //         k -= chalk[i];
        //     }
        //     else{
        //         //index = i;
        //         break;
        //     }
        //     i++;

        //     if(i == chalk.length){
        //         i = 0;
        //     }
        // }

        // return i;
    }
}
