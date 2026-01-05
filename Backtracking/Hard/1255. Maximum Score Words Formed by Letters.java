class Solution {

    private void backtracking(String[] words, int[] score, int[] freq, int[] sum, 
    int index, int[] temp){

        sum[0] = Math.max(temp[0], sum[0]);

        if(index >= words.length){
            return;
        }

        for(int i = index; i < words.length; i++){
            int s = 0;
            int flag = -1;

            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(freq[ch - 'a'] > 0){
                    s += score[ch - 'a'];
                    freq[ch - 'a'] -= 1;
                }
                else{
                    flag = j;
                    break;
                }
            }

            if(flag == -1){
                temp[0] += s;
                backtracking(words, score, freq, sum, i + 1, temp);

                for(char ch: words[i].toCharArray()){
                    freq[ch - 'a'] += 1;
                }
                temp[0] -= s;
            }
            else{
                for(int k = 0; k < flag; k++){
                    char ch = words[i].charAt(k);
                    freq[ch - 'a'] += 1;
                }
            }
        }
    }


    private void backtracking(String[] words, int[] score, int[] freq, int[] sum, 
    int[] index, int[] temp){

        sum[0] = Math.max(temp[0], sum[0]);

        for(int i = 0; i < words.length; i++){
            if(index[i] == 1){
                continue;
            }

            int s = 0;
            int flag = -1;

            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(freq[ch - 'a'] > 0){
                    s += score[ch - 'a'];
                    freq[ch - 'a'] -= 1;
                }
                else{
                    flag = j;
                    break;
                }
            }

            if(flag == -1){
                index[i] = 1;
                temp[0] += s;
                backtracking(words, score, freq, sum, index, temp);

                for(char ch: words[i].toCharArray()){
                    freq[ch - 'a'] += 1;
                }
                temp[0] -= s;
                index[i] = 0;
            }
            else{
                for(int k = 0; k < flag; k++){
                    char ch = words[i].charAt(k);
                    freq[ch - 'a'] += 1;
                }
            }
        }
    }


    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        // Time Complexity : O(letters + (2 ^ words))

        // Space Complexity : O(26)

        
        int[] freq = new int[26];
        int[] sum = {0};

        for(Character ch: letters){
            freq[ch - 'a'] += 1;
        }

        backtracking(words, score, freq, sum, 0, new int[1]);

        return sum[0];








        // // Time Complexity : O(letters + (words!))

        // // Space Complexity : O(26 + words)

        
        // int[] freq = new int[26];
        // int[] index = new int[words.length];
        // int[] sum = {0};

        // for(Character ch: letters){
        //     freq[ch - 'a'] += 1;
        // }

        // backtracking(words, score, freq, sum, index, new int[1]);

        // return sum[0];
    }
}
