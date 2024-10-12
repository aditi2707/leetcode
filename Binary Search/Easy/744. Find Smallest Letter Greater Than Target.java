class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int low = 0, high = letters.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(letters[mid] <= target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(low >= 0 && low < letters.length){
            return letters[low];
        }

        return letters[0];






        
        // for(int i = 0; i < letters.length; i++){
        //     if(letters[i] > target){
        //         return letters[i];
        //     }
        // }
        // return letters[0];
    }
}
