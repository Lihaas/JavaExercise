import java.util.Random;
public class random{
    public static void main(String[] args) {
        Random ran = new Random();
        int r = ran.nextInt(100);
        System.out.println(r);
    }
}