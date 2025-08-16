class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(1) (ignoring the output array)
        
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = arr[1] - arr[0];

        for(int i = 2; i < arr.length; i++){
            min = Math.min(min, arr[i] - arr[i - 1]);
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i - 1] == min){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }

        return ans;

    }
}
