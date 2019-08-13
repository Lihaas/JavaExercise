import javax.lang.model.util.ElementScanner6;

public class grade{
    public static void main(String[] args) {
        int maths = 20;
        int english = 27;
        int hindi = 22;
        int science = 23;

        int totalSubject = 4;
        int totalMarks = 120;

        float submistionOfMarks = maths + english + hindi + science;
        
        float result = (float)(submistionOfMarks/totalMarks)*100;

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