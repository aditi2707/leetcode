class Solution {

    public void findLetters(String word, HashSet<Character> set){

        for(int i = 0; i < word.length(); i++){
            set.add(word.charAt(i));
        }
    }

    public int similarPairs(String[] words) {
        
        int pairs = 0;
        boolean flag = false;

        for(int i = 0; i < words.length; i++){
            HashSet<Character> set1 = new HashSet<>();
            
            findLetters(words[i], set1);

            for(int j = i+1; j < words.length; j++){
                HashSet<Character> set2 = new HashSet<>();
                findLetters(words[i], set2);
                if(set1.equals(set2)){
                    pairs++;
                    break;
                }
                
            }

            
        }

        return pairs;
    }
}
