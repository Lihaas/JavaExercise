public class reverseArray{
    public static void main(String args[]){
        int arr[] ={12,3,12,3,4,54,64,235,667,8,43};
        int temp[]= new int[arr.length];

        for(int i = (arr.length-1) ; i>=0;i--){
               temp[arr.length - i -1]  = arr[i]  ;  }

        for(int i = 0 ; i<arr.length;i++){
            System.out.print(" "+ temp[i]);

        }
        
    }
}