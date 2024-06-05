package data_structure.trees;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeExample {
    public static void main(String[] args) {
        // Node 클래스를 이용해 노드 생성
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        // 노드 연결
        node1.left = node2;
        node1.right = node3;

        // 노드 출력
        Node root = node1;
        printTree(root);
    }

    private static void printTree(Node root) {
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
}
