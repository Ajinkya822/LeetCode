class Solution {
    public int longestConsecutive(int[] nums) {
        int best=0;
        Set<Integer> set=new HashSet<Integer>();
        for(int n:nums){
            set.add(n);
        }
        for(int n:set){ //traverse through set and not input array since input array might have duplicates
            
            if(!set.contains(n-1)){
                int current=1;
                int curr = n;
                while(set.contains(curr+1)){
                    current++;
                    curr++;
                }
                best=Math.max(best,current);
            }
        }
        
        return best;
        

    }   
}