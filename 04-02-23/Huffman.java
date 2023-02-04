/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

    void decode(String s, Node root) {
        Node temp = root;
        for(int i=0;i<s.length();i++){
            //if 0 go left
            if(s.substring(i,i+1).equals("0")){
                root= root.left;
                if(root.left==null && root.right==null){
                    System.out.print(root.data);
                    root = temp;

                }
            }
            
            if(s.substring(i,i+1).equals("1")){
                //if 1 go right
                root= root.right;
                if(root.left==null && root.right==null){
                    System.out.print(root.data);
                    root = temp;

                }
            }
        }
    }
    
