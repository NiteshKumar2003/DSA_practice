class Solution {
    List<List<Integer>> res=new LinkedList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        solve(root,0);
        return res;
    }

    private void solve(TreeNode root, int level){
        if(root == null) return;
        
        // When found a new level, add a new list
        if(level >= res.size())
            res.add(new ArrayList<>());
        
        // Add node in the list at the related level
        if(level%2==0) res.get(level).add(root.val);
        else res.get(level).add(0,root.val);
        
        // Traverse all the children
        
        solve(root.left, level+1);
        solve(root.right, level+1);
    }
}