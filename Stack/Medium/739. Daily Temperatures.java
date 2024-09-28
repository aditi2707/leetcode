class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for(int i = 1; i < temperatures.length; i++){
            if(temperatures[i] > temperatures[stack.peek()]){
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                    int j = stack.pop();
                    ans[j] = i - j;
                } 
                stack.push(i);
            }
            else{
                stack.push(i);
            }
        }

        return ans;
    }
}
