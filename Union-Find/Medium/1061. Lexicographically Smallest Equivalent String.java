class Solution {

    private char findParent(Map<Character, Character> parent, char p){

        while(parent.get(p) != p){
            p = parent.get(p);
        }

        parent.put(parent.get(p), p);
        return parent.get(p);
    }


    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        
        Map<Character, Character> parent = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(char c: s1.toCharArray()){
            parent.put(c, c);
        }
        for(char c: s2.toCharArray()){
            parent.put(c, c);
        }

        for(int i = 0; i < s1.length(); i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            char parentA = findParent(parent, a);
            char parentB = findParent(parent, b);

            if(parentA >= parentB){
                parent.put(parentA, parentB);
                    
            }
            else if(parentA < parentB){
                parent.put(parentB, parentA);
            }
        }

        for(char c: baseStr.toCharArray()){
            if(!parent.containsKey(c)){
                ans.append(c);
            }
            else{
                ans.append(findParent(parent, parent.get(c)));
            }
            
        }

        return ans.toString();


    }
}
