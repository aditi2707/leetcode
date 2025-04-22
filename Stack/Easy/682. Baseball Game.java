class Solution {
    public int calPoints(String[] operations) {

// Time Complexity : O(n)

        // Space Complexity : O(n)
        // The stack will use a linear space complexity.


        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(String s: operations){
            if(s.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a + b);
                ans += stack.peek();
            }
            else if(s.equals("D")){
                stack.push(stack.peek() * 2);
                ans += stack.peek();
            }
            else if(s.equals("C")){
                ans -= stack.peek();
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(s));
                ans += stack.peek();
            }
        }

        return ans;

        


        // // Time Complexity : O(n + n)
        // // One loop will run for the entire array. The other loop will run for 
        // // the length of the stack, which can be n in the worst case.

        // // Space Complexity : O(n)
        // // The stack will use a linear space complexity.

        
        // Stack<Integer> stack = new Stack<>();
        // int ans = 0;

        // for(String s: operations){
        //     if(s.equals("+")){
        //         int a = stack.pop();
        //         int b = stack.pop();
        //         stack.push(b);
        //         stack.push(a);
        //         stack.push(a + b);
        //     }
        //     else if(s.equals("D")){
        //         stack.push(stack.peek() * 2);
        //     }
        //     else if(s.equals("C")){
        //         stack.pop();
        //     }
        //     else{
        //         stack.push(Integer.parseInt(s));
        //     }
        // }

        // while(!stack.isEmpty()){
        //     ans += stack.pop();
        // }

        // return ans;





        
        // ArrayList<Integer> ans = new ArrayList<>();
        // int sum = 0;
        // int k = -1;

        // for(int i = 0; i < operations.length; i++){
        //     String op = operations[i];

        //     if(op.compareTo("+") == 0){
        //         int num1 = ans.get(k);
        //         int num2 = ans.get(k-1);

        //         ans.add(num1 + num2);
        //         k++;
        //         sum += ans.get(k);
        //     }
        //     else if(op.compareTo("C") == 0){
        //         sum -= ans.get(k);
        //         ans.remove(k);
        //         k--;
        //     }
        //     else if(op.compareTo("D") == 0){
        //         int num1 = ans.get(k);
        //         ans.add(num1 * 2);
        //         k++;
        //         sum += ans.get(k);
        //     }
        //     else{
        //         ans.add(Integer.parseInt(op));
        //         k++;
        //         sum += Integer.parseInt(op);
        //     }
        // }

        // return sum;
    }
}
