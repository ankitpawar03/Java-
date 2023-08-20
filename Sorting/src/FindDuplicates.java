import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args){

        int[] nums = {1,1,2};
        List<Integer> ans = new ArrayList<>();
        int i = 0;

        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, correct, i);
            }
            else{
                i++;
            }
        }
        for( i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
//           4,3,2,7,8,2,3,1
//            1,2,3,4,3,2,7,8
        }
        System.out.println(ans);
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

