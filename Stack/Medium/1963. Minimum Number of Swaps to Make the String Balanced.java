class Solution {
    public int minSwaps(String s) {

        int counter = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '['){
                counter++;
            }
            else{
                if(counter > 0){
                    counter--;
                }
            }
        }

        return (counter + 1) / 2;




        
        // Stack<Character> stack = new Stack<>();
        // int swaps = 0;

        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '['){
        //         stack.push('[');
        //     }
        //     else{
        //         if(stack.isEmpty()){
        //             swaps++;
        //         }
        //         else{
        //             stack.pop();
        //         }
        //     }
        // }

        // return (swaps + 1)/2;
    }
}
