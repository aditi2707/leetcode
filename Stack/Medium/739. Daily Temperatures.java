class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // Time Complexity : O(n * 2)
        // Focusing on only the while loop, every value will be pushed and popped 
        // atmost once. So the TC is n * 2.

        // Space Complexity : O(n) (ignoring the output array)
        // The stack may have all the values if the array is in non-decreasing order
        

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        
        stack.push(temperatures.length - 1);

        for(int i = temperatures.length - 2; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }

        return ans;




        // // Time Complexity : O(n * 2)
        // // Focusing on only the while loop, every value will be pushed and popped 
        // // atmost once. So the TC is n * 2.

        // // Space Complexity : O(n) (ignoring the output array)
        // // The stack may have all the values if the array is in non-decreasing order


        // Stack<Integer> stack = new Stack<>();
        // int[] ans = new int[temperatures.length];

        // for(int i = 0; i < temperatures.length; i++){
        //     while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
        //         ans[stack.peek()] = i - stack.peek();
        //         stack.pop();
        //     }
                
        //     stack.push(i);
        // }

        // return ans;
    }
}
