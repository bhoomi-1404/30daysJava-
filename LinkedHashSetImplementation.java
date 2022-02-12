import java.util.LinkedHashSet;
import java.util.*;

public class LinkedHashSetImplementation {
    public static void  main(String args[])
    {
        LinkedHashSet<String> hs=new LinkedHashSet<>();
        hs.add("A");
        hs.add("C");
        hs.add("M");
        hs.add("F");
        Iterator <String > itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
