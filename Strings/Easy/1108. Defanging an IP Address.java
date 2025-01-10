class Solution {
    public String defangIPaddr(String address) {

        String ans = "";

        for(int i = 0; i < address.length(); i++){
            char ch = address.charAt(i);

            if(ch == '.'){
                ans += "[.]";
            }
            else{
                ans += ch;
            }
        }

        return ans;





        // int c = 0;
        // for(int i = 0; i < address.length(); i = c++){
        //     if(address.charAt(i) == '.'){
        //         address = address.substring(0, i) + "[.]" + address.substring(i+1);
        //         c = i + 2;
        //     }
        // }
        // return address;




        // return address.replace(".", "[.]");
    }
}
