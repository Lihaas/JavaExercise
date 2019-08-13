public class alternatePrime{
    public static void main(String[] args) {
        int a = 20;
        int z =0;

        for(int i=2;i<=a;i++){
            int x = 0;
                for(int y = 2 ; y <= i/2 ; y++){
                            if(i%y == 0){
                                x = 1;
                            }
                            
                }

                if(x==0 ){
                    if(z==0){
                    System.out.println(i);  
                    z=1;}
                    else{
                        z=0;
                    }
                }


        }
    }
}