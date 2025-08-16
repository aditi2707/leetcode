class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        // Time Complexity : O((n ^ 2) * 2)

        // Space Complexity : O(n)

        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(Integer i: nums1){
            for(Integer j: nums2){
                if(!map.containsKey((i + j))){
                    map.put((i + j), 1);
                }
                else{
                    map.put((i + j), map.get((i + j)) + 1);
                }
            }
        }

        for(Integer i: nums3){
            for(Integer j: nums4){
                if(map.containsKey(-(i + j))){
                    count += map.get(-(i + j));
                }
            }
        }

        return count;





        // // Time Complexity : O(n ^ 3)

        // // Space Complexity : O(n)

        
        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;

        // for(Integer i: nums4){
        //     if(!map.containsKey(i)){
        //         map.put(i, 1);
        //     }
        //     else{
        //         map.put(i, map.get(i) + 1);
        //     }
        // }

        // for(Integer i: nums1){
        //     for(Integer j: nums2){
        //         for(Integer k: nums3){
        //             if(map.containsKey(-(i + j + k))){
        //                 System.out.println("Yes");
        //                 count += map.get(-(i + j + k));
        //             }
        //         }
        //     }
        // }

        // return count;
    }
}
