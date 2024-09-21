class Solution {
    public String stringHash(String s, int k) {
        
        // HashMap<Integer, Character> map = new HashMap<>();
        String result = "";
        // int c = 0;

        // for(char i = 'a'; i <= 'z'; i++){
        //     map.put(c, i);
        //     c++;
        // }

        for(int i = 0; i < s.length(); i += k){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                char ch = s.charAt(j);
                sum += ch - 'a';
            }
            sum = sum % 26;
            result += (char)(97 + sum);
        }

        return result;
    }
}
