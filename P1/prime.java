public class prime{
    public static void main(String[] args) {
        int l = 10;
        int h = 200;

        for(int i=l;i<=h;i++){
            int flag = 0;
                for(int j=2;j<i/2;j++){
                    if(i%j == 0){
                        flag =  1;

                    }
                    
                }  
                
                if (flag == 0){
                    System.out.println(i);
                }
        }




    }
}