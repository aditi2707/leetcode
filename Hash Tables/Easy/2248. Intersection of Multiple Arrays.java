class Solution {
    public List<Integer> intersection(int[][] nums) {

        int[] count = new int[1001];
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                count[nums[i][j]]++;
            }
        }

        for(int i = 0; i < 1001; i++){
            if(count[i] == nums.length){
                ans.add(i);
            }
        }

        return ans;





        
        
        // Set<Integer> set = new HashSet<>();

        // for(int i = 0; i < nums[0].length; i++){
        //     set.add(nums[0][i]);
        // }

        // for(int i = 1; i < nums.length; i++){
        //     Set<Integer> temp = new HashSet<>();
        //     for(int j = 0; j < nums[i].length; j++){
        //         if(set.contains(nums[i][j])){
        //             temp.add(nums[i][j]);
        //         }
        //     }
        //     set = temp;
        // }

        // List<Integer> ans = new ArrayList<>(set);
        // Collections.sort(ans);

        // return ans;
    }
}
