class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> adjList=new HashMap<>();
        int [] indegree=new int[numCourses];
        int [] op=new int[numCourses];
        Queue<Integer> q=new LinkedList<Integer>();
        
        //create adjacency list
        
       // adjList.getOrDefault(prerequisites[i][1], new ArrayList<>()).add(prerequisites[i][0])
        for(int i=0;i<prerequisites.length;i++){
            if(adjList.get(prerequisites[i][1])==null){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(prerequisites[i][0]);
                adjList.put(prerequisites[i][1], temp);
            }
            else{
                adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }
        }
        
        //create indegree array
        
        for(int i=0;i<prerequisites.length;i++){
            indegree[prerequisites[i][0]]++;
        }
        //add nodes having indegree=0 into the queue
        
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        //keep track of iterations
        int count=0;
        int index=0;
        
        while(count<numCourses && q.size()>0){
            ArrayList<Integer> temp=adjList.get(q.peek());
            if(temp!=null){
               for(int i=0;i<temp.size();i++){
                    indegree[temp.get(i)]--;
                    if(indegree[temp.get(i)]==0)
                        q.add(temp.get(i));
                } 
            }
            
            op[index]=q.remove();
            index++;
            count++;
        }
        if(count!=numCourses){
            return new int[0];
        }
        
        
        return op;
        
    }
}