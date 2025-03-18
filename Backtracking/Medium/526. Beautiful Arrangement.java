class Solution {

    private int backtracking(int n, List<Integer> temp, boolean[] used){

        if(temp.size() == n){
            return 1;
        }

        int count = 0;

        for(int i = 1; i <= n; i++){
            if(used[i]){
                continue;
            }
            if(i % (temp.size() + 1) != 0 && (temp.size() + 1) % i != 0){
                continue;
            }

            used[i] = true;
            temp.add(i);
            count += backtracking(n, temp, used);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }

        return count;
    }


    public int countArrangement(int n) {
        
        boolean[] used = new boolean[n + 1];

        return backtracking(n, new ArrayList<>(), used);
    }
}
