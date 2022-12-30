class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> num1 = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++){
            if(num1.containsKey(nums1[i])){
                continue;
            }
            else{
                num1.put(nums1[i], i);
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(num1.containsKey(nums2[i])){
                ans.add(nums2[i]);
                num1.remove(nums2[i]);
            }
        } 
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
