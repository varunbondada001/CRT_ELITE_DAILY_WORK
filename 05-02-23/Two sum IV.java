class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        //Collections.sort(res);
        System.out.print(res);
        int low = 0;
        int high = res.size()-1;
        while(low<high){
            if(res.get(low)+res.get(high)<k){
                low++;
                }
            else if(res.get(low)+res.get(high)>k){
                high--;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public void inOrder(TreeNode root,List<Integer> res){
        if(root==null)
            return ;
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
    }
}
