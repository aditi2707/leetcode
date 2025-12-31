class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {

        // Time Complexity : O((n * 2) + (n * 2) + 200)

        // Space Complexity : O(200)
        
        
        int[] count1 = new int[101];
        int[] count2 = new int[101];

        int sum = 0;

        for(int i = 0; i < nums2.length; i++){
            count1[nums1[i]]++;
            count2[nums2[i]]++;
        }

        int i = 0, j = 100;

        while(i <= 100 && j >= 0){
            if(count1[i] == 0){
                i++;
                continue;
            }
            if(count2[j] == 0){
                j--;
                continue;
            }
            
            while(count1[i] > 0 && count2[j] > 0){
                sum += i * j;
                count1[i]--;
                count2[j]--;
            }
        }
        

        return sum;





        

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int sum = 0;

        // for(int i = nums2.length - 1; i >= 0; i--){
        //     sum += nums1[nums1.length-1-i] * nums2[i];
        // }

        // return sum;








        // Arrays.sort(nums1);
        // PriorityQueue<Integer> max2 = new PriorityQueue<>(Collections.reverseOrder());
        // int sum = 0;

        // for(int i = 0; i < nums2.length; i++){
        //     max2.add(nums2[i]);
        // }

        // for(int i = 0; i < nums1.length; i++){
        //     sum += nums1[i] * max2.poll();
        // }

        // return sum;

    }
}
