import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args){

        int[] arr = {2,-1,1,0};
        cyclicSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){

        int i = 0;
        while(i<arr.length){

            int correct = arr[i]-1;

            if( arr[i]>0 && arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }
}
