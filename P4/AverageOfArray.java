public class AverageOfArray{
    public static void main(String[] args) {
        int add=0;
        int[] arr = {2,3,11,3,4,1,3,4};
        int len = arr.length;
        
        for(int i= 0;i<len;i++){
            add = add + arr[i];
            
        }

        double avg = (double)add/len;

        System.out.println(avg);        

    }
}