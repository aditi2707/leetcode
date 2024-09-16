class Solution {

    public boolean isPalindrome(String s){

        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) == s.charAt(s.length()-1-i)){
                continue;
            }
            else{
                return false;
            }
        }

        return true;
    }

    public void dfs(List<List<String>> ans, List<String> temp, int start, String s){

        if(start >= s.length()){
            ans.add(new ArrayList<String>(temp));
        }

        for(int i = start; i < s.length(); i++){
            if(isPalindrome(s.substring(start, i+1))){
                temp.add(s.substring(start, i+1));
                dfs(ans, temp, i+1, s);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();
        
        dfs(ans, new ArrayList<>(), 0, s);

        return ans;
    }
}
