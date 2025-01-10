class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int counter = 0;
      
        // for(int i = 0; i < jewels.length(); i++){
        //     for(int j = 0; j < stones.length(); j++){
        //         if(stones.charAt(j) == jewels.charAt(i)){
        //             counter++;
        //         }
        //     }
        // }



        // ArrayList<Character> jewel = new ArrayList<>();
        // for(int i = 0; i < jewels.length(); i++){
        //     jewel.add(jewels.charAt(i));
        // }

        // for(int i = 0; i < stones.length(); i++){
        //     if(jewel.contains(stones.charAt(i))){
        //         counter++;
        //     }
        // }


        for(int i = 0; i < stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) != -1){
                counter++;
            }
        }

        return counter;
    }
}
