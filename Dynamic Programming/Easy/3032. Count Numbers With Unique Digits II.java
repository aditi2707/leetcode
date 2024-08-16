class Solution {

    public int digit(int[] ans, int i){

        List<Integer> list = new ArrayList<>();
        int num = 0;

        while(i > 0){
            int d = i % 10;
            if(!list.contains(d)){
                list.add(d);
                i = i/10;
                if(ans[i] == 0){
                    ans[i] = 1;
                }
            }
            else{
                return 0;
            }
        }

        return 1;
    }

    public int numberCount(int a, int b) {

        // int counter = 0;

        // for(int i = a; i <= b; i++){
        //     if(i <= 9){
        //         counter++;
        //     }
        //     else if(i <= 99){
        //         if(i % 11 != 0){
        //             counter++;
        //         }
        //     }
        //     else if(i <= 999){
        //         int firstD = i/100;
        //         int secondD = (i/10)%10;
        //         int thirdD = i%10;

        //         if(firstD != secondD && firstD != thirdD && secondD != thirdD){
        //             counter++;
        //         }
        //     }
        // }

        // return counter;
        
        int counter = 0;
        int[] ans = new int[b+1]; 
        for(int i = a; i <= b; i++){
            if(ans[i] == 1){
                counter++;
            }
            else{
                counter += digit(ans, i);
            }
        }

        return counter;
    }
}
