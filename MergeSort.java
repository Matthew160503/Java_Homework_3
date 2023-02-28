
/**
 Реализовать алгоритм сортировки слиянием.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {2, 34, 1, -10, 6, 99, 39, 5, 9, 23, -5, 12, 456};
        mergeSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] arr){
        int n = arr.length;
        if (n == 1) return;

        int middle = n / 2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];

        for(int i = 0; i < middle; i++) left[i] = arr[i];
        for(int i = middle; i < n; i++) right[i - middle] = arr[i];

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while(i < l && j < r){
            if(left[i] < right[j])  arr[index++] = left[i++];
            else arr[index++] = right[j++]; 
        }

        for (int ll = i; ll < l; ll++) arr[index++] = left[ll];
        for (int rr = j; rr < r; rr++) arr[index++] = right[rr];
    }
}
