package hash;

public class MyHashMapTest {
    public static void main(String[] args) {
        System.out.println("=== Default Capacity 테스트 ===");
        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(0, "zero");
        System.out.println("0 = zero 추가 후: " + map);
        map.put(1, "one");
        System.out.println("1 = one 추가 후: " + map);
        map.put(15, "fifteen");
        System.out.println("15 = fifteen 추가 후: " + map);
        map.put(16, "sixteen");
        System.out.println("16 = sixteen 추가 후: " + map);

        System.out.println("get(1)? " + map.get(1));
        System.out.println("get(3)? " + map.get(3));

        System.out.println("containsKey(1)? " + map.containsKey(1));
        System.out.println("containsKey(3)? " + map.containsKey(3));

        map.remove(1);
        System.out.println("1 remove 후: " + map);

        map.put(15, "fifteen2");
        System.out.println("15 = fifteen2 추가(중복) 후: " + map);

        map.put(16, "SIXTEEN_UPDATED");
        System.out.println("16 = SIXTEEN_UPDATED 추가(중복) 후: " + map);

        map.remove(16);
        System.out.println("16 remove 후: " + map);

        System.out.println("=== Default Capacity 테스트 끝 ===\n");

        System.out.println("=== Custom Capacity(10) 테스트 ===");
        MyHashMap<Integer, String> map2 = new MyHashMap<>(10);

        map2.put(0, "zero");
        System.out.println("0=zero 추가 후: " + map2);
        map2.put(1, "one");
        System.out.println("1=one 추가 후: " + map2);
        map2.put(11, "eleven");
        System.out.println("11=eleven 추가 후: " + map2);

        map2.put(13, "thirteen");
        System.out.println("13=thirteen 추가 후: " + map2);

        map2.remove(13);
        System.out.println("13 remove 후: " + map2);

        System.out.println("containsKey(11)? " + map2.containsKey(11));
        System.out.println("containsKey(13)? " + map2.containsKey(13));

        map2.put(11, "ELEVEN_UPDATED");
        System.out.println("11=ELEVEN_UPDATED(업데이트) 후: " + map2);

        System.out.println("get(0)? " + map2.get(0));
        System.out.println("get(11)? " + map2.get(11));
        System.out.println("get(13)? " + map2.get(13));

        System.out.println("=== Custom Capacity 테스트 끝 ===");
    }
}