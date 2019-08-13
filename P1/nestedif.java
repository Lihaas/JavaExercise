public class nestedif{
    public static void main(String[] args) {
        int x = 1289;
        int y = 2;
        int z = 28;

        if(x>y){
            if(x>z){
                System.out.println(x + " is Greater no.");
            }
            else{System.out.println(z + " is Greater no.");}
        }

        if(y>x){
            if(y>z){System.out.println(y + " is Greater no.");}
            else{System.out.println(z + " is Greater no.");}
        }



    }
}