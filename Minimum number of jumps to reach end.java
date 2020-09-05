public class Solution {
    public int solve(ArrayList<Integer> A) {
        int end=0;
        int current_max = 0;
        int level=0;
        
        for(int i=0;i<A.size()-1;i++) {
            current_max = Math.max(current_max, i+A.get(i));
            if(i>end)
                return -1;
                
            if(i==end) {
                level++;
                end = current_max;
            }
        }
        
        return level;  //jumps
    }
}


