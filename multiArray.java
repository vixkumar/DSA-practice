
import java.util.Arrays;

public class multiArray {
    public static void main(String[] args) {
        int[][] nums = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };

        int target = 6;
        int [] ans = traverse(nums, target);
        System.out.println(Arrays.toString(ans));
        System.out.println("max element is " + max(nums));


    }

    static int[] traverse (int[][] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                     return new int[]{i, j};
                }
            }
        
        }
        return new int[] {-1, -1};
    }
     
    static int max (int[][] nums) {
        int max = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max) {
                     max = nums[i][j];
                }
            }
        
        }
        return max;
    }

}
