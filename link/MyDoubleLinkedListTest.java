package link;

public class MyDoubleLinkedListTest {
    public static void main(String[] args) {

        MyDoubleLinkedList<Integer> myLinkList = new MyDoubleLinkedList<>();

        myLinkList.add(0);
        System.out.println("0 추가 후: " + myLinkList);

        myLinkList.add(1);
        System.out.println("1 추가 후: " + myLinkList);

        myLinkList.add(2);
        System.out.println("2 추가 후: " + myLinkList);

        myLinkList.remove(2);
        System.out.println("인덱스 2 삭제 후: " + myLinkList);

        myLinkList.add(5);
        System.out.println("5 추가 후: " + myLinkList);

        myLinkList.add(0, 10);
        System.out.println("인덱스 0에 10 삽입 후: " + myLinkList);
        System.out.println("인덱스 0의 값: " + myLinkList.get(0));

        myLinkList.remove(0);
        System.out.println("인덱스 0 삭제 후: " + myLinkList);

        myLinkList.add(3, 3);
        System.out.println("인덱스 3에 3 삽입 후: " + myLinkList);

        myLinkList.set(2, 2);
        System.out.println("인덱스 2 값을 2로 변경 후: " + myLinkList);
    }
}
