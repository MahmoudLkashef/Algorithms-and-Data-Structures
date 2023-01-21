package sorting.quicksort;

public class QuickSort {
    public static void sort(int[] arr)
    {
        int left=0;
        int right= arr.length-1;
        quickSortHelper(arr,left,right);
    }
    private static void quickSortHelper(int[] arr,int left,int right)
    {
        int pivot=arr[(left+right)/2];
        int leftPointer=left;
        int rightPointer=right;

        while (leftPointer<=rightPointer)
        {
            while(arr[leftPointer]<pivot)leftPointer++;
            while (arr[rightPointer]>pivot)rightPointer--;

            if(leftPointer<=rightPointer)
            {
                int swap=arr[leftPointer];
                arr[leftPointer]=arr[rightPointer];
                arr[rightPointer]=swap;
                leftPointer++;rightPointer--;
            }
            if(left<rightPointer)quickSortHelper(arr,left,rightPointer);
            if(right>leftPointer)quickSortHelper(arr,leftPointer,right);
        }
    }
}
