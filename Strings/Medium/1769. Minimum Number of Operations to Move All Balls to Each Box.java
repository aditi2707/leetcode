class Solution {
    public int[] minOperations(String boxes) {

        int[] forward = new int[boxes.length()];
        int[] backward = new int[boxes.length()];
        int[] arr = new int[boxes.length()];

        int prev = boxes.charAt(0) == '0'?0 : 1;

        for(int i = 1; i < boxes.length(); i++){
            forward[i] += forward[i - 1] + prev;
            prev += boxes.charAt(i) == '0'?0 : 1;
        }

        prev = boxes.charAt(boxes.length()-1) == '0'?0 : 1;

        for(int i = boxes.length()-2; i >= 0; i--){
            backward[i] += backward[i + 1] + prev;
            prev += boxes.charAt(i) == '0'?0 : 1;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = forward[i] + backward[i];
        }
        
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
