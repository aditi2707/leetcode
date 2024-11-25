class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for(Integer i: nums1){
            set1.add(i);
        }

        for(Integer i: nums2){
            if(set1.contains(i)){
                if(!ans.contains(i)){
                    ans.add(i);
                }
            }
            set2.add(i);
        }

        for(Integer i: nums3){
            if(set1.contains(i) || set2.contains(i)){
                if(!ans.contains(i)){
                    ans.add(i);
                }
            }
        }

        return ans;








        
        // List<Integer> ans = new ArrayList<>();

        // for(int i = 0; i < nums1.length; i++){
        //     for(int j = 0; j < nums2.length; j++){
        //         if((nums1[i] ^ nums2[j]) == 0){
        //             if(!ans.contains(nums1[i])){
        //                 ans.add(nums1[i]);
        //             }
        //             break;
        //         }
        //     }
        // }

        // for(int i = 0; i < nums2.length; i++){
        //     for(int j = 0; j < nums3.length; j++){
        //         if((nums2[i] ^ nums3[j]) == 0){
        //             if(!ans.contains(nums2[i])){
        //                 ans.add(nums2[i]);
        //             }
        //             break;
        //         }
        //     }
        // }

        // for(int i = 0; i < nums1.length; i++){
        //     for(int j = 0; j < nums3.length; j++){
        //         if((nums1[i] ^ nums3[j]) == 0){
        //             if(!ans.contains(nums1[i])){
        //                 ans.add(nums1[i]);
        //             }
        //             break;
        //         }
        //     }
        // }

        // return ans;
    }
}
