class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();

        for(Integer i: nums1){
            map.put(i, 1);
        }

        for(Integer i: nums2){
            if(map.containsKey(i)){
                arr.add(i);
                map.remove(i);
            }
        }

        int[] ans = new int[arr.size()];
        int k = 0;

        for(Integer i: arr){
            ans[k] = i;
            k++;
        }

        return ans;





        // HashSet<Integer> set1 = new HashSet<>();
        // HashSet<Integer> set2 = new HashSet<>();
        // List<Integer> arr = new ArrayList<>();

        // for(Integer i: nums1){
        //     set1.add(i);
        // }
        // for(Integer i: nums2){
        //     set2.add(i);
        //     if(set1.contains(i)){
        //         arr.add(i);
        //         set1.remove(i);
        //     }
        // }

        // int[] ans = new int[arr.size()];
        // int k = 0;

        // for(Integer i: arr){
            
        //     ans[k] = i;
        //     k++;
        // }

        // return ans;






        // Set<Integer> set = new HashSet<>();
        // int i = 0, j = 0;

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // while(i < nums1.length && j < nums2.length){
        //     if(nums1[i] == nums2[j]){
        //         set.add(nums1[i]);
        //         i++;
        //         j++;
        //         continue;
        //     }
        //     if(nums1[i] < nums2[j]){
        //         i++;
        //     }
        //     else{
        //         j++;
        //     }
        // }

        // int[] ans = new int[set.size()];
        // int k = 0;

        // for(Integer p: set){
        //     ans[k] = p;
        //     k++;
        // }

        // return ans;






        
        // HashMap<Integer, Integer> num1 = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();
        
        // for(int i = 0; i < nums1.length; i++){
        //     if(num1.containsKey(nums1[i])){
        //         continue;
        //     }
        //     else{
        //         num1.put(nums1[i], i);
        //     }
        // }

        // for(int i = 0; i < nums2.length; i++){
        //     if(num1.containsKey(nums2[i])){
        //         ans.add(nums2[i]);
        //         num1.remove(nums2[i]);
        //     }
        // } 
        // return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
