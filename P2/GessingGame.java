import java.util.Scanner;
import java.util.Random;

public class GessingGame{
    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("\t\tNumber Gessing Game");
        System.out.println("*************************************************");
        System.out.println("\n\t\tRules For Game\n");
        System.out.println("1st If you gess greater than 100 or less then 1. \n    Return Will be Out Of Bound");
        System.out.println("2nd If your first gess under 10, You will get WARM!\n    Otherwise You will get COLD!");
        System.out.println("3rd On other gess:\n    #If your number closer to previous one then you will get WARMER!");
        System.out.println("    #If your number away from previous one then you will get COLDER! ");
        System.out.println("*************************************************");
        System.out.println("\t\tLets Get Start this game");
        System.out.println("*************************************************");
        System.out.println("\n\nGess your First No");
        int counter = 0 ;
        int privew = 0 ;
        int otherNo=0;
        int i = 0;
        Scanner s = new Scanner(System.in);
        
        Random ran = new Random();
        int ran1 = ran.nextInt(100);
     System.out.println(ran1);
        int firstNo = s.nextInt();

        if (firstNo<1 || firstNo > 100){
            System.out.println("Your gess is out of bound");
        }
            int x = Math.abs(firstNo - ran1);
        if(firstNo != ran1){
            if(x<=10){
                System.out.println("WARM!");
            }

            else{
                System.out.println("COLD!");
            }}
        counter = counter + 1;
            if(firstNo!=ran1){System.out.println("\nGess another No");
             otherNo = s.nextInt();}
            else{
                otherNo = firstNo;
            }
        while(otherNo != ran1){
            privew = x;
             x = Math.abs(otherNo - ran1);

             if(x> privew){
                 System.out.println("COLDER!");
             }
             else{
                 System.out.println("WARMER!");
             }
             System.out.println("\nGess another No");
             otherNo = s.nextInt();
             counter = counter + 1;
              

        }

        if (otherNo == ran1){
            System.out.println("CONGO");
            System.out.println("You take gess is " +  counter);
        }

        else{
            System.out.println("Do it agian");
        }

    }
}