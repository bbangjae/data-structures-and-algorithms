package search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };

        System.out.println(linearSearch(arr, 3));
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                left = mid + 1;
            }

            if (arr[mid] > x) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
