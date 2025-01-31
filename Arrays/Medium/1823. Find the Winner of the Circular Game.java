class Solution {
    public int findTheWinner(int n, int k) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        int c = 0;
        while(list.size() > 1){
            c = (c + k - 1) % list.size();
            list.remove(c);
        }

        return list.get(0);



        
        // Queue<Integer> queue = new LinkedList<>();
        // int c = k;

        // for(int i = 1; i <= n; i++){
        //     queue.add(i);
        // }

        // while(queue.size() > 1){
        //     int poll = queue.poll();
        //     if(c != 1){
        //         queue.add(poll);
        //         c--;
        //     }
        //     else{
        //         c = k;
        //     }
        // }

        // return queue.poll();
    }
}
