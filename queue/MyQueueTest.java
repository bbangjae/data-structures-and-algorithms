package queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.offer(0);
        System.out.println("0 추가 후: " + queue);
        queue.offer(1);
        System.out.println("1 추가 후: " + queue);
        queue.offer(2);
        System.out.println("2 추가 후: " + queue);
        System.out.println("2 추가 후 맨 위 값: " + queue.peek());
        System.out.println("size : " + queue.size());
        System.out.println("isEmpty : " + queue.isEmpty());
        System.out.println();

        System.out.println("poll 실행 (꺼낸 값): " + queue.poll());
        System.out.println("poll 실행 후: " + queue);
        System.out.println("size : " + queue.size());
        System.out.println();

        queue.offer(5);
        System.out.println("5 추가 후: " + queue);
        System.out.println("size : " + queue.size());
        System.out.println();

        System.out.println("모두 poll:");
        while (!queue.isEmpty()) {
            System.out.println("poll: " + queue.poll() + ", 현재: " + queue);
        }

        System.out.println("스택 비었음 -> isEmpty : " + queue.isEmpty());
        System.out.println("size : " + queue.size());
    }
}