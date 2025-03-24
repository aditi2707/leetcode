class Solution {

    private void backtracking(int n, List<Integer> temp, int[] ans){

        if(temp.size() > n){
            return;
        }

        ans[0] += 1;

        for(int i = 0; i <= 9; i++){

            if(temp.size() == 0 && i == 0){
                continue;
            }
            if(!temp.contains(i)){
                temp.add(i);
                backtracking(n, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }

        return;
    }


    public int countNumbersWithUniqueDigits(int n) {
        
        int[] ans = {0};

        backtracking(n, new ArrayList<>(), ans);

        return ans[0];
    }
}
