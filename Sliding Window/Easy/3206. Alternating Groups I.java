class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        
        int count = 0;
        int i = 0, j = 0;

        while(i < colors.length - 2){
            
            if((j - i + 1) < 3){
                j++;
            }
            else if((j - i + 1) == 3){
                if(colors[i] != colors[i + 1] && colors[i + 1] != colors[j]){
                    count++;
                }

                i++;
                j++;
            }
        }

        if(colors[colors.length - 2] != colors[colors.length - 1] && 
        colors[colors.length - 1] != colors[0]){
            count++;
        }
        if(colors[colors.length - 1] != colors[0] && colors[0] != colors[1]){
            count++;
        }

        return count;
    }
}
