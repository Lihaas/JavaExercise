import java.util.Random;
import java.util.Scanner;
public class rockPaperScicor{
    public static void main(String[] args) {
        String pc= "";
        Random ran = new Random();
        int i = ran.nextInt(3);
        Scanner s = new Scanner(System.in);
     //   int u = s.nextInt();
        switch(i){
            case 0 : pc = "paper";
                        break;
            case 1 : pc = "seasor";
                        break;
            case 2 : pc = "rock";
                        break;
            default: pc ="kya";
                        break;
        }
System.out.println(pc);



    }
}