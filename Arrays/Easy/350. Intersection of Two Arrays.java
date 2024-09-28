class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }      
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
