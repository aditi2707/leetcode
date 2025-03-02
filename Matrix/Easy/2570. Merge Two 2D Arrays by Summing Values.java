class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        // Time Complexity : O(maxLength(nums1, nums2)).
        // The first while loop will run for the min length of both the arrays. Then
        // the small while loops will run for that array which has remaining length.
        // So, that makes TC = O(largest length of both arrays).
        // If the function in the return statement is considered, then it will take 
        // a TC of O(n).

        // Space Complexity : O(n * 2) (if the output array is ignored).


        int i = 0, j = 0;
        List<int[]> list = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){

            if(nums1[i][0] == nums2[j][0]){
                list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                list.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            }
            else{
                list.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }

        while(i < nums1.length){
            list.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }
        while(j < nums2.length){
            list.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }

        return list.toArray(new int[list.size()][]);




        // // Time Complexity : O(maxLength(nums1, nums2) + (nums1 + nums2)).
        // // The first while loop will run for the min length of both the arrays. Then
        // // the small while loops will run for that array which has remaining length.
        // // So, that makes TC = O(largest length of both arrays). If all the IDs are
        // // unique in both the arrays, then the list will have a length of 
        // // (nums1 + nums2). The for loop will have a TC = O(nums1 + nums2).

        // // Space Complexity : O(n + n * 2) (if the output array is ignored).

        
        // int i = 0, j = 0;
        // List<List<Integer>> list = new ArrayList<>();

        // while(i < nums1.length && j < nums2.length){
        //     List<Integer> temp = new ArrayList<>();

        //     if(nums1[i][0] == nums2[j][0]){
        //         temp.add(nums1[i][0]);
        //         temp.add(nums1[i][1] + nums2[j][1]);
        //         i++;
        //         j++;
        //     }
        //     else if(nums1[i][0] < nums2[j][0]){
        //         temp.add(nums1[i][0]);
        //         temp.add(nums1[i][1]);
        //         i++;
        //     }
        //     else{
        //         temp.add(nums2[j][0]);
        //         temp.add(nums2[j][1]);
        //         j++;
        //     }

        //     list.add(temp);
        // }

        // while(i < nums1.length){
        //     List<Integer> temp = new ArrayList<>();
        //     temp.add(nums1[i][0]);
        //     temp.add(nums1[i][1]);
        //     list.add(temp);
        //     i++;
        // }
        // while(j < nums2.length){
        //     List<Integer> temp = new ArrayList<>();
        //     temp.add(nums2[j][0]);
        //     temp.add(nums2[j][1]);
        //     list.add(temp);
        //     j++;
        // }

        // int[][] ans = new int[list.size()][2];
        // int k = 0;

        // for(List<Integer> l: list){
        //     ans[k][0] = l.get(0);
        //     ans[k][1] = l.get(1);
        //     k++;
        // }

        // return ans;
    }
}
