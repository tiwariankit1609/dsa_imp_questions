import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int val:a){
            System.out.println(val+ " ");
            a[val] = sc.nextInt();
            a[3]=5;

        }
        System.out.println(Arrays.toString(a));
    
        insertionS(a);
    
        
      // System.out.println(Arrays.toString(a));
    }
    static void insertionS(int[] a){
       for(int i=1;i<a.length;i++){
        int j=i;
        while(j>0 && a[j]<a[j-1]){
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
            j--;
        }
       }
    }
    
}
