public class BoundaryElements_Sum {
    public static void main(String[] args){
        int arr[][] = {
            {2,3,4,5},
            {6,7,8,2},
            {4,5,6,7},
            {3,4,5,1}
        
        };
        
         int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0|| j==0 || i==arr.length-1 ||j==arr[i].length-1){
               System.out.print(arr[i][j]);
               sum+=arr[i][j];
                }
                

            }

        }
            System.out.println(sum);
        
    }
    
}
