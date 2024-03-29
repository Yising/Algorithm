package sort;

import java.util.List;

public class TestCase {
    private static final int[][] arrays = {{20, 40, 30, 10, 60, 50}, {5, 2, 3, 1}, {5, 1, 1, 2, 0, 0}};

    public static void main(String[] args) {
        for (int i = 0; i < arrays.length; i++) {
            sort(arrays[i]);
        }
    }

    private static void sort(int[] array) {
        int i;

        System.out.printf("before sort:");
        for (i = 0; i < array.length; i++)
            System.out.printf("%d ", array[i]);
        System.out.printf("\n");

        ShellSort.shellSort(array);
        //bubbleSort2(a, a.length);

        System.out.printf("after  sort:");
        for (i = 0; i < array.length; i++)
            System.out.printf("%d ", array[i]);
        System.out.printf("\n");
    }
}
