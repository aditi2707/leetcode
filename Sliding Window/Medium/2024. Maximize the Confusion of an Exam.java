class Solution {

    private int maxConsecAns(String answerKey, int k){

        int i = 0, j = 0, max = 0;
        int t = 0, f = 0;

        while(j < answerKey.length()){

            if(answerKey.charAt(j) == 'T'){
                t++;
            }
            else{
                f++;
            }

            while(Math.min(t, f) > k){
                max = Math.max(max, j - i);
                if(answerKey.charAt(i) == 'T'){
                    t--;
                }
                else{
                    f--;
                }
                i++;
            }

            j++;
        }

        return Math.max(max, j - i);
    }


    private int maxConsecAns(String answerKey, int k, char ch){

        int i = 0, j = 0, max = 0, count = 0;

        while(j < answerKey.length()){

            if(answerKey.charAt(j) == ch){
                count++;
            }

            while(count > k){
                max = Math.max(max, j - i);
                if(answerKey.charAt(i) == ch){
                    count--;
                }
                i++;
            }

            j++;
        }

        return Math.max(max, j - i);
    }


    public int maxConsecutiveAnswers(String answerKey, int k) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)


        return maxConsecAns(answerKey, k);





        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(1)
        
        
        // return Math.max(maxConsecAns(answerKey, k, 'T'), maxConsecAns(answerKey, k, 'F'));
    }
}
