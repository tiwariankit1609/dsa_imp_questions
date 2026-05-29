import java.util.Arrays;
public class SelectionS2 {
    static void selectionSort(String[] f){
        for(int i=0;i<f.length;i++){
            int minidx = i;
            for(int j=i+1;j<f.length;j++){
                if(f[j].compareTo(f[minidx])<0){
                    minidx = j;
                }
            }
            String temp = f[i];
            f[i] = f[i+1];
            f[i+1] = temp;
        }
    }
   public static void main(String[] args)  {
   //  String[] f1 = new String[7];
    String[] f = {"Banana","Mango","Orange","kevi","Papaya"};
    selectionSort(f);
    for(String val:f){
        System.out.println(val + " ");
    }
   } 
}
