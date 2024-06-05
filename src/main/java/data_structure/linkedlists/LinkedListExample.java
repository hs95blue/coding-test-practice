package data_structure.linkedlists;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListExample {
    public static void main(String[] args) {
        // Node 클래스를 이용해 노드 생성
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        // 노드 연결
        node1.next = node2;
        node2.next = node3;

        // 노드 출력
        Node head = node1;
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
