package design_patterns.behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        int arr[] = {5, 4, 5, 2, 66, 7, 9};

        Sorter sorter = new Sorter();
        sorter.setSortingStrategy(new BubbleSort());
        sorter.sort(arr);

        sorter.setSortingStrategy(new SelectionSort());
        sorter.sort(arr);
    }
}
