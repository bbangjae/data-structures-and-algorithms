package tree;

public class MyBinarySearchTreeTest {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(15);
        bst.insert(25);
        bst.insert(35);

        System.out.println("=== 트리 상태 (in-order) ===");
        bst.inOrderTraversal();
        System.out.println("size: " + bst.size() + "\n");

        // 1. 왼쪽, 오른쪽 자식이 모두 있는 노드 삭제: 20 (루트, 양쪽 자식 있음)
        System.out.println("[1] 왼쪽/오른쪽 자식 모두 있는 20 삭제");
        bst.delete(20);
        bst.inOrderTraversal();
        System.out.println("size: " + bst.size() + "\n");

        // 2. 자식이 하나만 있는 노드 삭제: (예시: 25만 자식인 30)
        System.out.println("[2] 자식이 하나만 있는 30 삭제");
        bst.delete(30);
        bst.inOrderTraversal();
        System.out.println("size: " + bst.size() + "\n");

        // 3. 트리에 없는 값 삭제: (예시: 100)
        System.out.println("[3] 존재하지 않는 100 삭제");
        bst.delete(100);
        bst.inOrderTraversal();
        System.out.println("size: " + bst.size() + "\n");
    }
}
