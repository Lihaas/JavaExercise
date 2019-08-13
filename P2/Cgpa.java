import java.util.Scanner;
public class Cgpa{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your CGPA");
        float f = s.nextFloat();

     float percent = (float)(f*9.5);
        System.out.println(percent);

    }
}