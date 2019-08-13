import java.util.Scanner;
public class fibonacciByUser{
    public static void main(String[] args) {
        System.out.println("how much no you want");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int current = 1;
        int prev = 0;
        int i = 0;
        int result = 0;
        System.out.println(current);
       while(i<x-1){
        result = prev + current;
        System.out.println(result);
        prev = current;
        current = result;
            i++;

       }

    }
}