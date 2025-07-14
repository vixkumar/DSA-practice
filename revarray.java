import java.util.Arrays;

public class revarray {
    public static void main(String[] args) {
        
    
 int [] arr = {23, 46, 59, 72, 64};
 rev(arr);
 System.out.println(Arrays.toString(arr));


   


}

static void swap(int [] arr, int index1, int index2) {
    int temp = arr[index1] ;
    arr[index1] = arr[index2];
    arr[index2] = temp;
}


static void rev(int [] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        swap (arr, start, end);
        start++;
        end --;
    }
    }
}

    

