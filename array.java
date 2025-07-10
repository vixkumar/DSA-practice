import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println("Type down int array");
        scanarr(arr);
        reverse(arr);
        
      
        max (arr);
        System.out.println(max(arr));


       

    }

    static void scanarr(int [] arr){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    static int  max(int [] arr) {
          int maxval = arr[0];
          for (int i = 0 ; i < arr.length ; i ++) {
              if(arr[i] > maxval) {
                maxval = arr[i];
              }
          }
          return maxval;
    }

    static void swap (int [] arr, int index1, int index2) {
          int temp = arr[index1];
          arr[index1] = arr[index2];
          arr[index2] = temp;
    }

    static void reverse (int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap (arr, start, end) ;
            start ++;
            end--;
        }
    
    }
    
}