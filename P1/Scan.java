import java.util.Scanner;
public class Scan{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        System.out.println(age + " this");
        s.close();

    }
}