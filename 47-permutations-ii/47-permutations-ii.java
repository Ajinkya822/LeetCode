class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>(); //final answer
        Set<List<Integer>> setAnswer=new HashSet<>(); //temporary answer to handle duplicates
        boolean visited[]=new boolean[nums.length];
        backtracking(nums, setAnswer, visited, new ArrayList<>());
        
        for(List<Integer> i: setAnswer)
            answer.add(i);
        return answer;
    }
    
    public void backtracking(int[] nums, Set<List<Integer>> setAnswer, boolean visited[], List<Integer> tempList){
        if(tempList.size()==nums.length)
            setAnswer.add(new ArrayList<>(tempList));
        
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                tempList.add(nums[i]);
                visited[i]=true;
                backtracking(nums, setAnswer, visited, tempList);
                visited[i]=false;
                tempList.remove(tempList.size()-1);
            }
        }
    }
}