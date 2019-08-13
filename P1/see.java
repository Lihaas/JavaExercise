public class see{
    public static void main(String[] args) {
        for(int i = 1 ; i <= 9 ; i++){
            System.out.print("O");
            if(i == 1 || i == 9){
                for(int j=1;j<9;j++)
                System.out.print(" O");
            }
            System.out.println();
        }
    }
}