class Solution {
    public String removeDuplicates(String s, int k) {

        // Time Complexity : O(n + n)

        // Space Complexity : O(n)
        
        
        Stack<Pair<Character, Integer>> stack = new Stack<>();
        
        int index = 0;
        String ans = "";

        while(index < s.length()){
            char ch = s.charAt(index);

            if(stack.isEmpty() || stack.peek().getKey() != ch){
                stack.push(new Pair<>(ch, 1));
            }
            else{
                int count = stack.pop().getValue();
                stack.push(new Pair<>(ch, count + 1));
                if(stack.peek().getValue() == k){
                    // while(!stack.isEmpty() && stack.peek().getKey() == ch){
                    //     stack.pop();
                    // }
                    stack.pop();
                }
            }

            index++;
        }

        while(!stack.isEmpty()){
            Pair<Character, Integer> pop = stack.pop();
            for(int i = 0; i < pop.getValue(); i++){
                ans = pop.getKey() + ans;
            }
            
        }

        return ans;
    }
}
