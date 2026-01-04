class Solution {

    private boolean isValid(List<String> temp){

        String top = temp.get(0);
        String left = temp.get(1);
        String right = temp.get(2);
        String bottom = temp.get(3);

        if(top.charAt(0) == left.charAt(0) && 
            left.charAt(3) == bottom.charAt(0) && 
            bottom.charAt(3) == right.charAt(3) && 
            top.charAt(3) == right.charAt(0)){
                return true;
        }

        return false;
    }

    private void backtracking(String[] words, List<List<String>> ans, 
    List<String> temp, int[] arr){

        if(temp.size() == 4){
            if(isValid(temp)){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int i = 0; i < words.length; i++){
            if(arr[i] == 1){
                continue;
            }
            
            temp.add(words[i]);
            arr[i] = 1;

            backtracking(words, ans, temp, arr);

            arr[i] = 0;
            temp.remove(temp.size() - 1);
        }

        return;
    }

    
    public List<List<String>> wordSquares(String[] words) {

        // Time Complexity : O((4 ^ n) + (n * 4))

        // Space Complexity : O(n)
        

        List<List<String>> ans = new ArrayList<>();
        int[] arr = new int[words.length];

        backtracking(words, ans, new ArrayList<>(), arr);

        ans.sort((list1, list2) -> {
            for(int i = 0; i < 4; i++) {
                int compareResult = list1.get(i).compareTo(list2.get(i));
                if(compareResult != 0) return compareResult;
            }
            return 0;
        });

        return ans;
    }
}
