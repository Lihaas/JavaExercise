public class perfectSquare{
    public static void main(String[] args) {
        double d  = 1986395761;

        double c = Math.sqrt(d);
        System.out.println(c);
        int fronValue = (int) c;

        double decimalValue = (c - fronValue);

        if(decimalValue == 0){
            System.out.println("Prefect Square");
        }
        else{
            System.out.println("Not Perfect Square");
        }

    }
} 