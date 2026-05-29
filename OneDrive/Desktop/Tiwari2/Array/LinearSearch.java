import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
       int[]a = {12,2,34,5,34,9};
       int target = 34;
       int ans = search(a,target);
       System.out.println(ans);
      System.out.println(saw);
    }
    static int search(int[]a,int target){
        if(a.length==0){
            return -1;
        }
       
        for(int index=0;index<a.length;index++){
        
            int element= a[index];
            if(element==target){
                return element;
            
            }
            }
            
        
        return -1;
        //  static boolean saw(int[]a,int target){
        //     for(int index=0;index<a.length;index++){
        
        //     if(element==[index]){
        //         return true;
        //     }
        // }
    }

    }

