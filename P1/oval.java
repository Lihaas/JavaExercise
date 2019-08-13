public class oval{
public static void main(String[] args) {
    for(int i = 1 ; i <= 9 ; i++){
        System.out.print(" O");
        for(int j=1;j<9;j++){
            
        if(i == 1 || i == 9){
            for(int x=1;j<9;j++)
            System.out.print(" O");

        
        }

        if (j==8){
            System.out.print(" O");
        }

        else {
            System.out.print("  ");
        }
        



        }
        System.out.println();
    }
}}