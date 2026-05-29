import java.util.Scanner;
import java.util.Arrays;
class BinarySearch {
    public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter your Array");
    int n = arr.length;
    for(int i=0;i<arr.length;i++){
    arr[i] = sc .nextInt();
    }
    
   System.out.println("Your target index is");
    int target = 36;
           for(int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]  +" ");
    }
    System.out.println(Arrays.toString(arr));
   int ans = binarySearch( arr,target);
   System.out.println("Your target index is");
    System.out.print(ans);
    }
    static int binarySearch(int arr[] ,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        int mid = start+(end-start)/2;
        
         if(target<arr[mid]){
            end=mid-1;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
        return mid;
        }
    }
        return -1;
}
}
    

