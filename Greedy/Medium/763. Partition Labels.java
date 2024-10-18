class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> ans = new ArrayList<>();
        int[] index = new int[26];

        int end = 0, size = 0;

        for(int i = 0; i < s.length(); i++){
            index[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < s.length(); i++){

            end = Math.max(end, index[s.charAt(i) - 'a']);
            size++;

            if(end == i){
                ans.add(size);
                size = 0;
            }
        }

        return ans;










        
        // List<Integer> ans = new ArrayList<>();
        // Map<Character, Integer> map = new HashMap<>();

        // int end = 0, size = 0;

        // for(int i = 0; i < s.length(); i++){
        //     map.put(s.charAt(i), s.lastIndexOf("" + s.charAt(i)));
        // }

        // for(int i = 0; i < s.length(); i++){

        //     end = Math.max(end, map.get(s.charAt(i)));
        //     size++;

        //     if(end == i){
        //         ans.add(size);
        //         size = 0;
        //     }
        // }

        // return ans;
    }
}
