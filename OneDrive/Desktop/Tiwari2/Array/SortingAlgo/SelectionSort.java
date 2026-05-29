//package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    static void sorting(int[]arr){
        for(int i=0;i<arr.length;i++){
            int max_idx =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max_idx])
                max_idx = j;
            }
        int temp = arr[i];
        arr[i]= arr[max_idx];
        arr[max_idx] = temp;
    }
}
  public static void main(String[] args) {
 int arr[] = {3,4,5,6,7};
 sorting(arr);
//for(int i=0;i<arr.length;i++){
    //System.out.printl0n(arr[i] +" ");

//}
System.out.println(Arrays.toString(arr));
  }
}
