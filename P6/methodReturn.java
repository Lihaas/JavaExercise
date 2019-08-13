public class methodReturn{
    public static void main(String[] args) {

         int z =   sum(3, 5);
         System.out.println(z);

    }



   static int sum(int a , int b){
        int c =  a+b;
        return c;
    }
}