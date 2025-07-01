class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        int i = 0;

        while(i < arr.length){
            if(arr[i] % 2 == 1){
                int count = 0;
                int j = i;
                while(j < arr.length && j < i + 3){
                    if(arr[j] % 2 == 1){
                        count++;
                    }
                    else{
                        break;
                    }
                    j++;
                }
                if(count == 3){
                    return true;
                }
                i = j + 1;
            }
            else{
                i++;
            }
        }

        return false;
    }
}
