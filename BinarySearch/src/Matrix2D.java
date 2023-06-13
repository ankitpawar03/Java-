import java.util.Arrays;

public class Matrix2D {
    public static void main(String[] args) {

        int[][] arr = {

                {10, 20, 29, 40},
                {15, 25, 36, 45},
                {30, 37, 40, 50},
                {35, 40, 46, 56}
        };
        System.out.println(Arrays.toString(search(arr, 36)));
    }

    static int[] search(int[][] matrix, int target){

        int r = 0;
        int c = matrix.length-1;

        while(r< matrix.length && c>=0 ){

            if(matrix[r][c] == target){
                return new int[] {r,c};
            }if (matrix[r][c] < target){
                r++;
            }else{
            c--;
        }
    }
        return new int[]{-1,-1};
    }
}
