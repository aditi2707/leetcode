class Solution {
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        int a = 0, b = 0, c = 0;

        for(int i = nums.length-1; i >= 0; i--){
            a = nums[i];
            if(i-1 >= 0){
                b = nums[i-1];
            }
            else{
                break;
            }
            if(i-2 >= 0){
                c = nums[i-2];
            }
            else{
                break;
            }

            if(a + b > c && b + c > a && a + c > b){
                return a + b + c;
            }
        }

        return 0;





        
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // for(Integer i: nums){
        //     maxHeap.add(i);
        // }

        // while(maxHeap.size() > 2){
        //     int a = maxHeap.poll();
        //     int b = maxHeap.poll();
        //     int c = maxHeap.poll();

        //     if(a + b > c && b + c > a && a + c > b){
        //         return a + b + c;
        //     }

        //     maxHeap.add(b);
        //     maxHeap.add(c);
        // }

        // return 0;

    }
}
