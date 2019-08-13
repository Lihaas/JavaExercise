public class arrays{
    public static void main(String[] args) {
        String[] cricket = {"Dhoni","Rohit","Kohli","Pandya","Pant","Shikhar"};
        int a = cricket.length;
        System.out.println(a);
        System.out.println(cricket[a-1]);
        System.out.println(cricket[1]);

        for(int i= 0 ; i<a ; i++){
            System.out.println(cricket[i]);
        }


    }
}