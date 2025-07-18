package stack;

public class MyStackTest {
        public static void main(String[] args) {
            MyStack<Integer> stack = new MyStack<>();

            stack.push(0);
            System.out.println("0 추가 후: " + stack);
            stack.push(1);
            System.out.println("1 추가 후: " + stack);
            stack.push(2);
            System.out.println("2 추가 후: " + stack);
            System.out.println("2 추가 후 맨 위 값: " + stack.peek());
            System.out.println("size : " + stack.size());
            System.out.println("isEmpty : " + stack.isEmpty());
            System.out.println();

            System.out.println("pop 실행 (꺼낸 값): " + stack.pop());
            System.out.println("pop 실행 후: " + stack);
            System.out.println("size : " + stack.size());
            System.out.println();

            stack.push(5);
            System.out.println("5 추가 후: " + stack);
            System.out.println("size : " + stack.size());
            System.out.println();

            System.out.println("모두 pop:");
            while (!stack.isEmpty()) {
                System.out.println("pop: " + stack.pop() + ", 현재: " + stack);
            }

            System.out.println("스택 비었음 -> isEmpty : " + stack.isEmpty());
            System.out.println("size : " + stack.size());
        }
    }