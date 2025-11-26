class Solution {
    public String sortSentence(String s) {

        // Time Complexity : O(n + 10)

        // Space Complexity : O(n)
        
        
        String[] arr = new String[10];
        String[] words = s.split(" ");
        String ans = "";
        
        for(String str: words){
            int pos = str.charAt(str.length() - 1) - '0';
            String word = str.substring(0, str.length() - 1);

            arr[pos] = word;
        }

        for(int i = 1; i < 10; i++){
            if(arr[i] == null){
                continue;
            }
            ans += arr[i] + " ";
        }

        return ans.trim();
    }
}
