class Solution {

    private void backtracking(int[] nums, int index, List<Integer> temp, int[] count){

        if(temp.size() == 4){
            int a = temp.get(0);
            int b = temp.get(1);
            int c = temp.get(2);
            int d = temp.get(3);

            if((a * b) == (c * d)){
                count[0] += 8;
            }
            if((a * c) == (b * d)){
                count[0] += 8;
            }
            if((a * d) == (b * c)){
                count[0] += 8;
            }
            
            
            return;
        }

        for(int i = index; i < nums.length; i++){
            temp.add(nums[i]);
                backtracking(nums, i + 1, temp, count);
                temp.remove(temp.size() - 1);
            
        }

        return;
    }


    public int tupleSameProduct(int[] nums) {

        // Time Complexity : O(n ^ 2 + n ^ 2)

        // Space Complexity : O(n ^ 2)
        

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(!map.containsKey(nums[i] * nums[j])){
                    map.put(nums[i] * nums[j], 1);
                }
                else{
                    map.put(nums[i] * nums[j], map.get(nums[i] * nums[j]) + 1);
                }
            }
        }

        int count = 0;

        for(Integer i: map.keySet()){
            int ways = (map.get(i) * (map.get(i) - 1)) / 2;
            count += 8 * ways;
        }

        return count;



        // Time Limit Succeeded
        
        // int[] count = {0};

        // backtracking(nums, 0, new ArrayList<>(), count);

        // return count[0];
    }
}
