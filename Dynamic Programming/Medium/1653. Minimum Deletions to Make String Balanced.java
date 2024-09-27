class Solution {

    public int minimumDeletions(String s) {

        // int[] b = new int[s.length()];
        int count = 0;
        int point = 0;

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == 'b'){
                if(point != 0){
                    // b[i] = 1;
                    count++;
                    point -= 1;
                }
            }
            else{
                point++;
            }
        }

        // for(int i = 0; i < b.length; i++){
        //     count += b[i];
        // }

        return count;








        // Stack<Character> stack = new Stack<>();
        // int count = 0;

        // for(int i = s.length()-1; i >= 0; i--){
        //     if(s.charAt(i) == 'b'){
        //         if(!stack.isEmpty()){
        //             stack.pop();
        //             count++;
        //         }
        //     }
        //     else{
        //         stack.push('a');
        //     }
        // }

        // return count;

    }
}
