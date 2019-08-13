import javax.xml.bind.SchemaOutputResolver;

public class EvenOrOdd{
    public static void main(String[] args) {

        int x = 11;
        int y;

        y = x%2;
        
        if(y==0){
            System.out.println(x + " is Even ");
        }
        else{
            System.out.println(x + " is odd ");
        }
    }

}