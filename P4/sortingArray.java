import java.util.Arrays;
public class sortingArray{
    public static void main(String[] args) {
        int arr[] = {2,212,3,212,4,323,12,444,23,2,424,4};
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(" " + arr[i]);
        } 
    }
}