class Solution {
    public int[] findBuildings(int[] heights) {

        int max = heights[heights.length-1];
        List<Integer> ans = new ArrayList<>();

        for(int i = heights.length-2; i >= 0; i--){
            if(heights[i] > max){
                max = heights[i];
                ans.add(i);
            }
        }

        int[] arr = new int[ans.size()+1];

        for(int i = 0; i < arr.length-1; i++){
            arr[i] = ans.get(ans.size() - 1- i);
        }

        arr[arr.length-1] = heights.length-1;
        return arr;
    }
}
