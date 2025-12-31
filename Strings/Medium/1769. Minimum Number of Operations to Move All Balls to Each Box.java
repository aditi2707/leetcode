class Solution {
    public int[] minOperations(String boxes) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1)
        

        int leftDist = 0;
        int leftNum = 0;
        int rightDist = 0;
        int rightNum = 0;

        int[] ans = new int[boxes.length()];

        for(int i = 1; i < boxes.length(); i++){
            char ch = boxes.charAt(i - 1);

            leftDist += leftNum;

            if(ch == '1'){
                leftDist += 1;
                leftNum += 1;
            }

            ans[i] = leftDist;
        }

        ans[boxes.length() - 1] = leftDist;

        for(int i = boxes.length() - 2; i >= 0; i--){
            char ch = boxes.charAt(i + 1);

            rightDist += rightNum;

            if(ch == '1'){
                rightDist += 1;
                rightNum += 1;
            }

            ans[i] += rightDist;
        }

        return ans;







        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 2)
        

        // int[] leftDist = new int[boxes.length()];
        // int[] leftNum = new int[boxes.length()];
        // int rightDist = 0;
        // int rightNum = 0;

        // int[] ans = new int[boxes.length()];

        // for(int i = 1; i < boxes.length(); i++){
        //     char ch = boxes.charAt(i - 1);

        //     leftDist[i] += leftDist[i - 1] + leftNum[i - 1];
        //     leftNum[i] += leftNum[i - 1];

        //     if(ch == '1'){
        //         leftDist[i] += 1;
        //         leftNum[i] += 1;
        //     }
        // }

        // ans[boxes.length() - 1] = leftDist[boxes.length() - 1];

        // for(int i = boxes.length() - 2; i >= 0; i--){
        //     char ch = boxes.charAt(i + 1);

        //     rightDist += rightNum;

        //     if(ch == '1'){
        //         rightDist += 1;
        //         rightNum += 1;
        //     }

        //     ans[i] = leftDist[i] + rightDist;
        // }

        // return ans;





        

        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n * 4)


        // int[] leftDist = new int[boxes.length()];
        // int[] leftNum = new int[boxes.length()];
        // int[] rightDist = new int[boxes.length()];
        // int[] rightNum = new int[boxes.length()];

        // int[] ans = new int[boxes.length()];

        // for(int i = 1; i < boxes.length(); i++){
        //     char ch = boxes.charAt(i - 1);

        //     leftDist[i] += leftDist[i - 1] + leftNum[i - 1];
        //     leftNum[i] += leftNum[i - 1];

        //     if(ch == '1'){
        //         leftDist[i] += 1;
        //         leftNum[i] += 1;
        //     }
        // }

        // ans[boxes.length() - 1] = leftDist[boxes.length() - 1];

        // for(int i = boxes.length() - 2; i >= 0; i--){
        //     char ch = boxes.charAt(i + 1);

        //     rightDist[i] += rightDist[i + 1] + rightNum[i + 1];
        //     rightNum[i] += rightNum[i + 1];

        //     if(ch == '1'){
        //         rightDist[i] += 1;
        //         rightNum[i] += 1;
        //     }

        //     ans[i] = leftDist[i] + rightDist[i];
        // }

        // return ans;




        
        
        // int[] arr = new int[boxes.length()];
        // for(int i = 0; i < boxes.length(); i++){
        //     int counter = 0;
        //     for(int j = 0; j < boxes.length(); j++){
        //         if(i == j){
        //             continue;
        //         }

        //         if(boxes.charAt(i) == '0' && boxes.charAt(j) == '1'){
        //             counter += Math.abs(j - i);
        //         }

        //         if(boxes.charAt(i) == '1' && boxes.charAt(j) == '1'){
        //             counter += Math.abs(j - i);
        //         }
        //     }

        //     arr[i] = counter;
        // }

        return arr;
    }
}
