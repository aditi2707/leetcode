class Solution {

        private void backtracking(List<String> ans, Map<Character, String> map, 
    String digits, String str, int index){

        if(index == digits.length()){
            ans.add(str);
            return;
        }

        for(char c: map.get(digits.charAt(index)).toCharArray()){
                str += c;
                backtracking(ans, map, digits, str, index + 1);
                str = str.substring(0, str.length() - 1);
            }

        return;
    }


    public List<String> letterCombinations(String digits) {

        // Time Complexity : O(4 ^ n).
        // Each digit has either 3 or 4 letters mapped to it. So if the worst case is
        // considered, then each letter has 4 choices so for a length of n, this will
        // be equal to 4 ^ n.

        // Space Complexity : O(32) (if we ignore the output array).
        

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return ans;
        }
        
        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtracking(ans, map, digits, "", 0);

        return ans;

    }
}
