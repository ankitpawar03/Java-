public class MissingNumber {

//    https://leetcode.com/problems/missing-number/description/
        public static void main(String[] args) {
            int[] nums = {3,0,1};
            System.out.println(missing(nums));
        }
        static int missing(int[] nums){
            int i = 0;
            while (i<nums.length){
                if(nums[i]< nums.length && nums[i] != nums[nums[i]]){
                    swap(nums, i, nums[i]);
                }else {
                    i++;
                }
            }
            int j = 0;
            for(j=0; j<nums.length; j++){
                if(nums[j] != j){
                    return j;
                }
            }return nums.length;
        }

        static void swap(int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
}
