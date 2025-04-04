class Solution {
    public String minRemoveToMakeValid(String s) {

        // Time Complexity : O(n + n + n)

        // Space Complexity : O(n + n)
        

        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            }
            else if(ch == ')'){
                if(stack.isEmpty()){
                    set.add(i);
                }
                else{
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            set.add(stack.pop());
        }

        for(int i = 0; i < s.length(); i++){
            if(!set.contains(i)){
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();




        // // Time Complexity : O(n ^ 2 + n + n)

        // // Space Complexity : O(n + n)

        
        // Stack<Pair<Character, Integer>> stack = new Stack<>();
        // Set<Integer> set = new HashSet<>();
        // String ans = "";
        // int open = 0;
        
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);

        //     if(stack.isEmpty() || ch != ')'){
        //         stack.push(new Pair<>(ch, i));
        //         if(ch == '('){
        //             open++;
        //         }
        //     }
        //     else{
        //         while(!stack.isEmpty() && stack.peek().getKey() != '(' && open > 0){
        //             stack.pop();
        //         }
        //         if(!stack.isEmpty() && open > 0){
        //             stack.pop();
        //             open--;
        //         }
        //         else{
        //             stack.push(new Pair<>(ch, i));
        //         }
        //     }
        // }

        // while(!stack.isEmpty()){

        //     if(stack.peek().getKey() == '(' || stack.peek().getKey() == ')'){
        //         set.add(stack.pop().getValue());
        //     }
        //     else{
        //         stack.pop();
        //     }
        // }

        // for(int i = 0; i < s.length(); i++){
        //     if(!set.contains(i)){
        //         ans += s.charAt(i);
        //     }
        // }

        // return ans;
    }
}
