class pair{
    int index;
    Node node;
    pair(int index,Node node){
        this.index=index;
        this.node=node;
    }
}


class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> llist = new ArrayList<>();
        if(root == null)
            return llist;
    
        Queue<pair> q = new ArrayDeque<>();
        Map<Integer,Integer> mp = new TreeMap<>();
        //PAIR IS A CLASS USED FOR KEEPING VALUES AS KEY VALUE IN QUEUE 
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair curr = q.poll();
            //HERE TV IS A TOPPVIEW AS DEIFINED BELOW USED FOR HORIZONTAL DISTANCE 
            //KEEPING THE VALUES IN HASHMAP
            if(mp.containsKey(curr.index) || !mp.containsKey(curr.index)){
                mp.put(curr.index,curr.node.data);
            }
            //CHECKING THE LEFT VALUE IS NULL AND IF NOT ADDING TO QUEUE
            if(curr.node.left!=null){
                q.add(new pair(curr.index-1,curr.node.left));
            }
            //CHECKING THE RIGHT VALUE IS NULL AND IF NOT ADDING TO QUEUE
            if(curr.node.right!=null){
                q.add(new pair(curr.index+1,curr.node.right));
            }
        }
        Set<Integer> s = mp.keySet();
        for(int i:s){
            llist.add(mp.get(i));
        }
        return llist;
    }
}
