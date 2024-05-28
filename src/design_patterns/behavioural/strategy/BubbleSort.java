package design_patterns.behavioural.strategy;

// Concrete Strategy
public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        int size = arr.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }
}
