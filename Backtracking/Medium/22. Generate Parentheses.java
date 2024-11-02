class Solution {

    public void generatePara(List<String> ans, String temp, int open, int close, int n){

        if(temp.length() == n * 2){
            ans.add(temp);
            return;
        }

        if(open < n){
            generatePara(ans, temp + '(', open + 1, close, n);
        }
        if(close < open){
            generatePara(ans, temp + ')', open, close + 1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();

        generatePara(ans, "", 0, 0, n);

        return ans;
    }
}
