import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMax {
    public static void main(String []args){
        ArrayList<Integer> MElem =new ArrayList<>();
        MElem.add(20);
        MElem.add(30);
        MElem.add(40);
        MElem.add(200);
        MElem.add(50);
        MElem.add(60);

       System.out.println(MElem);
        System.out.println( "the max of" +Collections.max(MElem));
        System.out.println( "the min of" +Collections.min(MElem));

    }

}
