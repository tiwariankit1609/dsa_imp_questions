import java.io.*;
import java.util.Scanner;
 class Quick {
    void sorting(int[]arr,int low,int high){
    if(low < high){
    
        int pi = partition( arr, low,high);
        sorting(arr, low,pi-1);
        sorting(arr,pi+1,high);
    }

   }  
   int partition(int arr[],int low,int high){
    int pivot=arr[low];
    int i=low;
    int j=high;
    while(i<j){
        while(arr[i]<=pivot && i<=high-1){
            i++;
        }
        while(arr[j]>pivot && i>=low+1){
            j--;
        }
        if(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    int temp=arr[j];
    arr[j]=pivot;
    arr[low]=temp;

    return j;
   }
   void display(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+ " ");
    }
    System.err.println();
   }
}
public class QuickSort{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your size of array:");
        int r=sc.nextInt();
        int[] arr = new int[r];
        for(int i=0;i<r;i++){
            arr[i]=sc.nextInt();
        }
        Quick obj = new Quick();
        obj.display(arr);
        obj.sorting(arr,0,r-1);
        obj.display(arr);

    }
}