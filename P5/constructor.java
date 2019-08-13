class sum{
    int s;
     sum(int a,int b){
        s = a + b;
        
    }

    void disp(){
        System.out.println(s);
    }
}



public class constructor {
    public static void main(String[] args) {
        sum ss = new sum(2,5);
        ss.disp();
        
          }
}