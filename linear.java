
public class linear{
    public static void main(String[]args){
         int [] nums = {23, 54, 66, 48, 59};
         int target = 48;
         linears(nums, 48);
         int ans = linears(nums, target);
         System.out.println(ans);

         
    }

    static int  linears (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}