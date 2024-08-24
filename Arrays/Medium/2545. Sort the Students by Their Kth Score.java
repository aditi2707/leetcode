class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        HashMap<Integer, Integer[]> map = new HashMap<>();

        for(int i = 0; i < score.length-1; i++){
            for(int j = 0; j < score.length-i-1; j++){
                if(score[j+1][k] > score[j][k]){
                    int[] temp = score[j+1];
                    score[j+1] = score[j];
                    score[j] = temp;
                }
            }
        }

        return score;
    }
}
