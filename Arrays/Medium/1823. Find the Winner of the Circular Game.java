class Solution {
    public int findTheWinner(int n, int k) {

        List<Integer> list = new ArrayList<>();
        int curr = 0;

        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        while(list.size() > 1){
            curr = (curr+k-1)%list.size();
            list.remove(curr);
        }

        return list.get(0);
        
        // Queue<Integer> queue = new LinkedList<>();
        // int c = 1;

        // if(n == 1){
        //     return 1;
        // }

        // for(int i = 1; i <= n; i++){
        //     queue.add(i);
        // }

        // while(queue.size() != 1){

        //     if(c < k){
        //         queue.add(queue.poll());
        //         c++;
        //     }
        //     else if(c == k){
        //         queue.poll();
        //         c = 1;
        //     }
        // }

        // return queue.poll();
    }
}
