class Solution {

    private void backtracking(List<Integer> list, List<Integer> temp, int n, int k, 
    int prev){

        if(temp.size() == n){
            int zeroes = temp.size() - 1;
            int num = 0;
            for(Integer i: temp){
                num += i * (int)Math.pow(10, zeroes);
                zeroes--;
            }
            list.add(num);

            return;
        }

        for(int i = 0; i <= 9; i++){
            if(temp.size() == 0){
                if(i == 0){
                    continue;
                }
                temp.add(i);
                backtracking(list, temp, n, k, i);
                temp.remove(temp.size() - 1);
            }
            else{
                if(Math.abs(i - prev) == k){
                    temp.add(i);
                    backtracking(list, temp, n, k, i);
                    temp.remove(temp.size() - 1);
                }
            }
        }

        return;
    }



    private void backtracking(List<Integer> list, String temp, int n, int k, 
    int prev){

        if(temp.length() == n){
            list.add(Integer.parseInt(temp));
            return;
        }

        for(int i = 0; i <= 9; i++){
            if(temp.length() == 0){
                if(i == 0){
                    continue;
                }
                backtracking(list, temp + String.valueOf(i), n, k, i);
            }
            else{
                if(Math.abs(i - prev) == k){
                    backtracking(list, temp + String.valueOf(i), n, k, i);
                }
            }
        }

        return;
    }


    public int[] numsSameConsecDiff(int n, int k) {

        // Both will have same TC and SC.

        // Time Complexity : O(9 * (2 ^ n)).
        // Space Complexity : O(9 * (2 ^ n)).

        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtracking(list, temp, n, k, 0);

        int[] ans = new int[list.size()];
        int ind = 0;

        for(Integer i: list){
            ans[ind] = i;
            ind++;
        }

        return ans;



        
        // List<Integer> list = new ArrayList<>();

        // backtracking(list, "", n, k, 0);

        // int[] ans = new int[list.size()];
        // int ind = 0;

        // for(Integer i: list){
        //     ans[ind] = i;
        //     ind++;
        // }

        // return ans;
    }
}
