//program to find first repeated element
import java.util.Arrays;
public class FirstRepeatedElement {
    public static void main(String[] args){
        int arr[]={2,3,5,3,1};
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){

               if(arr[i]==arr[j])
                System.out.print(arr[j]);
            }

            
        }
        
    }
    
}
