
public class swapwithoutusing{
    public static void main(String[] args) {
        int a = 15;
        int b = 21;

        a = a+b;
        b= a - b;
        a = a - b ;

        System.out.println("A =" + a);
        System.out.println("B =" + b);

    }
}