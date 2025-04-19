class Solution {
    public int[] finalPrices(int[] prices) {

        // Time Complexity : O(n * 2)
        // Think of it this way, ignore the for loop for now and focus on the while
        // loop. The while loop will run for push and pop of every elemnt atmost 
        // once. This can be seen in extreme cases when the TC is O(n).
        // So, all in all, the TC is linear.

        // Space Complexity : O(n) (ignoring the output array)


        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];

        for(int i = prices.length - 1; i >= 0; i--){

            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = prices[i];
            }
            else{
                ans[i] = prices[i] - prices[stack.peek()];
            }
            stack.push(i);
        }

        return ans;






        // // Time Complexity : O(n ^ 2)

        // // Space Complexity : O(1) (ignoring the output array)

        
        // int[] ans = new int[prices.length];

        // for(int i = 0; i < prices.length; i++){
        //     int flag = 0;
        //     for(int j = i + 1; j < prices.length; j++){
        //         if(prices[j] <= prices[i]){
        //             ans[i] = prices[i] - prices[j];
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0){
        //         ans[i] = prices[i];
        //     }
        // }

        // return ans;
    }
}
