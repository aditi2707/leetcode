class Solution {
    public String sortVowels(String s) {
        
        List<Character> vowel = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowel.add(ch);
                pos.add(i);
            }
        }

        Collections.sort(vowel);
        char[] d = s.toCharArray();

        for(int i = 0; i < pos.size(); i++){
            d[pos.get(i)] = vowel.get(i);
        }

        return new String(d);
    }
}
