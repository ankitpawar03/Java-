import java.util.ArrayList;
import java.util.List;

class FindNumsInArray {

    public static void main(String[] args) {

        int[] nums = {4,3,2,5,6,2,3,1};
        
        List<Integer> missed = new ArrayList<>();

        int i = 0;

        while(i<nums.length){

            int correct = nums[i]-1;

            if(nums[i] != nums[correct]){
                swap(nums, correct, i);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){

            if(nums[j] != j+1){

                missed.add(j+1);
            }
        }
        System.out.println(missed);
    }
    static void swap(int[] nums, int first, int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}