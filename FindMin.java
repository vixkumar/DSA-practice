

public class FindMin {
    public static void main(String[] args) {
        int[]nums = {18, 19, 20, 3, 7};
        System.out.println(minf(nums));

    }

    static int minf (int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                 min = nums[i];
            }
            
        }
      return min;

}

}
