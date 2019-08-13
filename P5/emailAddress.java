public class emailAddress{
    public static void main(String[] args) {
        String s = "vermasahil_f5@gmail.com";
        int len = s.length();
        int at = 0;
        int dot = 0;
        int atLocation = -1;
        int dotLocation = -1;
        int isAlpha = 1;
        int isGadbad = 0;
        int noDot =0;
        int noAlpha =0;
       for(int i = 0 ; i<len ;i++){
            if(s.charAt(i) == '@'){
                at = 1;
                atLocation = i;
System.out.println("1");
            }
            if(s.charAt(i)=='.'){
                dot = 1;
                dotLocation = i;
                System.out.println("2");
            }}


        for(int i = atLocation+1 ; i<dotLocation;i++){
            if( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i)>= 'A' && s.charAt(i) <= 'Z')){
                
            }
            else{
                isAlpha = 0;
                System.out.println("3");
            }
        }
            for(int y = 0 ; y<atLocation; y++){
                if( (s.charAt(y) >= 'a' && s.charAt(y) <= 'z') || (s.charAt(y)>= 'A' && s.charAt(y) <= 'Z') || (s.charAt(y)>=0 && s.charAt(y) <=9)||(s.charAt(y)=='_')){
                
                }
                else{
                    isGadbad = 1;
                    System.out.println("4");
                }

            }

            for(int i = atLocation+1 ; i<len;i++){
                if(s.charAt(i)=='.'){
                    noDot += 1;
                    System.out.print(" " +  noDot);
                }
            }

            for(int i = dotLocation+1 ;i<len;i++){
                if( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i)>= 'A' && s.charAt(i) <= 'Z')){
                   noAlpha +=1;
                  
                   System.out.print(" " +  noAlpha);
                }
            }


if(at == 1 && isAlpha!= 0 && isGadbad != 1 && noDot == 1 && noAlpha>1 && noAlpha< 4   ){
    System.out.println("TRUE");
}
else{
    System.out.println("no");
}
        




    }

}