class Solution {
    public int numUniqueEmails(String[] emails) {

        // Time Complexity : O(emails.length * email.length())

        // Space Complexity : O(emails.length)
        
        
        Set<String> set = new HashSet<>();

        for(String email: emails){
            String[] e = email.split("@");
            String domain = e[1];
            String local = e[0];

            if(local.indexOf("+") != -1){
                local = local.split("\\+")[0];
            }

            local = local.replace(".", "");

            set.add(local + "@" + domain);
        }

        return set.size();





        // // Time Complexity : O(emails.length * email.length())

        // // Space Complexity : O(emails.length)

        
        // Set<String> set = new HashSet<>();

        // for(String email: emails){
        //     String[] e = email.split("@");
        //     String domain = e[1];
        //     String local = e[0];

        //     if(local.indexOf("+") != -1){
        //         local = local.split("\\+")[0];
        //     }

        //     String temp = "";

        //     for(char c: local.toCharArray()){
        //         if(c == '.'){
        //             continue;
        //         }
        //         else{
        //             temp += c;
        //         }
        //     }

        //     local = temp;

        //     set.add(local + "@" + domain);
        // }

        // return set.size();

    }
}
