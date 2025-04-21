class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        // Time Complexity : O((n * 2) + n)
        // In the first for loop, each element will be pushed and popped atmost once.
        // So, TC will be linear. In the second for loop, it may happen that all
        // the asteroids do not collide. So the stack will contain all the asteroids.

        // Space Complexity : O(n)
        // Stack may have all the asteoids at some point.

        
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < asteroids.length; i++){
            int flag = 0;
            while(!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0){
                if(Math.abs(stack.peek()) < Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(Math.abs(stack.peek()) == Math.abs(asteroids[i])){
                    stack.pop();
                    flag = 1;
                }
                else{
                    flag = 1;
                }
                if(flag == 1){
                    break;
                }
            }

            if(flag == 0){
                stack.push(asteroids[i]);
            }
        }
        
        int[] ans = new int[stack.size()];

        for(int i = ans.length - 1; i >= 0; i--){
            ans[i] = stack.pop();
        }

        return ans;





        // // Time Complexity : O((n * 2) + n)
        // // In the first for loop, each element will be pushed and popped atmost once.
        // // So, TC will be linear. In the second for loop, it may happen that all
        // // the asteroids do not collide. So the stack will contain all the asteroids.

        // // Space Complexity : O(n)
        // // Stack may have all the asteoids at some point.


        // Stack<Integer> stack = new Stack<>();
        // stack.add(asteroids[0]);

        // for(int i = 1; i < asteroids.length; i++){
        //     if(!stack.isEmpty() && stack.peek() <= 0 && asteroids[i] <= 0){
        //         stack.push(asteroids[i]);
        //         continue;
        //     }
        //     if(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] > 0){
        //         stack.push(asteroids[i]);
        //         continue;
        //     }
        //     if(!stack.isEmpty() && stack.peek() < 0 && asteroids[i] > 0){
        //         stack.push(asteroids[i]);
        //         continue;
        //     }

        //     stack.push(asteroids[i]);
        //     while(stack.size() > 1){
        //         int pop1 = stack.pop();
        //         int pop2 = stack.pop();

        //         if(pop1 < 0 && pop2 < 0 || pop1 > 0 && pop2 > 0 || 
        //         pop1 == 0 && pop2 == 0 || pop1 > 0 && pop2 < 0){
        //             stack.push(pop2);
        //             stack.push(pop1);
        //             break;
        //         }

        //         if(pop1 < 0 && pop2 > 0){
        //             if(Math.abs(pop1) < Math.abs(pop2)){
        //                 stack.push(pop2);
        //             }
        //             else if(Math.abs(pop1) > Math.abs(pop2)){
        //                 stack.push(pop1);
        //             }
        //         }
        //         else if(pop1 > 0 && pop2 < 0){
        //             if(Math.abs(pop1) < Math.abs(pop2)){
        //                 stack.push(pop1);
        //             }
        //             else if(Math.abs(pop1) > Math.abs(pop2)){
        //                 stack.push(pop2);
        //             }
        //         }
        //     }
        // }

        // int[] ans = new int[stack.size()];
        // int k = stack.size() - 1;

        // while(!stack.isEmpty()){
        //     ans[k] = stack.pop();
        //     k--;
        // }

        // return ans;

    }
}
