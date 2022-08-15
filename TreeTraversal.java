package Trees;

import java.util.Stack;

public class TreeTraversal {

    public TreeTraversal() {

    }

    public static void main(String args[]) {
        System.out.println("Test");

    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    public void preOrderByStack(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<Node>();
        s.push(root);
        while (!s.isEmpty()) {
            Node tempNode = s.pop();
            System.out.println(" -> " + tempNode.data); // -> A -> B -> BLeft -> BRight -> C

            if (tempNode.right != null) {
                // push root.right so that it comes at last
                s.push(root.right);
            }

            if (tempNode.left != null) {
                // push root.left so that it comes at last
                s.push(root.left);
            }
        }
    }

    public void inOrderByStack(Node root) // left root right
    {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<Node>();// [A]=>[A,B,BL]
        Node tempNode = s.pop();
        while (tempNode != null) {
            s.push(tempNode);
            tempNode = tempNode.left;
        }

        while (!s.isEmpty())// Added=>[C]
        {
            tempNode = s.pop();// removed=>BL,B,BR,A,C
            System.out.println(" -> " + tempNode.data); // -> BL -> B -> BR -> A -> C
            if (tempNode.right != null) {
                s.push(tempNode.right);
            }
        }
    }
}