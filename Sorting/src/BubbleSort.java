import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){

        int[] ar = {9,8,7,6,5,4,0,-1,-2,-3};
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            boolean check = false;
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    check = true;
                }
            }
            if(check == false){
                break;
            }
        }
    }
}
