class Solution {

    private void backtracking(List<String> ans, char[] arr, int index){

        if(index == arr.length){
            ans.add(new String(arr));
            return;
        }

        if(Character.isLetter(arr[index])){
            arr[index] = Character.toLowerCase(arr[index]);
            backtracking(ans, arr, index + 1);
            arr[index] = Character.toUpperCase(arr[index]);
            backtracking(ans, arr, index + 1);
        }
        else{
            backtracking(ans, arr, index + 1);
        }

        return;
    }



    private void backtracking(List<String> ans, String temp, String s, int index){

        if(temp.length() == s.length()){
            ans.add(temp);
            return;
        }

        if(index == s.length()){
            return;
        }

        for(int i = index; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                backtracking(ans, temp + Character.toLowerCase(ch), s, i + 1);
                backtracking(ans, temp + Character.toUpperCase(ch), s, i + 1);
            }
            else{
                backtracking(ans, temp + ch, s, i + 1);
            }
        }

        return;
    }


    public List<String> letterCasePermutation(String s) {

        // Both the methods will have similar TC and SC.
        
        // Time Complexity : O(n * 2 ^ n).
        // This is because for each character, there are two options, either you
        // make it into uppercase or lowercase. And this will be applied for all
        // characters, hence in the worst case, when all characters are letters, the
        // TC will be O(n * 2 ^ n).

        // Space Complexity : O(n + n * 2 ^ n).
        // The temp array will contain a maximum of all characters and the recursion
        // stack can have all the combinations in the worst case, so that makes
        // n * 2 ^ n.


        List<String> ans = new ArrayList<>();

        char[] arr = s.toCharArray();

        backtracking(ans, arr, 0);

        return ans;



        
        // List<String> ans = new ArrayList<>();

        // backtracking(ans, "", s, 0);

        // return ans;
    }
}
