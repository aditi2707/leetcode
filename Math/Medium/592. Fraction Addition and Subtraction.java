class Solution {

    private int findLCM(List<Integer> list){

        int max = 1;

        for(Integer i: list){
            max *= i;
        }

        for(int i = 1; i <= max; i++){
            int count = 0;
            for(Integer j: list){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == list.size()){
                return i;
            }
        }

        return 1;
    }

    private int[] findIrreducibleFrac(int n, int d){

        int i = 2;

        while(i <= Math.min(Math.abs(n), d)){
            if(n % i == 0 && d % i == 0){
                n /= i;
                d /= i;
            }
            else{
                i++;
            }
        }

        return new int[]{n, d};
    }


    public String fractionAddition(String expression) {

        // Time Complexity : ~ O(n)
        // Space Complexity : O(n + n + n)


        String[] arr = expression.split("/");
        List<Integer> num = new ArrayList<>();
        List<Integer> den = new ArrayList<>();

        num.add(Integer.parseInt(arr[0]));

        for(int i = 1; i < arr.length - 1; i++){
            String n = "";
            String d = "";

            if(arr[i].indexOf("10") == 0){
                d = arr[i].substring(0, 2);
                n = arr[i].substring(2);
            }
            else{
                d = arr[i].substring(0, 1);
                n = arr[i].substring(1);
            }
            
            num.add(Integer.parseInt(n));
            den.add(Integer.parseInt(d));
        }

        den.add(Integer.parseInt(arr[arr.length - 1]));

        int numerator = 0, denominator = 1;

        for(int i = 0; i < num.size(); i++){
            int n = num.get(i);
            int d = den.get(i);

            numerator = numerator * d + n * denominator;
            denominator *= d;
        }

        if(numerator == 0){
            return String.valueOf(0) + "/" + String.valueOf(1);
        }

        int[] ans = findIrreducibleFrac(numerator, denominator);

        return String.valueOf(ans[0]) + "/" + String.valueOf(ans[1]);




        // // Time Complexity : ~ O(n ^ 2)

        // // Space Complexity : O(n + n + n)

        
        // String[] arr = expression.split("/");
        // List<Integer> num = new ArrayList<>();
        // List<Integer> den = new ArrayList<>();

        // num.add(Integer.parseInt(arr[0]));

        // for(int i = 1; i < arr.length - 1; i++){
        //     String n = "";
        //     String d = "";

        //     if(arr[i].indexOf("10") == 0){
        //         d = arr[i].substring(0, 2);
        //         n = arr[i].substring(2);
        //     }
        //     else{
        //         d = arr[i].substring(0, 1);
        //         n = arr[i].substring(1);
        //     }
            
        //     num.add(Integer.parseInt(n));
        //     den.add(Integer.parseInt(d));
        // }

        // den.add(Integer.parseInt(arr[arr.length - 1]));

        // int lcm = findLCM(den);
        // int sum = 0;

        // for(int i = 0; i < num.size(); i++){
        //     int d = lcm / (den.get(i));
        //     sum += num.get(i) * d;
        // }

        // if(sum == 0){
        //     return String.valueOf(0) + "/" + String.valueOf(1);
        // }

        // int[] ans = findIrreducibleFrac(sum, lcm);

        // return String.valueOf(ans[0]) + "/" + String.valueOf(ans[1]);
        
    }
}
