class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int sum = 0;

        for(int i = nums2.length - 1; i >= 0; i--){
            sum += nums1[nums1.length-1-i] * nums2[i];
        }

        return sum;








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
