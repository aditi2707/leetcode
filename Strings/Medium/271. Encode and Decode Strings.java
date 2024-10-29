public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        String ans = "";

        for(String s: strs){
            ans += s.length() + "#" + s;
        }

        return ans;





        // String ans = "";

        // for(String s: strs){
        //     ans += s + '\0';
        // }

        // return ans;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        List<String> ans = new ArrayList<>();

        int i = 0;
        while(i < s.length()){

            int j = i;
            while(s.charAt(j) != '#'){
                j++;
            }

            int len = Integer.valueOf(s.substring(i, j));
            ans.add(s.substring(j+1, j+1+len));
            i = j + 1 + len;
        }

        return ans;









        
        // List<String> ans = new ArrayList<>();
        // String temp = "";

        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) != '\0'){
        //         temp += s.charAt(i);
        //     }
        //     else{
        //         ans.add(temp);
        //         temp = "";
        //     }
        // }

        // return ans;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
