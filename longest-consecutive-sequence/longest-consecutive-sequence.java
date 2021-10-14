class Solution {
    public int longestConsecutive(int[] nums) {
        int current=1;
        int best=0;
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int n:nums){
            current=1;
            if(!set.contains(n-1)){
                while(set.contains(n+1)){
                    current++;
                    n++;
                }
                if(current>best)
                    best=current;
            }
        }
        
        return best;
    }   
}