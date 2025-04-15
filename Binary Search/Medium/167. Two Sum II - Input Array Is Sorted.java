class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Time Complexity : O(n)
        // In the worst case, the two numbers can be present at the extreme right.
        // So pointer i will have to traverse entire array.

        // Space Complexity : O(1)

        
        int i = 0, j = numbers.length - 1;

        while(i < j){
            if(numbers[i] + numbers[j] < target){
                i++;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                return new int[]{i + 1, j + 1};
            }
        }

        return new int[0];





        // // Time Complexity : O(nlog n)
        // // The binary search algorithm takes log n TC and this will be done for every element, so
        // // TC becomes nlog n.

        // // Space Complexity : O(1)
        

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
