package sort;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        System.out.println("bubble sort");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort1(int[] array) {
        System.out.println("bubble sort1");
        for (int i = array.length - 1; i > 0; i--) {
            boolean isChange = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isChange = true;
                }
            }
            if (!isChange) {
                return;
            }
        }
    }
}
