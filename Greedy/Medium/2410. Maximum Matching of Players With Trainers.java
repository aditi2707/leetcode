class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        // Time Complexity : O(nlog n + mlog m + (m + n))

        // Space Complexity : O(1)
        
        
        Arrays.sort(players);
        Arrays.sort(trainers);

        int count = 0;

        int i = 0, j = 0;

        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return count;
    }
}
