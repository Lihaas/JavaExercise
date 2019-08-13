import java.util.Scanner;
public class sumOfDiagonal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the matrix Size");
        int si = s.nextInt();
        System.out.println("Enter your no.");
        int[][] array= new int[si][si];
        int diag1 = 0;
        int diag2 = 0;

        for(int i=0;i<si;i++){
            for(int j=0;j<si;j++){
                array[i][j] = s.nextInt();
            }
        }

        for(int i=0;i<si;i++){
            for(int j=0;j<si;j++){
               System.out.print(array[i][j]); 
            }
            System.out.println();
        }

        for(int i=0;i<si;i++){
            for(int j=(si-1);j>=0;j--){
                if(i==j){
                    diag1+=array[i][j];
                }
                int k = i+j;

                if( k == (si-1)){
                diag2+=array[i][j];
               
                  }
        
            }

        


        }

        if(diag1 == diag2){
            System.out.println("Diagonal are Equal");
        }
        else{
            System.out.println("Diagonals are not equal");
        }
        
    }

}