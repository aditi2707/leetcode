class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int totalN = 0;
        int sum = 0;

        for(int i = 0; i < rolls.length; i++){
            sum += rolls[i];
        }

        totalN = (mean * (rolls.length + n)) - sum;
        if(totalN > n*6 || totalN < n){
            return new int[0];
        }

        int quotient = totalN / n;
        int mod = totalN % n;
        int[] ans = new int[n];
        Arrays.fill(ans, quotient);

        for(int i = 0; i < mod; i++){
            ans[i]++;
        }

        return ans;






        // int totalN = 0;
        // int[] ans = new int[n];
        // int sum = 0;

        // for(int i = 0; i < rolls.length; i++){
        //     sum += rolls[i];
        // }

        // totalN = (mean * (rolls.length + n)) - sum;
        // if(totalN > n*6 || totalN < n){
        //     return new int[0];
        // }

        // int diceNumber = 6;
        // int a = 0, b = 0;

        // while(diceNumber >= 1){
        //     int max = diceNumber * n;
        //     if(max > totalN){
        //         diceNumber--;
        //     }
        //     else{
        //         a = diceNumber;
        //         if(a == 6){
        //             a = 6;
        //             b = 0;
        //             break;
        //         }
        //         b = diceNumber + 1;
        //         break;
        //     }
        // }

        // for(int i = 0; i < n; i++){
        //     int p = a * (n-i) + b * i;
        //     if(p == totalN){
        //         for(int j = 0; j < n-i; j++){
        //             ans[j] = a;
        //         }
        //         for(int j = n-i; j < n; j++){
        //             ans[j] = b;
        //         }
        //     }
        // }

        // if(a == 0 && b == 0){
        //     return new int[0];
        // }
        // return ans;
    }
}
