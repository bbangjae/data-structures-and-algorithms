package search;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };

        System.out.println(linearSearch(arr, 3));
    }

    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
