class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> ans = new ArrayList<>();
        int index = 0;

        for(int i = 1; i <= n; i++){
            ans.add("Push");
            if(i != target[index]){
                ans.add("Pop");
            }
            else{
                index++;
            }
            

            if(index >= target.length){
                break;
            }
        }

        return ans;
    }
}
