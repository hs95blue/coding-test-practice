package data_structure.linkedlist;

public class DoubleLinkedList {
    public static void main(String[] args){
        System.out.println("main test");
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertFront(1);
        dll.insertFront(2);
        dll.insertFront(3);
        dll.insertFront(4);
        dll.insertFront(5);
        dll.print();
        dll.insertBack(6);
        dll.insertBack(7);
        dll.insertBack(8);
        dll.insertBack(9);
        dll.insertBack(10);
        dll.print();
        dll.deleteFront();
        dll.deleteFront();
        dll.deleteFront();
        dll.print();
        dll.deleteBack();
        dll.deleteBack();
        dll.deleteBack();
        dll.print();
        dll.insertMiddle(11, 2);
        dll.insertMiddle(12, 3);
        dll.insertMiddle(13, 4);
        dll.print();
        dll.deleteMiddle(2);
        dll.deleteMiddle(3);
        dll.print();

    }

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;

    public DoubleLinkedList(){
        this.head = null;
    }

    // 앞에 삽입 뒤에 삽입
public void insertFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

  public void insertBack(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void deleteFront(){
        if(head == null){
            System.out.println("데이터가 없습니다.");
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteBack(){
        if(head == null){
            System.out.println("데이터가 없습니다.");
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }
//요소 중간에 삽입
    public void insertMiddle(int data, int position){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    //요소 중간에 삭제
    public void deleteMiddle(int position){
        if(head == null){
            System.out.println("데이터가 없습니다.");
        } else {
            Node temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
