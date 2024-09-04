class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
       int x = 0, y = 0;
       boolean up = true, down = false, left = false, right = false;
       int maxDistance = 0;
       HashSet<String> set = new HashSet<>();

       for(int[] o: obstacles){
            set.add(String.valueOf(o[0]) + " " + String.valueOf(o[1]));
       }

        for(int i = 0; i < commands.length; i++){
            if(commands[i] == -2){
                if(up){
                    up = false;
                    left = true;
                }
                else if(down){
                    down = false;
                    right = true;
                }
                else if(right){
                    right = false;
                    up = true;
                }
                else{
                    left = false;
                    down = true;
                }
                
            }
            else if(commands[i] == -1){
                if(up){
                    up = false;
                    right = true;
                }
                else if(down){
                    down = false;
                    left = true;
                }
                else if(right){
                    right = false;
                    down = true;
                }
                else{
                    left = false;
                    up = true;
                }
            }
            else{

                int k = 1;
                while(k <= commands[i]){
                    int prevX = x;
                    int prevY = y;
                    if(up){
                        y++;
                    }
                    else if(down){
                        y--;
                    }
                    else if(left){
                        x--;
                    }
                    else{
                        x++;
                    }

                    String s = String.valueOf(x) + " " + String.valueOf(y);
                    if(set.contains(s)){
                        x = prevX;
                        y = prevY;
                        break;
                    }
                    k++; 
                }
                maxDistance = Math.max(maxDistance, x*x + y*y);
            } 
        }

        return maxDistance;
    }
}
