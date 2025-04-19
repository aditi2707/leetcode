class Solution {
    public int[] findBuildings(int[] heights) {

        // Time Complexity : O((n * 2) + n)

        // Space Complexity : O(n) (ignoring the output array)


        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < heights.length; i++){
            while(!stack.isEmpty() && heights[i] >= heights[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }

        int[] ans = new int[stack.size()];

        for(int i = ans.length - 1; i >= 0; i--){
            ans[i] = stack.pop();
        }

        return ans;

        

        
        // // Time Complexity : O(n + n)

        // // Space Complexity : O(n) (ignoring the output array)
        
        
        // int max = heights[heights.length-1];
        // List<Integer> ans = new ArrayList<>();

        // for(int i = heights.length-2; i >= 0; i--){
        //     if(heights[i] > max){
        //         max = heights[i];
        //         ans.add(i);
        //     }
        // }

        // int[] arr = new int[ans.size()+1];

        // for(int i = 0; i < arr.length-1; i++){
        //     arr[i] = ans.get(ans.size() - 1- i);
        // }

        // arr[arr.length-1] = heights.length-1;
        // return arr;

        


        
        // // Time Complexity : O(n + n)

        // // Space Complexity : O(n + n) (ignoring the output array)

        
        // Stack<Integer> stack = new Stack<>();
        // List<Integer> list = new ArrayList<>();

        // stack.push(heights.length - 1);
        // list.add(heights.length - 1);

        // for(int i = heights.length - 2; i >= 0; i--){
        //     if(heights[i] > heights[stack.peek()]){
        //         list.add(i);
        //         stack.push(i);
        //     }
        // }

        // int[] ans = new int[list.size()];

        // for(int i = list.size() - 1; i >= 0; i--){
        //     ans[ans.length - 1 - i] = list.get(i);
        // }

        // return ans;
    }
}
