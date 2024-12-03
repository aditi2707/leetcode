class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder sentence = new StringBuilder();
        sentence.append(s.substring(0, spaces[0]) + " ");
        
        for(int i = 0; i < spaces.length - 1; i++){
            sentence.append(s.substring(spaces[i], spaces[i + 1]) + " ");
        }

        sentence.append(s.substring(spaces[spaces.length - 1]));

        return sentence.toString();
    }
}
