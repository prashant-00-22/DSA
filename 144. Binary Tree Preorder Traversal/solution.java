class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null){
            return out;
        }

        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode node= stack.pop();

            out.add(node.val);

            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }
        }
        return out;
    }
}
