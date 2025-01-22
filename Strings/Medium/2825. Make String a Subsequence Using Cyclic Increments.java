class Solution {

    private boolean isSubsequence(char[] s1, char[] s2, int m, int n){

        if(n < 0){
            return true;
        }
        if(m < 0){
            return false;
        }

        boolean result = false;
        if(s1[m] == s2[n]){
            result = isSubsequence(s1, s2, m - 1, n - 1);
        }
        else{
            char ch = 'a';
            if(s1[m] != 'z'){
                ch = (char)((int)(s1[m]) + 1);
            }

            if(ch == s2[n]){
                result = isSubsequence(s1, s2, m - 1, n - 1);
            }
            else{
                result = isSubsequence(s1, s2, m - 1, n);
            }
        }

        return result;
    }

    
    public boolean canMakeSubsequence(String str1, String str2) {
        
        int i = 0, j = 0;

        while(i < str1.length() && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
            else{
                char cycle = (char)((int)str1.charAt(i) + 1);
                if(str1.charAt(i) == 'z'){
                    cycle = 'a';
                }
                if(cycle == str2.charAt(j)){
                    j++;
                }
            }

            i++;
        }

        return j >= str2.length();


        


        // char[] s1 = str1.toCharArray();
        // char[] s2 = str2.toCharArray();

        // return isSubsequence(s1, s2, s1.length - 1, s2.length - 1);





        // // char[] s1 = str1.toCharArray();
        // // char[] s2 = str2.toCharArray();

        // // int[][] dp = new int[s1.length + 1][s2.length + 1];

        // // for(int i = 0; i <= s1.length; i++){
        // //     Arrays.fill(dp[i], -1);
        // // }

        // // return isSubsequence(s1, s2, s1.length - 1, s2.length - 1, dp);
    }
}
