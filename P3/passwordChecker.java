import java.util.Scanner;
public class passwordChecker{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*******************************************");
        System.out.println("\tLets Check Your Passowrd");
        System.out.println("*******************************************");
        System.out.println("\n\t Enter Your Password\n");
        String password = s.nextLine();
        int lower = 0;
        int upper = 0 ;
        int specialChar= 0 ;
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        if(Character.isUpperCase(c)){
            upper += 1;  }
        if(Character.isLowerCase(c)){
            lower += 1;  }
        
            if(Character.isDigit(c)){
                number += 1;  }
               if(specialCharacters.contains(Character.toString(password.charAt(i)))){
                   sepcialChar += 1;  }
                }    
                   
        if(upper >=1 && lower >=1  && sepcialChar >= 1 && number >=1){
                System.out.println("This is Good Passowrd");
        }
        else{
            System.out.println("This is poor Password");
        }



    
    }
}