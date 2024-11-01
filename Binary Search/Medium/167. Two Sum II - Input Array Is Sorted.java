class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];
        int i = 0, j = numbers.length - 1;

        while(i < j){
            if(numbers[i] + numbers[j] > target){
                j--;
            }
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            }
        }

        return ans;









        // int[] ans = new int[2];
        // int i = 0;

        // while(i < numbers.length){
        //     int find = target - numbers[i];
        //     int j = i + 1;
        //     int k = numbers.length - 1;
        //     int ind = -1;

        //     while(j <= k){
        //         int mid = j + (k - j)/2;

        //         if(numbers[mid] < find){
        //             j = mid + 1;
        //         }
        //         else if(numbers[mid] > find){
        //             k = mid - 1;
        //         }
        //         else{
        //             ind = mid;
        //             break;
        //         }
        //     }

        //     if(ind != -1){
        //         ans[0] = i + 1;
        //         ans[1] = ind + 1;
        //         break;
        //     }
        //     else{
        //         i++;
        //     }
        // }

        // return ans;

    }
}
