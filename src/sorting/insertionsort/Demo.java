package sorting.insertionsort;

public class Demo {

    public static void main(String[] args) {

        int[] arr = {0, 9, 5, 2, 7, 1, 3, 15, -2, 8, 77};

        InsertionSort.sort(arr);

        for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }

}
