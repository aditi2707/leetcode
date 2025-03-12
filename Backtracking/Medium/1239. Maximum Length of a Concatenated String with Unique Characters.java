class Solution {

    private int backtracking(List<String> arr, int index, String str){

        if(index == arr.size()){
            return 0;
        }

        int max = 0;

        for(int i = index; i < arr.size(); i++){
            String s = arr.get(i);
            int flag = 0;
            for(char c: s.toCharArray()){
                if(str.indexOf(c) != -1 || (s.indexOf(c) != s.lastIndexOf(c))){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                str += s;
                max = Math.max(max, 
                Math.max(str.length(), backtracking(arr, i + 1, str)));
                
                str = str.substring(0, str.length() - s.length());
            }
        }

        return max;
    }



    private void backtracking(List<String> arr, int index, String str, int[] max){

        if(index == arr.size()){
            return;
        }

        for(int i = index; i < arr.size(); i++){
            String s = arr.get(i);
            int flag = 0;
            for(char c: s.toCharArray()){
                if(str.indexOf(c) != -1 || (s.indexOf(c) != s.lastIndexOf(c))){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                str += s;
                max[0] = Math.max(max[0], str.length());
                backtracking(arr, i + 1, str, max);
                str = str.substring(0, str.length() - s.length());
            }
        }

        return;
    }


    public int maxLength(List<String> arr) {

        // Both solutions will have same TC and SC.

        // Time Complexity : O(26 * 2 ^ n), where m is the length of str in 
        // backtracking().
        // The nested for loop will run for the length of s, which can be 26 in the
        // worst case. There are 2 options, either you select/not select each string.
        // Hence, TC here will be O(2 ^ n).

        // Space Complexity : O(26 * 16 + n) (if we include the depth of recursion 
        // stack).
        

        return backtracking(arr, 0, "");


        
        // int[] max = {0};

        // backtracking(arr, 0, "", max);

        // return max[0];
    }
}
