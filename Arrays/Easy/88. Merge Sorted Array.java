class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Time Complexity : O(m + n)

        // Space Complexity : O(1)
        

        int i = m - 1, j = n - 1;
        int index = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                i--;
                index--;
            }
            else if(nums1[i] < nums2[j]){
                nums1[index] = nums2[j];
                j--;
                index--;
            }
            else{
                nums1[index] = nums1[i];
                index--;
                nums1[index] = nums2[j];
                index--;
                i--;
                j--;
            }
        }

        while(i >= 0){
            nums1[index] = nums1[i];
            index--;
            i--;
        }
        while(j >= 0){
            nums1[index] = nums2[j];
            index--;
            j--;
        }

        return;





        // // Time Complexity : O((m + n) * 2)

        // // Space Complexity : O(m + n)

        
        // int[] temp = new int[m + n];
        // int index = 0;

        // int i = 0, j = 0;

        // while(i < m && j < n){
        //     if(nums1[i] < nums2[j]){
        //         temp[index] = nums1[i];
        //         i++;
        //         index++;
        //     }
        //     else if(nums1[i] > nums2[j]){
        //         temp[index] = nums2[j];
        //         j++;
        //         index++;
        //     }
        //     else{
        //         temp[index] = nums1[i];
        //         index++;
        //         temp[index] = nums2[j];
        //         index++;
        //         i++;
        //         j++;
        //     }
        // }

        // while(i < m){
        //     temp[index] = nums1[i];
        //     index++;
        //     i++;
        // }
        // while(j < n){
        //     temp[index] = nums2[j];
        //     index++;
        //     j++;
        // }

        // for(int k = 0; k < nums1.length; k++){
        //     nums1[k] = temp[k];
        // }

        // return;
    }
}
