import java.util.Scanner;
public class factorialWithWhileUser{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt() ;
        int z = 1 ;
        int i = x ;
        while(i>0){
             z = z*i;
             i--;
        }
        System.out.println(z);


    }
}