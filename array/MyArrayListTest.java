package array;


public class MyArrayListTest {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>(2);

        myArrayList.add(0);
        System.out.println("0을 추가한 후: " + myArrayList);

        myArrayList.add(1);
        System.out.println("1을 추가한 후: " + myArrayList);

        myArrayList.add(2);
        System.out.println("2를 추가한 후: " + myArrayList);

        myArrayList.add(3);
        System.out.println("3을 추가한 후: " + myArrayList);

        myArrayList.add(4);
        System.out.println("4를 추가한 후: " + myArrayList);

        myArrayList.remove(4);
        System.out.println("인덱스 4의 값을 삭제한 후: " + myArrayList);

        myArrayList.add(5);
        System.out.println("5를 추가한 후: " + myArrayList);

        myArrayList.add(4, 4);
        System.out.println("인덱스 4에 4을 삽입한 후: " + myArrayList);

        myArrayList.remove(5);
        System.out.println("인덱스 5의 값을 삭제한 후: " + myArrayList);

        myArrayList.remove(2);
        System.out.println("인덱스 2의 값을 삭제한 후: " + myArrayList);

        myArrayList.set(2, 2);
        System.out.println("인덱스 2의 값을 2로 변경한 후: " + myArrayList);

        System.out.println("값 2의 인덱스: " + myArrayList.indexOf(2));
        System.out.println("값 2의 포함여부: " + myArrayList.contains(2));

        System.out.println("값 5의 인덱스: " + myArrayList.indexOf(5));
        System.out.println("값 5의 포함여부: " + myArrayList.contains(5));
    }
}