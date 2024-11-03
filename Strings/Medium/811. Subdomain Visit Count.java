class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < cpdomains.length; i++){
            String[] arr = cpdomains[i].split(" ");
            int value = Integer.parseInt(arr[0]);
            String s = arr[1];

            if(s.indexOf(".") != s.lastIndexOf(".")){
                if(!map.containsKey(s)){
                    map.put(s, value);
                }
                else{
                    map.put(s, map.get(s) + value);
                }
                if(!map.containsKey(s.substring(s.indexOf(".") + 1))){
                    map.put(s.substring(s.indexOf(".") + 1), value);
                }
                else{
                    map.put(s.substring(s.indexOf(".") + 1), map.get(s.substring(s.indexOf(".") + 1)) + value);
                }
                if(!map.containsKey(s.substring(s.lastIndexOf(".") + 1))){
                    map.put(s.substring(s.lastIndexOf(".") + 1), value);
                }
                else{
                    map.put(s.substring(s.lastIndexOf(".") + 1), map.get(s.substring(s.lastIndexOf(".") + 1)) + value);
                }
            }
            else{
                if(!map.containsKey(s)){
                    map.put(s, value);
                }
                else{
                    map.put(s, map.get(s) + value);
                }
                if(!map.containsKey(s.substring(s.indexOf(".") + 1))){
                    map.put(s.substring(s.indexOf(".") + 1), value);
                }
                else{
                    map.put(s.substring(s.indexOf(".") + 1), map.get(s.substring(s.lastIndexOf(".") + 1)) + value);
                }
            }
        }

        for(String s: map.keySet()){
            ans.add(String.valueOf(map.get(s)) + " " + s);
        }

        return ans;







        
        
        // HashMap<String, Integer> map = new HashMap<>();
        // List<String> ans = new ArrayList<>();

        // for(int i = 0; i < cpdomains.length; i++){

        //     String[] temp = cpdomains[i].split(" ");
        //     //int len = temp.length();
        //     int num = Integer.parseInt(temp[0]);
        //     String domain = temp[1];

        //     if(!map.containsKey(domain)){
        //         map.put(domain, num);
        //     }
        //     else{
        //         map.put(domain, map.get(domain)+num);
        //     }

        //     for(int j = 0; j < domain.length(); j++){
        //         if(domain.charAt(j) == '.'){
        //             String r = domain.substring(j+1);
        //             if(!map.containsKey(r)){
        //                 map.put(r, num);
        //             }
        //             else{
        //                 map.put(r, map.get(r)+num);
        //             }
        //         }
        //     }

            
        // }

        // for(String s: map.keySet()){
        //     ans.add(map.get(s) + " " + s);
        // }

        // return ans;
    }
}
