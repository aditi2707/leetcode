class Solution {

    private void backtracking(List<Long> ans, List<Long> temp, long index, long sum){

        if(sum == 0){
            ans.addAll(temp);
            return;
        }

        if(sum < 0){
            return;
        }

        for(long i = index; i <= sum; i += 2){
            if(sum - i >= 0){
                temp.add(i);
                backtracking(ans, temp, i + 2, sum - i);
                if(!ans.isEmpty()){
                    return;
                }
                temp.remove(temp.size() - 1);
            }
            else{
                return;
            }
        }

        return;
    }


    public List<Long> maximumEvenSplit(long finalSum) {

        // Time Complexity : O((n/2) * 2 ^ (n/2)).
        // For each value, there are two choices, either you take or not take the 
        // value. Since only even numbers are taken into consideration, the values
        // will be n / 2. Hence TC is O(n/2). And this will be applied to every even
        // number so total TC becomes O((n/2) * 2 ^ (n/2).

        // Space Complexity : O((n/2) * (n/2)).
        // The recursion stack can have a maximum of all even numbers less than the 
        // sum, so that is n / 2. And at each call, a temp array is storing values.
        // So total SC = O((n/2) * (n/2)).
        

        List<Long> ans = new ArrayList<>();
        
        if(finalSum % 2 != 0){
            return ans;
        }

        backtracking(ans, new ArrayList<>(), 2, finalSum);

        return ans;
    }
}
