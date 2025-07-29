public class searchinmountain {
    public static void main(String[] args) {
      
    } 

    static int search (int [] arr ,int target) {
         int peak = peakIndexInMountainArray(arr);
           int firsttry = order_agnostic_bs(arr, target,0, peak);
           if (firsttry != -1) {
           return firsttry;
           }
           return order_agnostic_bs(arr, target, peak + 1, arr.length - 1);


    }

    static  int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
       
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
           
        }
        return start;
    }

    static int order_agnostic_bs(int []arr, int target, int start, int end){

        boolean isasc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

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
    
    static int binarysearch (int [] arr, int target, int start, int end) {

    while (start < end) {
        int mid = start + (end - start) / 2;
        if (target < arr[mid]) {
            end = mid -1;
        }
        else if (target > arr[mid]){
            start = mid +1;
        }
        else {
            return mid;
        }
    }
    return -1;
    }

}
