class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int[] freq = new int[26];
        int ans = 0;
        

        for(int i = 0; i < chars.length(); i++){
            char ch = chars.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < words.length; i++){
            String s = words[i];

            if(s.length() > chars.length()){
                continue;
            }
            int[] copy = Arrays.copyOf(freq, 26);
            int flag = 0;

            for(int j = 0; j < s.length(); j++){
                char ch = s.charAt(j);

                copy[ch - 'a']--;

                if(copy[ch - 'a'] < 0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                ans += s.length();
            }
        }

        return ans;
    }
}
