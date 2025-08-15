class Solution {
    public String[] findWords(String[] words) {

        // Time Complexity : O(words.length * words[i].length() * 10 + words.length)

        // Space Complexity : O(words.length + 3) (ignoring the output array)

        
        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        map.put(1, "qwertyuiop");
        map.put(2, "asdfghjkl");
        map.put(3, "zxcvbnm");

        for(int i = 0; i < words.length; i++){
            int index = 1;
            String s = words[i].toLowerCase();
            char first = s.charAt(0);
            if(map.get(2).indexOf(first + "") != -1){
                index = 2;
            }
            else if(map.get(3).indexOf(first + "") != -1){
                index = 3;
            }

            int flag = 0;
            for(char c: s.toCharArray()){
                if(map.get(index).indexOf(c + "") == -1){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                list.add(words[i]);
            }
        }

        String[] ans = new String[list.size()];

        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
