package data_structure.stacks;

public class LinkedListStack {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return top == null;
    }
    // 스택에 데이터 삽입
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // 스택에서 데이터 삭제
    public int pop() {
        if(isEmpty()) {
            System.out.println("스택이 비어있습니다.");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }
}
