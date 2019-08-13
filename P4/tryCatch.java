public class tryCatch{
    public static void main(String[] args) {
        int a = 0;
        int b = 291802;
        try{
        int c = b/a;
    System.out.println(c);}
        catch(Exception e){
            System.out.println(e);
         System.out.println("Error");
        }
    finally{
        System.out.println("Its good");
    }

    }
}