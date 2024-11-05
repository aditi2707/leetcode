class Solution {

    public void backtracking(String digits, Map<Character, String> map, List<String> ans, String temp, int s){

        if(temp.length() == digits.length()){
            ans.add(new String(temp));
            return;
        }

        for(int i = 0; i < map.get(digits.charAt(s)).length(); i++){
            temp += map.get(digits.charAt(s)).charAt(i);
            backtracking(digits, map, ans, temp, s + 1);
            temp = temp.substring(0, temp.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        Map<Character, String> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if(digits.equals("")){
            return ans;
        }

        backtracking(digits, map, ans, "", 0);

        return ans;
    }
}
