class Solution {
    public boolean isSymmetric(TreeNode root) {
        return Traversal(root,root);
    }
    public boolean Traversal(TreeNode root1 , TreeNode root2){
        if(root1==null && root2==null) return true ;
        if(root1==null || root2==null || root1.val!=root2.val) return false ;
        return Traversal(root1.left,root2.right) &&
                Traversal(root1.right , root2.left);
    }
}