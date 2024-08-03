public class CountOfNodes {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }


    public static int count (Node root){
        if(root == null){
          return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount +1;
    }


    public static int sum_OF_Nodes(Node root){
 if (root == null) {
    return 0;
 }

 int leftsum = sum_OF_Nodes(root.left);
 int rightsum = sum_OF_Nodes(root.right);
 return rightsum + leftsum + root.data;

    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        
        BinaryTree.idx = -1; // Reset the index before building the tree
        Node root = BinaryTree.buildTree(nodes);

        System.out.println("Count of nodes : "+count(root));
        System.out.println("sum of node : " + sum_OF_Nodes(root));
    }
}
