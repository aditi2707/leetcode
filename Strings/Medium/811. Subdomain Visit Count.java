class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < cpdomains.length; i++){

            String[] temp = cpdomains[i].split(" ");
            //int len = temp.length();
            int num = Integer.parseInt(temp[0]);
            String domain = temp[1];

            if(!map.containsKey(domain)){
                map.put(domain, num);
            }
            else{
                map.put(domain, map.get(domain)+num);
            }

            for(int j = 0; j < domain.length(); j++){
                if(domain.charAt(j) == '.'){
                    String r = domain.substring(j+1);
                    if(!map.containsKey(r)){
                        map.put(r, num);
                    }
                    else{
                        map.put(r, map.get(r)+num);
                    }
                }
            }

            
        }

        for(String s: map.keySet()){
            ans.add(map.get(s) + " " + s);
        }

        return ans;
    }
}
