class Solution {

    private boolean isPalindrome(String s){

        int i = 0, j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private void backtracking(List<List<String>> ans, String s, List<String> temp, 
    int index){

        if(index == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i < s.length(); i++){
            String str = s.substring(index, i + 1);
            if(isPalindrome(str)){
                temp.add(str);
                backtracking(ans, s, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }

    private void backtracking(List<List<String>> ans, String s, List<String> temp, 
    int index, boolean[][] dp){

        if(index == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(s.charAt(index) == s.charAt(i) && 
            ((i - index <= 2) || dp[index + 1][i - 1])){
                dp[index][i] = true;
                temp.add(s.substring(index, i + 1));
                backtracking(ans, s, temp, i + 1, dp);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }


    public List<List<String>> partition(String s) {

        // Time Complexity : O((n * (2 ^ n))). 
        // The for loop in backtracking() will run for the length of the string 
        // so TC = O(n). For each character, there are two choices, either the 
        // string is a palindrome or it is not. So that gives another n choices. 
        // Hence, TC = O(2 ^ n).

        // Space Complexity : O(n + n + n * n) (if we ignore the output array).
        // The temp array will take a maximum of string length strings. The 
        // dp array has max dimensions of string_length * string_length.
        // The recursion stack can have a maximum of length of string space.
        
        
        List<List<String>> ans = new ArrayList<>();
        boolean[][] dp = new boolean[s.length()][s.length()];

        backtracking(ans, s, new ArrayList<>(), 0, dp);

        return ans;





        // // Time Complexity : O((n * (2 ^ n)) * n/2). 
        // // The for loop in backtracking() will run for the length of the string 
        // // so TC = O(n). For each character, there are two choices, either the 
        // // string is a palindrome or it is not. So that gives another n choices. 
        // // Hence, TC = O(2 ^ n). The isPalindrome() will run for half length of 
        // // the string, so TC = O(n / 2).

        // // Space Complexity : O(n + n) (if we ignore the output array).
        // // The temp array will take a maximum of string length strings. The 
        // // recursion stack can have a maximum of length of string space.

        
        // List<List<String>> ans = new ArrayList<>();

        // backtracking(ans, s, new ArrayList<>(), 0);

        // return ans;
    }
}
