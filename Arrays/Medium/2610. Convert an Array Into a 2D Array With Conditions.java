class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        int[] freq = new int[nums.length+1];
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(freq[nums[i]] >= list.size()){
                list.add(new ArrayList<>());  
            }
                list.get(freq[nums[i]]).add(nums[i]);
                freq[nums[i]]++;
        }

        return list;

        // Arrays.sort(nums);
        // List<List<Integer>> list = new ArrayList<>();
        // list.add(new ArrayList<>());
        // list.get(0).add(nums[0]);
        // int index = 0;

        // for(int i = 1; i < nums.length; i++){
        //     if(!list.get(index).contains(nums[i])){
        //         list.get(index).add(nums[i]);
        //     }
        //     else{
        //         while(list.get(index).contains(nums[i])){
        //             if(index+1 >= list.size()){
        //                 list.add(new ArrayList<>());
        //             }
        //             index++;
        //         }
        //         list.get(index).add(nums[i]);
        //         index = 0;
        //     }
        // }

        // return list;
    }
}
