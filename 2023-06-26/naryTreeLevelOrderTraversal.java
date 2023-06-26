class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        solve(root, 0, res);
        return res;
    }
    
    private void solve(Node root, int level, List<List<Integer>> res){
        if(root == null) return;

        if(level >= res.size())
            res.add(new ArrayList<>());

        res.get(level).add(root.val);

        for(Node n : root.children)
            solve(n, level+1, res);
    }
}