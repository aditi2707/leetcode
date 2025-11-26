class Solution {
    public String mergeAlternately(String word1, String word2) {

        // Time Complexity : O(m + n)
        // In the while loop, if we consider n < m, then the loop is running for
        // two different strings, till a value of n each. Hence, 2n.
        // TC = O(2n + m - n) ~ O(m + n)

        // Space Complexity : O(word1.length + word2.length)

        
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;

        while(i < word1.length() && j < word2.length()){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);

            ans.append(ch1);
            ans.append(ch2);

            i++;
            j++;
        }

        if(i < word1.length()){
            ans.append(word1.substring(i));
        }
        if(j < word2.length()){
            ans.append(word2.substring(j));
        }

        return ans.toString();
    }
}
