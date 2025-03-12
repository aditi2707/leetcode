class Solution {

    private void backtracking(List<String> ans, String s, int index, int dots, 
    String temp){

        if(dots == 4 && index == s.length()){
            ans.add(temp.substring(0, temp.length() - 1));
        }

        if(index == s.length()){
            return;
        }

        for(int i = index; i < Math.min(index + 3, s.length()); i++){
            String str = s.substring(index, i + 1);
            if(str.charAt(0) == '0' && str.length() == 1 || str.charAt(0) != '0'){
                if(Integer.parseInt(str) <= 255){
                    temp += str + ".";
                    backtracking(ans, s, i + 1, dots + 1, temp);
                    temp = temp.substring(0, temp.length() - (str.length() + 1));   
                }
            }
        }

        return;
    }



    private void backtracking(List<String> ans, String s, int index, 
    List<String> temp){

        if(temp.size() == 4 && index == s.length()){
            String str = "";
            for(String st: temp){
                str += st + ".";
            }
            ans.add(str.substring(0, str.length() - 1));
        }

        if(index == s.length()){
            return;
        }

        for(int i = index; i < Math.min(index + 3, s.length()); i++){

            String str = s.substring(index, i + 1);
            if(str.charAt(0) == '0' && str.length() == 1 || str.charAt(0) != '0'){
                if(Integer.parseInt(str) <= 255){
                    temp.add(str);
                    backtracking(ans, s, i + 1, temp);
                    temp.remove(temp.size() - 1);   
                }
            }
        }

        return;
    }


    public List<String> restoreIpAddresses(String s) {

        // Time Complexity : O()

        List<String> ans = new ArrayList<>();

        if(s.length() > 12){
            return ans;
        }

        backtracking(ans, s, 0, 0, "");

        return ans;



        // List<String> ans = new ArrayList<>();

        // if(s.length() > 12){
        //     return ans;
        // }

        // backtracking(ans, s, 0, new ArrayList<>());

        // return ans;
    }
}
