package data_structure.stacks;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 클래스를 이용해 스택 생성
        Stack stack = new Stack();

        // 스택에 데이터 삽입
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 스택에서 데이터 삭제
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
