class Solution {
    public int splitNum(int num) {

        int[] arr = new int[10];
        int c = 0;
        int num1 = 0, num2 = 0;

        while(num > 0){
            int d = num % 10;
            arr[d]++;
            num /= 10;
        }

        for(int i = 0; i < 10; i++){
            while(arr[i] > 0){
                if(c % 2 == 0){
                    num1 = num1 * 10 + i;
                }
                else{
                    num2 = num2 * 10 + i;
                }
                c++;
                arr[i]--;
            }
        }

        return num1 + num2;







        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // while(num > 0){
        //     int d = num % 10;
        //     maxHeap.add(d);
        //     num /= 10;
        // }

        // if(maxHeap.size() % 2 != 0){
        //     maxHeap.add(0);
        // }

        // String num1 = "", num2 = "";

        // while(maxHeap.size() > 0){
        //     num1 = maxHeap.poll() + num1;
        //     num2 = maxHeap.poll() + num2;
        // }

        // int n1 = Integer.parseInt(num1);
        // int n2 = Integer.parseInt(num2);

        // return n1 + n2;
        








        // String n = String.valueOf(num);
        // char[] arr = n.toCharArray();

        // Arrays.sort(arr);
        // String num1 = "", num2 = "";

        // for(int i = arr.length-1; i >= 0; i -= 2){
        //     num1 = arr[i] + num1;
        //     if(i-1 >= 0)
        //         num2 = arr[i-1] + num2;
        // }

        // int n1 = Integer.parseInt(num1);
        // int n2 = Integer.parseInt(num2);

        // return n1 + n2;
    }
}
