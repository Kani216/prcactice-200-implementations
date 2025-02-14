import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayRemoveDupli {
    public static void main(String args[]){
        ArrayList<Integer>Link=new ArrayList<>();
        Link.add(23);
        Link.add(83);
        Link.add(43);
        Link.add(233);
        Link.add(22);  Link.add(23);
        System.out.println("array"+Link);
     Set<Integer> List=new LinkedHashSet<Integer>(Link);
     System.out.println("after removing duplicates"+List);

    }

}
