import java.util.Scanner;
public class GradeByEnter{ 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter maths marks");
        int maths = s.nextInt();

        System.out.println("Enter Science marks");
        int science = s.nextInt();

        System.out.println("Enter EVS marks");
        int Evs = s.nextInt();

        System.out.println("Enter GK marks");
        int Gk = s.nextInt();

        float SubmitionOFMArks = maths + science + Evs + Gk;

        float result = (float)(SubmitionOFMArks/400)*100;

        if(result>75){
            System.out.println("Grade A");
        }
        else if (result <75 && result>60){
            System.out.println("Grade B");
        }
        else if (result<60 && result>50){
            System.out.println("Grade c");
        }
        else{
            System.out.println("Fail");
        }



        System.out.println(result);



    }
}