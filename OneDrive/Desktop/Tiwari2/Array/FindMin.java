import java.net.SocketPermission;
import java.util.Arrays;
public class FindMin {
    public static void main(String[] args) {
        int[]num = {23,34,13,56,23,67,-23,-6,-9};
       // System.out.print("minmum number:");
        System.out.println(minNumber(num));
        System.err.println(maxNumber(num));
        for(int i=0;i<num.length;i++){
        System.out.println(num[i] + " ");
        }
        System.out.println(Arrays.toString(num));
    }
    static int minNumber(int[]num){
        //System.out.println("minmum number:");
        int min = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min = num[i];
            }
        }
        return min;
    }
    static int maxNumber(int[]num){
        int max =num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;    
    }  
    
}
