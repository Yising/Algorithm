package sort;

public class ShellSort {
    public static void shellSort(int[] array) {
        for (int i = array.length / 2; i > 0; i = i / 2) {
            for (int j = 0; j < i; j++) {
                groupSort(array, j, i);
            }
        }
    }

    private static void groupSort(int[] array, int start, int gap) {
        for (int i = start + gap; i < array.length; i = i + gap) {
            int j;
            for (j = i - gap; j >= start ; j -= gap) {
                if (array[j] < array[i]) {
                    break;
                }
            }
            int position = j + gap;
            int temp = array[i];
            for (int k = i - gap; k >= position ; k -= gap) {
                array[k + gap] = array[k];
            }
            array[position] = temp;
        }
    }
}
