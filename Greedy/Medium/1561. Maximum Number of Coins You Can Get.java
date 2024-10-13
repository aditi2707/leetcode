class Solution {
    public int maxCoins(int[] piles) {

        Arrays.sort(piles);
        int you = 0;

        for(int i = piles.length - 2; i >= piles.length/3; i -= 2){
            you += piles[i];
        }

        return you;





        // Arrays.sort(piles);
        // ArrayDeque<Integer> queue = new ArrayDeque<>();
        // int you = 0;

        // for(Integer i: piles){
        //     queue.addLast(i);
        // }

        // while(!queue.isEmpty()){
        //     queue.removeLast();
        //     you += queue.removeLast();
        //     queue.removeFirst();
        // }

        // return you;
    }
}
