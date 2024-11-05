class Solution {
    public String interpret(String command) {

        int i = 0;
        String ans = "";

        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                ans += "G";
                i += 1;
            }
            else if(command.charAt(i) == '('){
                if(i + 1 < command.length() && command.charAt(i + 1) == ')'){
                    ans += "o";
                    i += 2;
                }
                else{
                    ans += "al";
                    i += 4;
                }
            }
        }

        return ans;
    }
}
