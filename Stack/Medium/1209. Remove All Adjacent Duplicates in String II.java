class Solution {
    public String removeDuplicates(String s, int k) {

        // Time Complexity : O(n + n)
        

        // Space Complexity : O(n)

        
        Stack<Pair<Character, Integer>> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(char c: s.toCharArray()){
            if(stack.isEmpty() || stack.peek().getKey() != c){
                stack.push(new Pair<>(c, 1));
            }
            else{
                Pair<Character, Integer> pair = stack.pop();
                stack.push(new Pair<>(c, pair.getValue() + 1));
            }

            if(stack.peek().getValue() == k){
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            Pair<Character, Integer> pair = stack.pop();
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < pair.getValue(); i++){
                temp.append(pair.getKey());
            }
            ans.append(temp);
        }

        return ans.reverse().toString();
    }
}
