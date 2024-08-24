class Solution {

    public String[] finalMatches(String[] ans, int n){

        if(n == 2){
            return ans;
        }

        for(int i = 0; i < n/2; i++){
            String t = "(" + ans[i] + "," + ans[n-1-i] + ")";
            ans[i] = t;
        }

        return finalMatches(ans, n/2);
    }

    public String findContestMatch(int n) {
        
        String[] ans = new String[n];

        for(int i = 1; i <= n; i++){
            ans[i-1] = Integer.toString(i);
        }

        ans = finalMatches(ans, n);
        return "(" + ans[0] + "," + ans[1] + ")";



        // String[] ans = new String[n/2];
        // String r = "";

        // if(n == 2){
        //     return "(1,2)";
        // }

        // // for(int i = 1; i <= n/2; i++){
        // //     String s = "(" + Integer.toString(i) + "," + Integer.toString(n+1-i) + ")";
        // //     ans[i-1] = s;
        // // }

        // int length = n;
        // while(length > 2){
        //     for(int i = 0; i < length/2; i++){
        //         if(length == n){
        //             String s = "(" + Integer.toString(i+1) + "," + Integer.toString(n-i) + ")";
        //             ans[i] = s;
        //         }
        //         else{
        //             String t = "(" + ans[i] + "," + ans[length-1-i] + ")";
        //             ans[i] = t;
        //         }
                
        //     }
        //     length = length/2;
        // }

        // r = "(" + ans[0] + "," + ans[1] + ")";
        // return r;
    }
}
