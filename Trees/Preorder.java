public class Preorder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // The static keyword in Java is used for memory management mainly
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes); // recursive call

            return newNode;
        }

        // traversing O(n) root-left-right  pass root node as argument 
        public static void Preordertravercing(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            Preordertravercing(root.left);
            Preordertravercing(root.right);

            // System.out.println();
        }

        // inorder
        public static void inoder(Node root) {
            if (root == null) {
                return;
            }

            inoder(root.left);
            System.out.print(root.data + " ");
            inoder(root.right);
        }

        // postorder 
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        System.out.print("Preorder Traversal : ");
        tree.Preordertravercing(root);
        System.out.println();

        System.out.print("Inorder Traversal : ");
        tree.inoder(root);
        System.out.println();

        System.out.print("Postorder Traversal : ");
        tree.postorder(root);
        System.out.println();

    }
}