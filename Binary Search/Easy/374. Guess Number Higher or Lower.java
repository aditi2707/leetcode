/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        long low = 1, high = n;

        while(low <= high){

            long mid = low + (high - low)/2;

            if(guess((int)mid) == -1){
                high = mid - 1;
            }
            else if(guess((int)mid) == 1){
                low = mid + 1;
            }
            else{
                return (int)mid;
            }
        }

        return -1;
    }
}
