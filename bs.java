
public class bs {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 9, 14, 16, 18};
        int [] arr1 = {9, 8, 7, 6, 5, 4};
        int target = 10;
        int target1 = 7;
        int ans = binarysearch(arr,target);
        int ans1 = binarysearch (arr1, target1);
        System.out.println(ans);
        System.out.println(ans1);

    }

    

    static int binarysearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isasc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isasc) {
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

        else {
            if (target > arr[mid]) {
                end = mid-1;
            }
            else if (target < arr[mid]) {
                start = mid +1;
            }
            else {
              return mid;
            }
        }
        }
        return end;
    }
    
}
