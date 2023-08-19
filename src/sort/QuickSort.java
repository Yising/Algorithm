package sort;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int value = array[left];

        while (i < j) {
            while (i < j && array[j] > value) {
                j--;
            }
            if (i < j) {
                array[i++] = array[j];
            }
            while (i < j && array[i] < value) {
                i++;
            }
            if (i < j) {
                array[j--] = array[i];
            }
        }
        array[i] = value;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }
}
