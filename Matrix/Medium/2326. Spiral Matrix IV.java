/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        ListNode curr = head;
        int firstRow = 0;
        int lastRow = m-1;
        int firstColumn = 0;
        int lastColumn = n-1;

        int[][] ans = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(ans[i], -1);
        }

        while(head != null){
            for(int c = firstColumn; c <= lastColumn && head != null; c++){
                ans[firstRow][c] = head.val;
                head = head.next;
            }
            for(int r = firstRow+1; r <= lastRow && head != null; r++){
                ans[r][lastColumn] = head.val;
                head = head.next;
            }

            if(firstRow < lastRow){
                for(int c = lastColumn-1; c >= firstColumn && head != null; c--){
                    ans[lastRow][c] = head.val;
                    head = head.next;
                }
            }
            if(firstColumn < lastColumn){
                for(int r = lastRow-1; r >= firstRow+1 && head != null; r--){
                    ans[r][firstColumn] = head.val;
                    head = head.next;
                }
            }

            firstRow++;
            lastRow--;
            firstColumn++;
            lastColumn--;
        }

        return ans;
    }
}
