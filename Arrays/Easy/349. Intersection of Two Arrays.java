class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Time Complexity : O(n + 1000)

        // Space Complexity : O(1001)
        
        
        int[] freq = new int[1001];
        int count = 0;

        for(int i = 0; i < nums1.length; i++){
            if(freq[nums1[i]] == 0){
                freq[nums1[i]] = 1;
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(freq[nums2[i]] == 1){
                freq[nums2[i]] = 2;
                count++;
            }
        }

        int[] ans = new int[count];
        int index = 0;

        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 2){
                ans[index] = i;
                index++;
            }
        }

        return ans;




        
        
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
