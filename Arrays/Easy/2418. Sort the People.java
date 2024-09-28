class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        HashMap<Integer, String> sortHeight = new HashMap<>();
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < heights.length; i++){
            sortHeight.put(heights[i], names[i]);
            // maxHeap.add(heights[i]);
        }

        Arrays.sort(heights);

        for(int i = names.length-1; i >= 0; i--){
            // names[i] = sortHeight.get(maxHeap.poll());
            names[i] = sortHeight.get(heights[heights.length-1-i]);
        }

        return names;
    }
}
