package sorting.insertionsort;

public class InsertionSort {
    public static void sort(int[] arr)
    {
        int i=1;
        while(i<arr.length)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            i++;
        }
    }
}
