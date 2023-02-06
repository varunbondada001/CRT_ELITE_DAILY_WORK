class Solution {
    // Function to return a list containing the DFS traversal of the graph.
                boolean Visitedvertex [] ; 
                ArrayList<Integer> val = new ArrayList<>();
                ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
            Visitedvertex = new boolean[V];
            temp = adj;
            //INTIALLY CALLING WITH SOURCE 
            dfs(0);
            return val;
    }
    public void dfs(int source){
        val.add(source);
        Visitedvertex[source] = true;
        //EACH VALUE IS ASSIGNED TO NEIGH
        for(int neigh:temp.get(source)){
            if(!Visitedvertex[neigh]){
                dfs(neigh);
            }
        }
    }
    
}
