import java.util.Arrays;

public class Q7QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        QuickSort(arr, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Choose the first element as the pivot
        int pivot = arr[low];
        int i = low + 1;  // Start index for the partitioning
        int j = high;

        while (i <= j) {
            // Move i to the right while arr[i] <= pivot
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            // Move j to the left while arr[j] > pivot
            while (arr[j] > pivot) {
                j--;
            }

            // Swap arr[i] and arr[j] if i < j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index j
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;  // Return the pivot index
    }
}
