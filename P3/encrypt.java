import java.io.File;
import java.util.Scanner;
public class encrypt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s =scan.nextLine();
        String encry ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c) {
            case 'a' :  encry = encry +'a';
                        break;
            case 'b' :  encry = encry +'s';
                        break;

            case 'c' :  encry = encry +'d';
                        break;
            case 'd' :  encry = encry +'f';
                        break;
            case 'e' :  encry = encry +'g';
                        break;
            case 'f' :  encry = encry +'h';
                        break;   
            case 'g' :  encry = encry +'j';
                        break;
            case 'h' :  encry = encry +'k';
                        break;
            case 'i' :  encry = encry +'l';
                        break;
            case 'j' :  encry = encry +'q';
                        break;
            case 'k' :  encry = encry +'w';
                        break;
            case 'l' :  encry = encry +'e';
                        break;
            case 'm' :  encry = encry +'r';
                        break;
            case 'n' :  encry = encry +'t';
                        break;
            case 'o' :  encry = encry +'y';
                        break;
            case 'p' :  encry = encry +'u';
                        break;   
            case 'q' :  encry = encry +'i';
                        break;
            case 'r' :  encry = encry +'o';
                        break;
            case 's' :  encry = encry +'p';
                        break;
            case 't' :  encry = encry +'z';
                        break;
            case 'u' :  encry = encry +'x';
                        break;
            case 'v' :  encry = encry +'c';
                        break;
            case 'w' :  encry = encry +'v';
                        break;   
            case 'x' :  encry = encry +'b';
                        break;
            case 'y' :  encry = encry +'n';
                        break;
            case 'z':  encry = encry +'m';
                        break;
            
        }
            
    }
    System.out.println(encry);

         String decry =scan.nextLine();
            encry = "";
        for(int i=0;i<decry.length();i++){
            char c = decry.charAt(i);
            switch (c) {
            case 'a' :  encry = encry +'a';
                        break;
            case 'b' :  encry = encry +'x';
                        break;

            case 'c' :  encry = encry +'v';
                        break;
            case 'd' :  encry = encry +'c';
                        break;
            case 'e' :  encry = encry +'l';
                        break;
            case 'f' :  encry = encry +'d';
                        break;   
            case 'g' :  encry = encry +'e';
                        break;
            case 'h' :  encry = encry +'f';
                        break;
            case 'i' :  encry = encry +'q';
                        break;
            case 'j' :  encry = encry +'g';
                        break;
            case 'k' :  encry = encry +'h';
                        break;
            case 'l' :  encry = encry +'i';
                        break;
            case 'm' :  encry = encry +'z';
                        break;
            case 'n' :  encry = encry +'y';
                        break;
            case 'o' :  encry = encry +'r';
                        break;
            case 'p' :  encry = encry +'s';
                        break;   
            case 'q' :  encry = encry +'j';
                        break;
            case 'r' :  encry = encry +'m';
                        break;
            case 's' :  encry = encry +'b';
                        break;
            case 't' :  encry = encry +'n';
                        break;
            case 'u' :  encry = encry +'p';
                        break;
            case 'v' :  encry = encry +'w';
                        break;
            case 'w' :  encry = encry +'k';
                        break;   
            case 'x' :  encry = encry +'u';
                        break;
            case 'y' :  encry = encry +'o';
                        break;
            case 'z':  encry = encry +'t';
                        break;
            
        }
              
    }
    System.out.println(encry); 
}




}