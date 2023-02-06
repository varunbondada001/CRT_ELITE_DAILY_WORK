class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.add(0);
        res.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int m = queue.poll();
            for(int j:adj.get(m)){
                if(!visited[j]){
                    queue.add(j);
                    res.add(j);
                    visited[j] = true;
                    }
                }
            
        }
        return res;
    }
}


//OR



class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.add(0);
        res.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int n = queue.size();
        for(int i=0;i<n;i++){
            int m = queue.poll();
            for(int j:adj.get(m)){
                if(!visited[j]){
                    queue.add(j);
                    res.add(j);
                    visited[j] = true;
                    }
                }
            }
        }
        return res;
    }
}
