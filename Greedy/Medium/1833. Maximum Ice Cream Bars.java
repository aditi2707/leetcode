class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int max = 0;

        for(Integer i: costs){
            max = Math.max(max, i);
        }

        int[] count = new int[max + 1];

        for(Integer i: costs){
            count[i]++;
        }

        int startInd = 0;

        for(int i = 0; i < count.length; i++){
            int c = count[i];
            count[i] = startInd;
            startInd += c;
        }

        int[] sortArr = new int[costs.length];

        for(int i = 0; i < costs.length; i++){
            sortArr[count[costs[i]]] = costs[i];
            count[costs[i]]++;
        }

        int maxBars = 0;

        for(int i = 0; i < sortArr.length; i++){
            if(coins - sortArr[i] >= 0){
                maxBars++;
                coins -= sortArr[i];
            }
            else{
                break;
            }
        }

        return maxBars;





        
        // Arrays.sort(costs);
        // int max = 0;

        // for(int i = 0; i < costs.length; i++){
        //     if(coins - costs[i] >= 0){
        //         max++;
        //         coins -= costs[i];
        //     }
        //     else{
        //         break;
        //     }
        // }

        // return max;
    }
}
