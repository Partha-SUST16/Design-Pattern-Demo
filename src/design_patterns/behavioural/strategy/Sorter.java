package design_patterns.behavioural.strategy;

//Context
public class Sorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int arr[]){
        sortingStrategy.sort(arr);
    }
}
