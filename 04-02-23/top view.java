	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
        if(root == null)
            return;
    
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> mp = new TreeMap<>();
        //PAIR IS A CLASS USED FOR KEEPING VALUES AS KEY VALUE IN QUEUE 
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            //HERE TV IS A TOPPVIEW AS DEIFINED BELOW USED FOR HORIZONTAL DISTANCE 
            //KEEPING THE VALUES IN HASHMAP
            if(!mp.containsKey(curr.tv)){
                mp.put(curr.tv,curr.root.data);
            }
            //CHECKING THE LEFT VALUE IS NULL AND IF NOT ADDING TO QUEUE
            if(curr.root.left!=null){
                q.add(new Pair(curr.tv-1,curr.root.left));
            }
            //CHECKING THE RIGHT VALUE IS NULL AND IF NOT ADDING TO QUEUE
            if(curr.root.right!=null){
                q.add(new Pair(curr.tv+1,curr.root.right));
            }
        }
        Set<Integer> s = mp.keySet();
        for(int i:s){
           System.out.print(mp.get(i)+" ");
        } 
    }
static class Pair{
    int tv;
    Node root;
    public Pair(int tv,Node root){
        this.tv = tv;
        this.root = root;
    }
}
