public class Star{

public static void main(String[] args) {
    int i,j,x,k,l,m,n,o;
    for(i=1;i<=9;i++){
        for(j=9;j>=i;j--){
            System.out.print("*");
        }
        
      for(x=1;x<=i;x++)  {
        System.out.print(".");
      }

      for(k=1;k<i;k++){
        System.out.print(".");
      }
      System.out.println();
}

for(l=2;l<=9;l++){
      for(n=1;n<=l;n++)
      System.out.print("*");


            for(m=9;m>l;m--){
              System.out.print(".");
            }

            for(o=9;o>=l;o--){
              System.out.print(".");
            }


            System.out.println();   




}



}
}