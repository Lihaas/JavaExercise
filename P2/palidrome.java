import java.util.Scanner;
import java.lang.String;

public class palidrome{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        


        StringBuilder sb = new StringBuilder(str);

        String ss = sb.reverse().toString();
        System.out.println(ss);

        if(str.equals(ss)){
            System.out.println("This is palidrome");
        }

        else{
            System.out.println("This is not palidrome");
        }

    

    }
}