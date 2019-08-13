public class fibonacci{
    public static void main(String[] args) {
        int current = 1;
        int prev = 0;
        int i = 0;
        int result = 0;
        System.out.println(current);
       while(i<10){
        result = prev + current;
        System.out.println(result);
        prev = current;
        current = result;
            i++;

       }

    }
}