
public class bs {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 6, 8, 18};
        int target = 6;
        int ans = binarysearch(arr, 6);
        System.out.println(ans);

    }

    static int binarysearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid +1;
            }
            else {
              return mid;
            }
        }
        return -1;
    }
    
}
