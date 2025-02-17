class Solution {

    private void backtracking(Map<Integer, Integer> map, List<List<Integer>> ans, 
    List<Integer> temp, int size){

        if(temp.size() == size){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(Integer i: map.keySet()){
            if(map.get(i) > 0){
                temp.add(i);
                map.put(i, map.get(i) - 1);

                backtracking(map, ans, temp, size);

                temp.remove(temp.size() - 1);
                map.put(i, map.get(i) + 1);
            }
        }

        return;
    }



    private void backtracking(int[] nums, List<List<Integer>> ans, 
    List<Integer> temp, Set<Integer> freq){

        if(temp.size() == nums.length && !ans.contains(temp)){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!freq.contains(i)){
                temp.add(nums[i]);
                freq.add(i);

                backtracking(nums, ans, temp, freq);

                temp.remove(temp.size() - 1);
                freq.remove(i);
            }
        }

        return;
    }


    public List<List<Integer>> permuteUnique(int[] nums) {

        // Time Complexity : O(n * n!).
        // This is the worst time complexity when every element is unique.
        // The for loop in the backtracking() will run for all array elements in the 
        // worst case, so that will be O(n). But the function will be called only 
        // when the index is not present in the freq set. So that makes O(n!).
        // Hence TC is O(n * n!).

        // Space Complexity : O(2n) (if we ignore the SC of the output array and the
        // recursion stack).
        // The temp array will have a maximum of all array elements, so O(n). The
        // hashmap will have a size of array_length in the worst case.


        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        backtracking(map, ans, new ArrayList<>(), nums.length);

        return ans;




        // Time Complexity : O(n * n! + n) (if we consider TC of contains() 
        // of ArrayList).
        // The for loop in the backtracking() will run for all array elements, so 
        // that will be O(n). But the function will be called only when the index
        // is not present in the freq set. So that makes O(n!).
        // Hence TC is O(n * n!).

        // Space Complexity : O(n) (if we ignore the SC of the output array and the
        // recursion stack).
        // The temp array will have a maximum of all array elements, so O(n).

        
        // List<List<Integer>> ans = new ArrayList<>();
        // Set<Integer> freq = new HashSet<>();

        // backtracking(nums, ans, new ArrayList<>(), freq);

        // return ans;
    }
}
