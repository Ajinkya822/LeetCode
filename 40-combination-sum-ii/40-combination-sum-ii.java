class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer= new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(answer, new ArrayList<>(), target, candidates, 0);
        return answer;
    }
    public void backtrack(List<List<Integer>> answer, List<Integer> tempList, int remain, int[] candidates, int start ){
        if(remain<0){
            return;
        }
        else if(remain==0){
            answer.add(new ArrayList<>(tempList));
        }
        else{
            for(int i=start; i<candidates.length; i++){
                if(i>start && candidates[i]==candidates[i-1])
                    continue;
                tempList.add(candidates[i]);
                backtrack(answer, tempList, remain-candidates[i], candidates, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}