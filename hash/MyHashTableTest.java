package hash;

public class MyHashTableTest {
    public static void main(String[] args) {
        System.out.println("=== Default Capacity 테스트 ===");
        MyHashTable<Integer> myHashTable = new MyHashTable<>();

        myHashTable.add(0);
        System.out.println("0 추가 후: " + myHashTable);
        myHashTable.add(1);
        System.out.println("1 추가 후: " + myHashTable);
        myHashTable.add(15);
        System.out.println("15 추가 후: " + myHashTable);
        myHashTable.add(16);
        System.out.println("16 추가 후: " + myHashTable);

        System.out.println("contains 1? " + myHashTable.contains(1));
        System.out.println("contains 3? " + myHashTable.contains(3));

        myHashTable.remove(1);
        System.out.println("1 remove 후: " + myHashTable);

        myHashTable.add(15);
        System.out.println("15 추가(중복) 후: " + myHashTable);
        myHashTable.add(16);
        System.out.println("16 추가(중복) 후: " + myHashTable);
        myHashTable.add(3);
        System.out.println("3 추가 후: " + myHashTable);

        System.out.println("=== Default Capacity 테스트 끝 ===");

        System.out.println("=== Custom Capacity(13) 테스트 ===");
        MyHashTable<Integer> myHashTable2 = new MyHashTable<>(10);

        myHashTable2.add(0);
        System.out.println("0 추가 후: " + myHashTable2);
        myHashTable2.add(1);
        System.out.println("1 추가 후: " + myHashTable2);
        myHashTable2.add(11);
        System.out.println("11 추가 후: " + myHashTable2);

        myHashTable2.add(13);
        System.out.println("13 추가 후: " + myHashTable2);
        myHashTable2.remove(13);
        System.out.println("13 remove 후: " + myHashTable2);

        System.out.println("contains 11? " + myHashTable2.contains(11));
        System.out.println("contains 13? " + myHashTable2.contains(13));

        System.out.println("=== Custom Capacity 테스트 끝 ===");
    }
}