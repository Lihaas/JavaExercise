public class LargestThreeNo{
    public static void main(String[] args) {
        int x = 1289;
        int y = 23898;
        int z = 28776474;

        if(x>y && x>z){
            System.out.println(x +" is greater No.");
        }

        else if(z>y && z>x){
            System.out.println(z +" is greater No.");
        }

        else if(y>z && y>x){
            System.out.println(y +" is greater No.");
        }
    }
}