public class swapUsingVariable{
    public static void main(String[] args) {
        int a = 15;
        int b = 21;
        int temp;

        temp = a;
        a = b ;
        b = temp;
        System.out.println("A = "+ a);
        System.out.println("B = "+ b);

    }
}