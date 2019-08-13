public class SumOfSeven{
    public static void main(String[] args) {
        int[] ary = new int[]{2,3,4,8,9,-1,-2};
        
        for(int i=0;i<ary.length;i++){
            for(int y=i;y<ary.length;y++){
                int z = ary[i] + ary[y];
                if (z == 7){
                    System.out.println("("+ary[i] +","+ ary[y]+")");
                }
            }

        }
    }
}