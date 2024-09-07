class Solution {

    public int quickSelect(List<Integer> arr, int k){

        int index = new Random().nextInt(arr.size());
        int pivot = arr.get(index);

        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(Integer i: arr){
            if(i > pivot){
                left.add(i);
            }
            else if(i == pivot){
                mid.add(i);
            }
            else{
                right.add(i);
            }
        }

        if(left.size() >= k){
            return quickSelect(left, k);
        }
        if(left.size()+mid.size() < k){
            return quickSelect(right, k - left.size() - mid.size());
        }

        return pivot;
    }

    public int findKthLargest(int[] nums, int k) {
        
        List<Integer> arr = new ArrayList<>();

        for(Integer i: nums){
            arr.add(i);
        }

        return quickSelect(arr, k);
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // for(Integer i: nums){
        //     minHeap.add(i);
        //     if(minHeap.size() > k){
        //         minHeap.poll();
        //     }
        // }

        // return minHeap.poll();
    }
}
