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

    private void backtracking(String s, List<List<String>> ans, List<String> temp,  
    int start, boolean[][] dp){

        if(start == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int end = start; end < s.length(); end++){
            if(s.charAt(start) == s.charAt(end) && 
            ((end - start <= 2) || dp[start + 1][end - 1])){
                dp[start][end] = true;
                temp.add(s.substring(start, end + 1));
                backtracking(s, ans, temp, end + 1, dp);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }


    private void backtracking(String s, List<List<String>> ans, List<String> temp,  
    int ind){

        if(ind == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = ind; i < s.length(); i++){
            if(isPalindrome(s.substring(ind, i + 1))){
                temp.add(s.substring(ind, i + 1));
                backtracking(s, ans, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }


    public List<List<String>> partition(String s) {

        boolean[][] dp = new boolean[s.length()][s.length()];
        List<List<String>> ans = new ArrayList<>();

        backtracking(s, ans, new ArrayList<>(), 0, dp);

        return ans;


    
        // List<List<String>> ans = new ArrayList<>();

        // backtracking(s, ans, new ArrayList<>(), 0);

        // return ans;
    }
}
