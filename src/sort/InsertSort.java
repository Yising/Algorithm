package sort;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] < array[i]) {
                    break;
                }
            }
            int position = j + 1;
            if (position >= i) {
                continue;
            }
            int value = array[i];
            for (int k = i - 1; k >= position ; k--) {
                array[k + 1] = array[k];
            }
            array[position] = value;
        }
    }
}
