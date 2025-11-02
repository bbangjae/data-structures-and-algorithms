package insertion;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int key = arr[i];
                int j = i;

                while (j >= gap && key < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }
    }
}
