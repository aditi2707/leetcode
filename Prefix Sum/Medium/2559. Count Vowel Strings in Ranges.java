class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        
        int[] count = new int[queries.length];
        int[] prefix = new int[words.length];

        for(int i = 0; i < words.length; i++){
            String s = words[i];
            char start = s.charAt(0);
            char end = s.charAt(s.length() - 1);

            if((start == 'a' || start == 'e' || start == 'i' || start == 'o' || 
            start == 'u') && (end == 'a' || end == 'e' || end == 'i' || 
            end == 'o' || end == 'u')){
                prefix[i] = 1;
            }
        }

        for(int i = 1; i < prefix.length; i++){
            prefix[i] += prefix[i - 1];
        }

        for(int i = 0; i < queries.length; i++){
            if(queries[i][0] == 0){
                count[i] = prefix[queries[i][1]];
            }
            else{
                count[i] = prefix[queries[i][1]] - prefix[queries[i][0] - 1];
            }
        }

        return count;
    }
}
