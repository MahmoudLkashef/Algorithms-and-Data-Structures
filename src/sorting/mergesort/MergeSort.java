package sorting.mergesort;

public class MergeSort {
    public static void sort(int[] arr)
    {
        if(arr.length<2)return;
        int mid=arr.length/2;
        int[] leftArray=new int[mid];
        int[] rightArray=new int[arr.length-mid];

        for(int i=0;i<mid;i++)leftArray[i]=arr[i];
        for(int i=mid;i<arr.length;i++)rightArray[i-mid]=arr[i];

        sort(leftArray);
        sort(rightArray);
        merge(arr,leftArray,rightArray);
    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {

        int leftPointer=0,rightPointer=0,mainPointer=0;

        while(leftPointer<leftArray.length && rightPointer<rightArray.length)
        {
            if(leftArray[leftPointer]< rightArray[rightPointer])
                arr[mainPointer++]=leftArray[leftPointer++];

            else
                arr[mainPointer++]=rightArray[rightPointer++];
        }
        while(leftPointer<leftArray.length)arr[mainPointer++]=leftArray[leftPointer++];
        while(rightPointer<rightArray.length)arr[mainPointer++]=rightArray[rightPointer++];
    }

}
