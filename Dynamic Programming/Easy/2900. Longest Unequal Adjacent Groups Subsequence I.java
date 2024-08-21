class Solution {

    public List<String> findAlternate(String[] words, int[] groups, int n, int i, List<String> ans){

        if(i == n){
            return ans;
        }

        if(groups[i] != groups[i-1]){
            ans.add(words[i]);
        }

        return findAlternate(words, groups, n, i+1, ans);
    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);

        return findAlternate(words, groups, words.length, 1, ans);

        // for(int i = 1; i < groups.length; i++){
        //     if(groups[i] != groups[i-1]){
        //         ans.add(words[i]);
        //     }
        // }

        // return ans;
    }
}
