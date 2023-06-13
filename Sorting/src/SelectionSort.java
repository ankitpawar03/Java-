import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {-2,-1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int end = arr.length-1-i;
            int maxElement = max(arr, 0, end);
            swap(arr,maxElement, end);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int max(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
