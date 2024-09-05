class Solution {
    public int largestInteger(int num) {

        PriorityQueue<Integer> oddMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> evenMaxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int n = String.valueOf(num).length();
        int[] ans = new int[n];
        int ind = n-1;

        while(num > 0){
            int d = num % 10;
            if(d % 2 != 0){
                oddMaxHeap.add(d);
                ans[ind] = 1;
            }
            else{
                evenMaxHeap.add(d);
                ans[ind] = 2;
            }
            ind--;
            num /= 10;
        }

        ind = n-1;
        int number = 0;
        int index = 0;
        while(oddMaxHeap.size() != 0 || evenMaxHeap.size() != 0){

            if(ans[index] == 2){
                number += Math.pow(10, ind) * evenMaxHeap.poll();
            }
            else{
                number += Math.pow(10, ind) * oddMaxHeap.poll();
            }
            index++;
            ind--;
        }

        return number;










        // PriorityQueue<Integer> oddMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> evenMaxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // String n = String.valueOf(num);
        // int[] ans = new int[n.length()];
        // int ind = n.length()-1;

        // while(num > 0){
        //     int d = num % 10;
        //     if(d % 2 != 0){
        //         oddMaxHeap.add(d);
        //     }
        //     else{
        //         evenMaxHeap.add(d);
        //     }
        //     num /= 10;
        // }

        // int index = 0;
        // while(oddMaxHeap.size() > 0 && evenMaxHeap.size() > 0){

        //     if(Integer.parseInt(""+n.charAt(index)) % 2 == 0){
        //         ans[index] = evenMaxHeap.poll();
        //     }
        //     else{
        //         ans[index] = oddMaxHeap.poll();
        //     }
        //     index++;
        // }

        // while(oddMaxHeap.size() > 0){
        //     ans[index] = oddMaxHeap.poll();
        //     index++;
        // }
        // while(evenMaxHeap.size() > 0){
        //     ans[index] = evenMaxHeap.poll();
        //     index++;
        // }

        // index = 0;
        // int number = 0;
        // for(int i = n.length()-1; i >= 0; i--){
        //     number += Math.pow(10, i) * ans[index];
        //     index++;
        // }

        // return number;
    }
}
